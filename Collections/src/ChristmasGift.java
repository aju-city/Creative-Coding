public class ChristmasGift {
    private String name;
    private String recipient;
    private int price;

    // Getter methods
    public String getName(){
        return name;
    }

    public String getRecipient(){
        return recipient;
    }

    public int getPrice(){
        return price;
    }

    // Setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    public void setPrice(int price){
        this.price = price;
    }

    // Constructor
    ChristmasGift(String name, String recipient, int price){
        this.name = name;
        this.recipient = recipient;
        this.price = price;
    }
}
