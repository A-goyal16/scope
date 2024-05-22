package sample;

import org.springframework.stereotype.Component;

@Component
public class Employee
{
	static int count=0;
	int id;
	public Employee()
	{
		this.id=++count;
	}
	public int getId() {
		return id;
	}
}
