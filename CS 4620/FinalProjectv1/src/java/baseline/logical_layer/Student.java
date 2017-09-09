package baseline.logical_layer;

/**
 *
 * @author Chris Kemerait
 */

public class Student
{
    private Profile profile;
    private String name;

    public Student(String name, String studentNum)
    {
        this.name = name;
        profile = new Profile();
    }

    public Profile getProfile()
    {
        // begin-user-code
        return profile;
        // end-user-code
    }
    
    /** * * * @param theProfile the profile to set */

    public void setProfile(Profile theProfile)
    {
        // begin-user-code
        profile = theProfile;
        // end-user-code
    }

    /** * @return the name */
    public String getName()
    {
        return name;
    }

    /** * @param name the name to set */
    public void setName(String name)
    {
        this.name = name;
    }
}