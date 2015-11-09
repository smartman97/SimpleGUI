package gui.view;

import gui.controller.GUIController;
import javax.swing.*;

public class GUIPanel extends JPanel
{	
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Press Button");
		firstTextField = new JTextField("Type Here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupListeners()
	{
		
	}

	private void setupLayout()
	{
		
	}

	private void setupPanel()
	{
		
	}
}
