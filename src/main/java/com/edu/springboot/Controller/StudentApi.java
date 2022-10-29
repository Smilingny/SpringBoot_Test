package com.edu.springboot.Controller;

import com.edu.springboot.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentApi {
    @Autowired
    private StudentDao sDao;

}
