package com.addressBook.test;
import com.addressBook.model.Person;

public class AddressBook
{
	public static void main(String args[])
	{
		Person person = new Person();

		person.setName("Sahul");
		person.setEmailId("rathodsahul@gmail.com");
		person.setMobNumber("9881826882");

		System.out.println("Name = "+person.getName());
		System.out.println("Email Id = "+person.getEmailId());
		System.out.println("Mobile Number = "+person.getMobNumber());
	}
}
