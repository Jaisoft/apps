
    import java.awt.*;    
  
    public class Frame1 extends Frame {    
      
       
        Frame1() {  
      
        
          Button button = new Button("Click Me!!");  
      
          // setting button position on screen  
          button.setBounds(30,100,80,30);  
      
           
          add(button);  
      
          // frame size 300 width and 300 height    
          setSize(300,300);  
      
        
          setTitle("This is our basic AWT example");   
              
          // no layout manager   
          setLayout(null);   
      
          // now frame will be visible, by default it is not visible    
          setVisible(true);  
    }    
      
 
    public static void main(String args[]) {   
      
      
        Frame1 frameExample = new Frame1();    
      
    }  
      
    }    