package kr.or.dgit.mybatis_dev.service;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStudentService {
	
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

/*	@Test
	public void test1FindStudentByNo() {
		Student student = new Student();
		student.setStudId(1);
		Student findStudent = studentService.findStudentByNo(student);
		Assert.assertEquals(student.getStudId(), findStudent.getStudId());
	}
	
	@Test
	public void test2FindStudentByAll() {
		List<Student> lists = studentService.findStudentByAll();
		Assert.assertNotNull(lists);
	}
	@Test
	public void test3FindStudentAPI() {
		Student student = new Student();
		student.setStudId(1);
		
		Student selectStudent = studentService.findStudentAPI(student);
		Assert.assertEquals(student.getStudId(), selectStudent.getStudId());
	}
	
	@Test
	public void test4FindStudentByAllAPI() {
		List<Student> lists=studentService.findStudentByAllAPI();
		Assert.assertNotNull(lists);
	}*/
	
/*	@Test
	public void test5insertStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student student = new Student(3, "홍길동3", "lee@test.co.kr", new PhoneNumber("010-1234-1234"), newDate.getTime());
		int res = studentService.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test6insertStudentAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 3,28);
		
		Student student = new Student(4, "홍길동4", "lee@test.co.kr", new PhoneNumber("010-1234-1234"), newDate.getTime());
		int res = studentService.insertStudentWithAPI(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void test7updateStudent() {
		Student student = new Student();
		student.setStudId(1);
		student.setName("Timothy");
		student.setEmail("test@test.co.kr");
		student.setPhone(new PhoneNumber("978-643-3211"));
		student.setDob(new Date());
		
		int result = studentService.updateStudent(student);
		Assert.assertSame(1, result);
		
		student.setEmail("timoty@gmail.com");
		student.setPhone(new PhoneNumber("123-123-1234"));
		student.setDob(new GregorianCalendar(1988, 04, 25).getTime());
		result = studentService.updateStudentWithAPI(student);
		Assert.assertSame(1, result);
	}
	@Test
	public void test8DeleteStudent() {
		//test5insertStudent();
		
		int deleteStudent = studentService.deleteStudent(3);
		Assert.assertSame(1, deleteStudent);
		
		test5insertStudent();
		deleteStudent = studentService.deleteStudentWithAPI(3);
		Assert.assertSame(1, deleteStudent);
	}
	
	@Test
	public void test9insertStudentAutoInc() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student student = new Student();
		student.setName("홍길동4");
		student.setEmail("lee4@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		
		int res = studentService.insertStudentAutoInc(student);
		Assert.assertEquals(1, res);
	}*/
	
/*	@Test
	public void gTestSelectStudentByAllForResultMap() {
		List<Student> lists = studentService.findStudentByAllForResultMap();
		List<Student> listsAPI = studentService.findStudentByAllForResultMapWithAPI();
		Assert.assertEquals(listsAPI.size(), lists.size());
	}*/
	
/*	@Test
	public void gTestSelectStudentByAllForHashMap() {
		List<Map<String,Object>> lists = studentService.findStudentByAllForHashMap();
		List<Map<String,Object>> listsAPI = studentService.findStudentByAllForHashMapWithAPI();
		Assert.assertEquals(listsAPI, lists);
	}*/
	
/*	@Test
	public void testSelectStudentByNoForResultMapExtends() {
		Student student = new Student();
		student.setStudId(1);
		
		Student extStd = studentService.findStudentByNoForResultMapExtends(student);
		Student exStdAPI = studentService.findStudentByNoForResultMapExtendsWithAPI(student);
		Assert.assertEquals(extStd.getStudId(), exStdAPI.getStudId());
	}*/
	
/*	@Test
	public void testSelectStudentByNoAssociation(){
		Student student = new Student();
		student.setStudId(1);
		
		Student extStd = studentService.findStudentByNoAssociation(student);
		Student extStdAPI = studentService.findStudentByNoAssociationWithAPI(student);
		
		Assert.assertEquals(extStd.getStudId(), extStdAPI.getStudId());
	}*/

/*	@Test
	public void testInsertEnumStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		Student student = new Student();
		student.setName("test");
		student.setEmail("test@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		student.setGender(Gender.FMALE);
		int res= studentService.insertEnumStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testInsertEnumStudentWithAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 3,28);
		Student student = new Student();
		student.setName("test2");
		student.setEmail("test2@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		student.setGender(Gender.MALE);
		int res= studentService.insertEnumStudentWithAPI(student);
		Assert.assertEquals(1, res);
	}*/
/*	@Test
	public void testAFindAllStudentByParam() {
		Student student = studentService.findAllStudentByParam("Timothy", "timothy@gmail.com");
		Assert.assertNotNull(student);
	}
	@Test
	public void testBStudentByStudent() {
		Student std = new Student();
		std.setName("Timothy");
		std.setEmail("timothy@gmail.com");
		Student student = studentService.findAllStudentByStudent(std);
		Assert.assertNotNull(student);
	}
	@Test
	public void testCStudentByMap() {
		Map<String,String> maps = new HashMap<>();
		maps.put("name", "Timothy");
		maps.put("email", "timothy@gmail.com");
		Student student = studentService.findAllStudentByMap(maps);
		Assert.assertNotNull(student);
	}*/
	
	@Test
	public void testUpdateSetStudent() {
		Student student = new Student();
		student.setStudId(1);
		student.setPhone(new PhoneNumber("987-654-3211"));
		student.setDob(new Date());
		
		int result = studentService.updateSetStudent(student);
		Assert.assertSame(1, result);
		
		student.setPhone(new PhoneNumber("123-123-1234"));
		student.setDob(new GregorianCalendar(1988,04,25).getTime());
		result= studentService.updateSetStudent(student);
		Assert.assertSame(1, result);
	}
}
