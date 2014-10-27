package Students;

/**
 * Created by hp on 10/27/2014.
 */
/*
   This is the abstract class
 */
public abstract class Student {
    /*This is the student*/
    private String mName;

    public Student(String name)
    {
        this.mName= name;
    }

    /*
       This method must be overwritten by all the subclasses

       $param courseName   The name of the course
     */
    public abstract boolean attendingCourse (String courseName);

    public void setName(String name)
    {
        this.mName= name;
    }

    public String getName()
    {
        return mName;
    }
}
