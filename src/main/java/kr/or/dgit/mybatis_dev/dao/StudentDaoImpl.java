package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Student;

public class StudentDaoImpl implements StudentDao {
	
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(StudentDaoImpl.class);
	
	public StudentDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Student selectStudentByNo(Student student) {
		log.debug("selectStudentByNo()"); //어떤 메소드가 호출이 되었는지 확인할 수 있다.
		return sqlSession.getMapper(StudentDao.class).selectStudentByNo(student);
	}

	@Override
	public List<Student> selectStudentByAll() {
		log.debug("selectStudentByAll()"); 
		return sqlSession.getMapper(StudentDao.class).selectStudentByAll();
	}
	private String namespace = "kr.or.dgit.mybatis_dev.dao.StudentDao.";
	@Override
	public Student selectStudentByNoWithAPI(Student student) {
		log.debug("selectStudentByNoWidthAPI()"); 
		return sqlSession.selectOne(namespace+"selectStudentByNoWithAPI",student);
	}

	@Override
	public List<Student> selectStudentByAllWithAPI() {
		log.debug("selectStudentByAllWithAPI()"); 
		return sqlSession.selectList(namespace+"selectStudentByAllWithAPI");
	}

	@Override
	public int insertStudent(Student student) {
		log.debug("insertStudent()"); 
		return sqlSession.getMapper(StudentDao.class).insertStudent(student);
	}

	@Override
	public int insertStudnetWithAPI(Student student) {
		log.debug("insertStudnetWithAPI()"); 
		return sqlSession.insert(namespace+"insertStudnetWithAPI",student);
	}

	@Override
	public int updateStudent(Student student) {
		log.debug("updateStudent()"); 
		return sqlSession.getMapper(StudentDao.class).updateStudent(student);
	}

	@Override
	public int updateStudentwithAPI(Student student) {
		log.debug("updateStudentwithAPI()"); 
		return sqlSession.update(namespace+"updateStudentwithAPI",student);
	}

	@Override
	public int deleteStudent(int id) {
		log.debug("deleteStudent()"); 
		return sqlSession.getMapper(StudentDao.class).deleteStudent(id);
	}

	@Override
	public int deleteStudentWithAPI(int id) {
		log.debug("deleteStudentWithAPI()"); 
		return sqlSession.delete(namespace+"deleteStudentWithAPI",id);
	}

	@Override
	public int insertStudentAutoInc(Student student) {
		log.debug("insertStudentAutoInc()"); 
		return sqlSession.getMapper(StudentDao.class).insertStudentAutoInc(student);
	}

	@Override
	public List<Student> selectStudentByAllForResultMap() {
		log.debug("selectStudentByAllForResultMap()"); 
		return sqlSession.getMapper(StudentDao.class).selectStudentByAllForResultMap();
	}

	@Override
	public List<Student> selectStudentByAllForResultMapWithAPI() {
		log.debug("selectStudentByAllForResultMapWithAPI()"); 
		return sqlSession.selectList(namespace+"selectStudentByAllForResultMapWithAPI");
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		log.debug("selectStudentByAllForHashMap()"); 
		return sqlSession.getMapper(StudentDao.class).selectStudentByAllForHashMap();
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMapWithAPI() {
		log.debug("selectStudentByAllForHashMapWithAPI()"); 
		return sqlSession.selectList(namespace+"selectStudentByAllForHashMapWithAPI");
	}

	@Override
	public Student selectStudentByNoForResultMapExtends(Student student) {
		log.debug("selectStudentByNoForResultMapExtends()"); 
		return sqlSession.selectOne(namespace+"selectStudentByNoForResultMapExtends",student);
	}

	@Override
	public Student selectStudentByNoForResultMapExtendsWithAPI(Student student) {
		log.debug("selectStudentByNoForResultMapExtendsWithAPI()");
		return sqlSession.selectOne(namespace+"selectStudentByNoForResultMapExtendsWithAPI",student);
	}

}
