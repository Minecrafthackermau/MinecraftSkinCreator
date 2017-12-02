

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class EntryPoint {

	public static void main(String[] args) {
		Thread musicThread = new Thread(new SkinDesignerMusic());
		musicThread.start();
		
        JFrame skinDesigner = new JFrame("Minecraft Skin Designer");
		
        SkinDesignerUI titlePanel = new SkinDesignerUI();
		skinDesigner.getContentPane().add(titlePanel);
		
		skinDesigner.pack();
		
		skinDesigner.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		titlePanel.addKeyListener(titlePanel);
		titlePanel.setFocusable(true);
		titlePanel.requestFocusInWindow();
	
		skinDesigner.setVisible(true);
	}

}
