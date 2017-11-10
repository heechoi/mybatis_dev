package kr.or.dgit.mybatis_dev.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Course;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseServiceTest {
	private static CourseService courseService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService = CourseService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService=null;
	}

/*	@Test
	public void tes1tFindCourseByCondition() {
		GregorianCalendar cal = new GregorianCalendar(2013,1,1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorId", 1);
		map.put("name", "%java%");
		map.put("startDate", cal.getTime());
		
		List<Course> courses = courseService.findCourseByCondition(map);
		Assert.assertNotNull(courses);
	}
	*/
/*	@Test
	public void test2FindCaseCourses() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchBy", "Tutor");
		map.put("tutorId", 1);
		List<Course> courses = courseService.findCourses(map);
		Assert.assertNotNull(courses);
		
		map.replace("searchBy", "name");
		map.remove("tutorId");
		map.put("name", "%java%");
		courses = courseService.findCourses(map);
		Assert.assertNotNull(courses);
	}*/
/*	
	@Test
	public void testFindWhereCourses() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Course> courses = courseService.findWhereCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		courses = courseService.findWhereCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("name","%java%");
		courses = courseService.findWhereCourses(map);
		Assert.assertNotNull(courses);
		
		map.clear();
		map.put("endDate", new Date());
		courses = courseService.findWhereCourses(map);
	}*/
/*	@Test
	public void testFindTrimCourses() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Course> courses = courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		courses = courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		map.put("name","%java");
		courses = courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
	}*/
	
	@Test
	public void testFindCoursesForeachByTutors() {
		List<Integer> tutorIds = new ArrayList<Integer>();
		tutorIds.add(1);
		tutorIds.add(2);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorId", tutorIds);
		
		List<Course> courses = courseService.findCoursesForeachByTutors(map);
		Assert.assertNotNull(courses);
	}
}
