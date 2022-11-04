package com.edu.springboot.Controller;

import com.edu.springboot.Dao.StudentDao;
import com.edu.springboot.Entity.Student;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 开启RestController服务
@RestController
//开启Api
@Api(tags = "学生信息管理相关接口")
// 设置请求http请求映射路径
@RequestMapping(value = "/student")
public class StudentApi {
    @Autowired
    private StudentDao sDao;

    // 登录功能
    @PostMapping(value = "/login")  // 设置Post请求路径
    @ApiOperation("学生登录")  // 设置Api名称
    @CrossOrigin  // 设置允许跨域访问
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", dataTypeClass = String.class, defaultValue = "admin", required = true),
            @ApiImplicitParam(name = "password", value = "密码", dataTypeClass = String.class, defaultValue = "password", required = true)
    })  // 设置参数为必需
    @ApiResponse(code = 100, message = "成功", response = Student.class) // 表示响应信息
    public Student login(@RequestParam String name, @RequestParam String password) {
        return sDao.findStudentByNameAndPassword(name, password);
    }

    // 注册功能
    @PostMapping("/register")
    @ApiOperation("注册学生信息")
    @CrossOrigin
    @ApiResponse(code = 100, message = "成功")
    public Student registerStu(Student student) {
        return sDao.save(student);
    }

    // 根据ID查找用户信息
    @GetMapping("/getone/{id}")
    @ApiOperation("由ID查找学生")
    @CrossOrigin
    @ApiImplicitParam(name = "id", value = "学号ID", dataTypeClass = Long.class, defaultValue = "0", required = true)
    @ApiResponse(code = 100, message = "成功", response = Student.class)
    public Student getOne(@PathVariable("id") Long id) {
        return sDao.findStudentById(id);
    }

    // 获取所有用户信息
    @GetMapping("/getall")
    @ApiOperation("获取所有用户信息")
    @CrossOrigin
    @ApiResponse(code = 100, message = "成功", response = Student.class)
    public List<Student> getAll() {
        return sDao.findAll();
    }

    // 修改用户信息
    @PutMapping("/change")
    @ApiOperation("修改学生信息")
    @CrossOrigin
    @ApiResponse(code = 100, message = "成功", response = Student.class)
    public Student changeStu( Student student) {
        if(sDao.existsById(student.getId())) {
            return sDao.save(student);
        }
        return null;
    }

    // 删除用户
    @PostMapping("/delete")
    @ApiOperation("由ID删除学生")
    @CrossOrigin
    @ApiImplicitParam(name = "id", value = "学号ID", dataTypeClass = Long.class, required = true)
    @ApiResponse(code = 100, message = "成功")
    public boolean deleteStu(Long id) {
         sDao.deleteStudentById(id);
        return !sDao.existsById(id);
    }
}
