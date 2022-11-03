package com.edu.springboot.Dao;

import com.edu.springboot.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// 定义接口继承JpaRepository，其中定义了基础的JPA操作
// JpaRepository<T,ID>第一个参数是实体类，第二个参数是主键类型
public interface StudentDao extends JpaRepository<Student,Long> {
    // 根据Name和Password查找学生实体并返回该实体
    Student findStudentByNameAndPassword(String name,String password);

    // 根据ID查找学生
    Student findStudentById(Long id);

    // 查找所有学生
    List<Student> findAll();

    // 根据ID删除学生
    @Transactional
    @Modifying
    Student deleteStudentById(Long id);

    // 根据ID更新学生姓名
    @Transactional
    @Modifying
    @Query("update Student s set s.name=?1 where s.id=?2")
    void updateStudentNameById(String name, Long id);

    // 根据ID更新密码
    @Transactional
    @Modifying
    @Query("update Student s set s.password=?1 where s.id=?2")
    void updateStudentPasswordById(String password, Long id);

}
