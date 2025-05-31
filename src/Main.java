import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Main gestiona la interacción con el usuario por la consola
 * Permite hacer operaciones aritmeticas usando una instancia de la clase Calculadora
 */
public class Main {
    private Calculadora calculadora;
    private Scanner scanner;

    /**
     * Constructor para la clase InterfazUsuario
     * Inicializa la calculadora y el scanner para la entrada de usuario
     */
    public Main() {
        this.calculadora = new Calculadora();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Inicia la interfaz de usuario y muestra el menu de operaciones
     */
    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 7);
    }

    /**
     * Menu de opciones para el usuario
     */
    private void mostrarMenu() {
        System.out.println("\n --CALCULADORA JAVA--");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz cuadrada");
        System.out.println("7. Salir");
        System.out.print("Seleccione una operacion:");
    }

    /**
     * Procesa la opcion seleccionada por el usuario
     * @param opcion opcion seleccionada por el usuario
     */
    private void procesarOpcion(int opcion) {
        try {
            switch (opcion) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMultiplicacion();
                    break;
                case 4:
                    realizarDivision();
                    break;
                case 5:
                    realizarPotencia();
                    break;
                case 6:
                    realizarRaizCuadrada();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada no valida. Por favor ingrese un numero.");
            scanner.next(); // limpiar el buffer del scanner
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Realiza la operacion de suma
     */
    private void realizarSuma() {
        System.out.println("Ingrese el primer numero:");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double b = scanner.nextDouble();
        Numero numA = new Numero(a);
        Numero numB = new Numero(b);
        System.out.println("El resultado de la suma es: " + calculadora.suma(numA, numB));
    }

    /**
     * Realiza la operacion de resta
     */
    private void realizarResta() {
        System.out.println("Ingrese el primer numero:");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double b = scanner.nextDouble();
        Numero numA = new Numero(a);
        Numero numB = new Numero(b);
        System.out.println("El resultado de la resta es: " + calculadora.resta(numA, numB));
    }

    /**
     * Realiza la operacion de multiplicacion
     */
    private void realizarMultiplicacion() {
        System.out.println("Ingrese el primer numero:");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double b = scanner.nextDouble();
        Numero numA = new Numero(a);
        Numero numB = new Numero(b);
        System.out.println("El resultado de la multiplicacion es: " + calculadora.multiplicacion(numA, numB));
    }

    /**
     * Realiza la operacion de division
     * @throws ArithmeticException Si el segundo número es cero
     */
    private void realizarDivision() throws ArithmeticException {
        System.out.println("Ingrese el primer numero:");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double b = scanner.nextDouble();
        Numero numA = new Numero(a);
        Numero numB = new Numero(b);
        System.out.println("El resultado de la division es: " + calculadora.division(numA, numB));
    }

    /**
     * Realiza la operacion de potencia
     */
    private void realizarPotencia() {
        System.out.println("Ingrese la base:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese el exponente:");
        double exponente = scanner.nextDouble();
        Numero numBase = new Numero(base);
        Numero numExponente = new Numero(exponente);
        System.out.println("El resultado de la potencia es: " + calculadora.potencia(numBase, numExponente));
    }

    /**
     * Realiza la operación de raiz cuadrada.
     * @throws ArithmeticException Si el numero es negativo.
     */
    private void realizarRaizCuadrada() throws ArithmeticException {
        System.out.println("Ingrese el numero:");
        double numero = scanner.nextDouble();
        Numero num = new Numero(numero);
        System.out.println("El resultado de la raiz cuadrada es: " + calculadora.raizCuadrada(num));
    }

    /**
     * Metodo principal para iniciar la aplicacion
     * @param args Argumentos de la linea de comandos.
     */
    public static void main(String[] args) {
        Main interfaz = new Main();
        interfaz.iniciar();
    }
}
