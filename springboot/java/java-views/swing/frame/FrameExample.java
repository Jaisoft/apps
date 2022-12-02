
import javax.swing.*;  

public class FrameExample {  

public static void main(String[] args) {  


JButton b=new JButton("click");
b.setBounds(130,100,100, 40);

JFrame f=new JFrame();          
f.add(b);
f.setSize(400,500);  
f.setLayout(null);
f.setVisible(true);  
}  
}  