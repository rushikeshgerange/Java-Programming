//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        JFrame fobj = new JFrame(title);
        fobj.setSize(600,600);
        fobj.setVisible(true);

        JButton bobj = new JButton("Submit");
        fobj.add(bobj);
        
        fobj.addWindowListener(new MarvellousListener());
    }

}

class MarvellousListener extends WindowAdapter
{
    
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

}

class GUI7
{
    public static void main(String args[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA49");

    }
}