//package Converter;
//
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import java.awt.Color;
//import javax.swing.JButton;
//import java.awt.Font;
//import javax.swing.JLabel;
//import javax.swing.SwingConstants;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JTextField;
//
//public class Length2 extends JFrame {
//
//    private String type0,type1,type2,type3,type4;
//
//    private JPanel contentPane;
//    private JTextField mg;
//    private JTextField g;
//    private JTextField kg;
//    private JTextField t;
//    private JTextField tfMsg;
//
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    Length frame = new Length();
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//
//    public Length2() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(100, 100, 500, 600);
//        contentPane = new JPanel();
//        contentPane.setForeground(Color.WHITE);
//        contentPane.setBackground(Color.BLACK);
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(contentPane);
//        contentPane.setLayout(null);
//
//        JButton button = new JButton("Main Menu");
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                Main home = new Main();
//                home.setVisible(true);
//                home.setSize(500,600);
//                dispose();
//            }
//        });
//        button.setForeground(Color.WHITE);
//        button.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        button.setBackground(Color.BLUE);
//        button.setBounds(12, 499, 162, 41);
//        contentPane.add(button);
//
//        JLabel lblLengthConversion = new JLabel("Width Conversion");
//        lblLengthConversion.setHorizontalAlignment(SwingConstants.CENTER);
//        lblLengthConversion.setForeground(Color.WHITE);
//        lblLengthConversion.setFont(new Font("Tahoma", Font.PLAIN, 30));
//        lblLengthConversion.setBounds(12, 13, 458, 54);
//        contentPane.add(lblLengthConversion);
//
//        JButton button_1 = new JButton("Exit");
//        button_1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//            }
//        });
//        button_1.setForeground(Color.WHITE);
//        button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        button_1.setBackground(Color.RED);
//        button_1.setBounds(341, 499, 129, 41);
//        contentPane.add(button_1);
//
//        JButton button_2 = new JButton("Clear");
//        button_2.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                tfMsg.setText(null);
//                t.setText(null);
//                mg.setText(null);
//                g.setText(null);
//                kg.setText(null);
//
//            }
//        });
//        button_2.setForeground(Color.WHITE);
//        button_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        button_2.setBackground(new Color(0, 100, 0));
//        button_2.setBounds(200, 499, 129, 41);
//        contentPane.add(button_2);
//
//        JLabel lblMilligram = new JLabel("Milligram");
//        lblMilligram.setForeground(Color.WHITE);
//        lblMilligram.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        lblMilligram.setBackground(Color.BLACK);
//        lblMilligram.setBounds(12, 91, 107, 40);
//        contentPane.add(lblMilligram);
//
//        mg = new JTextField();
//        mg.setHorizontalAlignment(SwingConstants.CENTER);
//        mg.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        mg.setColumns(10);
//        mg.setBounds(131, 91, 147, 40);
//        contentPane.add(mg);
//
//        JLabel lblMg = new JLabel("mg");
//        lblMg.setForeground(Color.WHITE);
//        lblMg.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        lblMg.setBackground(Color.BLACK);
//        lblMg.setBounds(284, 91, 55, 40);
//        contentPane.add(lblMg);
//
//        JButton btnMg = new JButton("Convert");
//        btnMg.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                if(mg.getText().isEmpty())
//                {
//                    tfMsg.setText("Your input is emty !");
//                }
//                else
//                {
//                    tfMsg.setText(null);
//                    double Mg = Double.parseDouble(mg.getText());
//                    double Gm = Mg/1000;
//                    double Kg = Gm/1000;
//                    double Ton = Kg/1000;
//                    String GM = String.format("%.2f", Gm);
//                    String KG = String.format("%.2f", Kg);
//                    String TON = String.format("%.2f", Ton);
//                    g.setText(GM);
//                    kg.setText(KG);
//                    t.setText(TON);
//
//                }
//            }
//        });
//        btnMg.setForeground(Color.YELLOW);
//        btnMg.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        btnMg.setBackground(new Color(25, 25, 112));
//        btnMg.setBounds(351, 91, 100, 40);
//        contentPane.add(btnMg);
//
//        JLabel lblGram = new JLabel("Gram");
//        lblGram.setForeground(Color.WHITE);
//        lblGram.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        lblGram.setBackground(Color.BLACK);
//        lblGram.setBounds(12, 157, 107, 40);
//        contentPane.add(lblGram);
//
//        g = new JTextField();
//        g.setHorizontalAlignment(SwingConstants.CENTER);
//        g.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        g.setColumns(10);
//        g.setBounds(131, 157, 147, 40);
//        contentPane.add(g);
//
//        JLabel lblG = new JLabel("g");
//        lblG.setForeground(Color.WHITE);
//        lblG.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        lblG.setBackground(Color.BLACK);
//        lblG.setBounds(284, 157, 55, 40);
//        contentPane.add(lblG);
//
//        JButton btnG = new JButton("Convert");
//        btnG.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                if(g.getText().isEmpty())
//                {
//                    tfMsg.setText("Your input is emty !");
//                }
//                else
//                {
//                    tfMsg.setText(null);
//                    double Gm = Double.parseDouble(g.getText());
//                    double Mg = Gm*1000;
//                    double Kg = Gm/1000;
//                    double Ton = Kg/1000;
//                    String MG = String.format("%.2f", Mg);
//                    String KG = String.format("%.2f", Kg);
//                    String TON = String.format("%.2f", Ton);
//                    mg.setText(MG);
//                    kg.setText(KG);
//                    t.setText(TON);
//
//                }
//            }
//        });
//        btnG.setForeground(Color.YELLOW);
//        btnG.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        btnG.setBackground(new Color(25, 25, 112));
//        btnG.setBounds(351, 157, 100, 40);
//        contentPane.add(btnG);
//
//        JLabel lblKilogram = new JLabel("Kilogram");
//        lblKilogram.setForeground(Color.WHITE);
//        lblKilogram.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        lblKilogram.setBackground(Color.BLACK);
//        lblKilogram.setBounds(12, 220, 107, 40);
//        contentPane.add(lblKilogram);
//
//        kg = new JTextField();
//        kg.setHorizontalAlignment(SwingConstants.CENTER);
//        kg.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        kg.setColumns(10);
//        kg.setBounds(131, 220, 147, 40);
//        contentPane.add(kg);
//
//        JLabel lblKg = new JLabel("kg");
//        lblKg.setForeground(Color.WHITE);
//        lblKg.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        lblKg.setBackground(Color.BLACK);
//        lblKg.setBounds(284, 220, 55, 40);
//        contentPane.add(lblKg);
//
//        JButton btnKg = new JButton("Convert");
//        btnKg.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                if(kg.getText().isEmpty())
//                {
//                    tfMsg.setText("Your input is emty !");
//                }
//                else
//                {
//                    tfMsg.setText(null);
//                    double Kg = Double.parseDouble(kg.getText());
//                    double Gm = Kg*1000;
//                    double Mg = Gm*1000;
//                    double Ton = Kg/1000;
//                    String GM = String.format("%.2f", Gm);
//                    String MG = String.format("%.2f", Mg);
//                    String TON = String.format("%.2f", Ton);
//                    mg.setText(MG);
//                    g.setText(GM);
//                    t.setText(TON);
//
//                }
//            }
//        });
//        btnKg.setForeground(Color.YELLOW);
//        btnKg.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        btnKg.setBackground(new Color(25, 25, 112));
//        btnKg.setBounds(351, 220, 100, 40);
//        contentPane.add(btnKg);
//
//        JLabel lblTonne = new JLabel("Tonne");
//        lblTonne.setForeground(Color.WHITE);
//        lblTonne.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        lblTonne.setBackground(Color.BLACK);
//        lblTonne.setBounds(12, 281, 107, 40);
//        contentPane.add(lblTonne);
//
//        t = new JTextField();
//        t.setHorizontalAlignment(SwingConstants.CENTER);
//        t.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        t.setColumns(10);
//        t.setBounds(131, 281, 147, 40);
//        contentPane.add(t);
//
//        JLabel lblTonne_1 = new JLabel("tonne");
//        lblTonne_1.setForeground(Color.WHITE);
//        lblTonne_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        lblTonne_1.setBackground(Color.BLACK);
//        lblTonne_1.setBounds(284, 281, 55, 40);
//        contentPane.add(lblTonne_1);
//
//        JButton btnT = new JButton("Convert");
//        btnT.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                if(t.getText().isEmpty())
//                {
//                    tfMsg.setText("Your input is emty !");
//                }
//                else
//                {
//                    tfMsg.setText(null);
//                    double Ton = Double.parseDouble(t.getText());
//                    double Kg = Ton*1000;
//                    double Gm = Kg*1000;
//                    double Mg = Gm*1000;
//                    String GM = String.format("%.2f", Gm);
//                    String KG = String.format("%.2f", Kg);
//                    String MG = String.format("%.2f", Mg);
//                    g.setText(GM);
//                    kg.setText(KG);
//                    mg.setText(MG);
//
//                }
//            }
//        });
//        btnT.setForeground(Color.YELLOW);
//        btnT.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        btnT.setBackground(new Color(25, 25, 112));
//        btnT.setBounds(351, 281, 100, 40);
//        contentPane.add(btnT);
//
//        tfMsg = new JTextField();
//        tfMsg.setForeground(Color.RED);
//        tfMsg.setBackground(Color.BLACK);
//        tfMsg.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        tfMsg.setHorizontalAlignment(SwingConstants.CENTER);
//        tfMsg.setBounds(12, 349, 458, 137);
//        contentPane.add(tfMsg);
//        tfMsg.setColumns(10);
//    }
//}