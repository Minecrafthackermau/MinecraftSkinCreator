import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SkinDesignerUI extends JPanel implements KeyListener {
	boolean help = false;
	boolean startDesigning = false;
	boolean saved = false;    
	int x = 0;
	int y = 0;
	int K = 0;
	int L = 0;
	int J = 0;
	int WITH = 30;
	int HEIGHT = 30;
	int R = 0;
	int G = 0;
	int B = 0;
	int V = -10000000;
	int C = -10000;
	int SQ = 120;
	int LL = 0;
	int KK = 0;
	int JJ = 0;
	int JN = 0;
	int KN = 0;
	int LN = 0;
	int SQA = 40;
	int CC = -1000000;
	int VV = -100000;
	 int CN = -1000000;
	 int VN = -1000000;
int XX = 0;
int YY = 0;
	 int XN = 0;
	 int YN = 0;
	 int BB = 0;
	 int GG = 0;
	 int RR = 0;
	 int RN = 0;
	 int GN = 0;
	 int BN = 0;
Set<blockCreatorRGBXY> blocks = new HashSet<>();

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
		if(keyCode == KeyEvent.VK_COMMA){
			saved = !saved;
		}
	}

	private void updatePositionsFromHeldKeys(int keyCode){
		if (keyCode == KeyEvent.VK_D) {
			x = x + 4;
		}
		if (keyCode == KeyEvent.VK_A) {
			x = x - 4;
		}
		if (keyCode == KeyEvent.VK_S) {
			y = y + 4;
		}
		if (keyCode == KeyEvent.VK_W) {
			y = y - 4;
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
			WITH = 30;
			HEIGHT = 30;
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

		if(keyCode == KeyEvent.VK_O){
			WITH = WITH+1;
		}
		if(keyCode == KeyEvent.VK_I){
			HEIGHT = HEIGHT+1;
		}
		if(keyCode == KeyEvent.VK_Z){
			HEIGHT = HEIGHT-1;
		}
		if(HEIGHT < 40){
			HEIGHT = 40;
		}
		if(keyCode == KeyEvent.VK_X){
			WITH = WITH -1;
		}
		if(WITH < 40){
			WITH = 40;
		}
		if(keyCode == KeyEvent.VK_R){
			R = R+1;
		}
		if(R > 255){
			R = 255;
		}
		if(keyCode == KeyEvent.VK_G){
			G = G+1;
		}
		if(G > 255){
			G = 255;
		}
		if(keyCode == KeyEvent.VK_B){
			B = B+1;
		}
		if(B > 255){
			B = 255;
		}
		if(keyCode == KeyEvent.VK_V){
			C = -100000000;
			V = -100000000;
			B = 0;
			G = 0;
			R = 0;
		}
		if(L == 0){
			R = 255;
		}
		if(K == 0){
			G = 255;   
		}
		if(J == 0){
			B = 255;
		}
		if(L == 255){
			R = 0;
		}
		if(K == 255){
			G = 0;
		}
		if(J == 255){
			B = 0;
		}
		if(WITH > 480){
			WITH = 640;
		}
		if(HEIGHT > 480){
			HEIGHT = 480;
		}
		if(keyCode == KeyEvent.VK_Z){
			R = R+10;
		}
		if(keyCode == KeyEvent.VK_X){
			G = G+10;
		}
		if(keyCode == KeyEvent.VK_M){
			B = B+10;
		}
		if(keyCode ==  KeyEvent.VK_RIGHT){
			SQ = 560;
		}
		if(keyCode == KeyEvent.VK_LEFT){
			SQ = 120;
		}
		if(keyCode == KeyEvent.VK_UP){
			SQA = 40;
		}
		if(keyCode == KeyEvent.VK_DOWN){
			SQA = 80;
		}
		if(SQ == 120){
			if(SQA == 40){
				if(keyCode == KeyEvent.VK_ENTER){
					LN = L;
					KN = K;
					JN = J;
				}
			}
		}
		if(SQA == 40){
			if(SQ == 560){
				if(keyCode == KeyEvent.VK_ENTER){
					JJ = J;
					KK = K;
					LL = L;
				}
			}
		}
		if(SQ == 120){
			if(SQA == 80){
				if(keyCode == KeyEvent.VK_ENTER){
					L = LN;
					K = KN;
					J = JN;
				}
			}
		}
		if(SQ == 560){
			if(SQA == 80){
				if(keyCode == KeyEvent.VK_ENTER){
					J = JJ;
					K = KK;
					L = LL;
				}
			}
		}
		if(SQ == 120){
			if(SQA == 40){
				if(keyCode == KeyEvent.VK_ENTER){
					CN = C;
					VN = V;
				}
			}
		}
		if(SQ == 120){
			if(SQA == 80){
				if(keyCode == KeyEvent.VK_ENTER){
					C = CN;
					V = VN;
				}
			}
		}
		if(SQ == 560){
			if(SQA == 80){
				if(keyCode == KeyEvent.VK_ENTER){
					C = CC;
					V = VV;
				}
			}
		}
		if(SQ == 560){
			if(SQA == 40){
				if(keyCode == KeyEvent.VK_ENTER){
					CC = C;
					VV = V;
				}
			}
		}
		if(SQ == 120){
			if(SQA == 40){
				if(keyCode == KeyEvent.VK_ENTER){
				XN = x;
				YN = y;
				}
			}
		}
		if(SQ == 120){
			if(SQA == 80){
				if(keyCode == KeyEvent.VK_ENTER){
					y = YN;
					x = XN;	
				}
			}
		}
		if(SQ == 560){
			if(SQA == 40){
				if(keyCode == KeyEvent.VK_ENTER){
					XX = x;
					YY = y;
				}
			}
		}
		if(SQ == 560){
			if(SQA == 80){
				if(keyCode == KeyEvent.VK_ENTER){
					x = XX;
					y = YY;
				}
			}
		}
		if(SQ == 120){
			if(SQA == 40){
				if(keyCode == KeyEvent.VK_ENTER){
					BN = B;
					GN = G;
					RN = R;
				}
			}
		}
		if(SQ == 120){
			if(SQA == 80){
				if(keyCode == KeyEvent.VK_ENTER){
					B = BN;
					G = GN;
					R = RN;
				}
			}
		}
		if(SQ == 560){
			if(SQA == 40){
				if(keyCode == KeyEvent.VK_ENTER){
					BB = B;
					GG = G;
					RR = R;
				}
			}
		}
		if(SQ == 560){
			if(SQA == 80){
				if(keyCode == KeyEvent.VK_ENTER){
					B = BB;
					G = GG;
					R = RR;
				}
			}
		}

		if (keyCode == KeyEvent.VK_PERIOD){
			blockCreatorRGBXY block = new blockCreatorRGBXY();
			block.x=x;
			block.y=y;
			block.block=new Color(R, G, B);
			blocks.add(block);
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
		graphics.drawString("WELCOME TO THE ADVANCED SKIN CREATOR", 150, 250);
		graphics.setColor(Color.GREEN);
		graphics.fillRect(0, 450, 100000000, 30);

		if (startDesigning) {
			graphics.setColor(new Color(L, K, J));
			graphics.fillRect(0, 0, 1000000, 10000000);
			graphics.setColor(new Color(R, G, B));
			graphics.drawRect(x, y, 40, 40);
			
			blockCreatorRGBXY[] blocksToDraw = blocks.toArray(new blockCreatorRGBXY[]{});
			for(int i=0; i < blocksToDraw.length; i++) {
				blockCreatorRGBXY block = blocksToDraw[i];
				graphics.setColor(block.block);
				graphics.fillRect(block.x, block.y, 40, 40);
			}
		}
		graphics.setColor(Color.WHITE);
		graphics.drawString("H = help", 240, 300);
		if(saved == true){
			graphics.setColor(Color.RED);
			graphics.fillRect(0,  0,  100000,  100000);
			graphics.setColor(Color.BLACK);
			graphics.drawString("Saved Skins live HERE", 300, 30);
			graphics.setColor(new Color(LN, KN, JN));
			graphics.fillRect(150, 100, 80, 80);
			graphics.setColor(new Color(LL, KK, JJ));
			graphics.fillRect(480, 100, 80, 80);
			graphics.setColor(Color.BLACK);
			graphics.fillRect(SQ, SQA, 30, 30);
			graphics.setColor(Color.WHITE);
			graphics.drawString("SAVE", 120, 55);
			graphics.drawString("SAVE", 560, 55);
			graphics.drawString("USE", 120, 95);
			graphics.drawString("USE", 560, 95);
		}else if (help == true) {
			graphics.setColor(Color.WHITE);
			graphics.fillRect(0, 0, 1000000, 1000000);
			graphics.setColor(Color.BLACK);
			graphics.drawString("C = start designing", 0, 20);
			graphics.drawString("p = reset location", 0, 50);
			graphics.drawString("WASD = move square", 0, 80);
			graphics.drawString("LKJRGB = change color of background/squares", 0, 120);
			graphics.drawString("Full Stop/ Period = summon new square", 0, 140);
			graphics.drawString("VP = reset original square/ reset second square", 0, 170);
			graphics.drawString("IO = change dimensions", 0, 200);
			graphics.drawString("QT = change background to WHITE or BLACK", 0, 230);
			graphics.drawString("1 2 3 4 5 = move square 10, 20, 30, 40, 50 pixles to the right", 0, 260);
			graphics.drawString("COMMA = saved Skins", 0, 290);
			graphics.drawString("ZXM = add 10 colour pixels to the squares RGB by 10", 0, 320);
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

