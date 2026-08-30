/*
 * EJERCICIO 7
 * Crea una clase Division con un método que reciba dos números enteros
 * y realice la división. Maneja la excepción ArithmeticException en caso
 * de que el divisor sea cero, mostrando un mensaje adecuado.
 */

// Clase que contiene la lógica de la división
class Division {

    // Método que recibe dos enteros y devuelve el resultado de dividirlos
    public int dividir(int numerador, int denominador) {
        try {
            // Aquí ocurre la división. Si denominador es 0, Java lanza
            // automáticamente una ArithmeticException.
            int resultado = numerador / denominador;
            return resultado;

        } catch (ArithmeticException e) {
            // Este bloque se ejecuta SOLO si el divisor era 0
            System.out.println("Error: no se puede dividir entre cero.");
            // Devolvemos 0 como valor "seguro" porque el método debe
            // devolver algún int (no podemos dividir de verdad)
            return 0;
        }
    }
}

// Clase principal para probar la clase Division
public class Ejercicio7_Division {
    public static void main(String[] args) {

        Division miDivision = new Division();

        // Caso 1: división normal, sí funciona
        int resultado1 = miDivision.dividir(10, 2);
        System.out.println("10 / 2 = " + resultado1);

        // Caso 2: división entre cero, se debe mostrar el mensaje de error
        int resultado2 = miDivision.dividir(10, 0);
        System.out.println("Resultado devuelto en caso de error: " + resultado2);
    }
}
