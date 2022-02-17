package thisIsJavaChapter15.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messagesQueue = new LinkedList<>();

        messagesQueue.offer(new Message("SendMail", "귤"));
        messagesQueue.offer(new Message("SendSMS", "사과"));
        messagesQueue.offer(new Message("SendkaKaotalk", "자두"));

        while (!messagesQueue.isEmpty()) {
            Message message = messagesQueue.poll();
            System.out.println(message);
        }

    }
}
