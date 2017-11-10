package kr.or.dgit.mybatis_dev.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	public Student findStudentByNo(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
		}
	}
	
	public List<Student> findStudentByAll(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAll();
		}
	}
	public Student findStudentAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByNoWithAPI(student);
		}
	}
	
	public List<Student> findStudentByAllAPI() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByAllWithAPI();
		}
	}
	//insert문
	public int insertStudent(Student student) {
		int res = -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			res = studentDao.insertStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	public int insertStudentWithAPI(Student student) {
		int res = -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			res = studentDao.insertStudnetWithAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	//update 문
	public int updateStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			int res = studentDao.updateStudent(student);
			sqlSession.commit();
			return res;
		}catch(Exception e){
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
	
	public int updateStudentWithAPI(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			int res = studentDao.updateStudentwithAPI(student);
			sqlSession.commit();
			return res;
		}catch(Exception e){
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		} 
	}
	
	public int deleteStudent(int id) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			int res = studentDao.deleteStudent(id);
			sqlSession.commit();
			return res;
		}catch(Exception e){
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	
	}
	
	public int deleteStudentWithAPI(int id) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			int res = studentDao.deleteStudentWithAPI(id);
			sqlSession.commit();
			return res;
		}catch(Exception e){
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
	
	public int insertStudentAutoInc(Student student) {
		int res =-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			res = studentDao.insertStudentAutoInc(student);
			sqlSession.commit();
		}
		return res;
	}
	
	//결과매핑
	
	public List<Student> findStudentByAllForResultMap(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByAllForResultMap();
		}
	}
	
	public List<Student> findStudentByAllForResultMapWithAPI(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByAllForResultMapWithAPI();
		}
	}
	
	public List<Map<String,Object>> findStudentByAllForHashMap(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByAllForHashMap();
		}	

	}
	
	public List<Map<String,Object>> findStudentByAllForHashMapWithAPI(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByAllForHashMapWithAPI();
		}
	}
	
	public Student findStudentByNoForResultMapExtends(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByNoForResultMapExtends(student);
		}
	}
	
	public Student findStudentByNoForResultMapExtendsWithAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByNoForResultMapExtendsWithAPI(student);
		}
	}
	
	//일대일 매핑
	public Student findStudentByNoAssociation(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByNoAssociation(student);
		}
	}
	
	public Student findStudentByNoAssociationWithAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByNoAssociationAPI(student);
		}
	}
	
	
	public int insertEnumStudent(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			res = studentDao.insertEnumStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int insertEnumStudentWithAPI(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			res=studentDao.insertEnumStudentWithAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public Student findAllStudentByParam(String name, String email) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectAllStudentByParam(name, email);
		}
	}
	
	public Student findAllStudentByStudent(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectAllStudentByStudent(student);
		}
	}
	public Student findAllStudentByMap(Map<String,String> map) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectAllStudentByMap(map);
		}
	}
	
	public int updateSetStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			int res = studentDao.updateSetStudent(student);
			sqlSession.commit();
			return res;
		}catch(Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
}
