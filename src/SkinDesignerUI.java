import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

public class SkinDesignerUI extends JPanel implements KeyListener {
    boolean help = false;
    boolean startDesigning = false;
    int x = 0;
    int y = 0;
    int K = 0;
    int L = 0;
    int J = 0;
    int WITH = 30;

    private final Set<Integer> pressed = new HashSet<>();
    {
         javax.swing.Timer timer = new Timer(15, e -> {
            if (pressed.size() > 0) {
                for (int keyCode : pressed) {
                    updatePositionsFromHeldKeys(keyCode);
                }
                this.repaint();
            }
        });
        timer.start();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(640, 480);
    }

    private void updatePositionsFromKeyRelease(int keyCode){
        if (keyCode == KeyEvent.VK_C) {
            startDesigning = !startDesigning;
        }
        if (keyCode == KeyEvent.VK_H) {
            help = !help;
        }
    }

    private void updatePositionsFromHeldKeys(int keyCode){
        if (keyCode == KeyEvent.VK_D) {
            x = x + 2;
        }
        if (keyCode == KeyEvent.VK_A) {
            x = x - 2;
        }
        if (keyCode == KeyEvent.VK_S) {
            y = y + 2;
        }
        if (keyCode == KeyEvent.VK_W) {
            y = y - 2;
        }
        if (keyCode == KeyEvent.VK_L) {
            L = L + 1;
            if (L > 255) {
                L = L - 1;
            }
        }
        if (keyCode == KeyEvent.VK_K) {
            K = K + 1;
            if (K > 255) {
                K = K - 1;
            }
        }
        if (keyCode == KeyEvent.VK_J) {
            J = J + 1;
            if (J > 255) {
                J = J - 1;
            }
        }
        if (keyCode == KeyEvent.VK_T) {
            J = 0;
            K = 0;
            L = 0;
        }
        if (keyCode == KeyEvent.VK_P) {
            x = 0;
            y = 0;
        }
        if (keyCode == KeyEvent.VK_1) {
            x = x + 10;
        }
        if (keyCode == KeyEvent.VK_2) {
            x = x + 20;
        }
        if (keyCode == KeyEvent.VK_3) {
            x = x + 30;
        }
        if (keyCode == KeyEvent.VK_4) {
            x = x + 40;
        }
        if (keyCode == KeyEvent.VK_5) {
            x = x + 50;
        }
        if (x > 610) {
            x = 610;
        }
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        if (y > 450) {
            y = 450;
        }
    
	    if(keyCode == KeyEvent.VK_Q){
	    	J = 255;
	    	K = 255;
	    	L = 255;
	    }
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.setColor(Color.BLUE);
        graphics.fillRect(0, 0, 100000000, 100000000);

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, 1000, 50);

        graphics.setColor(Color.BLACK);
        graphics.drawString("skin creator", 350, 30);

        graphics.setColor(Color.RED);
        graphics.fillRect(0, 0, 30, 10000);
        graphics.fillRect(610, 0, 30, 100000);

        graphics.setColor(Color.GREEN);
        graphics.fillRect(0, 450, 100000000, 30);

        if (startDesigning) {
            graphics.setColor(new Color(L, K, J));
            graphics.fillRect(0, 0, 1000000, 10000000);
            graphics.setColor(Color.BLUE);
            graphics.drawRect(x, y, 30, 30);
        }
        graphics.setColor(Color.WHITE);
        graphics.drawString("H = help", 300, 240);
        if (help == true) {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, 1000000, 1000000);
            graphics.setColor(Color.BLACK);
            graphics.drawString("C = start designing", 0, 20);
            graphics.drawString("p = reset location", 0, 50);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
		pressed.add(keyCode);
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();  
    	pressed.remove(keyCode);
        updatePositionsFromKeyRelease(keyCode);
        updatePositionsFromHeldKeys(keyCode);
        this.repaint();
    }
}

