package baseline.logical_layer;

/**
 *
 * @author Chris Kemerait
 */
import java.util.ArrayList;
import java.util.List;

public class StudentInfoManager
{

	private List<Student> students;

	public StudentInfoManager()
	{
		students = new ArrayList<Student>();
		stubCollection();
	}

	/**
	 * @return
	 */
	public StudentNameCollection getAllStudentNames()
	{
		// begin-user-code
		StudentNameCollection names = new StudentNameCollection();
		for (int i = 0; i < students.size(); i++)
			names.addName(students.get(i).getName());
		return names;
		// end-user-code
	}

	/**
	* @param s
	 * @return
	 */
	public Student getStudent(String name)
	{
		// begin-user-code
		Student s = null;
		int location = getStudentLocation (name);
		if (location >= 0)
			s = students.get(location);
		return s;
		// end-user-code
	}

	/**
	 * @param s
	 */
	public void storeStudent(Student s)
	{
		// begin-user-code
		int location = getStudentLocation(s.getName());
		if (location >= 0)
			students.set(location, s);
		else
			students.add(s);
		// end-user-code
	}

	private int getStudentLocation (String name)
	{
		int i = 0;
		while (i < students.size() && !students.get(i).getName().equals(name))
			i++;
		if (i == students.size())
			i = -1;
		return i;
	}

	private void stubCollection()
	{
		Student s1 = new Student ("Bubba Dawg", "666666666");
		CareerInterests c1 = new CareerInterests();
		c1.addInterest("Taco Bell");
		c1.addInterest("chewing tobacco");
		Profile p1 = new Profile (c1);
		s1.setProfile(p1);
		students.add(s1);
		Student s2 = new Student ("Barbara Brilliant", "999999999");
		CareerInterests c2 = new CareerInterests();
		c2.addInterest("medicine");
		c2.addInterest("nuclear physics");
		Profile p2 = new Profile (c2);
		s2.setProfile(p2);
		students.add(s2);
		Student s3 = new Student ("Joe Selfish", "000000000");
		CareerInterests c3 = new CareerInterests();
		c3.addInterest("politics");
		c3.addInterest("power");
		Profile p3 = new Profile (c3);
		s3.setProfile(p3);
		students.add(s3);
	}
}