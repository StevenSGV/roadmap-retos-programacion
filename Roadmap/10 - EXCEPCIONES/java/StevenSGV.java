import java.util.ArrayList;
import java.util.List;

public class StevenSGV{
    public static void main(String[] args) {
        
        try {
            int divisionError = 10/1;
            System.out.println("Resultado división: " + divisionError);

            List<Integer> listaNumeros = new ArrayList<>();
            listaNumeros.add(divisionError);
            
            System.out.println("Lista de numeros: " + listaNumeros.get(2));

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error: " + e);
        }

        try {
            procesarParametros(1, 1, 2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El numero de elementos de la lista debe ser mayor a dos.");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0.");
        } catch (StrTypeError e){
            System.out.println("Error personalizado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado." + e);
        } finally {
            System.out.println("El programa ha finalizado sin detenerse.");
        }
        
        
    }

    static class StrTypeError extends Exception{
        public StrTypeError(String mensaje){
            super(mensaje);
        }
    }

    public static void procesarParametros(Integer... params) throws StrTypeError{

        if(params.length < 3){
            throw new IndexOutOfBoundsException();
        }else if(params[1] == 0){
            throw new ArithmeticException();
        }else if (params[2] == 1){
            throw new StrTypeError("El tercer parametro no puede ser 1.");
        }

        System.out.println(params[2]);
        System.out.println(params[0] / params[1]);
    }
}