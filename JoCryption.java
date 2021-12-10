package encryptSimple;


	import javax.swing.BorderFactory;
    	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import java.awt.datatransfer.StringSelection;
	import java.awt.Toolkit;
	import java.awt.datatransfer.Clipboard;
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class JoCryption extends JFrame  {

		
		/**
		 * 
		 */
		private static final long serialVersionUID = 6856124765735040351L;
		String x;
		JTextField textField2;
		JButton button;
		JButton copyButton;
		JPanel panel2;
		JLabel label;

		JoCryption() {
			JButton button = new JButton();
			JButton copyButton = new JButton();
			JTextField textField = new JTextField();
			textField2 = new JTextField();
			JPanel panel = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JLabel label = new JLabel();
			JPanel panel4 = new JPanel();
			JLabel label2 = new JLabel();
			JPanel panel5 = new JPanel();
			JLabel label3 = new JLabel();
			
			//Panel - user input panel
			panel.setBackground(new Color(220,220,220));
			panel.setBounds(300,270,300,50);
			panel.add(textField);
			
			//Panel2 - output panel
			panel2.setBackground(new Color(220,220,220));
			panel2.setBounds(15,200,900,50);
			panel2.add(textField2);
			panel2.setVisible(false);
			
			//label & panel 3 - text instructions for user input
			
			label.setText("Type a simple word you can remember e.g cat..dog..larry. Then press the encrypt button ");
			label.setVerticalAlignment(JLabel.BOTTOM);
			
			panel3.setBackground(new Color(220,220,220));
			panel3.setBounds(200,320,500,30);
			
			//label2 & panel 4 - text instructions for copy button
			label2.setText("Use the copy button to copy new encrypted password");
			label2.setVerticalAlignment(JLabel.BOTTOM);
			
			panel4.setBackground(new Color(220,220,220));
			panel4.setBounds(250,490,400,30);
			
			//logo
			panel5.setBackground(new Color(220,220,220));
			panel5.setBounds(160,0,600,200);
			
			label3.setText("JoCryption");
			label3.setForeground(new Color(187,0,0));
			label3.setVerticalAlignment(JLabel.CENTER);
			label3.setFont(new Font("DialogInput", Font.BOLD,70));
			
			
			//copy button - copy's new password
			copyButton = new JButton();
			copyButton.setBounds(370,430,150,60);
			copyButton.setText("Copy");
			copyButton.setFocusable(false);
			copyButton.setHorizontalTextPosition(JButton.CENTER);
			copyButton.setVerticalTextPosition(JButton.BOTTOM);
			copyButton.setFont(new Font("Serif", Font.BOLD,25));
			copyButton.setIconTextGap(-15);
			copyButton.setForeground(Color.black);
			copyButton.setBackground(Color.gray);
			copyButton.setBorder(BorderFactory.createEtchedBorder());
			copyButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					    	  
					String str = textField2.getText();
					Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
					StringSelection strsel = new StringSelection(str);
					clip.setContents(strsel, strsel);
					JOptionPane.showMessageDialog(null, "Encrypted password is copied");
				            }
						});
			
			//Button - encrypts user input
			button = new JButton();
			button.setBounds(370,350,150,60);
			button.setText("Encrypt");
			button.setFocusable(false);
			button.setHorizontalTextPosition(JButton.CENTER);
			button.setVerticalTextPosition(JButton.BOTTOM);
			button.setFont(new Font("Serif", Font.BOLD,25));
			button.setIconTextGap(-15);
			button.setForeground(Color.black);
			button.setBackground(Color.gray);
			button.setBorder(BorderFactory.createEtchedBorder());
			button.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae) {
		    	  
		    	  String x = textField.getText();
		    	  textField2.setText(getEncrypt(x));
		    	  panel2.setVisible(true);
		    	  textField2.setEditable(false);
		    	  
	            }
			});
			
			
			//TextField -text field for user input
			textField.setPreferredSize(new Dimension(290,40));
			textField.setFont(new Font("Consolas",Font.PLAIN,35));
			
			//TextField2 - Outputs encrypted password
			textField2.setPreferredSize(new Dimension(890,40));
			textField2.setFont(new Font("Consolas",Font.PLAIN,35));
			
			// JFrame
			this.setTitle("JoCryption");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			this.setSize(950,600);
			this.setResizable(false);
			this.add(copyButton);
			this.add(button);
			this.add(panel);
			this.add(panel2);
			this.add(panel3);
			panel3.add(label);
			this.add(panel4);
			panel4.add(label2);
			this.add(panel5);
			panel5.add(label3);
			this.getContentPane().setBackground(new Color(220,220,220));
			this.setVisible(true);
		
			

		
			
		}

	public String getEncrypt(String x) {
		//Encryption key 
		return x.replace("a","S73").replace("A", "$dF") 	
				.replace("b","ry6x").replace("B", "!57y")   
				.replace("c","g#s8").replace("C", "hW0a")   
				.replace("d","#Q03").replace("D", "*fc5")	
				.replace("e","9%yd").replace("E", "Jm6@")
				.replace("f","69h2").replace("F", "o3i8")
				.replace("g","yX4!").replace("G", "yD54")
				.replace("h","9b6R").replace("H", "63!f")
				.replace("i","S7HF").replace("I", "yR3C")
				.replace("j","&e^d").replace("J", "xjN$")
				.replace("k","*YBv").replace("K", "&cv%")
				.replace("l","rgD4").replace("L", "nYA#")
				.replace("m","U7b7").replace("M", "$ww!")
				.replace("n","u%@3").replace("N", "J&we")
				.replace("o","&2Dn").replace("O", "ku3l")
				.replace("p","Fn^@").replace("P", "43U9")
				.replace("q","78aZ").replace("Q", "88F8")
				.replace("r","42!b").replace("R", "!Uwo")
				.replace("s","J5@J").replace("S", "94EQ")
				.replace("t","5f3G").replace("T", "7c18")
				.replace("u","90$6").replace("U", "76t2")
				.replace("v","jBwq").replace("V", "za6b")
				.replace("w","xX#a").replace("W", "p0p7")
				.replace("x","&Ea1").replace("X", "86cs")
				.replace("y","&Vh4").replace("Y", "ir1d")
				.replace("z","87f5").replace("Z", "yr7B");
	}

		
	public static void main(String[] args) {
		new JoCryption();

	}
	}
		

