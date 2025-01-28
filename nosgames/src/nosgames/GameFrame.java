package nosgames;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GamePanel panel;

	GameFrame(){
			
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
//*****************************************
