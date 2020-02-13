//Nabil

//Edit valueBeforeConversion,result,TITLE,convertList
package Converter;

import javax.swing.*; //JFrame included
import java.awt.BorderLayout; // Windows layout
import java.awt.Color; //to use color 
import java.awt.event.*; // activate the action

public class Length extends JFrame implements ActionListener{
    private final String TITLE = "Distance Converter";
    private final String convertList[] ={"cm to m","m to km","m to inches","m to feet","km to miles"};
    private final double RATE1 = 0.01,RATE2 = 0.001, RATE3 = 39.3701, RATE4 = 3.28084, RATE5 = 0.621371;
    private JComboBox jcb;
    private JLabel title,result;
    private String valueAC;
    private JButton calculate;
    private double valueAfterConvert,valueMultiplier;
    private JPanel p1,p2;
    private JTextField valueBeforeConversion;
    
    public Length(){
        JComboBox jcb = new JComboBox(convertList);
        JPanel p1 = new JPanel(),p2 = new JPanel();
        JTextField valueBeforeConversion = new JTextField(10);
        JLabel label1 = new JLabel("Value before conversion");
        title = new JLabel(TITLE);
        JButton calculate = new JButton("Calculate");

        
        //Panel 1 Content
        p1.add(title);
        p1.add(jcb);
        
        //Panel 2 Content
        p2.add(label1);
        p2.add(valueBeforeConversion);
        p2.add(result);
        p2.add(calculate);
        
        //Background Colour
        p1.setBackground(new Color(25, 181, 254));
        p2.setBackground(Color.white);
        
        //Positioning
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        
        jcb.addActionListener(this);
        calculate.addActionListener(this);
        
        String valueAC = Double.toString(this.valueAfterConvert); 
        result = new JLabel(valueAC);

    }
     
    public void actionPerformed(ActionEvent e){
            int index;
            if(e.getSource() == jcb){{
                index = jcb.getSelectedIndex();
                switch(index){
                   case 0:
                   valueMultiplier = RATE1;break;
                   case 1:
                   valueMultiplier = RATE2;break;
                   case 2:
                   valueMultiplier = RATE3;break;
                   case 3:
                   valueMultiplier = RATE4;break;              
                   case 4:
                   valueMultiplier = RATE5;break;
                }
                if(e.getSource() == calculate){
                    valueAfterConvert = Double.parseDouble(valueBeforeConversion.getText()) * valueMultiplier; 
                }        
            }
        }
    }
}
