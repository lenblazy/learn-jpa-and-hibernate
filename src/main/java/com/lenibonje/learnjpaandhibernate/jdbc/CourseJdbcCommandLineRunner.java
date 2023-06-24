package com.lenibonje.learnjpaandhibernate.jdbc;

import com.lenibonje.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Aws", "Lenibonje"));
        repository.insert(new Course(2, "Learn Devops", "Lenibonje"));
        repository.insert(new Course(3, "Learn Azure", "Lenibonje"));
        repository.insert(new Course(4, "Learn iOS", "Lenibonje"));
        repository.delete(4);
    }
}
