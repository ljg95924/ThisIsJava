package ThisIsJavaChapter07;

public class PolymorphismCarExample {
    public static void main(String[] args) {
        PolymorphismCar car = new PolymorphismCar();

        for (int i = 1; i <= 5; i++) {
            int problemLoaction = car.run();

            if (problemLoaction == 1) {
                System.out.println("앞왼쪽 HankookTire로 교체");
                car.tires[0] = new PolymorphismHankookTire("앞왼쪽", 15);

            }
            if (problemLoaction == 2) {
                System.out.println("앞오른쪽 KumhoTire로 교체");
                car.tires[1] = new PolymorphismKumhoTire("앞오른쪽", 13);

            }
            if (problemLoaction == 3) {
                System.out.println("뒤왼쪽 HankookTire로 교체");
                car.tires[2] = new PolymorphismHankookTire("뒤왼쪽", 14);

            }
            if (problemLoaction == 4) {
                System.out.println("뒤오른쪽 KumhoTire로 교체");
                car.tires[3] = new PolymorphismKumhoTire("뒤오른쪽", 17);

            }
            System.out.println("------------------------------------------");
        }
    }
}
