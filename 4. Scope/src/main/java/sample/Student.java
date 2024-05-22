package sample;

import org.springframework.stereotype.Component;

@Component
public class Student 
{
	static int count=0;
	int id;
	public Student()
	{
		this.id=++count;
	}
	public int getId() {
		return id;
	}
	
}
