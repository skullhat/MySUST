public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public Account() {

    }

    public Account(int i, double b) {
        id = i;
        balance = b;
    }

    public void setId(int i) {
        id = i;
    }
    public void setBalance(double b) {
        balance = b;
    }
    public void setAnnualInterestRate(double a) {
        annualInterestRate = a;
    }
    
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate /100;
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate /12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
}
