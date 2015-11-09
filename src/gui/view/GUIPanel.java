package gui.view;

import gui.controller.GUIController;
import javax.swing.JPanel;

public class GUIPanel extends JPanel
{	
	private GUIController baseController;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
	}
}
