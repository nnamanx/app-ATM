package service;

import static utill.Input.intInput;

public class CashingOutMenu {

    public int bankMenu() {

        System.out.println("---------- CASH SYSTEM ----------");

        System.out.println("1. Cashing out" +
                "\n2. Exit");

        System.out.println();

        return intInput("Choose an option: ");
    }

    public void bankMenuChoices(int choice) {

        switch (choice) {
            case 1:
                CashingOutService service = new CashingOutService();
                if (service.entrance()) {
                    if (service.cashingOut()) {
                        System.out.println("Successfully completed!");
                        System.out.println();
                    } else {
                        System.out.println("Unsuccessful!");
                    }
                } else {
                    break;
                }
                break;
            case 2:
                System.out.println("System is exited.");
                System.exit(-1);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}

