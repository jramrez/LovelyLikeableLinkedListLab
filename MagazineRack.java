public class MagazineRack {
    ListNode traveler;
    ListNode follower;
    static ListNode head = new ListNode(new Magazine("To Work A Magazine Rack", 1), null);

    public MagazineRack(){}

    public void removeMagazine(Magazine mag){
        traveler = head;
        
        while (traveler.getThisNode() != mag) {
            follower = traveler;
            traveler = traveler.getNextNode();
        }
        traveler = traveler.getNextNode();
        follower.setNewNode(traveler);
    }

    public void addMagazine(Magazine mag){
        traveler = head;
        while (traveler.getNextNode() != null) {
            traveler = traveler.getNextNode(); 
        }
        traveler.setNewNode(new ListNode(mag, null));
    } 

    public void addMagazineBefore(Magazine target, Magazine mag){
        traveler = head;
        while (traveler.getThisNode() != target) {
            follower = traveler;
            traveler = traveler.getNextNode(); 
        }
        follower.setNewNode(new ListNode(mag, traveler));
    } 

    public void addMagazineAfter(Magazine target, Magazine mag){
        traveler = head;
        while (traveler.getThisNode() != target) {
            traveler = traveler.getNextNode(); 
        }
        traveler.setNewNode(new ListNode(mag, traveler.getNextNode()));
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
