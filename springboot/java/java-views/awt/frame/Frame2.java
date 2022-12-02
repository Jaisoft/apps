  
    import java.awt.*;    
      

    class Frame2 {    
      
      
       Frame2() {  
      
         
          Label label = new Label("Employee id:");   
          label.setBounds(20, 80, 80, 30);  
   
          Button button = new Button("Submit");  
          button.setBounds(100, 100, 80, 30); 
        
          TextField textField = new TextField();  
          textField.setBounds(20, 100, 80, 30);  
           
      
          Frame frame = new Frame();     
          frame.add(button);  
          frame.add(label);  
          frame.add(textField);   
          frame.setSize(400,300); 
          frame.setTitle("Employee info");   
          frame.setLayout(null);    
          frame.setVisible(true);  
    }    
      
  
    public static void main(String args[]) {   
      
      new Frame2();    
      
    }  
      
    }    
