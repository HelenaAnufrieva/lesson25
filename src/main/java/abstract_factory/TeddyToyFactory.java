package abstract_factory;

public class TeddyToyFactory implements ToyFactory{
    public Bear getBear(){return new TeddyBear();}
    public Cat getCat(){return new TeddyCat();}

}
