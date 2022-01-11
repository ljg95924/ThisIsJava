package ThisIsJavaChapter07;

public abstract class AbstractMethodAnimal {
    public String kind;

    public void breathe() {
        System.out.println("들숨, 날숨");
    }

    public abstract void sound();
}
