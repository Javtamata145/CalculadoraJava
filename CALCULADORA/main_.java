package CALCULADORA;
import javax.swing.*;

public class main_ {
    public static void main(String[] args)
    {
        CalcMode1 mode1 = new CalcMode1();
        CalcView view = new CalcView(mode1);

        // NUEVO: el cliente crea los comandos
        Command add = new AddCommand(mode1, view);
        Command subtract = new SubtractCommand(mode1, view);

        CalcController controller = new CalcController(mode1, view, add, subtract);

        view.setVisible(true);
    }
}