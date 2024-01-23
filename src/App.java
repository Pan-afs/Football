

import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				FootballGUI footballGui = new FootballGUI();
				
				// Display
				footballGui.setVisible(true);
			}
		});
	}
}
