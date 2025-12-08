public class StevenSGV {
    public static void main(String[] args) {
        // Tipos de operadores en Java (Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia,etc...)

        int primerNumero = 5;
        int segundoNumero = 5;
        int resultado;

        // Suma
        resultado = primerNumero + segundoNumero;
        System.out.println("La suma es: " + resultado);

        // Resta
        resultado = primerNumero - segundoNumero;
        System.out.println("La resta es: " + resultado);

        // Multiplicación
        resultado = primerNumero * segundoNumero;
        System.out.println("La multiplicación es: " + resultado);

        // División
        resultado = primerNumero / segundoNumero;
        System.out.println("La división es: " + resultado);

        // Módulo
        resultado = primerNumero % segundoNumero;
        System.out.println("El residuo de una división es: " + resultado);

        // Exponente
        resultado = (int) Math.pow(primerNumero, 2);
        System.out.println("El exponente (entre el primer numero con el segundo) es: " + resultado);

        // Ejemplos de (Condicionales, iterativas, excepciones...)
        System.out.println("Es igual el primer numero (" + primerNumero + ") con el segundo numero (" + segundoNumero + ")?: " + (primerNumero == segundoNumero));
        System.out.println("Es diferente el primer numero (" + primerNumero + ") con el segundo numero (" + segundoNumero + ")?: " + (primerNumero != segundoNumero));
        System.out.println("Es mayor el primer numero (" + primerNumero + ") con el segundo numero (" + segundoNumero + ")?: " + (primerNumero > segundoNumero));
        System.out.println("Es menor el primer numero (" + primerNumero + ") con el segundo numero (" + segundoNumero + ")?: " + (primerNumero < segundoNumero));
        System.out.println("Es mayor o igual el primer numero (" + primerNumero + ") con el segundo numero (" + segundoNumero + ")?: " + (primerNumero >= segundoNumero));
        System.out.println("Es menor o igual el primer numero (" + primerNumero + ") con el segundo numero (" + segundoNumero + ")?: " + (primerNumero <= segundoNumero));

        // Operadores lógicos
        boolean primerCondicion = true;
        boolean segundaCondicion = false;

        System.out.println("La condición AND es: " + (primerCondicion && segundaCondicion));
        System.out.println("La condición OR es: " + (primerCondicion || segundaCondicion));
        System.out.println("La condición NOT (en la primer condición) es: " + (!primerCondicion));

        // Operadores de asignación
        int numeroAsignacion = 1;

        // Suma y asignación
        numeroAsignacion += 1; // numeroAsignacion = numeroAsignacion + 1
        System.out.println("El operador de asignación += da como resultado: " + numeroAsignacion);

        // Resta y asignación
        numeroAsignacion -= 1; // numeroAsignacion = numeroAsignacion - 1
        System.out.println("El operador de asignación -= da como resultado: " + numeroAsignacion);

        // Multiplicación y asignación
        numeroAsignacion *= 1; // numeroAsignacion = numeroAsignacion * 1
        System.out.println("El operador de asignación *= da como resultado: " + numeroAsignacion);

        // División y asignación
        numeroAsignacion /= 1; // numeroAsignacion = numeroAsignacion / 1
        System.out.println("El operador de asignación /= da como resultado: " + numeroAsignacion);

        // Módulo y asignación
        numeroAsignacion %= 1; // numeroAsignacion = numeroAsignacion % 1
        System.out.println("El operador de asignación %= da como resultado: " + numeroAsignacion);

        // Operadores de identidad
        String texto1 = "Hola";
        String texto2 = "Hola";
        System.out.println("¿El texto 1 y el 2 son el mismo objeto?: " + (texto1 == texto2));

        // Condicionales
        int primerValor = 5;
        int segundoValor = 10;

        // IF - ELSE IF
        if (primerValor == segundoValor) {
            System.out.println("El primer valor es igual al segundo valor");
        }else if (primerValor > segundoValor) {
            System.out.println("El primer valor es mayor al segundo valor");
        }else if (primerValor < segundoValor) {
            System.out.println("El primer valor es menor al segundo valor");
        }

        //Iterativas

        // Bucle for (bucle de 1 a 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println("El valor de i es: " + i);
        }

        // While (bucle de 1 a 10)
        int contador = 0;
        while (contador  <= 10) {
            System.out.println("El valor del contador es: " + contador);
            contador ++;
        }

        // Excepciones
        try {
            int divisionImposible = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error: No se puede dividir entre cero." + e.toString());
        }

        /* DIFICULTAD EXTRA
         * Crea un programa que imprima por consola todos los números comprendidos
         * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3. */
        
        System.out.println("Números entre 10 y 55: ");
        for (int i = 10; i <= 55; i++) {
            if (i % 2 == 0 && i != 16 && i % 3 != 0){
                System.out.println(i);
            }
        }
    }
}