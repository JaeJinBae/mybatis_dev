package kr.or.dgit.mybatis_dev.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;

public class TestCourseService {

	private static CourseService courseService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService=CourseService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService=null;
	}

	@Test
	public void testFindCourseByCondition() {
		GregorianCalendar cal=new GregorianCalendar(2013,1,1);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("tutorId", 1);
		map.put("courseName", "%java%");
		map.put("startDate", cal.getTime());
		
		List<Course> courses=courseService.findCoursesByCondition(map);
		Assert.assertNotNull(courses);
	}
	
	@Test
	public void testFindCaseCourses() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("searchBy", "Tutor");
		map.put("tutorId", 1);
		List<Course> courses=courseService.findCaseCourses(map);
		Assert.assertNotNull(courses);
		
		map.replace("searchBy", "CourseName");
		map.remove("tutorId");
		map.put("courseName", "%java%");
		courses=courseService.findCaseCourses(map);
		Assert.assertNotNull(courses);
		
	}
	
	@Test
	public void testFindWhereCourses() {
		Map<String, Object> map=new HashMap<String, Object>();
		
		List<Course> courses=courseService.findwhereCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		courses=courseService.findwhereCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("courseName", "%java%");
		courses=courseService.findwhereCourses(map);
		
		map.clear();
		map.put("endDate", new Date());
		courses=courseService.findwhereCourses(map);
	}
	
	@Test
	public void testFindTrimCourses() {
		Map<String, Object> map=new HashMap<String, Object>();
		List<Course> courses=courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		courses=courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		map.put("courseName", "%java%");
		courses=courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
	}
	
	@Test
	public void testFindCoursesForeachByTutors() {
		List<Integer> tutorIds=new ArrayList<Integer>();
		tutorIds.add(1);
		tutorIds.add(2);
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("tutorIds", tutorIds);
		
		List<Course> courses=courseService.findCoursesForeachByTutors(map);
		Assert.assertNotNull(courses);
	}

}
