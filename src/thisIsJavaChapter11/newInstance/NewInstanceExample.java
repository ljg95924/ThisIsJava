package thisIsJavaChapter11.newInstance;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            //Class clazz = Class.forName("ThisIsJavaChapter11.NewInstance.SendAction");
            Class clazz = Class.forName("thisIsJavaChapter11.newInstance.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
