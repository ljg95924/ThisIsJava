package thisIsJavaChapter07;

public class AbstractMethodDog extends AbstractMethodAnimal {
    public AbstractMethodDog() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
