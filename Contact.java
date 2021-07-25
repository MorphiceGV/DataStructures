package lab4;

import java.util.ListIterator;

public class Contact implements Comparable<Contact>{

	public String name;
	
	public int phonenumber;
	
	public Contact(String name, int number)
	{
		this.name = name;
		this.phonenumber = number;
	}
		
	public String toString()
	{
		return name +"|" + phonenumber;
	}

	
	@Override
	public int compareTo(Contact arg)
	{	
if(this.name.equals(arg.name))
{

if(arg.phonenumber > this.phonenumber)
	{
		return  1 ;
	}
else 
	{
		return -1; 
	}
}

		// To-do: Please write this function so the contact can be sorted by name first, 
		// and then by phone number				
		
		return this.name.compareTo(arg.name); //remove this line after coding 
	}
	
}
