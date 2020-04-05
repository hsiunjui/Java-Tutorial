package com.learn.object.Polymorphism.test;

import com.learn.object.Polymorphism.Person;
import com.learn.object.Polymorphism.Student;
import com.learn.object.Polymorphism.Teacher;

public class TestPerson {
	public static void main(String[] arg) {
		// 向上转型(自动)
		Person teacher = new Teacher();
		teacher.walk();
		// teacher.teach();  // X,因为Person类并没有该方法,此时只能把Teacher看作Person
		Teacher.say(); // 调用父类的say方法,而不是自己的!!!!
		
		// 向下转型(强制)
		Teacher t = (Teacher)teacher;
		if (teacher instanceof Teacher) { // 判断类型,instanceof可以向上兼容
			t.teach(); // 正常访问
		}
		Teacher.say(); // 这里调用自己的say方法
		
		/** 不能再两个不同类型之间强转 ***/ 
		Person student = new Student();
		// t = (Teacher)student; // 会包运行时异常,不能转换
		student.walk();
	}
}
