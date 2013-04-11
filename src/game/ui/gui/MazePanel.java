package game.ui.gui;

import game.logic.Game;
import game.ui.GameOutput;
import game.ui.MazePictures;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MazePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	Game game;
	MazePictures pictures;

	private LinkedList<Character> keys = new LinkedList<Character>();

	public MazePanel(Game game, MazePictures pictures, Dimension preferred, Dimension maximum) {
		setBackground(null);
		setFocusable(true);
		setMaximumSize(maximum);
		setMinimumSize(GUInterface.getFormattedPreferredDimension(preferred, maximum));
		setPreferredSize(GUInterface.getFormattedPreferredDimension(preferred, maximum));

		this.game = game;
		this.pictures = pictures;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Dimension size = this.getSize();
		GameOutput.printGame(game, g, pictures, size);
	}

	public char getNextKey() {
		if (keys.isEmpty() ) 
			return '\n';
		else 
			return keys.removeFirst();
	}
	
}
