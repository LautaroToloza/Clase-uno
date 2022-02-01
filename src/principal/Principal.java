package principal;

import java.util.Scanner;

/**
 * @author Lautaro Toloza
 */
public class Principal {

    public static void main(String[] args) {
        /* CONSIGNA 2:
        Dada 5 calificaciones de un alumno obtenidas a lo largo del
        semestre, construya un programa que imprima el promedio
        de sus calificaciones.
         */
        Scanner capturaPantalla = new Scanner(System.in);

        System.out.print("Escriba el nombre del Alumno: ");
        String n_alumno = capturaPantalla.nextLine();

        double n1 = cargarNumero();
        double n2 = cargarNumero();
        double n3 = cargarNumero();
        double n4 = cargarNumero();
        double n5 = cargarNumero();

        double mostrar = promedio(n1, n2, n3, n4, n5);

        System.out.println("Libreta del alumno: " + n_alumno);
        System.out.println("Nota final: " + mostrar);
    }

    public static double promedio(double n1, double n2, double n3, double n4, double n5) {

        double suma = n1 + n2 + n3 + n4 + n5;
        double promedio = suma / 5;

        return promedio;

    }

    public static double cargarNumero() {

        Scanner leer = new Scanner(System.in);
        System.out.print("Escriba la nota: ");
        String nota = leer.nextLine();
        double nta = Double.parseDouble(nota);

        return nta;

    }

}
