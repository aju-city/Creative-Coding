public class Film
{
    private String title;
    private int realeaseYear;
    private double duration;
    private int soldTickets;

    Film(String title, int realeaseYear, double duration, int soldTickets)
    {
        this.title = title;
        this.realeaseYear = realeaseYear;
        this.duration = duration;
        this.soldTickets = soldTickets;
    }

    String getTitle()
    {
        return title;
    }

    int getRealeaseYear()
    {
        return realeaseYear;
    }

    double getDuration()
    {
        return duration;
    }

    int getSoldTickets()
    {
        return soldTickets;
    }

}
