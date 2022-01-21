package ThisIsJavaChapter12.ObjectMethodWaitNotifyNotifyAll;

public class ConsumerThread extends Thread {
    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox) {
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for(int i=1; i<=3; i++){
            String data= dataBox.getData();
            System.out.println("Consumer for문");
        }
        System.out.println("Consumer run끝");
    }
}
