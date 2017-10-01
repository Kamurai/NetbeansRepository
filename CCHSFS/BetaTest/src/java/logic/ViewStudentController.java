package logic;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.SessionScoped;
import java.sql.*;
import java.sql.ResultSet;

/**
 *
 * @author Chris Kemerait
 */
@ManagedBean(name="ViewStudentController")
@RequestScoped
//@SessionScoped
public class ViewStudentController
{
	private StudentInfoManager manager;
        //private StudentNameCollection snc = manager.getAllStudentNames();

	public ViewStudentController()//StudentInfoManager manager)
	{
		this.manager = new StudentInfoManager();
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

        public Student getLocalStudent(int index)
        {
            return manager.getLocalStudent(index);
        }

        public int getSizeofStudents()
        {
            return getStudentNames().getSize();
        }

        public int getSizeofStudentCI(Student s)
        {
            return s.getSizeofStudentCI();
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
