package com.edu.springboot.Dao;

import com.edu.springboot.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {

}
