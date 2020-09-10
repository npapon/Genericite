public class Main {

    public static void main( String[] args ) {
        // TODO Auto-generated method stub

        Solo<String> objetGeneriqueString = new Solo<String>();
        objetGeneriqueString.setAttribut( "gay" );
        objetGeneriqueString.afficherAttribut();

        Solo<Integer> objetGeneriqueInteger = new Solo<Integer>();
        objetGeneriqueInteger.setAttribut( 2 );
        objetGeneriqueInteger.afficherAttribut();

        Duo<String, String> doubleString = new Duo<String, String>();

        doubleString.setElement1( "Nico" );
        doubleString.setElement2( "Leslie" );

        System.out.println( doubleString.getElement1() + " " + doubleString.getElement2() );

        Duo<Integer, String> doubleIntegerString = new Duo<Integer, String>();

        doubleIntegerString.setElement1( 1 );
        doubleIntegerString.setElement2( "Leslie" );

        System.out.println( doubleIntegerString.getElement1() + " " + doubleIntegerString.getElement2() );

    }

}
