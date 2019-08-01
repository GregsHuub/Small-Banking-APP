package greg.financialApp;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.math.BigDecimal.*;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String logoutMsg = null;
        AccountCreator user = new AccountCreator(1, "Grzegorz",
                "Ozim", valueOf(10), "12345");





        System.out.println("type Password: ");

        while(true) {
            String typedPassword = scanner.nextLine();
            if (typedPassword.equals(user.getPassword())) {
                System.out.println("Hello, what kind of operations would like to do?");
                while (true) {
//                Scanner scanner = new Scanner(System.in);

                    System.out.println("1 - deposit, 2 - withdraw, 3 - show Balance, 4- logout");


                    while (!scanner.hasNextInt()) {
                        System.out.println("type number");
                        scanner.nextLine();
                    }
                    int operationToDo = scanner.nextInt();

                    switch (operationToDo) {
                        case 1:
                            System.out.println("Your choice: DEPOSIT");
                            depositMoney(user);
                            break;
                        case 2:
                            System.out.println("Your choice: WITHDRAW");
                            withdrawMoney(user);
                            break;
                        case 3:
                            System.out.println("Your choice SHOW BALANCE");
                            showBalance(user);
                            break;
                        case 4:
                            System.out.println("LOGOUT");
                            System.exit(1);
                    }

                }

            } else {
                System.out.println("Wrong password, try again");
            }
        }
    }

    private static void depositMoney(AccountCreator userValue) {
        BigDecimal depositValue = new BigDecimal(0);
        BigDecimal dailyLimit = new BigDecimal(2000);

        System.out.println("type amount to deposit");
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
//            while (!scanner.hasNextBigDecimal()) {
//                System.err.println("type amount, not letters");
//                scanner.nextLine();
//            }
                depositValue = scanner.nextBigDecimal();


                if (depositValue.compareTo(BigDecimal.ZERO) <= 0) {
                    System.out.println("to small amount to deposit, try again");
                } else if (depositValue.compareTo(dailyLimit) == 1) {
                    System.out.println("daily limit is 2000");
                } else {
                    break;
                }
            }
            userValue.setPersonalAmount(depositValue.add(userValue.getPersonalAmount()));
        }catch (InputMismatchException ime){
            System.out.println("type amount, not letters");
        }
    }

    private static void withdrawMoney(AccountCreator userValue) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal withdrawValue = new BigDecimal(0);
        BigDecimal dailyLimit = new BigDecimal(2000);
        System.out.println("type value to withdraw");

        while (true) {
            while (!scanner.hasNextBigDecimal()) {
                System.out.println("type amount not letters");
                scanner.nextLine();
            }

            withdrawValue = scanner.nextBigDecimal();
            if (userValue.getPersonalAmount().compareTo(withdrawValue) == 1) {
                if (withdrawValue.compareTo(BigDecimal.TEN) <= 0) {
                    System.out.println("you cannot withdraw value below 10.00");
                } else if (withdrawValue.compareTo(dailyLimit) == 1) {
                    System.out.println("daily limit is 2000, try again");
                } else {
                    break;
                }
            } else {
                System.out.println("amout to withdraw is bigger than balance");
            }
        }
        userValue.setPersonalAmount(userValue.getPersonalAmount().subtract(withdrawValue));
    }

    private static void showBalance(AccountCreator user) {
        System.out.println("Your current balance is " + user.getPersonalAmount());
    }


}

