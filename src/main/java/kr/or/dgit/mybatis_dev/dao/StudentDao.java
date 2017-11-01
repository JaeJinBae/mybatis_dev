package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentDao {
	Student selectStudentByNo(Student student);
	List<Student> selectStudentByAll();
}
