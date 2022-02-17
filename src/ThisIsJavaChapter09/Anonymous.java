package thisIsJavaChapter09;

public class Anonymous {
    // 필드 초기값으로 대입
    AnonymousPerson person = new AnonymousPerson() {
        void work() {
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    };

    void method1() {
        //로컬변수값으로 대입
        AnonymousPerson localVar = new AnonymousPerson() {
            void walk() {
                System.out.println("나는 걷는다 그냥");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어난다");
                walk();
            }
        };
        localVar.wake();
    }

    void method2(AnonymousPerson person) {
        person.wake();
    }
}
