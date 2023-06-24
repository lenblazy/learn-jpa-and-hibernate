package com.lenibonje.learnjpaandhibernate.jdbc;

import com.lenibonje.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    private static String INSERT_QUERY =
            """
                       insert into COURSE(ID, NAME, AUTHOR)
                       values(?, ?, ?);
                       
                    """;
    private static String DELETE_QUERY =
            """
                       delete from COURSE WHERE id=?
                      
                    """;

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }



}
