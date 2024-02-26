class Main { 
    public static void main(String[] args) {
        MagazineRack rack1 = new MagazineRack();
        rack1.addMagazine(new Magazine("TIMES", 1020));
        rack1.addMagazineBefore(new Magazine("TIMES", 1020), new Magazine("World Records 1996", 0));
        rack1.addMagazineAfter(new Magazine("TIMES", 1020), new Magazine("Telepathy 101", 267));
        rack1.displayRack();

    }
}