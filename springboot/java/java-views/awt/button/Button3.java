import java.awt.*;    
import java.awt.event.*;  

public class Button3POC {

    public Button3POC(){

        
        
        
        
        final TextField textField=new TextField();    
        textField.setBounds(50,50, 150,20);  
       
        Button button=new Button("Click Here");    
        button.setBounds(50,100,60,30);   
        button.addActionListener(new ActionListener() {    
        
            public void actionPerformed (ActionEvent e) {    
                textField.setText("Welcome to Javatpoint.");    
            }    
        }); 
        
        Frame frame = new Frame("Button Example");    
        frame.add(button);  
        frame.add(textField);    
        frame.setSize(400,400);    
        frame.setLayout(null);    
        frame.setVisible(true); 

    }

    public static void main(String[] args) {    

        new Button3POC();
            
    }   
    
}

  
  
