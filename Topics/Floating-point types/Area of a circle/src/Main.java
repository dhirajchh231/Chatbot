import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double pi =Math.PI;
        double r = scanner.nextDouble();
        double result = pi*r*r;
        System.out.println(result);
    }
}