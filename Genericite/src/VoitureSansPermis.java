
public class VoitureSansPermis extends Voiture {

    private String conducteur;

    public VoitureSansPermis() {
        super();
        this.conducteur = null;
    }

    public VoitureSansPermis( String marque, String conducteur ) {
        super( marque );
        this.conducteur = conducteur;
    }

    public String getConducteur() {
        return conducteur;
    }

    public void setConducteur( String conducteur ) {
        this.conducteur = conducteur;
    }

}
