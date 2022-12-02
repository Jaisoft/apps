import java.awt.*;  

public class Button2POC {

    Frame frame;  
    Button button1, button2, button3;  
    // instantiating using the constructor   
    Button2POC() {  
     
    
    button1 = new Button();  
    
    button2 = new Button ("Click here");  
    
    button3 = new Button();  
    button3.setLabel("Button 3");  


    frame = new Frame ("Frame to display buttons"); 
    frame.add(button1);  
    frame.add(button2);  
    frame.add(button3);  
    frame.setLayout(new FlowLayout());  
    frame.setSize(300,400);  
    frame.setVisible(true);  
    }  

    public static void main (String args[])  
    {  
    new Button2POC();  
    } 
    
}

    
     
    
