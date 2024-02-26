package refactorizar;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase realiza un cálculo de promedio a partir de una lista de números y determina si se ha aprobado o reprobado.
 */
public class refactorizar {

    /**
     * Método principal que ejecuta el programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        // Crear una lista de números
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(3);
        numeros.add(10);
      
        // Inicializar variables para el cálculo del promedio
        int suma = 0;
        int cantidad = 0;
            
        // Calcular la suma de los números y contar la cantidad
        for (Integer numero : numeros) {
            suma += numero;
            cantidad++;
        }
        
        // Calcular el promedio
        double promedio = calcularPromedio(suma, cantidad);
        
        // Determinar si se ha aprobado o reprobado
        if (promedio >= 7) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else {
            System.out.println("Lo siento, has reprobado.");
        }
        
        // Imprimir el promedio final
        System.out.println("El promedio final es: " + promedio);
    }

    /**
     * Calcula el promedio de una suma y una cantidad dadas.
     *
     * @param suma La suma de los números.
     * @param cantidad La cantidad de números.
     * @return El promedio de los números.
     * @throws ArithmeticException Si la cantidad es cero (división por cero).
     */
    public static double calcularPromedio(int suma, int cantidad) throws ArithmeticException {
        if (cantidad == 0) {
            throw new ArithmeticException("No se puede calcular el promedio con cantidad cero.");
        }
        return (double) suma / cantidad;
    }
}
