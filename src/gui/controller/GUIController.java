package gui.controller;

import gui.view.GUIFrame;

public class GUIController
{
	/**
	 * References to the GUIFrame object for internal use.
	 */
	private GUIFrame baseFrame;
	
	/**
	 * Creates a GUIAppController and initializes the GUIFrame.
	 */
	public GUIController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{
		
	}
}
