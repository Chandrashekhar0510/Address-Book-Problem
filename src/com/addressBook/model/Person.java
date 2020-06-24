package com.addressBook.model;

public class Person
{
	String name;
	String emailId;
	String city;
	String state;
	double mobNumber;
	int zipCode;

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public String getEmailId()
	{
		return this.emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId=emailId;
	}

	public String getCity()
	{
		return this.city;
	}

	public String getState()
	{
		return this.state;
	}

	public double getMobName()
	{
		return this.mobNumber;
	}

	public int getZipCode()
	{
		return this.zipCode;
	}
}
