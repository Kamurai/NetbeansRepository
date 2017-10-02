package baseline.logical_layer;

/**
 *
 * @author Chris Kemerait
 */
public class ViewStudentController
{
	private StudentInfoManager manager;


	public ViewStudentController(StudentInfoManager manager)
	{
		this.manager = manager;
	}

	/**
	 * @return
	 */
	public StudentNameCollection getStudentNames()
	{
		// begin-user-code
		return manager.getAllStudentNames();
		// end-user-code
	}

	/**
	 * @param s
	 * @return
	 */
	public Student getStudent(String stuNum)
	{
		// begin-user-code
		return manager.getStudent(stuNum);
		// end-user-code
	}
}
