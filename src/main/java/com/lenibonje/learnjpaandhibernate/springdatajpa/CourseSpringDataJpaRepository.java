package com.lenibonje.learnjpaandhibernate.springdatajpa;

import com.lenibonje.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {



}
