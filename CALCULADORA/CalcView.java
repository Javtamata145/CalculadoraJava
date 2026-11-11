package CALCULADORA;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalcView extends JFrame {
    //constantes
    private static final String INITIAL_VALUE = "1";
    //componentes
    private JTextField m_userInputTF = new JTextField(5);
    private JTextField m_total1TF = new JTextField(20);
    private JButton m_multiplyBtn = new JButton("Multiply");
    private JButton m_clearBtn = new JButton("Clear");

    private CalcMode1 m_mode1;

    //constructor
    CalcView(CalcMode1 mode1)
    {
        m_mode1 = mode1;
        m_mode1.setValue(INITIAL_VALUE);

        //inicializando componentes
        m_total1TF.setText(m_mode1.getValue());
        m_total1TF.setEditable(false);

        //layout de compoinentes
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_userInputTF);
        content.add(m_multiplyBtn);
        content.add(new JLabel("Total"));
        content.add(m_total1TF);
        content.add(m_clearBtn);

        //finalizar layout
        this.setContentPane(content);
        this.pack();

        this.setTitle("Simple Calc - MVC");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void reset()
    {
        m_total1TF.setText(INITIAL_VALUE);
    }

    String getUserInput()
    {
        return m_userInputTF.getText();
    }

    void setTotal(String newTotal)
    {
        m_total1TF.setText(newTotal);
    }

    void showError(String errMessage)
    {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    void addMultiplyListener(ActionListener mal)
    {
        m_multiplyBtn.addActionListener(mal);
    }

    void addClearListener(ActionListener cal)
    {
        m_clearBtn.addActionListener(cal);
    }
}
