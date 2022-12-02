import javax.swing.*;  
import java.awt.event.*;    

public class CheckBoxItemListener    {    
    
   CheckBoxItemListener(){    
         
        
        final JLabel label = new JLabel();            
        label.setHorizontalAlignment(JLabel.CENTER);    
        label.setSize(400,100);    
        
        JCheckBox checkbox1 = new JCheckBox("C++");    
        checkbox1.setBounds(150,100, 50,50);    
        checkbox1.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label.setText("C++ Checkbox: "     
               + (e.getStateChange()==1?"checked":"unchecked"));    
            }    
         });  
        
        JCheckBox checkbox2 = new JCheckBox("Java");    
        checkbox2.setBounds(150,150, 50,50);   
        checkbox2.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label.setText("Java Checkbox: "     
               + (e.getStateChange()==1?"checked":"unchecked"));    
            }    
         });   

        
        JFrame f= new JFrame("CheckBox Example");   
        f.add(checkbox1); 
        f.add(checkbox2); 
        f.add(label);    
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }   

public static void main(String args[])    
{    
    new CheckBoxItemListener();    
}    
}    