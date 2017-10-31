package kr.or.dgit.mybatis_dev.dao;

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

}
