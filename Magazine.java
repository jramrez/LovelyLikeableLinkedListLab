public class Magazine {
    private String magName;
    private int magIssue;
    private String magPublisher;

    public Magazine(String name, int issueNum, String publisher) {
        magName = name;
        magIssue = issueNum;
        magPublisher = publisher;
    }

    public Magazine(String name, int issueNum) {
        magName = name;
        magIssue = issueNum;
    }

    public void printMagazine() {
        System.out.println(magName + " " + magIssue);
        if (magPublisher != null) {
            System.out.println("The publisher is " + magPublisher);
        }
    }
    
}
