public class Singleton {
    private static Singleton singleton = new Singleton();
    int num;
    String tex;
    //생성자
    private Singleton(){

    }

    static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 Singleton");
        }
        else {
            System.out.println("다른 싱글");
        }

        System.out.println(obj1.num);
        System.out.println(obj1.tex);

    }
}