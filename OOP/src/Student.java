public class Student
{
    private String name;
    private int age;
    private String courseName;


    void changeCourse(String newCourse)
    {
        courseName = newCourse;
    }

    void updateAge(int newAge)
    {
        age = newAge;
    }

    void setName(String newName)
    {
        name = newName;
    }

    String getName()
    {
        return name;
    }

    void printStates()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course Name: " + courseName);
    }

    Student(String studentName, int studentAge, String studentCourseName)
    {
        name = studentName;
        age = studentAge;
        courseName = studentCourseName;
    }

}
