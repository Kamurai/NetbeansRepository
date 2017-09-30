package baseline.logical_layer;

/**
 *
 * @author Chris Kemerait
 */
public class Profile
{
    /** * * */
    private CareerInterests interests;
    public Profile ()
    {
        interests = new CareerInterests();
    }

    public Profile(CareerInterests interests)
    {
        this.interests = interests;
    }
    /** * @return the interests */

    public CareerInterests getInterests()
    {
        return interests;
    }
    /** * @param interests the interests to set */

    public void setInterests(CareerInterests interests)
    {
        this.interests = interests;
    }
}