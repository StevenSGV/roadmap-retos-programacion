
import java.util.Arrays;

class StevenSGV{
    public static void main(String[] args) {
        // Tipos de datos por valor - Asignación de valores
        int entero = 10;
        int segundoEntero = 20;

        // Modificación de valor de una variable (en este caso entera).
        entero = segundoEntero;
        System.out.println("El valor de entero es: " + entero);

        int entero1 = 10;
        int entero2 = entero1;  // copia el valor 10

        System.out.println("Antes de cambiar:");
        System.out.println("entero1 = " + entero1); // 10
        System.out.println("entero2 = " + entero2); // 10

        // Cambiamos entero2
        entero2 = 99;

        System.out.println("\nDespués de cambiar entero2:");
        System.out.println("entero1 = " + entero1); // 10 (NO cambia)
        System.out.println("entero2 = " + entero2); // 99

        // Tipos de datos por referencia
        String[] nombres = {"Steven", "Sandra", "Maria"};
        String[] listaNombres = nombres;
        
        System.out.println("La lista al final es: " + Arrays.toString(listaNombres));

        // Funciones
        int numero = 10;
        System.out.println("Antes del método: " + numero); // 10
        miEntero(numero);
        System.out.println("Despues del método: " + numero); // Sigue siendo 10.

        /* Dificultad extra */
        // Variables por valor
        int enteroA = 10;
        int enteroB = 20;

        int[] nuevoArreglo = valorEnterosVal(enteroA, enteroB);
        int nuevoA = nuevoArreglo[0];
        int nuevoB = nuevoArreglo[1];

        System.out.println("Los valores originales son " + enteroA + " y " + enteroB);
        System.out.println("Los valores que se retornaron son " + nuevoA + " y " + nuevoB);

        int[] valoresRef = {enteroA, enteroB};
        System.out.println("Los valores originales son " + Arrays.toString(valoresRef));

        int[] nuevoArregloRef = valorEnterosRef(valoresRef);
        int nuevoARef = nuevoArregloRef[0];
        int nuevoBRef = nuevoArregloRef[1];

        System.out.println("Los valores que se retornaron son " + nuevoARef + " y " + nuevoBRef);
    }

    public static int[] valorEnterosVal(int primerEntero, int segundoEntero){
        int temp = primerEntero;
        primerEntero = segundoEntero;
        segundoEntero = temp;

        int[] arregloEnteros = {primerEntero, segundoEntero};

        return arregloEnteros;
    }

    public static int[] valorEnterosRef(int[] arregloEnteros){
        int temp = arregloEnteros[0];
        arregloEnteros[0] = arregloEnteros[1];
        arregloEnteros[1] = temp;

        return arregloEnteros; 
    }

    public static void miEntero(int numeroFuncion){
        System.out.println("Dentro del médoto (Antes): " + numeroFuncion); // 10
        numeroFuncion = 20;
        System.out.println("Dentro del médoto (Despues): " + numeroFuncion); // 20
    }
}