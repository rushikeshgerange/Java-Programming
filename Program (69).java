import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(600,600);
        fobj.setVisible(true);

        Button bobj = new Button("Submit");
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

class GUI6
{
    public static void main(String args[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA49");

    }
}