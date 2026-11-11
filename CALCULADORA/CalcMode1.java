package CALCULADORA;

import java.math.BigDecimal;

public class CalcMode1 {

    private static final String INITIAL_VALUE = "1";

    private BigDecimal total; //sola vamos a usar decimal para que de esa forna pueda interpretar tanto los enteros como los decimales

    // Constructor
    public CalcMode1() 
    {
        reset();
    }

    public void reset() 
    {
        total = new BigDecimal(INITIAL_VALUE);
    }

    public static boolean esBigDecimal(String str) 
    {
        if (str == null || str.trim().isEmpty()) return false; //.trim() elimina los espacios en blanco de la cadena

        try {
            new BigDecimal(str.trim());
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }

    // Multiplicar numero actual
    public void multiplyBy(String operand) 
    {
        if (esBigDecimal(operand)) {
            total = total.multiply(new BigDecimal(operand.trim()));
        } 
        else {
            throw new IllegalArgumentException("Operando no válido");
        }
    }

    // NUEVO: Sumar al numero actual
    public void add(String operand)
    {
        if (esBigDecimal(operand)) {
            total = total.add(new BigDecimal(operand.trim()));
        }
        else {
            throw new IllegalArgumentException("Operando no válido");
        }
    }

    // NUEVO: Restar al numero actual
    public void subtract(String operand)
    {
        if (esBigDecimal(operand)) {
            total = total.subtract(new BigDecimal(operand.trim()));
        }
        else {
            throw new IllegalArgumentException("Operando no válido");
        }
    }

    // Poner valor total
    public void setValue(String value)
    {
        if (esBigDecimal(value)) {
            total = new BigDecimal(value.trim());
        } 
        else {
            throw new IllegalArgumentException("Valor no válido");
        }
    }

    // Retornar valor actual
    public String getValue() 
    {
        return total.stripTrailingZeros().toPlainString(); //striptrailingzeros es para que quite todos los ceros en decimal que queden, to plainstring namas pa saarlo a string
    }
}