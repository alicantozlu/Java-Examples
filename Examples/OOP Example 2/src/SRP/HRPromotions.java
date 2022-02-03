package SRP;

public class HRPromotions {
    public boolean isPromotionDueThisYear(Employee emp, boolean boo) {
        if (boo == true) {
            System.out.println("Hadi yine iyisin.");
            return true;
        } else {
            return false;
        }
    }
}
