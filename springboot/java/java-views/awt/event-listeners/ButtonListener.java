import java.awt.*;  
import java.awt.event.*;  

class AcctionListenerExample extends Frame implements ActionListener{  

 

AcctionListenerExample(){  
  
TextField textField=new TextField();  
textField.setBounds(60,50,170,20);  

Button button=new Button("click me");  
button.setBounds(100,120,80,30);  
button.addActionListener(this);



add(button);
add(textField);  


setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  


public void actionPerformed(ActionEvent e){  
textField.setText("Welcome");  
}  

public static void main(String args[]){  
new AcctionListenerExample();  
}  
}  