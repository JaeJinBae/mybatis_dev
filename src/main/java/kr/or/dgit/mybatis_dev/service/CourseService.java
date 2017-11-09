package kr.or.dgit.mybatis_dev.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.CourseDao;
import kr.or.dgit.mybatis_dev.dao.CourseDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class CourseService {
	private static final CourseService instance=new CourseService();

	public CourseService() {

	}

	public static CourseService getInstance() {
		return instance;
	}
	
	public List<Course> findCoursesByCondition(Map<String, Object> map){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao dao=new CourseDaoImpl(sqlSession);
			return dao.selectCoursesByCondition(map);
		}
	}
	
	public List<Course> findCaseCourses(Map<String, Object> map){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao dao=new CourseDaoImpl(sqlSession);
			return dao.selectCaseCourses(map);
		}
	}
	
	public List<Course> findwhereCourses(Map<String, Object> map){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao dao=new CourseDaoImpl(sqlSession);
			return dao.selectWhereCourses(map);
		}
	}
	
	public List<Course> findTrimCourses(Map<String, Object> map){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao dao=new CourseDaoImpl(sqlSession);
			return dao.selectTrimCourses(map);
		}
	}
	
	public List<Course> findCoursesForeachByTutors(Map<String, Object> map){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao dao=new CourseDaoImpl(sqlSession);
			return dao.selectCoursesForeachByTutors(map);
		}
	}
}
