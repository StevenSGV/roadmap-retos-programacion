public class StevenSGV {

    static int contadorGlobal = 0; 

    public static void main(String[] args) {
        Saludo();

        // LLamada a método con retorno (impresión directa)
        System.out.println(saludoRetorno());
        
        // Llamada a método con retorno (guardado en variable)
        String mensajeDesdeElRetorno = saludoRetorno();
        System.out.println(mensajeDesdeElRetorno);

        // Llamada a función con argumento sin retorno
        saludoConArgumento("Maria");

        // Llamada a función con múltiples argumentos sin retorno
        saludoConMultiplesArgumentos("Carlos", 30);

        // Llamada a método con parámetros y retorno
        String mensajeEspecial = saludoEspecial("Invitado", "Bienvenido al código de Java");
        System.out.println(mensajeEspecial);

        // Llamada a método con argumentos variables
        saludoMultiplesArgumentos("Ana", "Luis", "Perla"); // Puedes agregar más nombres si lo deseas

        // Ejemplos de métodos del lenguaje
        int primerNumero = 10;
        int segundoNumero = 2;
        double resultado;

        // Potencia
        resultado = Math.pow(primerNumero, segundoNumero);
        System.out.println("El resultado es: " + resultado);

        // Número aleatorio
        double numeroRandom = Math.random();
        System.out.println("El número random es: " + numeroRandom);

        // Convertir de Int a String
        int numero = 5;
        String numeroString = String.valueOf(numero);
        System.out.println("El número en (String) es: " + numeroString);

        // Variable local (Solo existe en el main)
        int contadorLocal = 5;
        contadorGlobal++;
        contadorLocal += 2;

        System.out.println("Global: " + contadorGlobal);
        System.out.println("Local: " + contadorLocal);

        MetodoConGlobal();

        /* DIFICULTAD EXTRA (opcional):
            * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
            *   - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
            *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
            *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
            *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
            *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos. */

        System.out.println(numeros("Fizz", " Buzz"));
        
    }

    // Funciones básicas (definidas por el usuario)
    public static void Saludo() {
        System.out.println("Hola, soy StevenSGV");
    }

    // Método con retorno de valor
    public static String saludoRetorno() {
        return "Hola desde el método con retorno";
    }

    // Función con un parámetro
    public static void saludoConArgumento(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // Función con múltiples parámetros
    public static void saludoConMultiplesArgumentos(String nombre, int edad) {
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
    }

    // Método con parámetros y retorno
    public static String saludoEspecial(String nombre, String mensaje) {
        return "Mensaje para " + nombre + ": " + mensaje;
    }

    // Método con argumentos variables (varargs)
    public static void saludoMultiplesArgumentos(String... nombres) {
        for (String nombre : nombres) {
            System.out.println("Hola, " + nombre);
        }
    }

    public static void MetodoConGlobal() {
        contadorGlobal++;
        System.out.println("Global en MétodoConGlobal: " + contadorGlobal);

        // Variable local de este método
        String mensajeLocal = "Soy local de MetodoGlobal";
        System.out.println(mensajeLocal);
    }

    public static int numeros (String primerValor, String segundoValor) {

        int contadorNumeros = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(primerValor + segundoValor);
            }else if (i % 3 == 0){
                System.out.println(primerValor);
            }else if (i % 5 == 0){
                System.out.println(segundoValor);
            }
            else {
                System.out.println(i);
                contadorNumeros++;
            }
        }
    return contadorNumeros;
    }
}