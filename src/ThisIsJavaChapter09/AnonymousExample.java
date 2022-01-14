package ThisIsJavaChapter09;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        anonymous.person.wake();

        anonymous.method1();
        
        //매개값으로 대입
        anonymous.method2(
                new AnonymousPerson(){
                    void study(){
                        System.out.println("공부를합니다.");
                    }

                    @Override
                    void wake() {
                        System.out.println("8시에 일어나요");
                        study();
                    }
                }
        );
    }

}
