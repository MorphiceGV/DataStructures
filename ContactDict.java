/**
 * 
 */
package lab4;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author MorhphiceGV
 *
 */
public class ContactDict {
	
	private LinkedList<Contact> dt;
	
	public ContactDict()
	{
		dt = new LinkedList<Contact>();		
	}	
		
	/**
	 * @param newContact - the new element to be added
	 * 
	 */
	public void add(Contact newContact)
	{		

	//To- do: By adding the contact record,
	// the list should always be ordered by name and then by phone number
		
		ListIterator<Contact> lst = dt.listIterator();
		
		while(lst.hasNext())
		{
			if (lst.next().compareTo(newContact) > 0)
			{
				lst.previous();
				lst.add( newContact);
				return;				
			}
			
		}
		lst.add(newContact);	
	}
	
	
			
	/**
	 * @param delContact - the specified Contact to be removed
	 * @return true if this list contained the specified Contact
	 */
	public boolean remove(Contact delContact)
	{
		ListIterator <Contact> st = dt.listIterator(); 
		
		while(st.hasNext())
		{
			if(st.next().equals(delContact))
			{
				//check if deletes 
				st.remove();
			}
			
		}
		st.remove();
		// To-do here
		return false; // remove this line after your coding ...
	}
	
	
	
	/**
	 * @param delContact - the duplicated elements to be removed
	 */
	public void removeDup(Contact delContact)
	{
		// To-do: remove duplicated elements in the list but keep one
		
		ListIterator <Contact> st = dt.listIterator();
		while(st.hasNext())
		{
			//if()
		}
		
		
	
	}
	
	
	public String display()
	{
		return dt.toString();
	}
}
