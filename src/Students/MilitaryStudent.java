package Students;

import Exceptions.SingException;
import Interfaces.ISinger;

/**
 * Created by hp on 10/27/2014.
 */
public class MilitaryStudent extends Student implements ISinger {

    public boolean isOfficer=false;

    public MilitaryStudent(String name){
        super(name);
    }

    @Override
    public boolean attendingCourse(String courseName) {
        if (courseName == null)
            return false;

        return (courseName.startsWith("Mil"));
    }

    public MilitaryStudent(String name, String rank)
    {
        super(rank+" "+name);
        checkisOfficer();
    }

    @Override
    public void sing() throws SingException {
        if (getName()==null)
            throw new SingException("The name od the student is invalid!");
        System.out.println(getName()+ " sings the anthem");
    }



    public  void checkisOfficer()
    {

    }

    public boolean isOfficer()
    {
       return false;
    }
}
