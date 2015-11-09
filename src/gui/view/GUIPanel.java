package gui.view;

import gui.controller.GUIController;
import javax.swing.*;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;

	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		firstButton = new JButton("Press Button");
		firstTextField = new JTextField("Type Here");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Helper method to load all GUI components into the panel
	 */
	private void setupListeners()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -160, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 6, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -182, SpringLayout.EAST, this);
	}

	private void setupPanel()
	{

	}
}
