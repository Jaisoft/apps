import java.awt.*;
import java.awt.event.*;

public class AwtAdapterDemo {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtAdapterDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      AwtAdapterDemo  awtAdapterDemo = new AwtAdapterDemo();        
      awtAdapterDemo.showWindowAdapterDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showWindowAdapterDemo(){
      headerLabel.setText("Listener in action: WindowAdapter");      

      Button okButton = new Button("OK");

      final Frame aboutFrame = new Frame();
      aboutFrame.setSize(300,200);;
      aboutFrame.setTitle("WindowAdapter Demo");
      aboutFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               aboutFrame.dispose();
         }        
      });    
      Label msgLabel = new Label("Welcome to tutorialspoint.");
      msgLabel.setAlignment(Label.CENTER);
      msgLabel.setSize(100,100);
      aboutFrame.add(msgLabel);
      aboutFrame.setVisible(true);
   }
}
