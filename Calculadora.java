import java.awt.*;
import javax.swing.*;

public class Calculadora extends JFrame{

        
        JPanel base = (JPanel) this.getContentPane(); // para el fondo donde iran los componentes.
       
        JTextField texto = new JTextField(); // PANTALLA DE TEXTO
        
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        JButton btnCE = new JButton("CE");
        JButton btnC = new JButton("C");
        JButton btnMAS = new JButton("+");
        JButton btnMENOS = new JButton("-");
        JButton btnMulti = new JButton("*");
        JButton btnDIVI = new JButton("/");
        JButton btnPORCI = new JButton("%");
        JButton btnIGUAL = new JButton("=");
        JButton btnPUNTO = new JButton(".");
        

    
    public Calculadora(){

        //PLANTILLA
        base.setLayout(null);
        setSize(350, 450);
        setTitle("CALCULADORA");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //VENTANA DE TEXTO
        
        texto.setBounds(28, 8, 288, 70);
        add(texto);
        
        //BOTONES
        
        btn1.setBounds(23,96,50,50);
        btn1.setFont(new Font("Arial", Font.BOLD,20));                        
        add(btn1);
        
        
        btn2.setBounds(85, 96, 50, 50);
        btn2.setFont(new Font("Arial", Font.BOLD,20));
        add(btn2);
        
        btn3.setBounds(147, 96, 50, 50);
        btn3.setFont(new Font("Arial", Font.BOLD,20));
        add(btn3);
        
        btnCE.setBounds(211, 96, 50, 50);
        btnCE.setFont(new Font("Arial", Font.BOLD,10));
        add(btnCE);
       
        btnC.setBounds(273, 96, 50, 50);
        btnC.setFont(new Font("Arial", Font.BOLD,20));
        add(btnC);
        
        btn4.setBounds(23, 166, 50, 50);
        btn4.setFont(new Font("Arial", Font.BOLD,20));
        add(btn4);
        
        btn5.setBounds(85, 166, 50, 50);
        btn5.setFont(new Font("Arial", Font.BOLD,20));
        add(btn5);
        
        btn6.setBounds(147, 166, 50, 50);
        btn6.setFont(new Font("Arial", Font.BOLD,20));
        add(btn6);
        
        btnMAS.setBounds(211, 166, 50, 50);
        btnMAS.setFont(new Font("Arial", Font.BOLD,20));
        add(btnMAS);
        
        btnMENOS.setBounds(273, 166, 50, 50);
        btnMENOS.setFont(new Font("Arial", Font.BOLD,20));
        add(btnMENOS);
        
        btn7.setBounds(23, 236, 50, 50);
        btn7.setFont(new Font("Arial", Font.BOLD,20));
        add(btn7);
       
        btn8.setBounds(85, 236, 50, 50);
        btn8.setFont(new Font("Arial", Font.BOLD,20));
        add(btn8);
        
        btn9.setBounds(147, 236, 50, 50);
        btn9.setFont(new Font("Arial", Font.BOLD,20));
        add(btn9);
        
        btnMulti.setBounds(211, 236, 50, 50);
        btnMulti.setFont(new Font("Arial", Font.BOLD,20));
        add(btnMulti);
        
        btnDIVI.setBounds(273, 236, 50, 50);
        btnDIVI.setFont(new Font("Arial", Font.BOLD,20));
        add(btnDIVI);
        
        btn0.setBounds(23, 306, 112, 50);
        btn0.setFont(new Font("Arial", Font.BOLD,20));
        add(btn0);
       
        btnPUNTO.setBounds(147, 306, 50, 50);
        btnPUNTO.setFont(new Font("Arial", Font.BOLD,20));
        add(btnPUNTO);
        
        btnPORCI.setBounds(211, 306, 50, 50);
        btnPORCI.setFont(new Font("Arial", Font.BOLD,17));
        add(btnPORCI);
       
        btnIGUAL.setBounds(273, 296, 50, 60);
        btnIGUAL.setFont(new Font("Arial", Font.BOLD,20));
        add(btnIGUAL);
        
        
    }
    
    public static void main(String[] args) {
        new Calculadora();
    }

}


