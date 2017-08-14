package abstract_factory;

public class Main {
    public static void main(String[] args) {
        ToyFactory toyFactory = new WoodenToyFactory();
        Bear bear = toyFactory.getBear();
        Cat cat = toyFactory.getCat();
        System.out.printf("I've got %s and %s", bear.getName(), cat.getName());

        ToyFactory toyFactory1 = new TeddyToyFactory();
        Bear bear1 = toyFactory.getBear();
        Cat cat1 = toyFactory.getCat();
        System.out.printf("I've got %s and %s", bear1.getName(), cat1.getName());
    }
}
