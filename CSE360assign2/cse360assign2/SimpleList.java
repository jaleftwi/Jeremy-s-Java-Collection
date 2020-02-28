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
		
		if (count > list.length) // Will create temporary list to copy elements and enlarge list
		{
			int tempList[] = new int[list.length];
			for (int pos = 0; pos < list.length; pos++)
			{
				tempList[pos] = list[pos];
			}
			
			int size = (list.length * 3) / 2;
			list = new int[size];
			for (int pos = 0; pos < tempList.length; pos++)
			{
				tempList[pos] = list[pos];
			}
		}
		
		for (int looper = count-1; looper > 0; looper--)
		{
			list[looper] = list[looper-1];
		}
		list[0] = value;
	}
	
	
	/** 
	 * Method to remove first instance of the requested integer value from list, 
	 * which will decrease the count.
	 * @param value This is the requested integer to be removed from the list.
	 */
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
		
		int emptySpace = list.length - count;
		if (emptySpace > (list.length / 4)) // Create temporary list for reduction (not below 1)
		{
			int tempList[] = new int[count];
			for (int pos = 0; pos < count; pos++)
			{
				tempList[pos] = list[pos];
				
				System.out.println(tempList[pos]);				
			}

			int size = (list.length * 3) / 4;
			
			if (size >= 1)
			{
				list = new int[size];
				for (int pos = 0; pos < tempList.length; pos++)
				{
					tempList[pos] = list[pos];
				}
			}
			else
			{
				list = new int[1];
			}
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
	public void append(int value)
	{
		count++;
		if (count > list.length) // Will create temporary list to copy elements and enlarge list
		{
			int tempList[] = new int[list.length];
			for (int pos = 0; pos < list.length; pos++)
			{
				tempList[pos] = list[pos];
			}
			
			int size = (list.length * 3) / 2;
			list = new int[size];
			for (int pos = 0; pos < tempList.length; pos++)
			{
				tempList[pos] = list[pos];
			}
		}
		
		list[count-1] = value;
	}
	
	
	/**
	 * Method to obtain the first value of the list.
	 * @return first The first element of the list.
	 */
	public int first()
	{
		int first = -1;
		
		if (count > 1)
		{
			first = list[0];
		}
		
		return first;
	}
	
	
	/**
	 * Method to obtain the last value of the list.
	 * @return last The last element of the list.
	 */
	public int last()
	{
		int last = -1;
		
		if (count > 1)
		{
			last = list[count-1];
		}
		
		return last;
	}
	
	
	/**
	 * Method to obtain the current available space that can be used in the list.
	 * @return size The current number of values that can be held in the list
	 */
	public int size()
	{
		int size = list.length;
		return size;
	}

} // end of SimpleList class

