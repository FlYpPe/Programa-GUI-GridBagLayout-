import javax.swing.*;

import java.awt.*;

class PruebaGridBag extends JFrame {
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	public PruebaGridBag() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Actividad");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel lb1 = new JLabel();
		
		lb1.setText("The classic forum inclides all visible fields for \n this list");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(lb1, gbc);
		add(lb1);
		
		JLabel lb2 = new JLabel();
		lb2.setText("Forum options");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(lb2, gbc);
		add(lb2);
		

		JLabel lb3 = new JLabel();
		lb3.setText("inclde the following");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(lb3, gbc);
		add(lb3);

		JCheckBox cb1 = new JCheckBox();
		cb1.setText("a tde for you forum");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb1, gbc);
		add(cb1);
		

		JTextField susc = new JTextField(10);
		susc.setText("Suscribe to our malling list");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(susc, gbc);
		add(susc);

		ButtonGroup bg1 = new ButtonGroup();
		JRadioButton orf = new JRadioButton("Only required Fields");
		
		orf.setSelected(true);
		bg1.add(orf);
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(orf, gbc);
		add(orf);
		JRadioButton af = new JRadioButton("All fields");
		bg1.add(af);
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(af, gbc);
		add(af);
		
		JLabel lb4 =  new JLabel();
		lb4.setText("(edit required fields in the from builder)");
		lb4.setBounds(10, 112,180,15);
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(lb4, gbc);
		add(lb4);
		
		JCheckBox cb2 = new JCheckBox();
		cb2.setText("Interest group fields");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb2, gbc);
		add(cb2);

		JCheckBox cb3 = new JCheckBox();
		cb3.setText("Required field indicators");
		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb3, gbc);
		add(cb3);
		
		JLabel lb5 =  new JLabel();
		lb5.setText("Set from width");
		gbc.gridx = 0;
		gbc.gridy = 10;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(lb5, gbc);
		add(lb5);
		
		JTextField jt2 = new JTextField(10);
		gbc.gridx = 0;
		gbc.gridy = 11;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jt2, gbc);
		add(jt2);
		
		JLabel lb6 =  new JLabel();
		lb6.setText("Enchance your form");
		gbc.gridx = 0;
		gbc.gridy = 12;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(lb6, gbc);
		add(lb6);
		
		JCheckBox cb4 = new JCheckBox();
		cb4.setText("Enable evil poup mode");
		gbc.gridx = 0;
		gbc.gridy = 13;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb4, gbc);
		add(cb4);
		JCheckBox cb5 = new JCheckBox();
		cb5.setText("Disable all java Script");
		gbc.gridx = 0;
		gbc.gridy = 14;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb5, gbc);
		add(cb5);
		JCheckBox cb6 = new JCheckBox();
		cb6.setText("Include archive link");
		gbc.gridx = 0;
		gbc.gridy = 15;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb6, gbc);
		add(cb6);
		JCheckBox cb7 = new JCheckBox();
		cb7.setText("Include MonkeyRewards link");
		gbc.gridx = 0;
		gbc.gridy = 16;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb7, gbc);
		add(cb7);
		

		
		
		gbc.fill = GridBagConstraints.WEST;

		
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		jp1.setBorder(BorderFactory.createTitledBorder(""));
		jp1.setBounds(350, 10, 250, 210);
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridheight = 3;
		gbc.gridwidth = 10;
		gbl.setConstraints(jp1, gbc);
		add(jp1);
		
		JLabel lb7 =  new JLabel();
		lb7.setText("Preview");
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(lb7, gbc);
		jp1.add(lb7);
		
		
		JLabel lb8 =  new JLabel();
		lb8.setText("Email Adress");
		lb8.setBounds(10,28,100,15);
		jp1.add(lb8);		
		JTextField jt3 = new JTextField(10);
		jp1.add(jt3);
		jt3.setBounds(10,46,100,20);
		
		
		
		
		JLabel lb9 =  new JLabel();
		lb9.setText("First Name");
		jp1.add(lb9);
		lb9.setBounds(10,69,100,20);		
		JTextField jt4 = new JTextField(10);
		jt4.setBounds(10,92,100,20);
		jp1.add(jt4);
		
		
		JLabel lb10 =  new JLabel();
		lb10.setBounds(10,116,100,15);
		lb10.setText("Last Name");
		jp1.add(lb10);
		JTextField jt5 = new JTextField(10);
		jt5.setBounds(10,133,100,20);
		jp1.add(jt5);
		
		JButton jb1 = new JButton("Suscribe");
		
		jp1.add(jb1);
		jb1.setBounds(10,168,90,25);
		
		JLabel lb11 =  new JLabel();
		lb11.setText("Copy paste onto your site ");
		lb11.setBounds(350, 235, 155, 15);
		add(lb11);
		
		JTextField jt6 = new JTextField(10);
		jt2.setBounds(350, 260, 250, 150);
		add(jt6);
		
		
		
		
		
	}
}
public class PruebaGrid{

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new PruebaGridBag();
			}
		});

	
		

	}

}
