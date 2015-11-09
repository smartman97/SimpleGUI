package gui.view;

import gui.controller.GUIController;

import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be the first line of setupFrame() -Installs panel in the frame.
		this.setSize(400, 400);			//Fine a good size for the application.
		this.setResizable(false);		//Advisable not required.
		this.setVisible(true);			//Must be the last line of setupFrame()
	}
}
