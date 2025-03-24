package pizza;

import pizza.model.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1 to select Pepperoni, 2 to select 4 Seasons, 3 to select Hawaiian, 4 to select Carbonara: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(Pizza.builder().name("Pepperoni").price("20 $").description("pizza sauce, pepperoni, mozzarella cheese, basil").build());
                break;
            case 2:
                System.out.println(Pizza.builder().name("4 Seasons").price("25 $").description("garlic sauce, pepperoni, ham, fresh mushrooms, chicken fillet, mozzarella cheese, basil").build());
                break;
            case 3:
                System.out.println(Pizza.builder().name("Hawaiian").price("30 $").description("Chicken fillet, pineapple preserves, chili pepper, mozzarella cheese, blue cheese, pizza sauce, oregano").build());
                break;
            case 4:
                System.out.println(Pizza.builder().name("Carbonara").price("35 $").description("Bacon, hard cheese, egg, mozzarella cheese, pizza sauce, gyros").build());
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
