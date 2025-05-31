/**
 * Clase calculadora utiliza la clase operacion para realizar operaciones aritmeticas
 */
public class Calculadora {
    private Operacion operacion;

    /**
     * Constructor clase calculadora
     */
    public Calculadora() {
        this.operacion = new Operacion();
    }

    /**
     * Suma de dos numeros
     * @param a
     * @param b
     * @return la suma de los dos numeros
     */
    public double suma(Numero a, Numero b) {
        return operacion.suma(a, b);
    }

    /**
     * Resta de dos numeros
     * @param a
     * @param b
     * @return la resta de los dos numeros
     */
    public double resta(Numero a, Numero b) {
        return operacion.resta(a, b);
    }

    /**
     * Multiplicacion de dos numeros
     * @param a
     * @param b
     * @return la multiplicacion de los dos numeros
     */
    public double multiplicacion(Numero a, Numero b) {
        return operacion.multiplicacion(a, b);
    }

    /**
     * Division de dos numeros
     * @param a
     * @param b
     * @return la division de los dos numeros
     * @throws ArithmeticException si el segundo nunero es cero
     */
    public double division(Numero a, Numero b) throws ArithmeticException {
        return operacion.division(a, b);
    }

    /**
     * Calcula la potencia de un numero elevado a otro
     * @param base
     * @param exponente
     * @return la potencia de la base elevada al exponente
     */
    public double potencia(Numero base, Numero exponente) {
        return operacion.potencia(base, exponente);
    }

    /**
     * Calcula raiz cuadrada de un numero
     * @param numero
     * @return
     * @throws ArithmeticException si el numero es negativo
     */
    public double raizCuadrada(Numero numero) throws ArithmeticException {
        return operacion.raizCuadrada(numero);
    }
}

