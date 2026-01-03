
import java.util.ArrayList;
import java.util.List;

public class StevenSGV{
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.sonido();

        Animal gato = new Gato();
        gato.sonido();

        Animal perro = new Perro();
        perro.sonido();

        Gerente gerente = new Gerente(1 ,"Stiven");

        ProjectManager projectManager = new ProjectManager(2, "Brais", "Proyecto 1");
        ProjectManager projectManager2 = new ProjectManager(3, "Moure", "Proyecto 2");

        Programador programador = new Programador(4, "Kontrol", "Swift");
        Programador programador2 = new Programador(5, "Nasi", "Dart");
        Programador programador3 = new Programador(6, "Nasos", "Python");

        gerente.agregarEmpleado(projectManager);
        gerente.agregarEmpleado(projectManager2);

        projectManager.agregarEmpleado(programador);
        projectManager.agregarEmpleado(programador2);

        projectManager2.agregarEmpleado(programador2);
        projectManager2.agregarEmpleado(programador3);

        programador.agregarEmpleado(gerente);

        gerente.coordinarProyectos();
        projectManager.coordinarProyectos();
        programador.programar();

        gerente.listaEmpleadosCargo();
        projectManager.listaEmpleadosCargo();
        programador.listaEmpleadosCargo();

    }

    static class Animal{

        Animal(){
        }

        void sonido(){
            System.out.println("El animal tiene un sonido que no esta determinado.");
        }
    }

    static class Gato extends Animal{

        public Gato(){
        }

        @Override
        public void sonido(){
            System.out.println("Miau!");
        }
    }

    static class Perro extends Animal{

        public Perro(){
        }

        @Override
        public void sonido(){
            System.out.println("Guau!");
        }
    }

    static class Empleado{

        private int id;
        private String name;
        private List<Empleado> listaEmpleados;

        public Empleado(int id, String name){
            this.id = id;
            this.name = name;
            this.listaEmpleados = new ArrayList<>();
        }

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }

        public void coordinarProyectos(){

        }

        public void agregarEmpleado(Empleado empleado){
            listaEmpleados.add(empleado);
        }

        public void cantidadEmpleados(){
            System.out.println("La cantidad de empleados a cargo es: " + listaEmpleados.size());
        }

        public void listaEmpleadosCargo(){

            System.out.println("La lista de empleados es: ");
            for(Empleado emp : listaEmpleados){
                System.out.println(emp.getName());
            }
            
        }
    }

    static class Gerente extends Empleado{

        public Gerente(int id, String name){
            super(id, name);
        }

        @Override
        public void coordinarProyectos(){
            System.out.println("Esta coordinando todos los proyectos de la empresa.");
        }
    }

    static class ProjectManager extends Empleado{

        private String proyecto;

        public ProjectManager(int id, String name, String proyecto){
            super(id, name);
            this.proyecto = proyecto;
        }

        @Override
        public void coordinarProyectos(){
            System.out.println("Esta coordinando su proyecto.");
        }
    }

    static class Programador extends Empleado{

        private String lenguaje;

        public Programador(int id, String name, String lenguaje){
            super(id, name);
            this.lenguaje = lenguaje;
        }

        public void programar(){
            System.out.println("Esta programando en: " + lenguaje);
        }

        @Override
        public void agregarEmpleado(Empleado empleado){
            System.out.println("Un programador no tiene empleados a su cargo, " + empleado.getName() + " no se añadirá.");
        }

        @Override
        public void listaEmpleadosCargo(){
            System.out.println("Un programador no tiene empleados a su cargo.");
        }
    }
}