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
            traveler.setPrevNode(follower);
        }
    }

    public void addMagazine(Magazine mag){
        traveler = head;
        while (traveler.getNextNode() != null) {
            traveler = traveler.getNextNode(); 
        }
        traveler.setNextNode(new ListNode(mag, null, traveler));
        head.setPrevNode(traveler.getNextNode());
    } 

    public void addMagazine(int index, Magazine mag){
        traveler = head;
        if (index == 0) {
            head = new ListNode(mag, traveler, head.getPrevNode());
            traveler.setPrevNode(head);
        }
        else {    
            for(int counter = 0; counter != index; counter++) {
                follower = traveler;
                traveler = traveler.getNextNode(); 
            }
            follower.setNextNode(new ListNode(mag, traveler, follower));
            traveler.setPrevNode(follower.getNextNode());
        }
    } 


    public void displayRack(char mode) {
        traveler = head;
        if (mode == 'F') {
            ((Magazine)traveler.getThisNode()).printMagazine();
            do {
                traveler = traveler.getNextNode();
                ((Magazine)traveler.getThisNode()).printMagazine();
            }
            while (traveler.getNextNode() != null);
        }
        else if (mode == 'B') {
            traveler = head.getPrevNode();
            ((Magazine)traveler.getThisNode()).printMagazine();
            do {
                traveler = traveler.getPrevNode();
                ((Magazine)traveler.getThisNode()).printMagazine();
            }
            while (traveler.getPrevNode() != head.getPrevNode());
        }
        else {
            System.out.println("Invalid Mode");
        }
    }

    public void displayRackLoop(int loops, char mode) {
        traveler = head.getPrevNode();
        traveler.setNextNode(head);
        traveler = head;
        int counter = 0;
        if (mode == 'F') {
            ((Magazine)traveler.getThisNode()).printMagazine();
            do {
                traveler = traveler.getNextNode();
                ((Magazine)traveler.getThisNode()).printMagazine();
                if ((traveler.getNextNode()).equals(head)) {
                    counter++;
                }
            }
            while (counter != loops);
        }
        else if (mode == 'B') {
            do {
                traveler = traveler.getPrevNode();
                ((Magazine)traveler.getThisNode()).printMagazine();
                if (traveler.equals(head)) {
                    counter++;
                    System.out.println("----LOOP " + counter + "----");
                }
            }
            while (counter != loops);
        }
        else {
            System.out.println("Invalid Mode");
        }
        traveler = head.getPrevNode();
        traveler.setNextNode(null);
    }
}
