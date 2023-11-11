public class Main {
    public static void main(String[] args) {
        BankAccoount accoount = new BankAccoount("12345678",1000.0);

        System.out.println("Account Number: " + accoount.getAccountNumber());
        System.out.println("Initial Balance: " + accoount.getBalance());

        accoount.deposit(500.0);
        System.out.println("balnace after deposit " +accoount.getBalance());

        accoount.withdraw(100.0);
        System.out.println("balance after withdraw " +accoount.getBalance());
    }
}