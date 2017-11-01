package kr.or.dgit.mybatis_dev.service;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStudentService {
	private static StudentService studentService;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService=new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService=null;
	}

	@Test
	public void test1FindStudentByNo() {
		Student student=new Student();
		student.setStudId(1);
		
		Student findStudent=studentService.findStudentByNo(student);
		Assert.assertEquals(student.getStudId(), findStudent.getStudId());
	}
	
	@Test
	public void test2FindStudentByAll() {
		List<Student> lists=studentService.findStudentByAll();
		Assert.assertNotNull(lists);
	}

}
