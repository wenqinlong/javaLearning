import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppGraphInOut {
    public static void main(String[] args) {
        new AppFrame();
    }
}

class AppFrame extends JFrame {
    JTextField in = new JTextField();
    JButton btn = new JButton("求平方根");
    JLabel out = new JLabel("用于显示结果的标签");
    public AppFrame() {
        setLayout(new FlowLayout());
        getContentPane().add(in);
        getContentPane().add(btn);
        getContentPane().add(out);
        btn.addActionListener(e -> {
            String s = in.getText();
            double d = Double.parseDouble(s);
            double sqrt = Math.sqrt(d);
            out.setText(d+"的平方根是"+sqrt);
        });
        setSize(400, 100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

//    class BtnActionAdapter implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
}


