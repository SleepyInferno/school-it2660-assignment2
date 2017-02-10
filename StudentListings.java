



public class StudentListings
{ 	String name;  // key field
    int ID;
    double GPA;
   public StudentListings(String n, int ident, double gp )
  {  
	  name = n;
      ID = ident;
      GPA = gp;
  }
   public String output( )
   {   
	   return("Name: " + name + "\nID: " + ID + "\nGPA: " + GPA + "\n \n");
   }
   public StudentListings deepCopy( )
   {  StudentListings clone = new StudentListings(name, ID, GPA);
      return clone;
   }
   public int compareTo(String targetKey)
   {  return(name.compareTo(targetKey));
   }

   public void inputStudentListings(String na, int i, double g)
   {
	  name = na;
      ID = i;
      GPA = g;
   }
   public StudentListings()
   {
	   
   }
  }
