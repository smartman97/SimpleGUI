package gui.view;

import gui.controller.GUIController;

import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
	}
	
	private void setupFrame()
	{
		this.setSize(400, 400);
		this.setVisible(true);
	}
}
