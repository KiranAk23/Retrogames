package nosgames;
import java.awt.Color; 
import javax.swing.JFrame; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MainPage extends JFrame implements ActionListener{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button1;
	JButton button2;
	JLabel label;
	
	MainPage(){
    this.setTitle("JFrame title goes here"); //sets title of this 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application 
    this.setResizable(false); //prevent this from being resized 
    this.setSize(420,420); //sets the x-dimension, and y-dimension of this 
    this.setVisible(true); //make this visible  
    this.getContentPane().setBackground(new Color(0, 0, 0));
    this.setLayout(null);//change color of background }
    label = new JLabel();
	label.setBounds(150, 250, 150, 150);
	label.setVisible(false);
	
	button1 = new JButton();
	button1.addActionListener(this);
	button1.setText("🐍 Snake 🐍");
	button1.setBounds(162, 150, 175, 75);
	button1.setFocusable(false);
	button1.setHorizontalTextPosition(JButton.CENTER);
	button1.setVerticalTextPosition(JButton.BOTTOM);
	button1.setIconTextGap(-15);
	button1.setForeground(Color.red);
	button1.setBackground(Color.white);
	button1.setBorder(BorderFactory.createEtchedBorder());
	adjustButtonFontSize(button1);
	
	button2 = new JButton();
	button2.addActionListener(this);
	button2.setText("🪩 Ping Pong 🪩");
	button2.setBounds(162, 250, 175, 75);
	button2.setFocusable(false);
	button2.setHorizontalTextPosition(JButton.CENTER);
	button2.setVerticalTextPosition(JButton.BOTTOM);
	button2.setIconTextGap(-15);
	button2.setForeground(Color.red);
	button2.setBackground(Color.white);
	button2.setBorder(BorderFactory.createEtchedBorder());
	adjustButtonFontSize(button2);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,500);
	this.setVisible(true);
	this.add(label);
	this.add(button1);
	this.add(button2);
 }

	
	private void adjustButtonFontSize (JButton button) {
	    // Adjust the font size to fit within the button
		final int MIN_FONT_SIZE=12;
		final int MAX_FONT_SIZE=18;
	    Font font = button.getFont();
	    FontMetrics metrics = button.getFontMetrics(font);
	    int buttonWidth = button.getWidth();
	    int buttonHeight = button.getHeight();
	    int textWidth = metrics.stringWidth(button.getText());
	    int textHeight = metrics.getHeight();

	    float fontSize = font.getSize();
	    while ((textWidth > buttonWidth || textHeight > buttonHeight) && fontSize>MIN_FONT_SIZE) {
	        fontSize--;
	        font = font.deriveFont(fontSize);
	        metrics = button.getFontMetrics(font);
	        textWidth = metrics.stringWidth(button.getText());
	        textHeight = metrics.getHeight();
	    }
	    while (fontSize < MAX_FONT_SIZE) {
	        fontSize++;
	        font = font.deriveFont(fontSize);
	        metrics = button.getFontMetrics(font);
	        textWidth = metrics.stringWidth(button.getText());
	        textHeight = metrics.getHeight();
	        if (textWidth > buttonWidth || textHeight > buttonHeight) {
	            fontSize--;  // Revert to last fitting size
	            break;
	        }
	    }
	    button.setFont(font);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			button1.setEnabled(true);
			label.setVisible(true);
			new GameFrame();
		}
		if(e.getSource()==button2) {
			button2.setEnabled(true);
			label.setVisible(true);
			new GameFrame2();
		}	
		
	}}