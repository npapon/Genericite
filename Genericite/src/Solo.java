
public class Solo<T> {

    T attribut;

    public Solo() {
        this.attribut = null;
    }

    public Solo( T attribut ) {
        this.attribut = attribut;
    }

    public void setAttribut( T attribut ) {
        this.attribut = attribut;
    }

    public T getAttribut() {
        return this.attribut;
    }

    public void afficherAttribut() {
        System.out.println( "C'est ca l'attribut " + this.attribut );

    }

}
