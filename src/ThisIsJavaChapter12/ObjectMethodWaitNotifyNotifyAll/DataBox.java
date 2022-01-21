package ThisIsJavaChapter12.ObjectMethodWaitNotifyNotifyAll;

public class DataBox {
    private String data;

    public synchronized String getData() {
        if (this.data == null) {
            try {
                System.out.println("getData정지정지");
                wait();
            } catch (InterruptedException e) {

            }
        }
        String returnValue = data;
        System.out.println("읽은 데이터: " + returnValue);
        data = null;
        notify();
        return returnValue;
    }

    public synchronized void setData(String data) {
        if (this.data != null) {
            try {
                System.out.println("setData정지정지");
                wait();
            } catch (InterruptedException e) {

            }
        }
        this.data = data;
        System.out.println("생성한 데이터: " + data);
        notify();
        System.out.println("9999");
    }
}
