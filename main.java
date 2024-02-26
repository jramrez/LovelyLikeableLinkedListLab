class Main { 
    public static void main(String[] args) {
        MagazineRack rack1 = new MagazineRack();
        Magazine mag1 = new Magazine("TIMES", 1020);
        rack1.addMagazine(mag1);
        rack1.addMagazineBefore(mag1, new Magazine("World Records 1996", 0));
        rack1.addMagazineAfter(mag1, new Magazine("Telepathy 101", 267));
        rack1.displayRack();

    }
}