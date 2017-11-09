package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentDao {
	Student selectStudentByNoWithAPI(Student student);
	List<Student> selectStudentByAllWithAPI();
	
	int insertStudentWithAPI(Student student);
	int insertStudentAutoInc(Student student);
	int updateStudentWidthAPI(Student student);
	int deleteStudentWithAPI(int id);
	
	List<Student> selectStudentByAllForResultMap();
	List<Student> selectStudentByAllForResultMapWithAPI();
	
	List<Map<String, Object>> selectStudentByAllForHashMap();
	List<Map<String, Object>> selectStudentByAllForHashMapWithAPI();
	
	Student selectStudentByNoForResultMapExtends(Student student);
	Student selectStudentbyNoForResultMapExtendsWithAPI(Student student);
	
	Student selectStudentByNoAssociation(Student student);
	Student selectStudentByNoAssociationWithAPI(Student student);
	
	int insertEnumStudent(Student student);
	int insertEnumStudentWithAPI(Student student);
	
	//여러개의 입력 파라미터 전달
	Student selectAllStudentByParam(String name, String email);
	Student selectAllStudentByStudent(Student student);
	Student selectAllStudentByMap(Map<String, String> map);
	
	//resultSet 처리방식의 재정의
	Map<Integer, String> selectStudentForMap();
}
