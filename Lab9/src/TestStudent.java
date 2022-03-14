
public class TestStudent 
{

	public static void main(String[] args) 
	{	
	
		Student s1 = new Student();
		s1.print();
		s1.setName("John Doe");
		s1.setAge(21);
		s1.setGrade(56);
		s1.print();
		Student s2 = new Student("Jane Doe", 18, 275);
		s2.print();
		System.out.println();
		
		Student s3 = new Student (s2);
		System.out.println("Original");
		s2.print();
		System.out.println();
		
		//s3.print();
		s3.setName("AMMAR");
		s3.setAge(20);
		s3.setGrade(99);
		System.out.println("copy");
		s3.print();


	}

}
