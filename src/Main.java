import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.print("Введите цену билета: ");
        Scanner scanner = new Scanner(System.in);
        int price_ticket = scanner.nextInt();
        int mile = (price_ticket / 20); //расчет миль

        System.out.println("Бонусных миль будет начислино: " + mile);

    }
}
