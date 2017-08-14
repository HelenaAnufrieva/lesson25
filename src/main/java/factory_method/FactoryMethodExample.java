package factory_method;

public class FactoryMethodExample {
    public static void main(String[] args) {

        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};

        for (Creator creator: creators)
        {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}
