package thisIsJavaChapter09.anoymousInterfaceObject;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();

    //필드초기값으로 대입
    Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };

    
    Window() {
        //매개값으로 필드대입
        button1.setOnClickListener(listener);
        //매개값으로 익명구현객체대입
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다.");
            }
        });
    }
}
