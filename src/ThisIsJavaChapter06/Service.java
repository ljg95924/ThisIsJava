package ThisIsJavaChapter06;

public class Service {
    @PrintAnnotation
    public void mothod1(){
        System.out.println(" 실행 내용1");
    }

    @PrintAnnotation("*")
    public void method2(){
        System.out.println("실행 내용2");
    }

    @PrintAnnotation(value = "#", number = 20)
    public void method3(){
        System.out.println("실행 내용3");
    }
    
}
