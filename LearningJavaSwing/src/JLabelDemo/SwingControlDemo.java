package JLabelDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JLabel controlPanel;
	
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
		mainFrame.setSize(400, 400);
	}

}
