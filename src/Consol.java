import java.util.Scanner;

public class Consol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько у вас венгерских форинтов?");
        double forints = scanner.nextDouble();
        Parser parser = new Parser();

        double rubles = forints * parser.hufValue(huf);
        System.out.println("Ваши сбережения в новежских кронах: " + rubles / parser.nokValue(nok));
    }
}
