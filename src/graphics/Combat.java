package graphics;
import java.awt.*;
import javax.swing.*;

public class Combat extends JPanel {
    private Image playersPokemon;
    
    public Combat() {
        loadImage();
    }
    
    private void loadImage() {
        // Load the image using ClassLoader
        playersPokemon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/fonts/448.png"));
    }
    
    public void update() {
        repaint();  // Calls the paintComponent method to redraw the image
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (playersPokemon != null) {
            g.drawImage(playersPokemon, 100, 100, this);  // Draw the image at (100, 100)
        }
    }
}
