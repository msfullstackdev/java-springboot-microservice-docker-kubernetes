package com.example.demo.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passPortNumber;
	
	public Student()
	{
		super();
	}
	
	public Student(Long id, String name, String passPortNumber)
	{
		super();
		this.id=id;
		this.name=name;
		this.passPortNumber=passPortNumber;
		
	}
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getPassportNumber()
	{
		return passPortNumber;
	}
	public void setPassportNumber(String passPortNumber)
	{
		this.passPortNumber = passPortNumber;
	}
}
