package Students;

import Interfaces.ISinger;

/**
 * Created by hp on 10/27/2014.
 */
public class CivilStudent extends Student implements ISinger {

    public CivilStudent(String name)
    {
        super(name);
    }
    @Override
    public void sing() {
        System.out.println(getName()+ " sings Lady Gaga");
    }

    @Override
    public boolean attendingCourse(String courseName) {
        if (courseName == null)
            return false;

        return !(courseName.startsWith("Mil"));
    }
}
