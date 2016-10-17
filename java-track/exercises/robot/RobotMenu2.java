package robot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RobotMenu2 {

	private JFrame frmRobottime;
	private DefaultListModel<Robot> listModel;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RobotMenu2 window = new RobotMenu2();
					window.frmRobottime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RobotMenu2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRobottime = new JFrame();
		frmRobottime.setTitle("RobotTime");
		frmRobottime.setBounds(100, 100, 568, 214);
		frmRobottime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRobottime.getContentPane().setLayout(null);
		
		listModel = new DefaultListModel<Robot>();
		list = new JList(listModel);
		//JList list = new JList();
		list.setBounds(205, 11, 337, 153);
		frmRobottime.getContentPane().add(list);
		
		JButton btnCreateANew = new JButton("Create a New Robot!");
		btnCreateANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = list.getSelectedIndex();
				String name = (String)JOptionPane.showInputDialog(
						frmRobottime,
						"Name Your robot",
						"Name dialog", JOptionPane.PLAIN_MESSAGE,
						null,
						null,
						"");
				int posX = getPositiveValue("Give X position", "PosX Dialog");
				int posY = getPositiveValue("Give Y position", "PosY Dialog");
				int speed = getPositiveValue("Give a speed", "Speed Dialog");
				
				
				Robot r = new Robot(name, posX, posY, speed, "North");
				listModel.add(listModel.size(), r);
						
			}
		});
		btnCreateANew.setBounds(0, 8, 195, 23);
		frmRobottime.getContentPane().add(btnCreateANew);
	}
	
	private int getPositiveValue(String prompt, String title)
	{
		String s = (String)JOptionPane.showInputDialog(
				frmRobottime,
				prompt,
				title, JOptionPane.PLAIN_MESSAGE,
				null,
				null,
				"");
		double sint = Double.parseDouble(s);
		while(sint < 0)
		{
			s = (String)JOptionPane.showInputDialog(
					frmRobottime,
					prompt + "(Please enter a positive value)",
					title, JOptionPane.PLAIN_MESSAGE,
					null,
					null,
					"");
			sint = Double.parseDouble(s);			
		}
		return (int)sint;
	}

}
