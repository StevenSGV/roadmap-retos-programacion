import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class StevenSGV{
    public static void main(String[] args) {
        
        //ArrayList

        ArrayList<String> listaNombres = new ArrayList();
        listaNombres.add("Federico");
        listaNombres.add("Luis");
        listaNombres.add("Miguel");

        System.out.println(listaNombres);

        // LinkedList - La diferencia con la ArrayList es que esta es más eficiente para leer.
        // Mientras que la LinkedList es mejor para modificar.

        LinkedList<String> listaNombres2 = new LinkedList();
        listaNombres2.add("Steven");
        listaNombres2.add("Antonio");
        listaNombres2.add("Montana");

        // Acceso de datos
        listaNombres2.get(0);

        // Eliminación de datos
        listaNombres2.remove(2); // Se usa el indice del elemento que se quiere eliminar (siendo 0 el primer elemento).
        // listaNombres2.remove("Montana"); // O támbien el mismo String

        System.out.println(listaNombres2);    

        // Orden de los datos usando el paquete de Collections
        ArrayList<Integer> listaNumeros = new ArrayList();
        listaNumeros.add(3);
        listaNumeros.add(1);
        listaNumeros.add(2);

        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);   

        // Actualización con set
        listaNumeros.set(2, 5);
        System.out.println(listaNumeros);   

        // HashMaps - Guarda datos como pares clave-valor

        HashMap<Integer, String> usuarios = new HashMap();

        usuarios.put(101, "Ana"); // 101 (El entero) es la clave del valor ("Ana").
        usuarios.put(102, "Luis");
        usuarios.put(103, "Maria");

        System.out.println("Mapa inicial: " + usuarios);

        String nombreLuis = usuarios.get(102);
        System.out.println("Nombre del usuario con ID 102: " + nombreLuis);

        usuarios.remove(103);
        System.out.println("Mapa después de eliminar el usuario 103: " + usuarios);

        // Ejercicio extra
        Scanner input = new Scanner(System.in);
        HashMap<String, String> listaContactos = new HashMap();

        boolean bucleOn = true;
        while (bucleOn){
            System.out.println("\n\n");
            System.out.println("1. Buscar contacto.");
            System.out.println("2. Insertar contacto.");
            System.out.println("3. Actualizar contacto.");
            System.out.println("4. Eliminar contacto.");
            System.out.println("5. Salir.");

            System.out.println("Por favor, selecciona una opción: ");
            int opcion = input.nextInt();
            
                switch (opcion){

                case 1:
                    input.nextLine();
                    System.out.println("Introduzca el contacto a buscar: ");
                    String contactoBuscar = input.nextLine();
                    
                    if (listaContactos.containsKey(contactoBuscar)){
                        String contactoEncontrado = listaContactos.get(contactoBuscar);
                        System.out.println("El telefono es: " + contactoEncontrado);
                    }else {
                        System.out.println("Error: no se ha encontrado el contacto.");
                    }
                break;
                case 2:
                    input.nextLine();
                    System.out.println("Introduce el nombre: ");
                    String nombreContacto = input.nextLine();
                    System.out.println("Introduce el telefono: ");
                    String telefonoContacto = input.nextLine();

                    boolean contactoValido = true;

                        if (telefonoContacto.length() > 11){
                            contactoValido = false;
                        }

                        for (int i = 0; i < telefonoContacto.length() && contactoValido; i++){
                        char c = telefonoContacto.charAt(i);
                        
                            if (!Character.isDigit(c)){
                                contactoValido = false;
                            }
                        }
                        if (contactoValido){
                            listaContactos.put(nombreContacto, telefonoContacto);
                            System.out.println("Se ha registado correctamente.");
                        }else {
                            System.out.println("Error: no debe contener más de 11 dígitos ni simbolos no numéricos.");
                        }
                break;
                case 3:
                    input.nextLine();
                    System.out.println("Introduzca el contacto para editar: ");
                    String contactoEditar = input.nextLine();
                    
                    if (listaContactos.containsKey(contactoEditar)){
                        System.out.println("Introduzca el nuevo telefono: ");
                        String telefonoNuevo = input.nextLine();
                        boolean contactoValido2 = true;

                            if (telefonoNuevo.length() > 11){
                                contactoValido2 = false;
                            }

                            for (int i = 0; i < telefonoNuevo.length() && contactoValido2; i++){
                                char c = telefonoNuevo.charAt(i);

                                if (!Character.isDigit(c)){
                                    contactoValido2 = false;
                                }
                            }
                            if (contactoValido2){
                                listaContactos.replace(contactoEditar, telefonoNuevo);
                                System.out.println("Se ha editado correctamente.");
                    }else {
                        System.out.println("Error: el contacto no se ha encontrado.");
                    }
                }
                break;
                case 4:
                    input.nextLine();
                    System.out.println("Introduzca el contacto a eliminar: ");
                    String contactoEliminar = input.nextLine();

                    if (listaContactos.containsKey(contactoEliminar)){
                        listaContactos.remove(contactoEliminar);
                        System.out.println("Se ha eliminado correctamente.");
                    }else {
                        System.out.println("Error: no se ha encontrado ese contacto.");
                    }
                    
                break;
                case 5:
                    System.out.println("Saliendo...");
                    bucleOn = false;
                break;
                default:
                    System.out.println("Ha seleccionado una opción incorrecta.");
                break;
            }
        }
    }
}