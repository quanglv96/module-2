package demo;

import javax.swing.*;

public class Run1 {
    public JOptionPane test() {
        final JOptionPane optionPane = new JOptionPane(
                "The only way to close this dialog is by\n"
                        + "pressing one of the following buttons.\n"
                        + "Do you understand?",
                JOptionPane.QUESTION_MESSAGE,
                JOptionPane.YES_NO_OPTION);
        return optionPane;
    }
}