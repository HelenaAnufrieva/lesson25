package factory_method;

abstract class Creator {
    public abstract Product factoryMethod();
    public Product operation()
    {
        return factoryMethod().testProduct();
    }

}
