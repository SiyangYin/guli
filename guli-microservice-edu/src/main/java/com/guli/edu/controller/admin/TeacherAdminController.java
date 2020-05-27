package com.guli.edu.controller.admin;


import com.guli.edu.entity.Teacher;
import com.guli.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/edu/teacher")
@CrossOrigin //跨域  protocal hostname port --> cors issue
public class TeacherAdminController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> list() {
        return teacherService.list(null);
    }

    @DeleteMapping("{id}")
    public boolean removeById(@PathVariable String id) {
        return teacherService.removeById(id);
    }
}