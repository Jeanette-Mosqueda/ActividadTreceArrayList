package ActividadTreceArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class OrdenarList {

    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<String>();
        Comparator<String> comparatorAlfabeticamente;
        Comparator<String> comparatorLongitud;
        frutas.add("Uva");
        frutas.add("Fresa");
        frutas.add("Sandia");
        frutas.add("Banana");
        frutas.add("Melon");
        frutas.add("Manzana");
        frutas.add("Durazno");
        frutas.add("Pera");
        frutas.add("Piña");
        frutas.add("Guayaba");


        System.out.println("LISTA INICIAL \n"+ frutas);

        //ordenamiento por alfabeto con clase anonima

        comparatorAlfabeticamente = new Comparator<String>() {
            //implementacion de la logica obligatoria
            @Override
            public int compare(String fruta1, String fruta2) {

                return fruta1.compareTo(fruta2);
            }
        };
        frutas.sort(comparatorAlfabeticamente);
        System.out.println("\nLISTA EN ORDEN ALFABETICO CON CLASE ANONIMA\n" + frutas);

        // ordenamiento por longitud con clase anonima
        comparatorLongitud  = new Comparator<String>() {
            @Override
            public int compare(String fruta1, String fruta2) {
                return Integer.compare(fruta1.length(),fruta2.length());
            }
        };
        frutas.sort(comparatorLongitud);
        System.out.println("\nLISTA EN ORDEN POR LONGITUD CON CLASE ANONIMA\n" + frutas);


        //ordenamiento por alfabeto Con lambdas
       comparatorAlfabeticamente = (fruta1, fruta2) -> fruta1.compareTo(fruta2);
        frutas.sort(comparatorAlfabeticamente);
        System.out.println("\nLISTA EN ORDEN ALFABETICO CON LAMBDA\n" + frutas);
        //ordenamiento por longitud con lambda
        comparatorLongitud = (fruta1, fruta2) -> Integer.compare(fruta1.length(),fruta2.length());
        frutas.sort(comparatorLongitud);
        System.out.println("\nLISTA EN ORDEN POR LONGITUD CON LAMBDA\n" + frutas);

        //ordenamiento por alfabeto con metodo de referencia
        frutas.sort(String::compareTo);
        System.out.println("\nLISTA EN ORDEN ALFABETICO CON METODO DE REFERENCIA\n" + frutas);
        //ordenamiento por longitud con metodo de referencia
        frutas.sort(Comparator.comparingInt(String::length));
        System.out.println("\nLISTA EN ORDEN POR LONGITUD CON METODO DE REFERENCIA\n" + frutas);


    }
}
