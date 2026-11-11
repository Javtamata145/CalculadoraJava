package CALCULADORA;
import javax.swing.*;

public class main_ {
    public static void main(String[] args)
    {
        CalcMode1 mode1 = new CalcMode1();
        CalcView view = new CalcView(mode1);
        CalcController controller = new CalcController(mode1,view);

        view.setVisible(true);
    }
}
