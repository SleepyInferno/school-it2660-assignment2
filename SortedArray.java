

public class SortedArray
{
	private int next;
    private int size;
    private StudentListings[ ] data;
    
    
    public SortedArray(int i)
    {   size = i;
        data = new StudentListings[size];
     }
    public boolean insert(StudentListings targetKey)
    {
    	StudentListings[] student = new StudentListings[size + 1];
    	if(student.length >= size)
    	{
            return false;
    	}
         data[next]= targetKey.deepCopy( );
         if(data[next] == null)
         {
            return false;
         }
         else
         {
         next = next + 1; 
         return true;
         }
    }
	public StudentListings[] arraySort(StudentListings list[])
	{
		int p;
		boolean key = false;
		StudentListings temp;
		while (key)
		{
			key = true;
            for (p = 0;  p < list.length - 1;  p++)
            {
                if (list [p].name.compareToIgnoreCase(list [p+1].name) > 0)
                {
                    temp = list [p];
                    list [p] = list [p+1];
                    list [p+1] = temp;
                    key = true;
                }
            }
        }
        return list;
	}
    public StudentListings fetch(String targetKey)
    {  StudentListings node;
        StudentListings temp;
        int i = 0;
        while ( i < next && !(data[i].compareTo(targetKey) == 0))
        {  i++;
        }
      if(i== next) // node not found
          return null;
      //deep copy the node's information into the client's node
         node = data[i].deepCopy( );
      // move the node up one position in the array, unless it is the first node
         if(i != 0) // bubble-up accessed node
        {   temp = data[i-1];
             data[i-1] = data[i];
             data[i] = temp;
        }
        return node;
    } // end of fetch method
    
    public boolean delete(String targetKey) {
        //boolean isDeleted = false;
        int isFound = -1;
        StudentListings[] newStudent = new StudentListings[data.length - 1];
        
        for (StudentListings student : data) {

            if (student.name.equals(targetKey)) {
            	isFound = 0;
                //isDeleted = true;
                next++;
            }
            
            if (isFound < 0 && next < data.length - 1) {
                newStudent[next] = data[next];
                next++;
            }
            nodeDeleted = false;
        }
            students = newArray;
            return true;
        }
    
    public boolean update(String targetKey, StudentListings newStudent) {
        delete(targetKey);
        insert(newStudent);
        return true;
    }
}