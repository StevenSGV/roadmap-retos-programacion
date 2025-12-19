class StevenSGV{
    public static void main(String[] args) {
        // cuentaRegresiva(100);

        // Ejercicio extra
        long resultado = factorial(5);
        System.out.println("El resultado del factorial es " + resultado);

        System.out.println("El resultado de fibonacci es " + fibonacci(8));
    }

    public static void cuentaRegresiva(int numero){
        if (numero >= 0){
            System.out.println(numero);
            cuentaRegresiva(numero - 1);
        }
    }

    public static long factorial(long numero){
        if (numero < 0) {
            System.out.println("Los numeros negativos no son validos.");
            return 0;
        }else if (numero == 0 || numero == 1){
            return 1;
        }

        if (numero > 1){
            numero = numero * factorial(numero - 1);
        }
    return numero;
    }

    public static long fibonacci(long numero){
        if (numero <= 0){
            System.out.println("Tiene que ser un numero mayor a 0.");
        }else if (numero == 1){
            return 0;
        }else if (numero == 2){
            return 1;
        }

        if (numero > 2){
            numero = fibonacci(numero - 2) + fibonacci(numero - 1);
        }
    return numero;
    }
}