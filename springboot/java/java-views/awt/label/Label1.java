import java.awt.*;    
  
public class Label1 {    
public static void main(String args[]){   
  
    Label label1 = new Label ("First Label.");  
    label1.setBounds(50, 100, 100, 30);   
    
    Label label2 = new Label ("Second Label.");   
    label2.setBounds(50, 150, 100, 30);  
  
    Frame frame = new Frame ("Label example");  
    frame.add(label1);  
    frame.add(label2);  
    frame.setSize(400,400);    
    frame.setLayout(null);    
    frame.setVisible(true);    
}    
}  