package gui.controller;

/**
 * Starts the simple GUI program
 * @author Colm Laro
 * @version 1.0 11/9/2015
 *
 */

public class GUIRunner
{
	/**
	 * @param args Unused as this is a GUI
	 */
	public static void main(String[] args)
	{
		GUIController appController = new GUIController();
		appController.start();
	}
}
