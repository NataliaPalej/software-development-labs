/**
 * 
 * @author Denis McCarthy
 * <p>An Class that describes a Student 
 */
public class Student 
{
	private String name;
	private int age;
	private int grade;
	
	public Student (Student s){
		this.name = s.name;
		this.age = s.age;
		this.grade = s.grade;
	}
	
	
	/**
	 * Creates a Student Object with default values
	 */
	public Student()
	{
		this.setName(null);
		this.setAge(0);
		this.setGrade(0);      
	}
	/**
	 * Creates a Student Object with parameters
	 * @param name
	 * @param age
	 * @param grade
	 */
	public Student(String name, int age, int grade)
	{
		this.setName(name);
		this.setAge(age);
		this.setGrade(grade);      
	}
	/**
	 * Returns the name of a particular Student
	 * @return The name
	 */
	public String getName()
	{
		return this.name;
	} 
	/**
	 * Returns the age of a particular Student
	 * @return The age
	 */
	public int getAge()
	{
		return this.age;  
	}
	/**
	 * Returns the grade of a particular Student
	 * @return The grade
	 */
	public int getGrade()
	{ 
		return this.grade;   
	}  
	/**
	 * Sets the name of a Student object to a parameter passed in
	 * @param name
	 */
	public void setName(String name)
	{
		this. name = name;
	}
	/**
	 * Sets the age of a Student object to a parameter passed in
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	/**
	 * Sets the grade of a Student object to a parameter passed in
	 * <p>Any grade outside 0-100 is set to 0
	 * @param grade
	 */
	public void setGrade(int grade)
	{
		if (grade >=0 && grade <= 100)
	    {
	    	this. grade = grade;
	    }
	    else
	    {
	    	this. grade = 0;
	    }      
	 }
	/**
	 * Prints out a Student Object
	 */
	 public void print()
	 {
		 System.out.println("Name = "+ this.getName());
	     System.out.println("Age = "+ this.getAge());               
	     System.out.println("Grade = "+ this.getGrade());       
	}

}
