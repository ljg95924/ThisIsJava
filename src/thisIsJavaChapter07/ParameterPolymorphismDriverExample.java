package thisIsJavaChapter07;

public class ParameterPolymorphismDriverExample {
    public static void main(String[] args) {
        ParameterPolymorphismDriver driver = new ParameterPolymorphismDriver();

        ParameterPolymorphismBus bus = new ParameterPolymorphismBus();
        ParameterPolymorphismTaxi taxi = new ParameterPolymorphismTaxi();

        driver.drive(bus); //자동 타입 변환 Vehicle vehicle = bus;
        driver.drive(taxi); // 자동 타입 변환 Vehicle vehicle = taxi;

    }
}
