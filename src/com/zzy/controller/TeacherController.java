package com.zzy.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zzy.bean.Teacher;
import com.zzy.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	@RequestMapping("/getTeacher")
	public String getTeacher(@RequestParam("id")Integer id,Model model) {
		Teacher teacher=teacherService.getTeacher(id);
		model.addAttribute("teacher", teacher);
		return "success";
	}

}
