package prototype;

public class Cookie implements Cloneable {

    protected int weight;

    @Override
    public Cookie clone() throws CloneNotSupportedException{
        Cookie copy = (Cookie) super.clone();
        return copy;
    }
}
