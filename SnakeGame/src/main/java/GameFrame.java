import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){
        //        GamePanel panel = new GamePanel();
        this.add(new GamePanel()); //this shorthands line 8
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
