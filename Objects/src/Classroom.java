import java.util.ArrayList;

public class Classroom
{
    private int classSize;
    private Student rep;
    private ArrayList<Student> stlist;

    Classroom(int classSize, Student rep)
    {
        this.classSize = classSize;
        this.rep = rep;
    }

    public int getRepAge()
    {
        return rep.getAge();
    }

    public void setRepAge(int age)
    {
        this.rep.setAge(age);
    }

    public String getRepName(){
        return rep.getName();
    }
}
