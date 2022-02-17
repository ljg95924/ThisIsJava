package thisIsJavaChapter13.genericInheritance;

public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("SmartTv");
        product.setCompany("Samsung");

        System.out.println(product.getCompany());
        System.out.println(product.getModel());
        System.out.println(product.getClass());

        Storage<Tv> storage = new StorageImpl<Tv>(100);
        storage.add(new Tv(), 0);
       System.out.println(storage.get(0));

    }
}
