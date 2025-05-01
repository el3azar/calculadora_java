import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=====BIENVENIDOS A SU CALCULADORA EN JAVA =====");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.print("Ingrese el primer número: ");
                        Numero n1 = new Numero(scanner.nextDouble());
                        System.out.print("Ingrese el segundo número: ");
                        Numero n2 = new Numero(scanner.nextDouble());
                        Operacion op = new Operacion(n1, n2);

                        switch (opcion) {
                            case 1:
                                System.out.println("Resultado: " + calculadora.suma(op));
                                break;
                            case 2:
                                System.out.println("Resultado: " + calculadora.resta(op));
                                break;
                            case 3:
                                System.out.println("Resultado: " + calculadora.multiplicacion(op));
                                break;
                            case 4:
                                System.out.println("Resultado: " + calculadora.division(op));
                                break;
                        }
                        break;
                    case 5:
                        System.out.print("Ingrese el número a elevar a una potencia: ");
                        Numero numero = new Numero(scanner.nextDouble());
                        System.out.print("Ingrese la potencia a la que sera elevado el numero:  ");
                        Numero potencia = new Numero(scanner.nextDouble());
                        Operacion elevar = new Operacion(numero, potencia);
                        System.out.println("Resultado: " + calculadora.potencia(elevar));
                        break;
                    case 6:
                        System.out.print("Ingrese el número: ");
                        Numero numeroRaiz = new Numero(scanner.nextDouble());
                        Operacion raiz = new Operacion(numeroRaiz,null);
                        System.out.println("Resultado: " + calculadora.raizCuadrada(raiz));
                        break;

                    case 7:
                        salir = true;
                        System.out.println("Gracias por usar la calculadora.");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
