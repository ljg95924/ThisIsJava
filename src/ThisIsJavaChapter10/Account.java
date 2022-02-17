package thisIsJavaChapter10;

public class Account {
    private long balance;

    public Account() {

    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int moeny) throws BalanceInsufficientException {
        if (balance < moeny) {
            throw new BalanceInsufficientException("잔고부족: " + (moeny - balance) + "모자람");
        }
        balance -=moeny;
    }
}
