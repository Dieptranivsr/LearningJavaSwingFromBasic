package diep.JLabelDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
	public SwingControlDemo() {
		prepareGUI();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingControlDemo swingControlDemo = new SwingControlDemo();
		swingControlDemo.showLabelDemo();
	}
	
	private void prepareGUI() {
		mainFrame = new JFrame("Vi du mo dau Java Swing");
		//mainFrame.setMaximumSize(null);
		mainFrame.setSize(400, 400);
		//ImageIcon img = new ImageIcon("/home/dieptran/eclipse-workspace/LearningJavaSwing/image/rsz_iconlogolabv2_2020.jpg");
		//mainFrame.setIconImage(img.getImage());
		//mainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/rsz_iconlogolabv2_2020.jpg")));
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		
		statusLabel.setSize(350, 100);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}
	
	private void showLabelDemo() {
		headerLabel.setText("Control in action: JLabel");
		
		JLabel label = new JLabel("", JLabel.CENTER);
		
		label.setText("Welcome to Java Swing instruction lesson.");
		label.setOpaque(true);
		label.setBackground(Color.GRAY);
		label.setForeground(Color.WHITE);
		
		controlPanel.add(label);
		
		mainFrame.setVisible(true);
	}
}
