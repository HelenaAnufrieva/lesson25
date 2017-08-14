package abstract_factory;

public class WoodenToyFactory implements ToyFactory {
    public Bear getBear(){return new WoodenBear();}
    public Cat getCat(){return new WoodenCat();}

}
