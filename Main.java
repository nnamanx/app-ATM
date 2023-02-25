import service.CashingOutMenu;

public class Main {
    public static void main(String[] args) {

        CashingOutMenu service = new CashingOutMenu();

        while (true) {
            service.bankMenuChoices(service.bankMenu());
        }

    }
}