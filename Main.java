import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "ab";

        System.out.println("Ingresa el número de palabras que quieres generar: ");
        int longitud = sc.nextInt();

        if (longitud == 0) {
            System.out.println("\nLa cadena generada es: ");
            System.out.println("λ");
        }
        else {
            ArrayList<String> combinaciones = generarCombinaciones(cadena, longitud);
            combinaciones.add(0, "λ");
            System.out.println("\nLas cadenas generadas son: ");
            System.out.println(combinaciones);
        }
    }

    public static ArrayList<String> generarCombinaciones(String cadena, int longitud) {
        ArrayList<String> combinaciones = new ArrayList<String>();
        combinaciones.add("");
        for (int i = 0; i < longitud; i++) {
            ArrayList<String> nuevasCombinaciones = new ArrayList<String>();
            for (String combinacion : combinaciones) {
                for (int j = 0; j < cadena.length(); j++) {
                    String nuevaCombinacion = combinacion + cadena.charAt(j);
                    nuevasCombinaciones.add(nuevaCombinacion);
                }
            }
            combinaciones = nuevasCombinaciones;
        }
        return combinaciones;
    }
}