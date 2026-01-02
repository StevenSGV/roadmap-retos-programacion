import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class StevenSGV{
    public static void main(String[] args) {
        
        // Ejercicio - Pila
        Deque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("El pop devuelve: " + stack.pop() + ". El resto de la lista queda: " + stack);

        stack.push("D"); // Luego agrega otro
        System.out.println("El peek devuelve: " + stack.peek() + ". La lista queda: " + stack); // Permite mirar arriba sin "Quitarlo"

        stack.pop();
        stack.pop();
        stack.pop();
        
        System.out.println(stack);
        
        Deque<String> palabra = new ArrayDeque<>();
        palabra.push("J");
        palabra.push("A");
        palabra.push("V");
        palabra.push("A");
        System.out.println(palabra);

        String invertida = "";
        while (!palabra.isEmpty()){
            String letra = palabra.pop();
            invertida = invertida + letra;
        }

        System.out.println(invertida);
        System.out.println(palabra);

        // Cola
        Deque<String> persona = new ArrayDeque<>();
        persona.offer("A");
        persona.offer("B");
        persona.offer("C");
        
        persona.poll(); // Sale el primero en llegar (A)
        System.out.println(persona);

        persona.offer("D");
        System.out.println(persona.peek()); // Toma B

        persona.poll(); persona.poll(); // Solo queda D

        System.out.println(persona);

        Deque<String> trabajos = new ArrayDeque<>();
        trabajos.offer("Doc1");
        trabajos.offer("Doc2");
        trabajos.offer("Doc3");

        System.out.println(trabajos.poll());

        trabajos.offer("Doc4");

        while (!trabajos.isEmpty()){
            System.out.println("Imprimiendo: " + trabajos.poll());
        }

        System.out.println(trabajos);

        // Ejercicio Extra
        // webAplication();
        impresoraCompartida();
    }

    public static void webAplication(){
        Scanner input = new Scanner(System.in);
        Deque<String> pila = new ArrayDeque<>();

        boolean estado = true;
        while(estado){
            System.out.println("Introduce una URL ó desplazate con adelante/atrás/salir: ");
            String action = input.nextLine();

            if(action.equals("salir")){
                    System.out.println("Saliendo...");
                    estado = false;
            }else if(action.equals("atras")){
                if(pila.isEmpty()){
                    System.out.println("Estas en la página de inicio.");
                    continue;
                }
                pila.pop();
                
                if(pila.isEmpty()){
                    System.out.println("Estas en la página de inicio.");
                }else{
                    System.out.println("Estas actualmente en: " + pila.peek());
                }
            }else if(action.equals("adelante")){
                System.out.println("adelante.");
            }else{
                pila.push(action);
                System.out.println("Estás actualmente en: " + action);
            }
        }
    }

    public static void impresoraCompartida(){
        Deque<String> cola = new ArrayDeque<>();
        Scanner input = new Scanner(System.in);

        boolean estado = true;

        while(estado){
            System.out.println("Añade un documento o selecciona imprimir/salir: ");
            String action = input.nextLine();

            if(action.equals("salir")){
                estado = false;
                System.out.println("Saliendo...");
            }else if(action.equals("imprimir")){
                if(cola.isEmpty()){
                    System.out.println("No hay elementos para imprimir.");
                }else{
                    System.out.println("Imprimiendo: " + cola.poll());
                }
            }else{
                cola.offer(action);
                System.out.println("Cola de impresión: " + cola);
            }

        }
    }
}