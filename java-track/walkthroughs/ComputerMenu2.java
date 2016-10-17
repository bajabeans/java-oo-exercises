import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComputerMenu2 {
	
	

	private JFrame frame;
	private DefaultListModel<Computer> listModel;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComputerMenu2 window = new ComputerMenu2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComputerMenu2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 159);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		listModel = new DefaultListModel<Computer>();
		list = new JList(listModel);
		list.setBounds(223, 11, 201, 91);
		frame.getContentPane().add(list);
		
		JButton btnCreateANew = new JButton("Create a new Computer");
		btnCreateANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = list.getSelectedIndex();
				int mem = (int)getPositiveValue("How much memory does the computer have?", "Memory Dialog");
				double proc = getPositiveValue("How much processing speed does the computer have?", "Processor Dailog");
				double size = getPositiveValue("What size is the computer?", "Processor Dialog");
				String brand = (String)JOptionPane.showInputDialog(
						frame,
						"What brand of computer is it?",
						"Brand Dialog", JOptionPane.PLAIN_MESSAGE,
						null,
						null,
						"");
				Computer c = new Computer(mem, proc, size, brand);
				listModel.add(listModel.size(),c);
						
			}
		});
		btnCreateANew.setBounds(10, 11, 203, 23);
		frame.getContentPane().add(btnCreateANew);
		
		JButton btnChangeProcessor = new JButton("Change Processor");
		btnChangeProcessor.setBounds(10, 45, 203, 23);
		frame.getContentPane().add(btnChangeProcessor);
		
		JButton btnAddMemory = new JButton("Add Memory");
		btnAddMemory.setBounds(10, 79, 203, 23);
		frame.getContentPane().add(btnAddMemory);
		
		
	}
	
	private double getPositiveValue(String prompt, String title)
	{
		//
		String s = (String)JOptionPane.showInputDialog(
				frame,
				prompt,
				title, JOptionPane.PLAIN_MESSAGE,
				null,
				null,
				"");
		double sint = Double.parseDouble(s);
		while(sint < 0)
		{
			s = (String)JOptionPane.showInputDialog(
					frame,
					prompt + "(Please enter a positive value)",
					title, JOptionPane.PLAIN_MESSAGE,
					null,
					null,
					"");
			sint = Double.parseDouble(s);
		}
		return sint;
	}

}
