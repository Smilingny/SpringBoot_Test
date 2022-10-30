package com.edu.springboot;

import com.edu.springboot.Controller.StudentApi;
import com.edu.springboot.Entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
@RunWith(SpringRunner.class)
class Work4ApplicationTests {
	@Autowired
	StudentApi sa;

	// 测试查找函数
	@Test
	public void findOne(){
		Student stu = sa.getOne(1L);
		System.out.println(stu.getName());
	}

	// 测试新增用户
	@Test
	void create(){
		Student stu=new Student();
		stu.setName("小张");
		stu.setPassword("xiaozhang");
		stu.setAge(20);
		sa.registerStu(stu);
	}

	// 测试删除
	@Test
	public void delete(){
		sa.deleteStu(14L);
	}

	// 测试更新用户
	@Test
	public void update(){
		Student stu=new Student();
		stu.setId(12L);
		stu.setName("小刚");
		stu.setPassword("xiaogang");
		stu.setAge(22);
		sa.changeStu(stu);
	}
}
