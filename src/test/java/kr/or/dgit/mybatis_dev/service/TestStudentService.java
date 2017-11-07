package kr.or.dgit.mybatis_dev.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
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

	/*@Test
	public void test2FindStudentByNo() {
		Student student=new Student();
		student.setStudId(1);
		
		Student findStudent=studentService.findStudentByNoWithAPI(student);
		Assert.assertEquals(student.getStudId(), findStudent.getStudId());
	}
	
	@Test
	public void test3FindStudentByAll() {
		List<Student> lists=studentService.findStudentByAllWithAPI();
		Assert.assertNotNull(lists);
	}

	@Test
	public void test1InsertStudentWithAPI() {
		Calendar newDate=GregorianCalendar.getInstance();
		newDate.set(2017, 11, 1);
		
		Student student= new Student(4, "김사또", "lee@test.co.kr", new PhoneNumber("010-1111-1111"), newDate.getTime());
		int res=studentService.insertStudentWithAPI(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testInsertStudentAutoInc() {
		Calendar newDate=GregorianCalendar.getInstance();
		newDate.set(2017, 11,1);
		
		Student student=new Student();
		student.setName("홍길동");
		student.setEmail("asdf@naver.com");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		
		int res=studentService.insertStudentAutoInc(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testUpdateStudent() {
		Student student=new Student();
		student.setStudId(1);
		student.setName("Timothy");
		student.setEmail("qwer@daum.net");
		student.setPhone(new PhoneNumber("019-523-1234"));
		student.setDob(new Date());
		
		int result=studentService.updateStudentWithAPI(student);
		Assert.assertSame(1, result);
	}
	
	@Test
	public void testDeleteStudent() {
		int deleteStudent=studentService.deleteStudentWithAPI(0);
		Assert.assertSame(1, deleteStudent);
	}
	
	@Test
	public void gTestSelectStudentByAllForResultMap() {
		List<Student> lists=studentService.findStudentByAllForResultMap();
		List<Student> listsApi=studentService.findStudentByAllForResultMapWithAPI();
		Assert.assertEquals(listsApi.size(), lists.size());
	}
	
	@Test
	public void gTestSelectStudentByAllForHashMap() {
		List<Map<String, Object>> lists=studentService.findStudentByAllForHashMap();
		List<Map<String, Object>> listsApi=studentService.findStudentByAllForHashMapWithAPI();
		Assert.assertEquals(listsApi.size(), lists.size());
	}
	
	@Test
	public void test5SelectStudentByNoForResultMapExtends() {
		Student student=new Student();
		student.setStudId(1);
		
		Student extStd=studentService.findStudentByNoForResultMapExtends(student);
		Student extStdApi=studentService.findStudentbyNoForResultMapExtendsWithAPI(student);
		Assert.assertEquals(extStd.getStudId(), extStdApi.getStudId());
	}*/
	
/*	@Test
	public void selectStudentByNoAssociation() {
		Student student =new Student();
		student.setStudId(1);
		
		Student extStd=studentService.findStudentByNoAssociation(student);
		Student extStdApi=studentService.findStudentByNoAssociationWithAPI(student);
		
		Assert.assertEquals(extStd.getStudId(), extStdApi.getStudId());
	}*/
	
	/*@Test
	public void testInsertEnumStudent() {
		Calendar newDate=GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		Student student=new Student();
		student.setName("teset");
		student.setEmail("test@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-000-0200"));
		student.setGender(Gender.FEMALE);
		int res=studentService.insertEnumStudent(student);
		Assert.assertEquals(1, res);
		
	}
	
	@Test
	public void testInsertEnumStudentWithAPI() {
		Calendar newDate=GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		Student student=new Student();
		student.setName("teset1");
		student.setEmail("test1@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-111-2222"));
		student.setGender(Gender.MALE);
		int res=studentService.insertEnumStudentWithAPI(student);
		Assert.assertEquals(1, res);
		
	}*/
}
