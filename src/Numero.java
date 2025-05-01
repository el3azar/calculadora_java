/**
 * Clase Numero
 * Representa un número real para operar en la calculadora.
 */
public class Numero {
    private Double valor;

    // Constructor
    public Numero(Double valor) {
        this.valor = valor;
    }

    // Retorna el valor del número
    public Double getValor() {
        return valor;
    }

    // Asigna un nuevo valor al número
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
