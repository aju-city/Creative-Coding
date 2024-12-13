public class Main
{
    public static void main(String[] arg)
    {
        System.out.println("Hello");
        Film Titanic = new Film("Titanic", 1997, 3.25, 100);

        System.out.println("Titanic was released in " + Titanic.getRealeaseYear());
    }
}