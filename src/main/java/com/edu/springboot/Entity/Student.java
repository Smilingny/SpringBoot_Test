package com.edu.springboot.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id //设置StuId为主键
    @GeneratedValue(strategy = GenerationType.AUTO)  //设置递增规则
    private Long id;
    private String name;
    private String password;
    private Integer age;
    /*//学生和爱好为一对多的关系
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    // mappedBy = "student" 形成双向关系，避免生成中间表
    // cascade = CascadeType.ALL 包含所有持久化操作
    // fetch = FetchType.LAZY 表示关系类在被访问时才加载
    // 学生有多个爱好，故采取泛型
    public List<Hobby> hobbyList;

    public List<Hobby> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<Hobby> HobbyList) {
        this.hobbyList = HobbyList;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
