package math;

public interface math {
    //Hjælpefunktion som runder doubles til 2 digits
    static double roundto2(double number) {
        return Math.round(number * 100) / 100.0;
    }
}
