package baseline.logical_layer;

/**
 *
 * @author Chris Kemerait
 */
public class ManageStudentController
{
	private StudentInfoManager manager;


	public ManageStudentController(StudentInfoManager manager)
	{
		this.manager = manager;
	}

	/**
	 * @param id
	 * @return
	 */
	public Student getStudent(String id)
	{
		// begin-user-code
		return manager.getStudent(id);
		// end-user-code
	}

	/**
	 * @param s
	 * @return
	 */
	public Boolean saveStudent(Student s)
	{
		// begin-user-code
		boolean valid = validateStudent (s);
		if (valid)
			manager.storeStudent(s);
		return valid;
		// end-user-code
	}

	/**
	 * @param s
	 * @return
	 */
	private Boolean validateStudent(Student s)
	{
		// begin-user-code
		// TODO Auto-generated method stub
		return true;
		// end-user-code
	}
}
