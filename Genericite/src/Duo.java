
public class Duo<T, U> {

    private T element1;
    private U element2;

    public Duo()

    {
        this.element1 = null;
        this.element2 = null;
    }

    public Duo( T element1, U element2 )

    {
        this.element1 = element1;
        this.element2 = element2;
    }

    public T getElement1() {
        return element1;
    }

    public void setElement1( T element1 ) {
        this.element1 = element1;
    }

    public U getElement2() {
        return element2;
    }

    public void setElement2( U element2 ) {
        this.element2 = element2;
    }

}
