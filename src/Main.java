import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        Scanner s = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Сложение");
        int a = s.nextInt();
        System.out.println(c.add(a, a));
    }
}
