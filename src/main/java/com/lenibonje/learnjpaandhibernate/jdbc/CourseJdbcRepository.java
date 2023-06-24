package com.lenibonje.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    private static String INSERT_QUERY =
            """
               insert into COURSE(ID, NAME, AUTHOR)
               values(1, 'Learn AWS', 'Lenibonje');
               
            """;

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }

}
