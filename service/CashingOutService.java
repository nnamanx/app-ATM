package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

import static utill.Input.stringInput;
import static utill.Input.intInput;

public class CashingOutService {

    public boolean entrance() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/lamankhudadatzada/Desktop/java/ATM_app-main/accountData"));

            String iban = stringInput("Enter your iban: ");

            String line;

            while ((line = reader.readLine()) != null) {
                String[] splitted = line.split(" - ");

                String trueIban = splitted[1];

                if (trueIban.equalsIgnoreCase(iban)) {
                    System.out.println("Welcome " + splitted[0]);
                    System.out.println("Total amount: " + splitted[2]);
                    break;
                } else {
                    System.out.println("Entered iban does not exists. Try again.");
                    return false;
                }

            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean cashingOut() {

        try {
            int outed = intInput("Enter the amount wanted cash out: ");

            try {
                BufferedReader reader = new BufferedReader(new FileReader("/Users/lamankhudadatzada/Desktop/Java lessons/ATM_app/src/accountData"));

                String line;

                while ((line = reader.readLine()) != null) {
                    String[] splitted = line.split(" - ");

                    double total = Double.parseDouble(splitted[2]);

                    int[] arr = {200, 100, 50, 20, 10, 5, 1};

                    if (total >= outed) {
                        for (int i = 0; i < arr[i]; i++) {
                            int res = outed / arr[i];
                            outed -= (res * arr[i]);
                            System.out.println(arr[i] + " - " + res);
                        }

                    } else {
                        System.out.println("Insufficient balance. Try again.");
                    }
                }

                reader.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, enter valid amount of money (without coin part)");
            return false;
        }

        return true;
    }
}
