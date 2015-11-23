package gui.view;

import gui.controller.GUIController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

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
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				setBackground(randomColor());
				firstTextField.setText("OOOO, pretty colors!");
			}
		});
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -162, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 45, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 42, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 121, SpringLayout.EAST, firstButton);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private Color randomColor()
	{
		Random rand = new Random();
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		
		Color randomColor = new Color(r, g, b);
		
		return randomColor;
	}
}
