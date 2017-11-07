package kr.or.dgit.mybatis_dev.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	public Student findStudentByNoWithAPI(Student student) {
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoWithAPI(student);
		}
	}
	
	public List<Student> findStudentByAllWithAPI(){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllWithAPI();
		}
	}
	
	public int insertStudentWithAPI(Student student) {
		int res=-1;
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			res=dao.insertStudentWithAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int insertStudentAutoInc(Student student) {
		int res=-1;
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			res=dao.insertStudentAutoInc(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int updateStudentWithAPI(Student student) {
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao studentDao=new StudentDaoImpl(sqlSession);
			int res=studentDao.updateStudentWidthAPI(student);
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}finally{
			sqlSession.close();
		}
	}
	
	public int deleteStudentWithAPI(int id) {
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao studentDao=new StudentDaoImpl(sqlSession);
			int res=studentDao.deleteStudentWithAPI(id);
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
	
	public List<Student> findStudentByAllForResultMap(){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao=new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByAllForResultMap();
		}
	}
	
	public List<Student> findStudentByAllForResultMapWithAPI(){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao studentDao=new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByAllForResultMapWithAPI();
		}
	}
	
	public List<Map<String, Object>> findStudentByAllForHashMap(){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForHashMap();
		}
	}
	
	public List<Map<String, Object>> findStudentByAllForHashMapWithAPI(){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForHashMapWithAPI();
		}
	}
	
	public Student findStudentByNoForResultMapExtends(Student student) {
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoForResultMapExtends(student);
		}
	}
	
	public Student findStudentbyNoForResultMapExtendsWithAPI(Student student) {
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			return dao.selectStudentbyNoForResultMapExtendsWithAPI(student);
		}
	}
	
	public Student findStudentByNoAssociation(Student student) {
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoAssociation(student);
		}
	}
	
	public Student findStudentByNoAssociationWithAPI(Student student) {
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoAssociationWithAPI(student);
		}
	}
	
	public int insertEnumStudent(Student student) {
		int res=-1;
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			res=dao.insertEnumStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int insertEnumStudentWithAPI(Student student) {
		int res=-1;
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao=new StudentDaoImpl(sqlSession);
			res=dao.insertEnumStudentWithAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
}
