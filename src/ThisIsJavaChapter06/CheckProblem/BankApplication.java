package ThisIsJavaChapter06.CheckProblem;

import java.util.Scanner;

public class BankApplication {
    private static Account2[] accountArray = new Account2[100];
    private static Scanner scanner = new Scanner(System.in);

    public void inputView() {
        System.out.println("---------------------------------------------");
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("---------------------------------------------");
        System.out.print("선택>");
    }

    public static void main(String[] args) {
        boolean run = true;
        BankApplication BA = new BankApplication();
        while (run) {
            BA.inputView();

            int selectNo = scanner.nextInt();

            BA.selectMenu(selectNo);
        }
    }

    private void selectMenu(int selectNo) {
        if (selectNo == 1) {
            createAccount();
        } else if (selectNo == 2) {
            accountList();
        } else if (selectNo == 3) {
            deposit();
        } else if (selectNo == 4) {
            withdraw();
        } else if (selectNo == 5) {
            System.exit(0);
        }
    }

    private void withdraw() {
        System.out.println("출금");
        System.out.print("계좌번호: ");
        String Ano = scanner.next();
        System.out.print("출금액: ");
        int withdrawMoney = scanner.nextInt();
        for (Account2 e : accountArray
        ) {
            if (e.getAno().equals(Ano)) {
                e.setBalance(e.getBalance() - withdrawMoney);
                System.out.println("출금이 성공되었습니다.");
                break;
            } else {
                System.out.println("출금 실패");
                break;
            }
        }

    }

    private void accountList() {
        for (Account2 e : accountArray) {
            if (e == null) {
                break;
            }
            System.out.println(e.getAno() + "\t" + e.getOwner() + "\t" + e.getBalance());
        }
    }

    private void deposit() {
        System.out.print("계좌번호: ");
        String Ano = scanner.next();
        System.out.print("예금액: ");
        int addMoney = scanner.nextInt();
        int i = 0;
        for (Account2 e : accountArray
        ) {
            if (e.getAno().equals(Ano)) {
                e.setBalance(e.getBalance() + addMoney);
                System.out.println("결과: 예금이 생공되었습니다.");
                break;
            } else {
                System.out.println("잘못된계좌번호");
                break;
            }

        }
    }

    private void createAccount() {
        BankView BV = new BankView();
        BV.createPageView();
        System.out.print("계좌번호: ");
        String accountNum = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = new Account2(accountNum, owner, balance);
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }

    }
}
