public class MagazineRack {
    ListNode traveler;
    ListNode follower;
    static ListNode head = new ListNode(new Magazine("To Work A Magazine Rack", 1), null, null);

    public MagazineRack(){}

    public void removeMagazine(int index){
        traveler = head;
        if (index == 0) {
            head = traveler.getNextNode();
        }
        else {
            for(int counter = 0; counter != index; counter++) {
            follower = traveler;
            traveler = traveler.getNextNode();
            }
            traveler = traveler.getNextNode();
            follower.setNextNode(traveler);
        }
    }

    public void addMagazine(Magazine mag){
        traveler = head;
        while (traveler.getNextNode() != null) {
            traveler = traveler.getNextNode(); 
        }
        traveler.setNextNode(new ListNode(mag, null));
    } 

    public void addMagazine(int index, Magazine mag){
        traveler = head;
        if (index == 0) {
            head = new ListNode(mag, traveler);
        }
        else {    
            for(int counter = 0; counter != index; counter++) {
                follower = traveler;
                traveler = traveler.getNextNode(); 
            }
            follower.setNextNode(new ListNode(mag, traveler));
        }
    } 


    public void displayRack(){
        traveler = head;
        ((Magazine)traveler.getThisNode()).printMagazine();
        do {
            traveler = traveler.getNextNode();
            ((Magazine)traveler.getThisNode()).printMagazine();
        }
        while (traveler.getNextNode() != null);
            
    }
}
