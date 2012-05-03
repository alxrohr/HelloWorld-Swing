/**
 * 
 */
package de.alxrohr.helloworldswing;

import javax.swing.JFrame;

/**
 * @author Alexander Rohr
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame( "Hello World!" );
		frame.setSize(400, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}
