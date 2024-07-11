import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 extends JFrame {
    public JPanel menu3;
    private JButton reg;
    private JLabel label1;

    public form3() {
        setTitle("Hobbie");
        setContentPane(menu3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setPreferredSize(new Dimension(1000,800));
        setMinimumSize(new Dimension(1000,800));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new form2();
                setVisible(false);
            }
        });
    }
}
