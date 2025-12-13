
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class StevenSGV{
    public static void main(String[] args) {
        
        // Operaciones

        String primerPalabra = "Hola";
        String segundaPalabra = "Java";

        // Concatenación
        System.out.println(primerPalabra + " " + segundaPalabra + "!");

        // Indexación
        char caracter = primerPalabra.charAt(0); // Primer caracter
        System.out.println(caracter);


        for (int i = 0; i < primerPalabra.length(); i++){ // Ciclo para impresión
            char c = primerPalabra.charAt(i);
            System.out.println(c);
        }

        // Longitud
        System.out.println(primerPalabra.length());

        // Porción
        System.out.println(primerPalabra.substring(0, 2));
        
        // Reemplazo
        String palabraFinal = primerPalabra.replace("Hola", "Adios");
        System.out.println(palabraFinal);

        // División
        String cadenaTexto = "Hola mundoJava";
        String[] partesCadena = cadenaTexto.split(" ");

        for (String palabra : partesCadena){
            System.out.println(palabra);
        }

        System.out.println(partesCadena[1]); // Parte específica
        
        // Conversión a mayúsculas
        System.out.println(primerPalabra.toUpperCase());

        // Conversión a minúsculas
        System.out.println(segundaPalabra.toLowerCase());

        // Verificación
        boolean contiene = segundaPalabra.contains("Java");
        System.out.println(contiene);

        // Conversión de String a enteros
        String cadenaNumeros = "12345";
        System.out.println(Integer.parseInt(cadenaNumeros.trim())); // String.trim() es por si el String tiene espacios.

        // Ejercicio extra
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la primer palabra: ");
        String palabraPrincipal = input.nextLine();
        System.out.println("Introduce la segunda palabra: ");
        String palabraSecundaria = input.nextLine();

        comprobracionPalabras(palabraPrincipal, palabraSecundaria);

    }

    public static void comprobracionPalabras(String palabraUno, String palabraDos){
        String palabraUnoNormalizada = palabraUno.toLowerCase().trim();
        String palabraDosNormalizada = palabraDos.toLowerCase().trim();

        esPalindromo(palabraUnoNormalizada);
        esPalindromo(palabraDosNormalizada);

        sonAnagramas(palabraUnoNormalizada, palabraDosNormalizada);

        esIsograma(palabraUnoNormalizada);
        esIsograma(palabraDosNormalizada);
    }

    public static boolean esPalindromo(String palabra){
        
        for (int i = 0; i < palabra.length()/2; i++){
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)){
                System.out.println("La palabra " + palabra + " NO es palindromo.");
                return false;
            }
        }
        System.out.println("La palabra " + palabra + " es palindromo.");
        return true;
    }

    public static boolean sonAnagramas(String palabraUno, String palabraDos){

        if (palabraUno.length() != palabraDos.length()){
            System.out.println("Las palabras " + palabraUno + " y " + palabraDos + " NO son anagramas.");
            return false;
        }else {
            char[] cadenaUno = palabraUno.toCharArray();
            Arrays.sort(cadenaUno);
            String cadenaUnoOrdenada = String.valueOf(cadenaUno);

            char[] cadenaDos = palabraDos.toCharArray();
            Arrays.sort(cadenaDos);
            String cadenaDosOrdenada = String.valueOf(cadenaDos);

                if (!cadenaUnoOrdenada.equals(cadenaDosOrdenada)){
                    System.out.println("Las palabras " + palabraUno + " y " + palabraDos + " NO son anagramas.");
                    return false;
                    }
        }
        System.out.println("Las palabras " + palabraUno + " y " + palabraDos + " son anagramas.");
        return true;
    }

    public static boolean esIsograma(String palabra){

        HashMap<Character, Integer> mapaConteo = new HashMap();

        for (int i = 0; i < palabra.length(); i++){
            char c = palabra.charAt(i);

            if (!mapaConteo.containsKey(c)){
                mapaConteo.put(c, 1);
            }else {
                int conteoActual = mapaConteo.get(c);
                mapaConteo.put(c, conteoActual + 1);
            }
        }
        Iterator<Integer> it = mapaConteo.values().iterator();
        int freqObjetivo = it.next();

        while (it.hasNext()){
            int freq = it.next();
            if (freq != freqObjetivo){
                System.out.println("La palabra " + palabra + " NO es un isograma.");
                return false;
            }
        }
        System.out.println("La palabra " + palabra + " es un isograma.");
        return true;
    }
}