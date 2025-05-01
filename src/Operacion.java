/**
 * Clase Operacion
 * Encapsula dos números reales como una operación aritmética.
 */
public class Operacion {
    private Numero numero1;
    private Numero numero2;

    // Constructor
    public Operacion(Numero numero1, Numero numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Retorna el primer número
    public Numero getNumero1() {
        return numero1;
    }

    // Retorna el segundo número
    public Numero getNumero2() {
        return numero2;
    }
}
