public class Main
{
    public static void main(String[] args)
    {
        Student me = new Student(18, 1, "me");
        Student you = new Student(20, 3, "you");
        Classroom java = new Classroom(200, me);

        me.setAge(30);
        System.out.println(me.getAge());

        Student.amountSaved = 500;
        System.out.println(Student.amountSaved);

        System.out.println(you.amountSaved);

        you.amountSaved = 400;
        System.out.println(Student.amountSaved);

        java.setRepAge(20);
        System.out.println(java.getRepAge());

        String studentName = new Student("Alex", 14).name;
        // Creates object, but isn't referenced, so it cannot be accessed.

        System.out.println(java.getRepName());
    }
}
