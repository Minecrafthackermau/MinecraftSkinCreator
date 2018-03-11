import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SkinDesignerEntryPoint {
	public static void main(String[] args) {
        JFrame skinDesigner = new JFrame("Minecraft Skin Designer");
		SkinDesignerUI skinDesignerUI = createSkinDesignerUI();
		skinDesigner.getContentPane().add(skinDesignerUI);
		skinDesigner.pack();
		skinDesigner.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		skinDesigner.setVisible(true);
		SkinDesignerMusic.start();
	}

	private static SkinDesignerUI createSkinDesignerUI() {
		SkinDesignerUI titlePanel = new SkinDesignerUI();
		titlePanel.addKeyListener(titlePanel);
		titlePanel.setFocusable(true);
		titlePanel.requestFocusInWindow();
		return titlePanel;
	}
}