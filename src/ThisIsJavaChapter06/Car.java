package ThisIsJavaChapter06;

public class Car {
    String model;
    int speed;

    //생성자
    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        for (int i = 0; i <= 50; i += 10) {
            this.setSpeed(i);
            //setSpeed(i);
            System.out.println(this.model+"가 달립니다. 시속:"+ this.speed);
        }
    }

    public static void main(String[] args) {
        Car car= new Car("람머스");
        car.run();
    }

}



