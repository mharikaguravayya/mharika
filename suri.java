class student
{
	string name;
	int regno;
	public Student()
	{
	name="raju";
	regno=1234;
	}
	public Student (student s)
	{
	name=n;
	regno=r;
	}
	student(student s)
	{
	name=s.name;
	regno=s.regno;
	}
	void display()
	{
	System.out.println(name+"\t"+regno);
	}
}
class studentdemo
{
	public static void main (string args[])
	{
		Student s1=new student();
		Student s2= new
		Student("Ravi",1489);
		Student s3=new student(s1);
		s1.display();
		s2.display();
		s3.display();
	}
}


















c