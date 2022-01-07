package ThisIsJavaChapter06.CheckProblem;

public class ShopService {
    private static ShopService singleton = new ShopService();

    public static ShopService getInstance() {
        return singleton;
    }
}
