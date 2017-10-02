package baseline.logical_layer;

/**
 *
 * @author Chris Kemerait
 */
import java.util.ArrayList;
import java.util.List;

public class CareerInterests
{
    private List interests;

    public CareerInterests ()
    {
        interests = new ArrayList();
    }

    public List getCareerInterests()
    {
        return interests;
    }

    public void addInterest(String interest)
    {
        if (!interests.contains(interest)) interests.add(interest);
    }
}