package thisIsJavaChapter10;

public class MultipleCatchExaceptionExample {
    public static void main(String[] args) {
        try{
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            System.out.println(data1 + data2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족");
        }catch (NumberFormatException e){
            System.out.println("숫자로 변환 불가능");
        }finally {
            System.out.println("다시 실행하셈");
        }
    }
}
