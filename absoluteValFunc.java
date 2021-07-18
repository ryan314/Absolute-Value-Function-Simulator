import java.io.*; 
import java.awt.*;
import javax.swing.*;
import javax.imageio.*; 
import java.awt.event.*; 
import java.awt.image.*;
import javax.swing.event.*; 
import javax.swing.JSlider.*; 
import java.awt.BorderLayout.*;
import java.awt.image.BufferedImage.*; 

public class absoluteValFunc implements ChangeListener, ActionListener {

	// _______ PROPERTIES _______ 
	
	// Declaring J-Frames for main, help, and about JFrame
	/** 
		This property allows the programmer to create a JFrame for the main screen
	*/
	public JFrame frame;
	
	/** 
		This property allows the programmer to create a JFrame for the help screen
	*/
	public JFrame frameHelp; 
	
	/** 
		This property allows the programmer to create a JFrame for the about screen
	*/
	public JFrame frameAbout; 
	
	// __________________________________________________________________________
	
	// Declaring J-Panels for help and about screen 
	/** 
		This property allows the programmer to create a JPanel for the help screen
	*/
	public JPanel helpPanel; 
	
	/** 
		This property allows the programmer to create a JPanel for the about screen
	*/
	public JPanel aboutPanel;

	/** 
		This property allows the programmer to create a timer to repaint the panel 
	*/
	public Timer timer; // declaring a timer
	
	// __________________________________________________________________________
	
	// Declaring variables for a menu in Java 
	/** 
		This property allows the programmer to create a JMenuBar
	*/
	public JMenuBar menuBar; // declaring a JMenuBar
	
	/** 
		This property allows the programmer to create a JMenu
	*/
	public JMenu menu; // declaring a JMenu 
	
	/** 
		This property allows the programmer to create a JMenuItem called help 
	*/
	public JMenuItem help; // declaring JMenuItem called help 
	
	/** 
		This property allows the programmer to create a JMenuItem called about 
	*/
	public JMenuItem about; // declaring JMenuItem called about 
	
	// __________________________________________________________________________

	// Declaring J-Sliders for a, h, and k-values 
	/** 
		This property allows the programmer to create a JSlider for the a-value of the absolute value function 
	*/
	public JSlider sliderA; 
	
	/** 
		This property allows the programmer to create a JSlider for the h-value of the absolute value function  
	*/
	public JSlider sliderH; 
	
	/** 
		This property allows the programmer to create a JSlider for the k-value of the absolute value function  
	*/
	public JSlider sliderK; 
	
	// __________________________________________________________________________
	
	// Declaring J-Labels to label the a, h, and k JSliders 
	/** 
		This property allows the programmer to create a JLabel to label the a JSlider
	*/
	public JLabel aLbl; 
	
	/** 
		This property allows the programmer to create a JLabel to label the h JSlider
	*/
	public JLabel hLbl;
	
	/** 
		This property allows the programmer to create a JLabel to label the k JSlider
	*/
	public JLabel kLbl; 
	
	// __________________________________________________________________________

	// Declaring J-Labels for negative x-values (-1 to -10)
	/** 
		This property allows the programmer to create a JLabel for the x-value of -1 
	*/
	public JLabel XN1;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of -2
	*/
	public JLabel XN2;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of -3
	*/
	public JLabel XN3;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of -4 
	*/
	public JLabel XN4;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of -5
	*/
	public JLabel XN5;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of -6
	*/
	public JLabel XN6;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of -7 
	*/
	public JLabel XN7;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of -8
	*/
	public JLabel XN8;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of -9
	*/
	public JLabel XN9;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of -10
	*/
	public JLabel XN10;
	
	// __________________________________________________________________________
	
	// Declaring J-Labels for positive x-values (1 to 10)
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 1
	*/
	public JLabel XP1;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 2
	*/
	public JLabel XP2;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 3
	*/
	public JLabel XP3;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 4
	*/
	public JLabel XP4;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 5
	*/
	public JLabel XP5;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 6
	*/
	public JLabel XP6;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 7
	*/
	public JLabel XP7;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 8
	*/
	public JLabel XP8;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 9
	*/
	public JLabel XP9;
	
	/** 
		This property allows the programmer to create a JLabel for the x-value of 10
	*/
	public JLabel XP10;
	
	// __________________________________________________________________________
	
	// Declaring J-Labels for negative y-values (-1 to -10) 
	/** 
		This property allows the programmer to create a JLabel for the y-value of -1
	*/
	public JLabel YN1;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of -2
	*/
	public JLabel YN2;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of -3
	*/
	public JLabel YN3;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of -4
	*/
	public JLabel YN4;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of -5
	*/
	public JLabel YN5;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of -6
	*/
	public JLabel YN6;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of -7
	*/
	public JLabel YN7;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of -8
	*/
	public JLabel YN8;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of -9
	*/
	public JLabel YN9;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of -10
	*/
	public JLabel YN10;

	// __________________________________________________________________________

	// Declaring J-Labels for positive y-values (1 to 10)
	/** 
		This property allows the programmer to create a JLabel for the y-value of 1
	*/
	public JLabel YP1;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of 2
	*/
	public JLabel YP2;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of 3
	*/
	public JLabel YP3;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of 4
	*/
	public JLabel YP4;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of 5
	*/
	public JLabel YP5;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of 6
	*/
	public JLabel YP6;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of 7
	*/
	public JLabel YP7;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of 8
	*/
	public JLabel YP8;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of 9
	*/
	public JLabel YP9;
	
	/** 
		This property allows the programmer to create a JLabel for the y-value of 10
	*/
	public JLabel YP10;
	
	// __________________________________________________________________________
	
	// Declaring J-Labels to label the x and y axes 
	/** 
		This property allows the programmer to create a JLabel to label the x-axis
	*/
	public JLabel xAxisLbl;
	
	/** 
		This property allows the programmer to create a JLabel to label the y-axis
	*/
	public JLabel yAxisLbl; 

	/** 
		This property allows the programmer to create a JLabel to display the absolute value function equation
	*/
	public JLabel equation; // declaring a JLabel to display the absolute value function equation 
	
	// __________________________________________________________________________
	
	// Declaring J-Labels for the text of the about screen 
	/** 
		This property allows the programmer to create a JLabel to display the text of the about screen 
	*/
	public JLabel aboutLbl_1; 
	
	// __________________________________________________________________________
	
	/** 
		This property allows the programmer to create a BufferedImage which will handle the screenshot of the help page
	*/
	public BufferedImage helpScreen; 
	
	/** 
		This property allows the programmer to create a BufferedImage which will handle an image of St. A's logo 
	*/
	public BufferedImage logo; // declaring a BufferedImage called logo
	
	/** 
		This property allows the programmer to create a BufferedImage which will handle an image of the general form of an absolute value function 
	*/
	public BufferedImage generalForm;
	
	/** 
		This property allows the programmer to create a JLabel which will contain the BufferedImage logo 
	*/
	public JLabel logoLbl; // declaring a JLabel to hold the BufferedImage logo 
	
	/** 
		This property allows the programmer to create a JLabel which will contain the BufferedImage generalForm 
	*/
	public JLabel generalFormLbl; 
	
	/** 
		This property allows the programmer to create a JLabel which will contain the BufferedImage aboutScreen 
	*/
	public JLabel helpScreenLbl; 
	
	absoluteValFuncPanel panel; 
	
	// _______ METHODS _______ 
	
	/** 
	 * This method is called when the state of the target of ChangeListener changes <br>
	 * The target in this program would be a JComponent that has a ChangeListener added to it 
	*/
	public void stateChanged(ChangeEvent evt) {	
		if (evt.getSource() == this.sliderA) { // checks if the source of event is JSlider sliderA
			this.panel.intA = this.sliderA.getValue(); // if so, the variable intA equals the value selected on the A JSlider 
			this.equation.setText("     y = " + "" + this.panel.intA + " | " + "x - " + "" + this.panel.intH / 20 + "|" + " + " + "" + this.panel.intK / 20); // updates the equation displayed by the equation JLabel 
																																							  // because the a-value was changed 
		} 
		
		if (evt.getSource() == this.sliderH) { // checks if the source of event is JSlider sliderH 
			this.panel.intH = 20* this.sliderH.getValue(); // if so, the value of intH equals 20 times the value selected on the H JSlider 
		}
		
		if (evt.getSource() == this.sliderK) { // checks if the source of event is JSlider sliderK 
			this.panel.intK = -20 * this.sliderK.getValue(); // if so, the variable intK equals -20 times the value selected on the K JSlider 
		}
		
		if (this.panel.intH >= 0) { // checks if the value stored in intH is greater than or equal to 0 
			this.equation.setText("   y = " + "" + this.panel.intA + " | " + "x - " + "" + this.panel.intH / 20 + "|" + " + " + "" + this.panel.intK / 20);
		}
		
		if (this.panel.intH < 0) { // checks if the value stored in intH is less than 0 
			this.equation.setText("   y = " + "" + this.panel.intA + " | " + "x + " + "" + -this.panel.intH / 20 + "|" + " + " + "" + -this.panel.intK / 20);
		} 
		
		if (this.panel.intK >= 0) { // checks if the value stored in intK is greater than or equal to 0 
			if (this.panel.intH >= 0) {
				this.equation.setText("   y = " + "" + this.panel.intA + " | " + "x - " + "" + this.panel.intH / 20 + "|" + " - " + "" + this.panel.intK / 20); 
			} else if (this.panel.intH < 0) {
				this.equation.setText("   y = " + "" + this.panel.intA + " | " + "x + " + "" + -this.panel.intH / 20 + "|" + " - " + "" + this.panel.intK / 20); 
			}
		} 
		
		if (this.panel.intK < 0) { // checks if the value stored in intK is less than 0 
			if (this.panel.intH >= 0) {
				this.equation.setText("   y = " + "" + this.panel.intA + " | " + "x - " + "" + this.panel.intH / 20 + "|" + " + " + "" + -this.panel.intK / 20);
			} else if (this.panel.intH < 0) {
				this.equation.setText("   y = " + "" + this.panel.intA + " | " + "x + " + "" + -this.panel.intH / 20 + "|" + " + " + "" + -this.panel.intK / 20);
			}
				
		} 
	} 
	
	// Overriding the actionPerformed method in the ActionListener interface
	/**
	 * This method is called when an action has occured (or when the target of ActionListener has triggered an event) <br>
	 * The target in this program would refer to a JComponent that has an ActionListener added to it 
	 */
	public void actionPerformed(ActionEvent evt) { 
		if (evt.getSource() == this.timer) { // checks if the source of event is the timer 
			this.panel.repaint(); // if so, repaint panel 
		}
		
		if (evt.getSource() == this.help) { // checks if the source of event is the JMenuItem help 
			this.frameHelp = new JFrame("Help"); // creates a new JFrame with the title of "Help" 
			this.frameHelp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // closes only the help JFrame when 'x' is clicked 
			
			this.helpPanel = new JPanel(); // creates a new JPanel called helpPanel 
			this.helpPanel.setPreferredSize(new Dimension(960, 540)); // sets the dimensions of helpPanel to 960 px by 540 px 
			
			this.helpScreen = new BufferedImage(960, 540, BufferedImage.TYPE_INT_ARGB); // creates a new BufferedImage called aboutScreen 
			
			try { // tries the following code
				this.helpScreen = ImageIO.read(new File("helpScreen.png")); // reads the image called aboutScreen.png 
			} catch (IOException e) { // catches the IOException 
			}
			
			this.helpScreenLbl = new JLabel(new ImageIcon(this.helpScreen)); // sets the content of JLabel logoLbl to logo 
			this.helpScreenLbl.setSize(960, 540); // sets the size of logoLbl to 960 px by 540 px 
			this.helpScreenLbl.setLocation (0, 0); // sets the location of logoLbl to (0, 0)
			this.helpPanel.add(this.helpScreenLbl); // adds logoLbl to aboutPanel 
			
			this.frameHelp.setContentPane(this.helpPanel); // sets the content of the JFrame frameHelp to helpPanel 
			this.frameHelp.pack(); // tells frameHelp to adapt itself to helpPanel set as its content 
			this.frameHelp.setResizable(false); // makes it so that frameHelp isn't resizable
			this.frameHelp.setVisible(true); // sets frameHelp as visible 
		}
			
		if (evt.getSource() == this.about) { // checks if source of event is JMenuItem about 
			this.frameAbout = new JFrame("About"); // creates a new JFrame with the title "About" 
			this.frameAbout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // closes only the about JFrame when 'x' is clicked 
			
			this.aboutPanel = new JPanel(); // creates a new JPanel called aboutPanel 
			this.aboutPanel.setPreferredSize(new Dimension(960, 540)); // sets the dimensions of aboutPanel to 500 px by 500 px 
			
			this.aboutLbl_1 = new JLabel(""); // creates a new JLabel called aboutLbl_1
			this.aboutLbl_1.setText("<html> Absolute Value Function Simulator <br/> created by Ryan Chiu, who is in Mr.Cadawas' <br/> Computer Science class called ICS4U1, at St. Augustine CHS! <br/> I hope this program enhanced your knowledge <br/> about absolute value functions!<html>"); // sets the text of aboutLbl_1 to the following 
			this.aboutLbl_1.setFont(this.aboutLbl_1.getFont().deriveFont(20.0f)); // sets the font size of the text of JLabel aboutLbl_1 to 20
			this.aboutLbl_1.setSize(500, 30); // sets the size of aboutLbl_1 to 500 px by 30 px 
			this.aboutLbl_1.setLocation(0, 200); // sets the location of aboutLbl_1 to (0, 0)
			this.aboutPanel.add(this.aboutLbl_1); // adds JLabel aboutLbl_1 to aboutPanel 
	
			this.logo = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB); // creates a new BufferedImage called logo 
			
			try { // tries the following code
				this.logo = ImageIO.read(new File("stALogo.png")); // reads the image called StA.png 
			} catch (IOException e) { // catches the IOException 
			}
			
			this.logoLbl = new JLabel(new ImageIcon(this.logo)); // sets the content of JLabel logoLbl to logo 
			this.logoLbl.setSize(256, 256); // sets the size of logoLbl to 256 px by 256 px 
			this.logoLbl.setLocation (0, 0); // sets the location of logoLbl to (0, 0)
			this.aboutPanel.add(this.logoLbl); // adds logoLbl to aboutPanel 
		
			this.frameAbout.setContentPane(this.aboutPanel); // sets the content of frameAbout to aboutPanel 
			this.frameAbout.pack(); // tells frameAbout to adapt itself to the panel set as its content (aboutPanel)
			this.frameAbout.setResizable(false); // makes it so that aboutFrame isn't resizable 
			this.frameAbout.setVisible(true); // sets frameAbout to visible 
		}	
	}

	// _______ CONSTRUCTOR _______ 
	
	/**
		This constructor method is responsible for creating the absoluteValFunc object 
	 */
	public absoluteValFunc() {	
		this.frame = new JFrame("Absolute Value Function Simulator"); // creates a new JFrame called frame with the title "Absolute Value Function Simulator" 
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allows user to close frame by clicking on its 'x' button 
	
		this.menuBar = new JMenuBar(); // creates a new JMenuBar called menuBar 
		this.menu = new JMenu("Menu"); // creates a new JMenu called menu 
		
		this.help = new JMenuItem("Help"); // creates a new JMenuItem called help 
		this.help.addActionListener(this); // adds an action listener to help 
		
		this.about = new JMenuItem("About"); // creates a new JMenuItem called about
		this.about.addActionListener(this); // adds an action listener to about 
	
		this.menuBar.add(this.menu); // adds JMenu menu to JMenuBar menuBar
		this.menu.add(this.help); // adds JMenuItem help to JMenu menu 
		this.menu.add(this.about); // adds JMenuItem about to JMenu menu 
		
		this.sliderA = new JSlider(-10, 10, 1);  // creates a new JSlider called sliderA
												 // sets the minimum value to -10 and maximum value to 10 
												 // makes sliderA start at a value of 1 
		this.sliderA.setSize(250, 60); // sets the size of sliderA to 250 px by 60 px 
		this.sliderA.setLocation(650, 280); // sets the location of sliderA to (650, 280) 
		this.sliderA.setMajorTickSpacing(2); // sets the major tick spacing to be 2 
		this.sliderA.setMinorTickSpacing(1); // sets the minor tick spacing to be 1 
		this.sliderA.setPaintTicks(true); // sets paint ticks to be true 
		this.sliderA.setPaintLabels(true); // sets paint labels to be true 
		this.sliderA.addChangeListener(this); // adds a change listener to sliderA 
		
		this.sliderH = new JSlider(-10, 10, 0); // creates a new JSlider called sliderH
												// sets minimum value to -10 and maximum value to 10 
												// makes sliderH start at a value of 0 
		this.sliderH.setSize(250, 60); 
		this.sliderH.setLocation(650, 350);
		this.sliderH.setMajorTickSpacing(2);
		this.sliderH.setMinorTickSpacing(1);
		this.sliderH.setPaintTicks(true);
		this.sliderH.setPaintLabels(true); 
		this.sliderH.addChangeListener(this); 
			
		this.sliderK = new JSlider(-10, 10, 0); // creats a new JSlider called sliderK 
												// sets minimum value to -10 and maximum value to 10 
												// makes sliderK start at a value of 0 
		this.sliderK.setSize(250, 60); 
		this.sliderK.setLocation(650, 420); 
		this.sliderK.setMajorTickSpacing(2);
		this.sliderK.setMinorTickSpacing(1);
		this.sliderK.setPaintTicks(true);
		this.sliderK.setPaintLabels(true); 
		this.sliderK.addChangeListener(this); 
		
		this.aLbl = new JLabel("     a-value: "); // creates a new JLabel called aLbl and sets its text to "     a-value: "
		this.aLbl.setSize(80, 30); // sets the size of aLbl to 80 px by 30 px 
		this.aLbl.setLocation(550, 280); // sets the location of aLbl to be (550, 280)
		this.aLbl.setOpaque(true); // sets aLbl to be opaque so that its color can be adjusted 
		this.aLbl.setBackground(new Color(142, 229, 255)); // sets the background of aLbl to be a custom color (light blue)
		this.aLbl.setForeground(Color.BLACK); // sets the text of aLbl to be black 
		
		this.hLbl = new JLabel("     h-value: "); // creates a new JLabel called hLbl and sets its text to "     h-value: "
		this.hLbl.setSize(80, 30); 
		this.hLbl.setLocation(550, 350); 
		this.hLbl.setOpaque(true);
		this.hLbl.setBackground(new Color(142, 229, 255)); 
		this.hLbl.setForeground(Color.BLACK); 
		
		this.kLbl = new JLabel("     k-value: "); // creates a new JLabel called kLbl and sets its text to "     k-value: "
		this.kLbl.setSize(80, 30); 
		this.kLbl.setLocation(550, 420); 
		this.kLbl.setOpaque(true);
		this.kLbl.setBackground(new Color(142, 229, 255)); 
		this.kLbl.setForeground(Color.BLACK); 
		
		// Creating the negative x-axis number J-Labels 
		this.XN1 = new JLabel("-1"); // creates a new JLabel called XN1 and sets its text to "-1"
		this.XN1.setSize(30, 30); // sets the size of XN1 to 30 px by 30 px 
		this.XN1.setLocation(253, 280); // sets the location of XN1 to (253, 280) 
		
		this.XN2 = new JLabel("-2"); 
		this.XN2.setSize(30, 30); 
		this.XN2.setLocation(233, 280);
		
		this.XN3 = new JLabel("-3"); 
		this.XN3.setSize(30, 30); 
		this.XN3.setLocation(213, 280);
		
		this.XN4 = new JLabel("-4"); 
		this.XN4.setSize(30, 30); 
		this.XN4.setLocation(193, 280);
		
		this.XN5 = new JLabel("-5"); 
		this.XN5.setSize(30, 30); 
		this.XN5.setLocation(173, 280);
		
		this.XN6 = new JLabel("-6"); 
		this.XN6.setSize(30, 30); 
		this.XN6.setLocation(153, 280);
		
		this.XN7 = new JLabel("-7"); 
		this.XN7.setSize(30, 30); 
		this.XN7.setLocation(133, 280);
		
		this.XN8 = new JLabel("-8"); 
		this.XN8.setSize(30, 30); 
		this.XN8.setLocation(113, 280);
		
		this.XN9 = new JLabel("-9"); 
		this.XN9.setSize(30, 30); 
		this.XN9.setLocation(93, 280);
		
		this.XN10 = new JLabel("-10"); 
		this.XN10.setSize(30, 30); 
		this.XN10.setLocation(73, 280);
		
		// Creating the positive x-axis number JLabels 
		this.XP1 = new JLabel("1"); // creates a new JLabel called XP1 and sets its text to "1"
		this.XP1.setSize(30, 30); // sets the size of XP1 to 30 px by 30 px 
		this.XP1.setLocation(297, 252); // sets the location of XP1 to (297, 252) 
		
		this.XP2 = new JLabel("2"); 
		this.XP2.setSize(30, 30); 
		this.XP2.setLocation(317, 252);
		
		this.XP3 = new JLabel("3"); 
		this.XP3.setSize(30, 30); 
		this.XP3.setLocation(337, 252);
		
		this.XP4 = new JLabel("4"); 
		this.XP4.setSize(30, 30); 
		this.XP4.setLocation(357, 252);
		
		this.XP5 = new JLabel("5"); 
		this.XP5.setSize(30, 30); 
		this.XP5.setLocation(377, 252);
		
		this.XP6 = new JLabel("6"); 
		this.XP6.setSize(30, 30); 
		this.XP6.setLocation(397, 252);
		
		this.XP7 = new JLabel("7"); 
		this.XP7.setSize(30, 30); 
		this.XP7.setLocation(417, 252);
		
		this.XP8 = new JLabel("8"); 
		this.XP8.setSize(30, 30); 
		this.XP8.setLocation(437, 252);
		
		this.XP9 = new JLabel("9"); 
		this.XP9.setSize(30, 30); 
		this.XP9.setLocation(457, 252);
	
		this.XP10 = new JLabel("10"); 
		this.XP10.setSize(30, 30); 
		this.XP10.setLocation(477, 252);
		
		// Creating the y-axis number J-Labels 
		this.YN1 = new JLabel("-1"); // creates a new JLabel called YN1 and sets its text to "-1" 
		this.YN1.setSize(30, 30); // sets the size of YN1 to 30 px by 30 px 
		this.YN1.setLocation(290, 284); // sets the location of YN1 to (290, 284)
		
		this.YN2 = new JLabel("-2"); 
		this.YN2.setSize(30, 30); 
		this.YN2.setLocation(290, 304); 
		
		this.YN3 = new JLabel("-3"); 
		this.YN3.setSize(30, 30); 
		this.YN3.setLocation(290, 324); 
		
		this.YN4 = new JLabel("-4"); 
		this.YN4.setSize(30, 30); 
		this.YN4.setLocation(290, 344); 
	
		this.YN5 = new JLabel("-5"); 
		this.YN5.setSize(30, 30); 
		this.YN5.setLocation(290, 364); 
		
		this.YN6 = new JLabel("-6"); 
		this.YN6.setSize(30, 30); 
		this.YN6.setLocation(290, 384); 
		
		this.YN7 = new JLabel("-7"); 
		this.YN7.setSize(30, 30); 
		this.YN7.setLocation(290, 404); 
		
		this.YN8 = new JLabel("-8"); 
		this.YN8.setSize(30, 30); 
		this.YN8.setLocation(290, 424); 
		
		this.YN9 = new JLabel("-9"); 
		this.YN9.setSize(30, 30); 
		this.YN9.setLocation(290, 444); 
		
		this.YN10 = new JLabel("-10"); 
		this.YN10.setSize(30, 30); 
		this.YN10.setLocation(290, 464); 
		
		// Creating the positive y-axis number JLabels
		this.YP1 = new JLabel("1"); // creates a new JLabel called YP1 and sets its text to "1"
		this.YP1.setSize(30, 30); // sets the size of YP1 to 30 px by 30 px 
		this.YP1.setLocation(265, 245); // sets the location of YP1 to (265, 245) 
		
		this.YP2 = new JLabel("2"); 
		this.YP2.setSize(30, 30); 
		this.YP2.setLocation(265, 225); 
		
		this.YP3 = new JLabel("3"); 
		this.YP3.setSize(30, 30); 
		this.YP3.setLocation(265, 205); 
		
		this.YP4 = new JLabel("4"); 
		this.YP4.setSize(30, 30); 
		this.YP4.setLocation(265, 185); 
		
		this.YP5 = new JLabel("5"); 
		this.YP5.setSize(30, 30); 
		this.YP5.setLocation(265, 165); 
		
		this.YP6 = new JLabel("6"); 
		this.YP6.setSize(30, 30); 
		this.YP6.setLocation(265, 145); 
		
		this.YP7 = new JLabel("7"); 
		this.YP7.setSize(30, 30); 
		this.YP7.setLocation(265, 125); 
		
		this.YP8 = new JLabel("8"); 
		this.YP8.setSize(30, 30); 
		this.YP8.setLocation(265, 105); 
		
		this.YP9 = new JLabel("9"); 
		this.YP9.setSize(30, 30); 
		this.YP9.setLocation(265, 85); 
		
		this.YP10 = new JLabel("10"); 
		this.YP10.setSize(30, 30); 
		this.YP10.setLocation(265, 65); 
		
		// Creating the J-Labels to label the x and y axes
		this.xAxisLbl = new JLabel("X"); // creates a new JLabel called xAxisLbl and sets its text to "X" 
		this.xAxisLbl.setSize(30, 30);
		this.xAxisLbl.setLocation(60, 265); 
		this.xAxisLbl.setForeground(Color.RED); // sets the text color of xAxisLbl to red 
		
		this.yAxisLbl = new JLabel("Y"); // creates a new JLabel called yAxisLbl and sets its text to "Y"
		this.yAxisLbl.setSize(30, 30);
		this.yAxisLbl.setLocation(277, 50); 
		this.yAxisLbl.setForeground(Color.RED); // sets the text color of yAxisLbl to red
		
		// Creating the equation JLabel 
		this.equation = new JLabel("   y = 1 |x - 0| + 0"); // creates a new JLabel called equation and sets its text to "   y = 1 |x - 0| + 0"
		this.equation.setFont(this.equation.getFont().deriveFont(12.0f)); // sets the font size of the text of JLabel equation to 12 
		this.equation.setSize(120, 40); 
		this.equation.setLocation(550, 100);
		this.equation.setOpaque(true); // sets equation to opaque so its color can be adjusted 
		this.equation.setBackground(new Color(4, 184, 239)); // sets the background of equation to a custom color (bright and light blue) 
		this.equation.setForeground(Color.WHITE); // sets the text of equation to white 
		
		this.generalForm = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB); // creates a new BufferedImage called generalForm 
			
		try { // tries the following code
			this.generalForm = ImageIO.read(new File("generalForm.png")); // reads the image called generalForm.png 
		} catch (IOException e) { // catches the IOException 
		}
			
		this.generalFormLbl = new JLabel(new ImageIcon(this.generalForm)); // sets the content of JLabel logoLbl to logo 
		this.generalFormLbl.setSize(114, 88); // sets the size of logoLbl to 114 px by 88 px 
		this.generalFormLbl.setLocation (750, 80); // sets the location of generalFormLbl to (750, 80)
	
		this.panel = new absoluteValFuncPanel(); // creates a new absoluteValFuncPanel object called panel 
		this.panel.setPreferredSize(new Dimension(960, 540)); // sets the size of panel to 960 px by 540 px 
		this.panel.setLayout(null); // tells Java to let us control the layout and properties of the JComponents on panel 
			
		// Adding the JSliders for the a, h, and k values to panel 
		this.panel.add(this.sliderA);
		this.panel.add(this.sliderH); 
		this.panel.add(this.sliderK); 
		
		// Adding the JLabels for the a, h and k values to panel
		this.panel.add(this.aLbl);
		this.panel.add(this.hLbl);
		this.panel.add(this.kLbl);
		
		// Adding the JLabels for the negative x-values to panel 
		this.panel.add(this.XN1); 
		this.panel.add(this.XN2); 
		this.panel.add(this.XN3);
		this.panel.add(this.XN4);
		this.panel.add(this.XN5);
		this.panel.add(this.XN6);
		this.panel.add(this.XN7);
		this.panel.add(this.XN8);
		this.panel.add(this.XN9);
		this.panel.add(this.XN10);
		
		// Adding the JLabels for the positive x-values to panel 
		this.panel.add(this.XP1); 
		this.panel.add(this.XP2); 
		this.panel.add(this.XP3); 
		this.panel.add(this.XP4); 
		this.panel.add(this.XP5); 
		this.panel.add(this.XP6); 
		this.panel.add(this.XP7); 
		this.panel.add(this.XP8); 
		this.panel.add(this.XP9); 
		this.panel.add(this.XP10); 
		
		// Adding the JLabels for the negative y-values to panel 
		this.panel.add(this.YN1); 
		this.panel.add(this.YN2); 
		this.panel.add(this.YN3); 
		this.panel.add(this.YN4); 
		this.panel.add(this.YN5); 
		this.panel.add(this.YN6); 
		this.panel.add(this.YN7); 
		this.panel.add(this.YN8); 
		this.panel.add(this.YN9); 
		this.panel.add(this.YN10); 
		
		// Adding the JLabels for the positive y-values to panel 
		this.panel.add(this.YP1); 
		this.panel.add(this.YP2); 
		this.panel.add(this.YP3); 
		this.panel.add(this.YP4); 
		this.panel.add(this.YP5); 
		this.panel.add(this.YP6); 
		this.panel.add(this.YP7); 
		this.panel.add(this.YP8); 
		this.panel.add(this.YP9); 
		this.panel.add(this.YP10); 
		
		// Adding the x- and y- axis JLabels to panel 
		this.panel.add(this.xAxisLbl); 
		this.panel.add(this.yAxisLbl); 
	
		this.panel.add(this.equation); // adds the JLabel equation to panel 
		
		this.panel.add(this.generalFormLbl); // adds the JLabel generalFormLbl to panel 
		
		this.frame.setJMenuBar(this.menuBar); // sets the JMenuBar of the frame to menuBar 
		
		this.frame.setContentPane(this.panel); // sets the content of JFrame frame to JPanel panel 
		this.frame.pack(); // tells frame to adapt itself to the JPanel set as its content (panel)
		this.frame.setResizable(false); // makes it so that frame cannot be resized  
		this.frame.setVisible(true); // sets frame to visible 
		
		this.timer = new Timer(1000/48, this); // causes timer to trigger an event at 48 fps 
		this.timer.start(); // starts Timer timer 
	}

	// _______ MAIN METHOD _______ 
	/**
		This main method allows for the absoluteValFunc constructor to be called (which will create an absoluteValFunc object) 
	 */
	public static void main (String[] args) {
		new absoluteValFunc(); // creates a new absoluteValFunc object
	} 

} 
