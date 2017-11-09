package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Course;

public interface CourseDao {
	//if조건
	List<Course> selectCoursesByCondition(Map<String, Object> map);
	
	//choose, when, otherwise조건
	List<Course> selectCaseCourses(Map<String, Object> map);
	
	//where조건
	List<Course> selectWhereCourses(Map<String, Object> map);
	
	//trim조건
	List<Course> selectTrimCourses(Map<String, Object> map);
	
	//foreach루프
	List<Course> selectCoursesForeachByTutors(Map<String, Object> map);
}
