package utill;

import java.util.Scanner;

public class Input {

    public static String stringInput(String statement) {

        Scanner stringSc = new Scanner(System.in);

        System.out.print(statement);

        return stringSc.nextLine();
    }

    public static int intInput(String statement) {

        Scanner intSc = new Scanner(System.in);

        System.out.print(statement);

        return intSc.nextInt();

    }
}
