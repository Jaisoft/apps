import java.awt.*;
import java.awt.event.*;

public class AwtListenerDemo {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtListenerDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      AwtListenerDemo  awtListenerDemo = new AwtListenerDemo();  
      awtListenerDemo.showComponentListenerDemo();
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

   private void showComponentListenerDemo(){
      headerLabel.setText("Listener in action: ComponentListener");      

      ScrollPane panel = new ScrollPane();      
      panel.setBackground(Color.magenta);            

      Label msglabel = new Label();
      msglabel.setAlignment(Label.CENTER);
      msglabel.setText("Welcome to TutorialsPoint AWT Tutorial.");
      panel.add(msglabel);

      msglabel.addComponentListener(new CustomComponentListener());      
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }

   class CustomComponentListener implements ComponentListener {

      public void componentResized(ComponentEvent e) {
         statusLabel.setText(statusLabel.getText() 
         + e.getComponent().getClass().getSimpleName() + " resized. ");
      }

      public void componentMoved(ComponentEvent e) {
         statusLabel.setText(statusLabel.getText() 
         + e.getComponent().getClass().getSimpleName() + " moved. ");
      }

      public void componentShown(ComponentEvent e) {
         statusLabel.setText(statusLabel.getText() 
         + e.getComponent().getClass().getSimpleName() + " shown. ");
      }

      public void componentHidden(ComponentEvent e) {
         statusLabel.setText(statusLabel.getText() 
         + e.getComponent().getClass().getSimpleName() + " hidden. ");
      }
   }
}
