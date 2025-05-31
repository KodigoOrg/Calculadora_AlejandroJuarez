/**
 * Clase operacion contiene metodos para realizar operaciones aritmeticas
 */
public class Operacion {
    /**
     * Suma de dos numeros
     * @param a
     * @param b
     * @return la suma de los 2 numeros
     */
    public double suma(Numero a, Numero b) {
        return a.getValor() + b.getValor();
    }

    /**
     * Resta de dos numeros
     * @param a
     * @param b
     * @return la resta de los 2 numeros
     */
    public double resta(Numero a, Numero b) {
        return a.getValor() - b.getValor();
    }

    /**
     * Multiplicacion de dos numeros
     * @param a
     * @param b
     * @return la multiplicacion de los 2 numeros
     */
    public double multiplicacion(Numero a, Numero b) {
        return a.getValor() * b.getValor();
    }

    /**
     * Division de dos numeros
     * @param a
     * @param b
     * @return la division de los 2 numeros
     * @throws ArithmeticException si el segundo numero es 0
     */
    public double division(Numero a, Numero b) throws ArithmeticException {
        if (b.getValor() == 0) {
            throw new ArithmeticException("Division por cero no permitida");
        }
        return a.getValor() / b.getValor();
    }

    /**
     * Calcula la potencia de un numero elevado a otro
     * @param base la base
     * @param exponente el exponente
     * @return la potencia de la base elevada al exponente
     */
    public double potencia(Numero base, Numero exponente) {
        return Math.pow(base.getValor(), exponente.getValor());
    }

    /**
     * Calcula la raiz cuadrada de un numero
     * @param numero el numero
     * @return la raiz cuadrada del numero
     * @throws ArithmeticException si el numero es negativo
     */
    public double raizCuadrada(Numero numero) throws ArithmeticException {
        if (numero.getValor() < 0) {
            throw new ArithmeticException("No se puede calcular la raiz cuadrada de un numero negativo");
        }
        return Math.sqrt(numero.getValor());
    }
}

