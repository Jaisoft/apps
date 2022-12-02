import java.awt.*;    

public class ButtonPOC {  
  
public static void main (String[] args) {   
  
    
       
  
   
    Button button = new Button("Click Here");   
    // set the position for the button in frame   
    button.setBounds(50,100,80,30);    


    Frame frame = new Frame("Button Example"); 
    frame.add(button);    
    frame.setSize(400,400);    
    frame.setLayout(null);    
    frame.setVisible(true);     
}    
}    

