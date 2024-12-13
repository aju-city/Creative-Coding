public class ExpeditionMember {
    private String name;
    private int studentID;
    public static int member_counter = 0;

    // Setter methods for name, ID, name and ID

    public void setName(String name){
        this.name = name;
    }

    public void setStudentId(int studentID){
        this.studentID = studentID;
    }

    public void setMemberDetails(String name, int studentID ){
        this.name = name;
        this.studentID = studentID;
    }

    // Getter methods for name, ID, name and ID

    public String getName(){
        return name;
    }

    public int getStudentID(){
        return studentID;
    }

    public String getMemberDetails() {
        return "Name: " + name + ", Student ID: " + studentID;
    }

    // Constructor Method

    public ExpeditionMember(String name, int studentID){
        this.name = name;
        this.studentID = studentID;
        member_counter++;
    }
}
