/**
 * Name: Jeremy Leftwich
 * Course: CSE360
 * Class 359
 * Purpose: This is the code for class SimpleListTest, which allows for testing of the
 * SimpleList class file 
 */

package cse360assign2;

/**
 * 	SimpleList allows for the creation of a 10 element array (which are integers) allowing
 * 	for the addition, search, and removal of elements, while keeping count of the
 * 	number of active elements. 
 */
public class SimpleList {
	
	// Declaration of Variables
	
	/**
	 * A list that will contain an amount of desired integers.
	 */
	private int[] list;
	
	/**
	 * The number of elements being contained in the list.
	 */
	private int count;
	
	
	// Declaration of Methods
	
	/**
	 * Constructs a simple list object that can hold any number of elements.
	 * Count of the elements in the list begins at 0.
	 */
	public SimpleList()
	{
		list = new int[10];
		count = 0;
	}
	
	
	/** 
	 * Method to add integer value into beginning of list, which will increase the count.
	 * If the array needs to be enlarged, the array size will increase by 50%
	 * @param value This is the requested integer to be added into the list.
	 */
	public void add(int value)
	{
		count++;
		
		for (int looper = count-1; looper > 0; looper--)
		{
			list[looper] = list[looper-1];
		}
		list[0] = value;
		
		count--;
	}
	
	
	/** 
	 * Method to remove first instance of the requested integer value from list, 
	 * which will decrease the count.
	 * @param value This is the requested integer to be removed from the list.
	 */
	public void remove(int value)
	{
		int index = search(value);
		
		if(index != -1)
		{
			for (int looper = index; looper < 9; looper++)
			{
				list[looper] = list[looper+1];
			}
			count--;
		}
	}
	
	
	/**
	 * Method to return integer count of list elements
	 * @return count This is the number of elements in the list.
	 */
	public int count()
	{
		return count;
	}
	
	
	/**
	 * Method to print current list elements
	 * @return message This is the naming of all current elements in the list.
	 * 				   Each element is separated by a space.
	 */
	public String toString()
	{
		String message = "";
		
		if(count != 0)
		{
			message = message + list[0];
			for (int looper = 1; looper < count; looper++)
			{
				message = message + " " + list[looper];
			}
		}
		
		return message;
	}
	
	
	/** 
	 * Method to search for the index integer of a given value (given as an integer).
	 * @param value This is the requested integer to be located in the list.
	 * @return index This is the first located instance where the requested element was found.
	 */
	public int search(int value)
	{
		int index = -1;
		
		for(int looper = 0; looper < count; looper++)
		{
			if(index == -1 && list[looper] == value)
			{
				index = looper;
			}
		}
		
		return index;
	}
	
	/**
	 * Method to add integer value into end of list, which will increase the count.
	 * If the array needs to be enlarged, the array size will increase by 50%
	 * @param value This is the requested integer to be added into the list.
	 */

} // end of SimpleList class

