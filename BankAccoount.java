public class BankAccoount {
    //private data members
    private String accountNumber;
    private double balance;



    public BankAccoount(String accountNumber, double intialBalance){
        this.accountNumber = accountNumber;
        this.balance = intialBalance;
    }
    public String getAccountNumber(){ //accessors methods
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){  //mutators methods
        if(amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }
}
