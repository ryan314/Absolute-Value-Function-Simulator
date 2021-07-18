import java.io.*; 
import java.awt.*;
import javax.swing.*;
import javax.imageio.*; 
import java.awt.image.*; 

public class absoluteValFuncPanel extends JPanel{

	// _______ PROPERITES _______
	
	/**
		This property is an integer representing the a-value of the absolute value function 
	 */
	public int intA = 1; // declaring integer variable for a-value of absolute value function
	
	/**
		This property is an integer representing the h-value of the absolute value function 
	 */
	public int intH = 0; // declaring integer variable for h-value of absolute value function
	
	/**
		This property is an integer representing the k-value of the absolute value function
	 */
	public int intK = 0; // declaring integer variable for k-value of absolute value function 
	
	// _______ METHODS _______

	// Overriding the paintComponent method of JPanel 
	
	/**
	 * This method overrides the paintComponent method of JPanel <br>
	 * This method will be responsible for drawing the grid lines, axes, and absolute value function graph
	 */ 
	
	public void paintComponent(Graphics g) { 
		super.paintComponent(g);
		g.setColor(new Color(211, 211, 211)); // sets a custom color for grid lines (light gray) 
		
		// Draws the vertical grid lines 
		for (int i = 0; i <= 360; i+=20) { 
			g.drawLine(100 + i, 80, 100 + i, 480);
		}
		
		// Draws the horizontal grid lines 
		for (int i = 0; i <= 360; i+=20) {
			g.drawLine(80, 100 + i, 480, 100 + i); 
		}

		g.setColor(Color.BLACK); // sets the color of the axes (for the cartesian grid) to black 
		g.drawLine(280, 80, 280, 480); // draws the y-axis
		g.drawLine(80, 280, 480, 280); // draws the x-axis
		
		g.setColor(Color.BLUE); // sets the color of the absolute value function to blue 
		
		// Drawing absolute value function for negative a-values 
		if (intA == -1){ // checks if integer variable intA stores a value of -1
			g.drawLine(280 + intH, 280 + intK, 100 + intH, 460 + intK); // if so, 280 + intH represents the x-coordinate of the start point of this line
																		// 280 + intK represents the y-coordinate of the start point of this line 
																		// 100 + intH represents the x-coordinate of the end point of this line
																		// 460 + intK represents the y-coordinate of the end point of this line
			g.drawLine(280 + intH, 280 + intK, 460 + intH, 460 + intK);	// if so, 280 + intH represents the x-coordinate of the start point of this line
																		// 280 + intK represents the y-coordinate of the start point of this line
																		// 460 + intH represents the x-coordinate of the end point of this line 
																		// 460 + intK represents the y-coordinate of the end point of this line 
		}
		
		if (intA == -2) { // checks if integer variable intA stores the value -2
			g.drawLine(280 + intH, 280 + intK, 190 + intH, 460 + intK); 
			g.drawLine(280 + intH, 280 + intK, 370 + intH, 460 + intK);	
		}
		
		if (intA == -3) { // checks if integer variable intA stores the value -3
			g.drawLine(280 + intH, 280 + intK, 220 + intH, 460 + intK); 
			g.drawLine(280 + intH, 280 + intK, 340 + intH, 460 + intK);	
		}
		
		if (intA == -4) { // checks if integer variable intA stores the value -4
			g.drawLine(280 + intH, 280 + intK, 235 + intH, 460 + intK); 
			g.drawLine(280 + intH, 280 + intK, 325 + intH, 460 + intK);	
		}
		
		if (intA == -5) { // checks if integer variable intA stores the value -5
			g.drawLine(280 + intH, 280 + intK, 244 + intH, 460 + intK); 
			g.drawLine(280 + intH, 280 + intK, 316 + intH, 460 + intK);	
		}
		
		if (intA == -6) { // checks if integer variable intA stores the value -6
			g.drawLine(280 + intH, 280 + intK, 250 + intH, 460 + intK); 
			g.drawLine(280 + intH, 280 + intK, 310 + intH, 460 + intK);	
		}
		
		if (intA == -7) { // checks if integer variable intA stores the value -7
			g.drawLine(280 + intH, 280 + intK, 254 + intH, 460 + intK); 
			g.drawLine(280 + intH, 280 + intK, 306 + intH, 460 + intK);	
		}
		
		if (intA == -8) { // checks if integer variable intA stores the value -8
			g.drawLine(280 + intH, 280 + intK, 257 + intH, 460 + intK); 
			g.drawLine(280 + intH, 280 + intK, 303 + intH, 460 + intK);	
		}
		
		if (intA == -9) { // checks if integer variable intA stores the value -9
			g.drawLine(280 + intH, 280 + intK, 260 + intH, 460 + intK); 
			g.drawLine(280 + intH, 280 + intK, 300 + intH, 460 + intK);	
		}
		
		if (intA == -10) { // checks if integer variable intA stores the value -10
			g.drawLine(280 + intH, 280 + intK, 262 + intH, 460 + intK); 
			g.drawLine(280 + intH, 280 + intK, 298 + intH, 460 + intK);	
		}
		
		// Drawing the absolute value function for an a-value of 0 
		if (intA == 0) {
			g.drawLine(100 + intH, 280 + intK, 460 + intH, 280 + intK); 
		}
		
		// Drawing the absolute value function for positive a-values 
		if (intA == 1){ // checks if integer variable intA stores the value 1
			g.drawLine(280 + intH, 280 + intK, 100 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 460 + intH, 100 + intK);		
		}
		
		if (intA == 2) { // checks if integer variable intA stores the value 2
			g.drawLine(280 + intH, 280 + intK, 190 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 370 + intH, 100 + intK);	
		}
		
		if (intA == 3) { // checks if integer variable intA stores the value 3
			g.drawLine(280 + intH, 280 + intK, 220 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 340 + intH, 100 + intK);	
		}
		
		if (intA == 4) { // checks if integer variable intA stores the value 4
			g.drawLine(280 + intH, 280 + intK, 235 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 325 + intH, 100 + intK);	
		}
		
		if (intA == 5) { // checks if integer variable intA stores the value 5
			g.drawLine(280 + intH, 280 + intK, 244 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 316 + intH, 100 + intK);	
		}
		
		if (intA == 6) { // checks if integer variable intA stores the value 6
			g.drawLine(280 + intH, 280 + intK, 250 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 310 + intH, 100 + intK);	
		}
		
		if (intA == 7) { // checks if integer variable intA stores the value 7
			g.drawLine(280 + intH, 280 + intK, 254 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 306 + intH, 100 + intK);	
		}
		
		if (intA == 8) { // checks if integer variable intA stores the value 8
			g.drawLine(280 + intH, 280 + intK, 257 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 303 + intH, 100 + intK);	
		}
		
		if (intA == 9) { // checks if integer variable intA stores the value 9
			g.drawLine(280 + intH, 280 + intK, 260 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 300 + intH, 100 + intK);	
		}
		
		if (intA == 10) { // checks if integer variable intA stores the value 10
			g.drawLine(280 + intH, 280 + intK, 262 + intH, 100 + intK); 
			g.drawLine(280 + intH, 280 + intK, 298 + intH, 100 + intK);	
		}
	}	
	
	// _______ CONSTRUCTOR _______  
	
	/**
		This constructor method is responsible for creating the absoluteValFuncPanel object
	 */
	
	public absoluteValFuncPanel() {
		super(); // makes absoluteValFuncPanel essentially equal to JPanel 
				 // because it creates the JPanel parent object 
	} 
	
}  
