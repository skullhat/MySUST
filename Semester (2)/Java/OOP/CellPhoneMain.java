public class CellPhoneMain {
    public static void main(String[] args) {
        CellPhone p1 = new CellPhone();
        p1.setManufact("Samsong");
        p1.setPrice(1000);
        p1.setModele("Galxy Note 10");
        System.out
                .println("Your phone is " + p1.getManufact() + " " + p1.getModle() + " and it cost: " + p1.getPrcie());
    }
}
