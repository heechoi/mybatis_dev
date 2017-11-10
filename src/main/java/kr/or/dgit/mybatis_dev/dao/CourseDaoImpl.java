package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Course;

public class CourseDaoImpl implements CourseDao {
	
	private SqlSession sqlSession;
	private static final Log log=LogFactory.getLog(CourseDaoImpl.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.CourseDao.";
	
	
	public CourseDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}


	@Override
	public List<Course> selectCoursesByCondition(Map<String, Object> map) {
		log.debug("selectCoursesByCondition()");
		return sqlSession.selectList(namespace+"selectCoursesByCondition",map);
	}


	@Override
	public List<Course> selectCaseCourses(Map<String, Object> map) {
		log.debug("selectCaseCourses()");
		return sqlSession.selectList(namespace+"selectCaseCourses",map);
	}


	@Override
	public List<Course> selectWhereCourses(Map<String, Object> map) {
		log.debug("selectWhereCourses()");
		return sqlSession.selectList(namespace+"selectWhereCourses",map);
	}


	@Override
	public List<Course> selectTrimCourses(Map<String, Object> map) {
		log.debug("selectTrimCourses()");
		return sqlSession.selectList(namespace+"selectTrimCourses", map);
	}


	@Override
	public List<Course> selectCoursesForeachByTutors(Map<String, Object> map) {
		log.debug("selectCoursesForeachByTutors()");
		return sqlSession.selectList(namespace+"selectCoursesForeachByTutors", map);
	}

}
