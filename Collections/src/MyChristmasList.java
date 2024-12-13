import java.util.ArrayList;

public class MyChristmasList {
    private ArrayList<String> myList;

    // Getter method
    public ArrayList<String> getMyList() {
        return myList;
    }

    // Setter method
    public void setMyList(ArrayList<String> myList) {
        this.myList = myList;
    }

    // Constructor
    MyChristmasList() {
        myList = new ArrayList<String>();
    }
}
