import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StickFigures extends JPanel{
    //Data Fields

    //Define frame size
    private int frameWidth = 1000;
    private int frameHeight = 800;

    public void paint(Graphics g){

        //Draw the male figure
        g.drawOval(50,50,50,50);
        g.drawLine(75,100,75,200);
        g.drawRect(50,200,50,50);
        g.drawLine(54,210,20,210);
        g.drawLine(96,210,130,210);
        g.drawLine(70,250,70,300);
        g.drawLine(80,250,80,300);

        //Draw the female figure
        g.drawOval(150,50,50,50);
        g.drawLine(175,100,175,150);
        g.drawLine(120,250,175,150);
        g.drawLine(230,250,175,150);
        g.drawLine(147,200,120,150);
        g.drawLine(202,200,230,150);
        g.drawLine(170,250,170,300);
        g.drawLine(180,250,180,300);
        g.drawLine(120,250,230,250);

    }

    public int getFrameWidth(){
        return frameWidth;
    }
    public int getFrameHeight(){
        return frameHeight;
    }

    public static void main(String[] args){
        JFrame frame = new JFrame();
        StickFigures StickFigures = new StickFigures();
        frame.getContentPane().add(StickFigures);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(StickFigures.getFrameWidth(),StickFigures.getFrameHeight());
        frame.setVisible(true);

    }
}

