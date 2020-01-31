package com.zzy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzy.bean.Teacher;
import com.zzy.dao.TeacherDao;

@Service
public class TeacherService {
	@Autowired
	private TeacherDao teacherDao;
	public Teacher getTeacher(Integer id) {
		return teacherDao.getTeacherById(id);
	}

}
