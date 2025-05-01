/**
 * Clase Calculadora
 * Contiene métodos para realizar operaciones aritméticas básicas y avanzadas.
 */

public class Calculadora {
    //Suma dos numeros recibiendo un objeto operacion y los numeros
    public Double suma(Operacion op) {
        return op.getNumero1().getValor() + op.getNumero2().getValor();
    }
    //Resta dos numeros recibiendo un objeto operacion y los numeros
    public Double resta(Operacion op) {
        return op.getNumero1().getValor() - op.getNumero2().getValor();
    }
    //Multiplica dos numeros recibiendo un objeto operacion y los numeros
    public Double multiplicacion(Operacion op) {
        return op.getNumero1().getValor() * op.getNumero2().getValor();
    }
    //DIVIDE dos numeros recibiendo un objeto operacion y los numeros
    public Double division(Operacion op) {
        if (op.getNumero2().getValor() == 0) {
            throw new ArithmeticException("Error: división por cero.");
        }
        return op.getNumero1().getValor() / op.getNumero2().getValor();
    }
    //eleva a una potencia recibiendo un objeto operacion en el cua esta la potencia y el numero
    public Double potencia(Operacion op) {
        return Math.pow(op.getNumero1().getValor(), op.getNumero2().getValor());
    }
    //calcula la raiz cuadrada mediante un objeto operacion
    public Double raizCuadrada(Operacion operacion) {
        if (operacion.getNumero1().getValor() < 0) {
            throw new ArithmeticException("Error: no se puede calcular la raíz de un número negativo.");
        }
        return Math.sqrt(operacion.getNumero1().getValor());
    }
}
