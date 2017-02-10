

public class SortedArray
{
	int next;
    int size;
    StudentListings[ ] data;
    
    
    public SortedArray(int i)
    {   size = i;
        data = new StudentListings[size];
     }
    public boolean insert(StudentListings newStudent)
    {
    	int isInsert = -1;
    	StudentListings[] student = new StudentListings[size + 1];
    	if(student.length > size)
    	{
            return false;
    	}
    	int count = 0;
         if(data.length == 0)
         {
            student [count] = newStudent;
            isInsert = 0;
         }
         for (int i = 0; i < data.length; i++)
         {
        	 student[count] = data[i];
        	 count++;
        	 if (isInsert == -1)
        	 {
        		 student[count] = newStudent;
        		 isInsert = 0;
        		 count++;
        	 }
         }
         
         data = student; 
         return true;
         
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
      if(i== next)
          return null;
         node = data[i].deepCopy( );
         if(i != 0) 
        {   temp = data[i-1];
             data[i-1] = data[i];
             data[i] = temp;
        }
        return node;
    } // end of fetch method
    
    public boolean delete(String targetKey) {
        int isFound = -1;
        int count = 0;
        StudentListings[] newStudent = new StudentListings[data.length - 1];
        
        for (StudentListings student : data) {

            if (student.name.equals(targetKey)) {
            	isFound = 0;
                //isDeleted = true;
                count++;
            }
            
            if (isFound < 0 && next < data.length - 1) {
                newStudent[next] = data[count];
                count++;
                next++;
            }
            isFound = -1;
        }
            data = newStudent;
            return true;
        }
    
    public boolean update(String targetKey, StudentListings newStudent) {
        delete(targetKey);
        insert(newStudent);
        return true;
    }
}