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

        system.out.println("La condición AND es: " + (primerCondicion && segundaCondicion));




        /* DIFICULTAD EXTRA
         * Crea un programa que imprima por consola todos los números comprendidos
         * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3. */


    }
}