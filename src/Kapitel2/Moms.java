package Kapitel2;
import java.util.Scanner;

public class Moms {
    public static void plusDanskMoms() {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast købesum: ");
        double købesum = input.nextDouble();
        double skat = købesum * 0.25;
        System.out.println("Momsen er DKK" + (int) (skat * 100) / 100.0);
    }

    public static void plusTyskMoms() {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast købesum: ");
        double købesum = input.nextDouble();
        double skat = købesum * 0.16;
        System.out.println("Momsen er EUR" + (int) (skat * 100) / 100.0);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Hvis du er dansk, tryk 1, hvis du er tysk, tryk 2, hvis du vil afslutte programmet, tryk enter");
            String svar = input.nextLine();

            if (svar.equals("1")) {
                plusDanskMoms();
            } else if (svar.equals("2")) {
                plusTyskMoms();
            } else {
                System.out.println("Tak fordi du bruger mig!");
                run = false;
            }
        }
    }
}


