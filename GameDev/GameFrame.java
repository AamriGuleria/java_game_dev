import javax.swing.JFrame;

public class GameFrame extends JFrame{
    // public GameFrame(){
        
    // }
    public static void main(String[] args) {
        int bwidth=400;
        int bheight=640;
        JFrame frame=new JFrame("Flappy Bird");
        frame.setSize(bwidth,bheight);
        frame.setLocationRelativeTo(null);//window in the center of the screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Flappy fp=new Flappy();
        frame.add(fp);
        // frame.pack();
        // fp.requestFocus();
        frame.setVisible(true);
    }
}                                                                                       