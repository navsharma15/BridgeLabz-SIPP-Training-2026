package ScenarioBased.ExceptionSolutions;

public class Atm {

    private double balance = 10000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance = balance - amount;

        System.out.println(
                "Balance After Withdrawal of "
                        + amount + " is " + balance);
    }

    public static void main(String[] args) {

        Atm m = new Atm();

        try {
            m.withdraw(12000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}