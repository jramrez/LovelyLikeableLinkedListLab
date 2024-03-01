class Main { 
    public static void main(String[] args) {
        Library.clearConsole();
        MagazineRack rack1 = new MagazineRack();
        rack1.addMagazine(new Magazine("TIMES", 1020));
        rack1.addMagazine(new Magazine("TIMES", 1021));
        rack1.addMagazine(new Magazine("TIMES", 1022));
        rack1.addMagazine(new Magazine("TIMES", 953));
        rack1.addMagazine(3, new Magazine("TIMES", 1020));
        rack1.addMagazine(0, new Magazine("Old York Times", 20));
        
        rack1.displayRack('B');

    }
}