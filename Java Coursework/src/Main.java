import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] allNames = {"James", "Lily", "Harry", "Ron", "George", "Fred"};
        int[] allStudentIDs= {100, 101, 102, 103, 104, 105};
        ExpeditionMember[] members;

        Random rand = new Random();
        int numberOfMembers = rand.nextInt(3) + 4;
        members = new ExpeditionMember[numberOfMembers];

        for (int i = 0; i < members.length; i++) {
            members[i] = new ExpeditionMember(allNames[i], allStudentIDs[i]);
        }

        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0], members[1], members[2]);
        ResearchExpedition nileExpedition = new ResearchExpedition(members[members.length-3], members[members.length-2], members[members.length-1]);

        System.out.println("Pyramid Expedition:\nExpedition Leader: " + pyramidExpedition.getExpeditionLeaderName() + "\nArchivist: " + pyramidExpedition.getArchivistName() + "\nField Researcher: " + pyramidExpedition.getFieldResearcherName());
        System.out.println("\nNile Expedition:\nExpedition Leader: " + nileExpedition.getExpeditionLeaderName() + "\nArchivist: " + nileExpedition.getArchivistName() + "\nField Researcher: " + nileExpedition.getFieldResearcherName());

        if(ExpeditionMember.member_counter == numberOfMembers){
            System.out.println("\nSUCCESS");
        }
        else{
            System.out.println("\nFAILED");
        }
    }
}
