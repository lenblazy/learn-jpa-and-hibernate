package com.lenibonje.learnjpaandhibernate.course;

import com.lenibonje.learnjpaandhibernate.jpa.CourseJpaRepository;
import com.lenibonje.learnjpaandhibernate.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn Aws", "Lenibonje"));
        repository.save(new Course(2, "Learn Devops", "Lenibonje"));
        repository.save(new Course(3, "Learn Azure", "Lenibonje"));
        repository.save(new Course(4, "Learn iOS", "Lenibonje"));
        repository.deleteById(4L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());

    }
}
