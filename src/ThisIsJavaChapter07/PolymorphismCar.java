package thisIsJavaChapter07;

public class PolymorphismCar {
    PolymorphismTire[] tires = {
            new PolymorphismTire("앞왼쪽", 6),
            new PolymorphismTire("앞오른쪽", 2),
            new PolymorphismTire("뒤왼쪽", 3),
            new PolymorphismTire("뒤오른쪽", 4)
    };

    int run() {
        System.out.println("자동차 달려~");
        if (tires[0].roll () == false) {
            stop();
            return 1;
        }
        if (tires[1].roll() == false) {
            stop();
            return 2;
        }
        if (tires[2].roll() == false) {
            stop();
            return 3;
        }
        if (tires[3].roll() == false) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("자동차 멈춰~");
    }
}
