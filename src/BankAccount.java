import java.util.Scanner;

class BankAccount {

    static double balance;
    static Scanner custom = new Scanner(System.in);

    public static void main(String args[]) {

        String name, adress, phone, accNumber;
        balance = 1000;

        System.out.println("Please enter your name: ");
        name = custom.nextLine();
        System.out.println("Please enter your adress: ");
        adress = custom.nextLine();
        System.out.println("Please enter your phone number: ");
        phone = custom.nextLine();
        System.out.println("Please enter your Account Number: ");
        accNumber = custom.nextLine();

        for (int i = 0; i < 3; i++) {
            Deposit();

        }
        for (int w = 0; w < 2; w++) {
            Withdraw();
        }
        System.out.println("Name: " + name);
        System.out.println("Adress: " + adress);
        System.out.println("Phone Number: " + phone);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Current Balance: " + balance);
    }

    static public double Deposit() {
        double deposit;
        System.out.println("Deposit:");
        deposit = custom.nextInt();

        balance = balance + deposit;

        return balance;

    }

    static public double Withdraw() {
        double withdraw;
        System.out.println("Withdraw");
        withdraw = custom.nextInt();

        balance = balance - withdraw;

        return balance;

    }

}