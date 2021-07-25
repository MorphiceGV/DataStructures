package lab3;

/***************************************************************************
 * A Linked List class with a private static inner Node class.
 * @author MorphiceGV
 *****************************************************************************/

import java.util.*;

public class MySingleLinkedList<E>
{
   private Node<E> head;

 /**
   *  Constructs an empty list
   */
   public MySingleLinkedList()
   {
      head = null;
   }
 /**
   *  Returns true if the list is empty
   *  @return true/false - empty/not empty
   */
   public boolean isEmpty()
   {
      return head == null;
   }
 /**
   *  Inserts a new node at the beginning of this list.
   *  @param item - element to add
   *
   */
   public void addFirst(E item)
   {
      head = new Node<E>(item, head);
   }
 /**
  *  Returns the first element in the list.
  *  @return the head of the list
  *  @exception NoSuchElementException if an empty list
  */
   public E getFirst()
   {
      if(head == null) throw new NoSuchElementException();

      return head.data;
   }
   
 /**
   *  Removes the first element in the list.
   *  @return head of the list
   *
   */
   public E removeFirst()
   {
      E tmp = getFirst();
      head = head.next;
      return tmp;
   }
   
   
 /**
   *  Inserts a new node to the end of this list.
   *  @param item - the element to add at the end of list
   */
   public void addLast(E item)
   {
      if( head == null)
         addFirst(item);
      else
      {
         Node<E> tmp = head;
         while(tmp.next != null) tmp = tmp.next;

         tmp.next = new Node<E>(item, null);
      }
   }
   
   /**
    *  Removes all nodes from the list.
    *
    */
    public void clear()
    {
       head = null;
    }   
 
 /**
   *  @return a string representation
   *
   */
   public String toString()
   {
      StringBuffer result = new StringBuffer();
      Node<E> tmp = head;
      
      while(tmp != null)
      {
    	  tmp = tmp.next;
      	  result.append(tmp + " ");
      }
      
      return result.toString();
   }
 /**
   *  Inserts a new node after a node containing the key
   *  @param key - the data of existing node included in the list 
   *  @param toInsert - the data of the new node to be inserted 
   */
   public void insertAfter(E key, E toInsert)
   {
      Node<E> tmp = head;

      while(tmp != null && !tmp.data.equals(key)) tmp = tmp.next;

      if(tmp != null)
         tmp.next = new Node<E>(toInsert, tmp.next);
   }
 
   /*
    * ================================   The following functions need to be filled ===================================================
    */
   
   /**
    *  Returns the last element in the list.
    *  @return  last element in the list
    *  @throws  NoSuchElementException if the list is empty
    */
    public E getLast()
    {
    	 Node<E> tmp = head;
    	  
  if(tmp == null)
	  throw new NoSuchElementException(); 
  
   while(tmp != null && tmp.next != null )
	   tmp = tmp.next;
        return tmp.data; 
    }

  /**
    *  Returns true if this list contains the specified element.
    *  @param item - element to be checked
    *  @return True - if contained; otherwise False 
    *
    */
    public boolean contains(E item)
    {
    	    Node <E> tmp = head; 

		while (tmp != null) {

			if (tmp.data.equals(item)) 
			{
				return true;
			} 
			
			else {
				
				tmp = tmp.next;
			}
		}
		return false;
	}
       
    /**
     *  Returns the data at the specified position in the list.
     *  @param  the position index
     *  @return  the data contained at the given position index
     *  @throws  IndexOutOfBoundsException if pos is larger than the size of list
     *
     */
    public E get(int pos)
    {
    	 Node <E> tmp = head; 
    	 int counter =0 ; 
     	 	
  while(tmp != null  )
    {
    	if(counter != pos)
    	{
    		tmp = tmp.next; 
    		counter++;
    	}
    	else
    	{ 
    		return tmp.data;
    	}
    	
   
    }
    
  if (pos > counter)
	throw new IndexOutOfBoundsException();
  
    	return tmp.data;  //remove this line after your implementation
    }
    
         
     /**
      * Count the number of occurrence of key 
      * @param key - the element to be counted
      */
     public int countApperance(E key)
     { 
    	 
    	 Node <E> tmp = head;
    	 
    	 int ret = 0;
    	     	 
    	 while( tmp != null)
    	 {
    		 if(tmp.data.equals(key) )
    		 {	 
    			 ret++;
    			 
    		 }
    		 tmp = tmp.next;
    		 
    	 }
    	
    	     	 
    	 return ret;    	 
     }
   
     
     /**
      *  Removes the first occurrence of the specified element in this list.
      *  @param key - the element to be removed
      *
      */
      public void remove(E key)
      {
    	  boolean match = false;
    	
    	  Node <E> tmp = head; 
    	  while(tmp != null && !match)
    	  {
    		  if(tmp.data.equals(key))
    		  {	
    			  match = true;
    			  clear();
    		  }
    		  
    		  else {
    			  tmp = tmp.next;
    		  }
    	  }
    	  
      }
    
     
     
 /**
   *  Removes all the occurrence of the specified element in this list.
   *  @param key - the element to be removed
   *
   */
   public void removeAll(E key)
   {	 	   
	
	   Node <E> tmp = head;
	   Node <E> next = tmp.next;
	   if (head == null)
		   throw new NoSuchElementException();
	   
	   else 
	   {
		   while(tmp != null)
		   {
			   if (tmp.data == key)
			   {
				   tmp.data = next.data;
				   remove(key);
				   
			   }
			   tmp = tmp.next;
		   }
	   }
	   
	   
   }
 
 
 /*******************************************************
 *
 *  The Node class
 *
 ********************************************************/
   private static class Node<E>
   {
      private E data;
      private Node<E> next;

      public Node(E data, Node<E> next)
      {
         this.data = data;
         this.next = next;
      }
   }

}