import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.String.*;

public class kapitel2 {

    public static class opgave1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter miles: ");
            int number = Integer.valueOf(scan.nextLine());
            System.out.println(number + " miles is " + (Math.round((number * 1.6) * 10) / 10.0) + " kilometers");
        }
    }

    public static class opgave2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the length of the sides and height of the Equilateral triangle:");
            double length = Double.parseDouble(scan.nextLine());

            double area = ((sqrt(3) / 4) * pow(length, 2));
            System.out.println("The area is " + roundto2(area));

            double volume = area * length;
            System.out.println("The volume of the Triangular prism is " + roundto2(volume));
        }
    }

    public static class opgave3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a value for meter:");
            double value = Double.parseDouble(scan.nextLine());
            System.out.println(value + " meters is " + roundto2(value * 3.2786) + " feet");
        }
    }

    public static class opgave4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a number in square meters:");
            double sqm = Double.parseDouble(scan.nextLine());
            System.out.println(sqm + " square meters is " + roundto2(sqm * 0.3025) + "pings");

        }
    }

    public static class opgave5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the subtotal and gratuity rate:");
            String subandgratuity = scan.nextLine();
            String[] subandgrat = (subandgratuity.split(" "));

            double subtotal = Integer.parseInt(subandgrat[0]);
            double gratuityrate = Integer.parseInt(subandgrat[1]);
            double gratuity = subtotal * gratuityrate / 100.0;
            double total = subtotal + gratuity;

            System.out.println("The gratuity is " + gratuity + " and total is " + total);

        }
    }

    public static class opgave6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a number between 0 and 1000:");
            int number = Integer.valueOf(scan.nextLine());
            int number1 = number;

            if (number < 1000 && number > 0) {
                List<Integer> digits = new ArrayList<>();

                while ((int) (Math.log10(number) + 1) >= 1) {

                    digits.add(number % 10);
                    number = number / 10;
                }

                int result = 1;
                for (int i : digits) {
                    result *= i;
                }
                System.out.println("The multiplication of all digits in " + number1 + " is " + result);

            } else {
                System.out.println("something wrong with your number, but I'm not gonna tell ya what");
            }
        }
    }

    public static class opgave7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of minutes:");
            int minutes = Integer.valueOf(scan.nextLine());
            double hours = minutes/60;
            double days = hours/24;
            int years = (int) days/365;
            double remaingDays = days % 365;
            System.out.println(minutes + " minutes is approximately " + years + " and " + (int)remaingDays + " days");
        }
    }

    public static class opgave9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter v0,v1 and t:");
            String[] values = scan.nextLine().split(" ");

            double v0 = Double.parseDouble(values[0]);
            double v1 = Double.parseDouble(values[1]);
            double t = Double.parseDouble(values[2]);


            System.out.println("The average acceleration is " + (v1-v0)/t);

        }
    }

    public static class opgave10 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the amount of water in kilograms:");
            double waterweight = Double.parseDouble(scan.nextLine());
            System.out.println("Enter the initial temperature:");
            double initialtemp = Double.parseDouble(scan.nextLine());
            System.out.println("Enter the final temperature:");
            double finaltemp = Double.parseDouble(scan.nextLine());

            double energy = waterweight * (finaltemp-initialtemp)*4184;

            System.out.println("The energy needed is " + energy );
        }
    }

    public static class opgave12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter speed and acceleration:");

            String [] input = scan.nextLine().split(" ");
            double [] numbers= Arrays.stream(input).mapToDouble(Double::valueOf).toArray();
            System.out.println("The minimum runway length for this airplane is "
                                    + ((pow(numbers[0], 2))/(2*numbers[1])));
        }
    }

    public static class opgave13 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the montly savings amount");

            double savingsamount = Double.parseDouble(scan.nextLine());
            double savings = savingsamount*(1.003125);

            //rentes regning over 5 loops
            for (int i = 0; i < 5 ; i++) {
                savings = (savings + savingsamount)*1.003125;
            }
            System.out.println("after the 6th month the account value is " + savings);
        }
    }






    public static double roundto2(double number) {
        return Math.round(number * 100) / 100.0;
    }
}

