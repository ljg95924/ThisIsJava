package thisIsJavaChapter09.anoymousInterfaceObject;

public class Anonymous {
    //필드 초기값으로 대입
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Tv를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("Tv를 끕니다.");
        }
    };

    void method1() {
        //로컬변수값으로 대입
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("오디오를 끕니다.");
            }
        };
        //로컬변수 사용
        localVar.turnOn();
    }

    void method2(RemoteControl rc) {
        rc.turnOn();
    }
}

