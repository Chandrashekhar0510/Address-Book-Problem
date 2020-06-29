package com.addressBook.model;

public class Person
{
	String name;
	String emailId;
	String city;
	String state;
	String mobNumber;
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

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return this.state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getMobNumber()
	{
		return this.mobNumber;
	}

	public void setMobNumber(String mobNumber)
	{
		this.mobNumber = mobNumber;
	}

	public int getZipCode()
	{
		return this.zipCode;
	}

	public void setZipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}
}
