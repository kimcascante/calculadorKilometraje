package Semana2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Nombre del programa: 
 * Descripcion: Calcular la cantidad de kilómetros de un viaje realizado en carro. El algoritmo debe
    recibir el kilometraje del vehículo antes de iniciar el viaje, y el kilometraje del vehículo
    al terminar el viaje. Se debe imprimir el total de kilómetros del viaje. 
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */


public class ej3w2 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException {
    
        double kmViaje;
        double kmAntes;
        double kmDespues;

        escribir.println("Digite el Kilometraje antes del Viaje");
        kmAntes = Double.parseDouble(leer.readLine());

        escribir.println("Digite el Kilometraje despues del Viaje");
        kmDespues = Double.parseDouble(leer.readLine());

        kmViaje = (kmAntes - kmDespues);
        escribir.print("El Kilometraje del Viaje fue de " + kmViaje);

    }
}