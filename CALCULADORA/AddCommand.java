package CALCULADORA;

public class AddCommand implements Command {
    private CalcMode1 m_mode1;
    private CalcView m_view;

    public AddCommand(CalcMode1 mode1, CalcView view) {
        m_mode1 = mode1;
        m_view = view;
    }

    public void execute() {
        m_mode1.add(m_view.getUserInput());
    }
}