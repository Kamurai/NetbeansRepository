package baseline.logical_layer;

/**
 *
 * @author Chris Kemerait
 */
import java.util.ArrayList;
import java.util.List;

public class StudentNameCollection
{
	private List<String> names;

	public StudentNameCollection()
	{
		names = new ArrayList<String>();
	}

	/**
	 * @return the names
	 */
	public List<String> getNames()
	{
		return names;
	}

	public void addName (String name)
	{
		names.add(name);
	}
}