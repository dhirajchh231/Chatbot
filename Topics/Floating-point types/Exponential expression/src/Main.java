import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double num = scanner.nextDouble();
        double result = num*num*num + num*num+ num +1;
        System.out.println(result);
    }
}