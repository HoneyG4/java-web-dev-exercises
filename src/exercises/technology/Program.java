package exercises.technology;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        LapTop tobi = new LapTop(28,300,true,LocalDate.of(2023,10,7));
        Smartphone lizzie = new Smartphone(20,230,true, 25);
       lizzie.addApp();
       lizzie.removeApp();
       lizzie.removeApp();
        System.out.println(lizzie.getNumOfApps());
        System.out.println(tobi.isUpdated());
    }

}
