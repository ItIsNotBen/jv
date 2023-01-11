import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName;
        String allowedName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        userName = scanner.nextLine();





        if (userName.equals(allowedName)) {
            System.out.println("That name is found, you are let through.");
        } else {
            System.out.println("Name not found. Try again.");
        }


    }
}
