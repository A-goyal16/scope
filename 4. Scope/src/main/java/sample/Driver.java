package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver 
{
	public static void main(String[] args)
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("Sample.xml");
		Employee e1=con.getBean(Employee.class);
		Employee e2=con.getBean(Employee.class);
		System.out.println(e1.getId());
		System.out.println(e2.getId());
		//for Employee we created two object still is taking count as 1 because the scope for this bean is singleton and it is allowing to create only one object throughout the application.
		
		System.out.println("----------------");

		Student s=con.getBean(Student.class);
		Student s1=con.getBean(Student.class);
		System.out.println(s.getId());
		System.out.println(s1.getId());
		//for Student class also we create two object and it is increasing count everytime because the scope is prototype and it will allow to create multiple object for one bean.
	}
}
//the difference between both of them is Singleton scope is allow to create one object for one bean throughout the application and
//the prototype scope allow to create a multiple object for one bean.



