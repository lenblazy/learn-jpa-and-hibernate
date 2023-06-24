package com.lenibonje.learnjpaandhibernate.course;

import com.lenibonje.learnjpaandhibernate.course.Course;
import com.lenibonje.learnjpaandhibernate.jdbc.CourseJdbcRepository;
import com.lenibonje.learnjpaandhibernate.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Aws", "Lenibonje"));
        repository.insert(new Course(2, "Learn Devops", "Lenibonje"));
        repository.insert(new Course(3, "Learn Azure", "Lenibonje"));
        repository.insert(new Course(4, "Learn iOS", "Lenibonje"));
        repository.deleteById(4);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
