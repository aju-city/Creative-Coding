public class Student {
    private int age;
    private int year_group;
    static int amountSaved;
    String name;

    Student(int a, int b, String n)
    {
        age = a;
        year_group = b;
        name = n;

    }

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    void setAge(int age)
    {
        this.age = age;
    }

    String getName(){
        return name;
    }
}
