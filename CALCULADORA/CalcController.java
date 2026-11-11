package CALCULADORA;
import java.awt.event.*;

public class CalcController {
    private CalcMode1 m_mode1;
    private CalcView m_view;

    //Constructor (CAMBIO: ahora recibe los comandos de suma y resta)
    CalcController(CalcMode1 mode1, CalcView view, Command add, Command subtract)
    {
        m_mode1 = mode1;
        m_view = view;

        //añadiendo los listener
        view.addMultiplyListener(new MultiplyListener());
        view.addAddListener(new OperationListener(add));           // NUEVO
        view.addSubtractListener(new OperationListener(subtract)); // NUEVO
        view.addClearListener(new ClearListener());
    }

    class MultiplyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String userInput = "";
            try{
                userInput = m_view.getUserInput();
                m_mode1.multiplyBy(userInput);
                m_view.setTotal(m_mode1.getValue());
            } catch(NumberFormatException nfex){
                m_view.showError("Bad input: '" + userInput + "'");
            }
        }
    } //se termina la clase de multiply listener

    // NUEVO: ejecuta cualquier Command (suma, resta)
    class OperationListener implements ActionListener
    {
        private Command command;

        OperationListener(Command command)
        {
            this.command = command;
        }

        public void actionPerformed(ActionEvent e)
        {
            try{
                command.execute();
                m_view.setTotal(m_mode1.getValue());
            } catch(IllegalArgumentException ex){
                m_view.showError("Bad input: '" + m_view.getUserInput() + "'");
            }
        }
    }

    class ClearListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            m_mode1.reset();
            m_view.reset();
        }
    }// se termina la clase interiro de clear listener
}