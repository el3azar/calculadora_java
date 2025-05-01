public class Calculadora {

    public Double suma(Operacion op) {
        return op.getNumero1().getValor() + op.getNumero2().getValor();
    }

    public Double resta(Operacion op) {
        return op.getNumero1().getValor() - op.getNumero2().getValor();
    }

    public Double multiplicacion(Operacion op) {
        return op.getNumero1().getValor() * op.getNumero2().getValor();
    }

    public Double division(Operacion op) {
        if (op.getNumero2().getValor() == 0) {
            throw new ArithmeticException("Error: división por cero.");
        }
        return op.getNumero1().getValor() / op.getNumero2().getValor();
    }

    public Double potencia(Operacion op) {
        return Math.pow(op.getNumero1().getValor(), op.getNumero2().getValor());
    }

    public Double raizCuadrada(Operacion operacion) {
        if (operacion.getNumero1().getValor() < 0) {
            throw new ArithmeticException("Error: no se puede calcular la raíz de un número negativo.");
        }
        return Math.sqrt(operacion.getNumero1().getValor());
    }
}
