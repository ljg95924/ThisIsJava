package thisIsJavaChapter07;

public class AbstractMethodCat extends AbstractMethodAnimal {
    public AbstractMethodCat() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("야옹~");
    }
}
