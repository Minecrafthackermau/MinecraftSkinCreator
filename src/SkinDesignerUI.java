import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SkinDesignerUI extends JPanel implements KeyListener {
boolean startDesigning = false;
int x = 0;
int y = 0;
int K = 0;
int L = 0;
int J = 0;
	public SkinDesignerUI() {
		

	}

	public SkinDesignerUI(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public SkinDesignerUI(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	public SkinDesignerUI(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(640,480);
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_C){
			startDesigning = true;
		}else if(e.getKeyCode() == KeyEvent.VK_D){
			x = x+1;
		}else if(e.getKeyCode() == KeyEvent.VK_A){
			x = x-1;
		}else if(e.getKeyCode() == KeyEvent.VK_S){
			y = y+1;
		}else if(e.getKeyCode() == KeyEvent.VK_W){
			y = y-1;
		}else if(e.getKeyCode() == KeyEvent.VK_L){
			L = L+1;
			if(L > 255){
				L = L-255;
			}
		}else if(e.getKeyCode() == KeyEvent.VK_K){
			K = K+1;
			if(K > 255){
				K = 0;
			}
		}else if(e.getKeyCode() == KeyEvent.VK_J){
			J = J+1;
			if(J > 255){
				J = 0;
			}
		}
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		
//		Graphics2D graphics2d = (Graphics2D) graphics;
		
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

if(startDesigning){
	graphics.setColor(new Color(L, K, J));
graphics.fillRect(0,  0,  1000000,  10000000);
graphics.setColor(Color.BLUE);
graphics.fillRect(x, y, 30, 30);
}
 
	}
	}
	
