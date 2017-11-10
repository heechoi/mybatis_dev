package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentDao {
	
	Student selectStudentByNo(Student student);
	List<Student> selectStudentByAll();
	
	Student selectStudentByNoWithAPI(Student student);
	List<Student> selectStudentByAllWithAPI();
	
	int insertStudent(Student student);
	int insertStudnetWithAPI(Student student);
	
	int insertStudentAutoInc(Student student);
	
	int updateStudent(Student student);
	int updateStudentwithAPI(Student student);
	
	int deleteStudent(int id);
	int deleteStudentWithAPI(int id);
	
	List<Student> selectStudentByAllForResultMap();
	List<Student> selectStudentByAllForResultMapWithAPI();
	
	List<Map<String,Object>> selectStudentByAllForHashMap();
	List<Map<String,Object>> selectStudentByAllForHashMapWithAPI();
	
	Student selectStudentByNoForResultMapExtends(Student student);
	Student selectStudentByNoForResultMapExtendsWithAPI(Student student);
	
	Student selectStudentByNoAssociation(Student student);
	Student selectStudentByNoAssociationAPI(Student student);
	
	int insertEnumStudent(Student student);
	int insertEnumStudentWithAPI(Student student);
	
	Student selectAllStudentByParam(String name,String email);
	Student selectAllStudentByStudent(Student student);
	Student selectAllStudentByMap(Map<String, String> map);
	
	int updateSetStudent(Student student);
}
