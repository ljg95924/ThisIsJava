package thisIsJavaChapter07;

public class AbstractMethodExample {
    public static void main(String[] args) {
        AbstractMethodDog dog = new AbstractMethodDog();
        AbstractMethodCat cat = new AbstractMethodCat();
        dog.sound();
        cat.sound();

        //변수의 자동타입변환
        AbstractMethodAnimal animal;
        animal = new AbstractMethodDog();
        animal.sound();

        animal = new AbstractMethodCat();
        animal.sound();

        //메소드의 다형성
        animalSound(new AbstractMethodDog());
        animalSound(new AbstractMethodCat());
    }

    private static void animalSound(AbstractMethodAnimal animal) {
        animal.sound();
    }

}
