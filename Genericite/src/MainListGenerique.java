import java.util.ArrayList;
import java.util.List;

public class MainListGenerique {

    public static void main( String[] args ) {
        Voiture voiture1 = new Voiture();
        Voiture voiture2 = new Voiture();
        List<Voiture> listeVoitures = new ArrayList<Voiture>();
        listeVoitures.add( voiture1 );
        listeVoitures.add( voiture2 );

        List<VoitureSansPermis> listeVoituresSansPermis = new ArrayList<VoitureSansPermis>();
        VoitureSansPermis voitureSansPermis1 = new VoitureSansPermis();
        VoitureSansPermis voitureSansPermis2 = new VoitureSansPermis();
        listeVoituresSansPermis.add( voitureSansPermis1 );
        listeVoituresSansPermis.add( voitureSansPermis2 );

        List<VoitureElectrique> listeVoituresElectriques = new ArrayList<VoitureElectrique>();
        VoitureElectrique voitureElectrique1 = new VoitureElectrique();
        VoitureElectrique voitureElectrique2 = new VoitureElectrique();
        listeVoituresElectriques.add( voitureElectrique1 );
        listeVoituresElectriques.add( voitureElectrique2 );

        List<Object> marqueVoiture = new ArrayList<Object>();

        Object marqueVolvo = new String( "Volvo" );
        Object marquePeugeot = new String( "Peugeot" );

        marqueVoiture.add( marqueVolvo );
        marqueVoiture.add( marquePeugeot );

        afficherElementsListGenerique( listeVoituresSansPermis );

        afficherElementsListGenerique( listeVoituresElectriques );
        afficherElementsListGenerique( listeVoitures );
        afficherElementsListGeneriqueSuperieur( marqueVoiture );
        afficherElementsListGeneriqueSuperieur( listeVoitures );
        // KO car ca descend de Voiture et non ca monte
        // afficherElementsListGeneriqueSuperieur( listeVoituresElectrique );

    }

    public static void afficherElementsListGenerique( List<? extends Voiture> list ) {
        for ( Voiture voiture : list ) {
            System.out.println( voiture.toString() );
        }
    }

    public static void afficherElementsListGeneriqueSuperieur( List<? super Voiture> list ) {
        for ( Object object : list ) {
            System.out.println( "Objet : " + object.toString() );
        }
    }

}
