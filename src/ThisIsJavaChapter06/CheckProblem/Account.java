package ThisIsJavaChapter06.CheckProblem;

public class Account {
    private int balance;
    private final static int MIN_BALANCE=0;
    private final static int MAX_BALANCE=1000000;
    Account(){

    }

    int getBalance(){
        return balance;
    }
    int setBalance(int balance){
        if(balance<=MAX_BALANCE && balance >= MIN_BALANCE){
            return this.balance = balance;
        }
        return this.balance;
    }
}
