import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StevenSGV{
    public static void main(String[] args) {
        
        List<String> lang = new ArrayList<>();
        lang.add("Python");
        lang.add("Java");

        Programador miProgramador = new Programador("Steven", 22, lang);
        miProgramador.info();

        Stack miPila = new Stack();
        miPila.agregarElemento("elemento");
        miPila.agregarElemento("elemento2");
        miPila.agregarElemento("elemento3");
        
        miPila.eliminarElemento();
        
        miPila.infoElementos();
        
        miPila.cantidadElementos();

        Queue miCola = new Queue();
        miCola.agregarElemento("elemento");
        miCola.agregarElemento("elemento2");
        miCola.agregarElemento("elemento3");

        miCola.eliminarElemento();
        miCola.eliminarElemento();

        miCola.infoElementos();

        miCola.cantidadElementos();

    }

    static class Programador{

        private String name;
        private int age;
        private List<String> languages;

    public Programador(String name, int age, List<String> languages){
        this.name = name;
        this.age = age;
        this.languages = languages;
    }

    public void info(){
        System.out.println("Nombre: " + name + " | " + "Age: " + age + " | " + "Lenguajes: " + languages);
        }
    }

    static class Stack{

        private Deque<String> stack = new ArrayDeque<>();

        public Stack(){ 
        }

        public void agregarElemento(String elemento){
            stack.push(elemento);
        }

        public void eliminarElemento(){
            if(!stack.isEmpty()){
                stack.pop();
                if(stack.isEmpty()){
                    System.out.println("La Pila ya esta vacía.");
                }
            }
        }

        public void cantidadElementos(){
            System.out.println("La cantidad de elementos en la pila son: " + stack.size());
        }

        public void infoElementos(){
            System.out.println("Elementos de la pila: " + stack);
        }
    }

    static class Queue{

        private Deque<String> queue = new ArrayDeque<>();

        public Queue(){
        }

        public void agregarElemento(String elemento){
            queue.offer(elemento);
        }

        public void eliminarElemento(){
            if(!queue.isEmpty()){
                queue.poll();
                if(queue.isEmpty()){
                    System.out.println("La cola ya esta vacía.");
                }
            }
        }

        public void cantidadElementos(){
            System.out.println("La cantidad de elementos de la cola son: " + queue.size());
        }

        public void infoElementos(){
            System.out.println("Los elementos de la cola son: " + queue);
        }
    }
}