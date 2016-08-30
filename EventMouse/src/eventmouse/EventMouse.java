/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmouse;

/**
 *
 * @author rahulthawal
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public  class EventMouse{

    /**
     * @param args the command line arguments
     */
    
  JFrame frame;
  JTextField coordinates;
 // setting layout
 public void initGUI ( ) {


// creating event generator
frame = new JFrame();

Container cont = frame.getContentPane();
cont.setLayout(new BorderLayout( ) );

coordinates = new JTextField ();
cont.add(coordinates, BorderLayout.NORTH);

//frame.addMouseMotionListener(this);

// registering window handler with generator
WindowHandler wh = new WindowHandler();
frame.addWindowListener(wh);

MouseHandler mhandler = new MouseHandler ();
frame.addMouseMotionListener(mhandler);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(200,150);
frame.setVisible(true);
 }
 
public EventMouse()
 {initGUI();}
 
    public static void main(String[] args) {
        // TODO code application logic here
   EventMouse e = new EventMouse();
    }

    
}

   

  class WindowHandler extends WindowAdapter
  {
          public void windowClosing (WindowEvent we) 
          {

                    JOptionPane.showMessageDialog(null, "Good Bye");
                    System.exit(0);
          
          }
  }
class MouseHandler extends MouseAdapter
{
            public void mouseMoved (MouseEvent me) 
          {
                int x = me.getX();
                int y = me.getY();
                
                coordinates.setText("Moved at [" + x + "," + y + "]" );
          }
    

}

   

