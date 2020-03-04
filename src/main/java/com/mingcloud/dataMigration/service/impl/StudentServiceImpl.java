package com.mingcloud.dataMigration.service.impl;

import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import com.mingcloud.dataMigration.mapper.cluster.StudentMapper;
import com.mingcloud.dataMigration.pojo.Student;
import com.mingcloud.dataMigration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户操作实现类
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student>  implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	protected BaseMapper<Student> getMapper() {

		return this.studentMapper;
	}
	
}
