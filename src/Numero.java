/**
 * Clase numero representa un numero real
 */
public class Numero {
    private double valor;

    /**
     * Constructor para clase numero
     * @param valor el valor del numero
     */
    public Numero(double valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el valor del numero
     * @return el valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Establece el valor del numero
     * @param valor el nuevo valor del numero
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
