import java.util.Scanner;

public class Course_IDS_Name {
	//Public variables
	public int course_ID;
	public String course_name;

	public Course_IDS_Name(int i, String str) {
		// TODO Auto-generated constructor stub
		this.course_ID = i;
		this.course_name = str;
		
	}

	// Linear Search
	public static void LinearSearch (Course_IDS_Name[] arrs, int course_ID) {
			for (int i = 0; i < arrs.length; i++) 
			{  
			 //Complexity O(n)
				if(course_ID == arrs[i].course_ID) {
				 System.out.println("Element found!");
				 break;
			 }		 			
		 }
		 if(course_ID == arrs.length)
		 {
			 System.out.println("Element not found!");
		 }		 
	}
	
	// Binary Search
	public static void BinarySearch(Course_IDS_Name[] arrs, int course_ID) {
		int first = 0;
		int last = (arrs.length -1);
		int mid = (first + last) /2;
	
		
		while (first<=last)
		{
			if(arrs[mid].course_ID < course_ID) {
				first = mid + 1;
			}
			else if(arrs[mid].course_ID == course_ID) {
				System.out.println("Element is found at position: " + arrs[mid].course_ID + " \nCourse Name is: " +arrs[mid].course_name);  
				break;
			}
			else 
			{
				last = mid-1;
			}
				mid = (first+last)/2;
		}
		if (first > last ){  
		      System.out.println("Element is not found!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Course_IDS_Name[] arrs = new Course_IDS_Name[8];
		
		//Creating a string Array with the ID as integer and corresponding Course Name
		
		//Here I am loading the class variables manually, we can read it from the file as well
		
		//Load file
		
		
		arrs[0] = new Course_IDS_Name(517,"Enterprise Application Development1");
		arrs[1] = new Course_IDS_Name(518,"Enterprise Application Development2");
		arrs[2] = new Course_IDS_Name(519,"Enterprise Application Development3");
		arrs[3] = new Course_IDS_Name(520,"Enterprise Application Development4");
		arrs[4] = new Course_IDS_Name(521,"Enterprise Application Development5");
		arrs[5] = new Course_IDS_Name(522,"Enterprise Application Development6");
		arrs[6] = new Course_IDS_Name(523,"Enterprise Application Development7");
		arrs[7] = new Course_IDS_Name(524,"Enterprise Application Development8");
		
		

		// Asking the user to input which algorithm search they want to use
		int AlgotithmSelection;
				
		// Asking the user to input based on the ID and giving the result as the corresponding Course name
		int course_id;
		
		System.out.println("Enter the type of algorithm you want to use: " + "\n" + "1. Linear Search  2. Binary Search?  3. Recursive");
		
		AlgotithmSelection = sc.nextInt();
		System.out.println("Enter the course ID to be searched");
		course_id = sc.nextInt();
		if(AlgotithmSelection == 1) {
			LinearSearch(arrs, course_id);
		}else if(AlgotithmSelection == 2){
			BinarySearch(arrs, course_id);
		}else if(AlgotithmSelection == 3) {
			
		}
		
		
						
	}

}