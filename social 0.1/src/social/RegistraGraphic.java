package social;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class RegistraGraphic {

	private JFrame frame;
	private JTextField txtInserire;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textFieldLoginNome;
	private JTextField textFieldLoginPsw;
	private JTextField textField;
	private PaginaPersonaleGraphic paginaPersonale ;
	private DatiUtili dati = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistraGraphic window = new RegistraGraphic();
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
	public RegistraGraphic() {
		caricamento();
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 1014, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome Utente:");
		lblNome.setBounds(87, 133, 134, 20);
		frame.getContentPane().add(lblNome);
		
		JLabel lblSesso = new JLabel("Sesso");
		lblSesso.setBounds(87, 254, 69, 20);
		frame.getContentPane().add(lblSesso);
		
		JLabel lblPsw = new JLabel("Password:");
		lblPsw.setBounds(87, 171, 111, 20);
		frame.getContentPane().add(lblPsw);
		
		JLabel lblDataDiNascita = new JLabel("Data di Nascita");
		lblDataDiNascita.setBounds(87, 290, 122, 20);
		frame.getContentPane().add(lblDataDiNascita);
		
		txtInserire = new JTextField();
		txtInserire.setBounds(219, 130, 146, 26);
		frame.getContentPane().add(txtInserire);
		txtInserire.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 168, 152, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(219, 251, 146, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(219, 287, 146, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Registrati");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//bisogna aggiungere i controlli per verificare che tutti i dati siano 
				//compatibili (es. nome è string, data è int etc.)
				if(txtInserire.getText().length() != 0 && textField_1.getText().length() != 0 && 
				   textField_3.getText().length() != 0 && textField_2.getText().length() != 0 )
					{
						Utente nuovoUtente = new Utente();
						nuovoUtente.creaUtente(txtInserire.getText(), textField_1.getText(),textField_3.getText(),textField_2.getText() );
						dati.getListaUtenti().add(nuovoUtente);
				
						
							try {
								Serializator.saveData(dati);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							
			//textField_4.setText(nuovoUtente.getAnnoNascita());
				}
			}
		});
		btnNewButton.setBounds(514, 129, 115, 29);
		frame.getContentPane().add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setBounds(514, 186, 209, 88);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				for(int i=0 ; i<dati.getListaUtenti().size() ; i++)
				{
					
					if((dati.getListaUtenti().get(i).getUsername().equals((textFieldLoginNome.getText())) ) && (
					   dati.getListaUtenti().get(i).getPassword().equals((textFieldLoginPsw.getText()))) )
					{
						
						paginaPersonale = new PaginaPersonaleGraphic();
				
						textField.setText("sei registrato nel sistema");
						frame.setVisible(false);
						
						
					}
				}
			}
		});
		btnLogin.setBounds(514, 414, 115, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel label = new JLabel("Nome Utente:");
		label.setBounds(87, 418, 134, 20);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Password:");
		label_1.setBounds(87, 454, 111, 20);
		frame.getContentPane().add(label_1);
		
		textFieldLoginNome = new JTextField();
		textFieldLoginNome.setColumns(10);
		textFieldLoginNome.setBounds(219, 415, 146, 26);
		frame.getContentPane().add(textFieldLoginNome);
		
		textFieldLoginPsw = new JTextField();
		textFieldLoginPsw.setColumns(10);
		textFieldLoginPsw.setBounds(219, 454, 146, 26);
		frame.getContentPane().add(textFieldLoginPsw);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(514, 472, 209, 88);
		frame.getContentPane().add(textField);
	}
	
	public  void caricamento()
	{
			try 
			{if(Serializator.getSalvataggio() != null) 
			{
				dati = Serializator.readSavedData(Serializator.getFilename());
				System.out.println("caricamento");
			}
			else 
				dati = new DatiUtili();
				
			} catch (ClassNotFoundException e) 
			  {
			  e.printStackTrace();
			  }
			  catch (IOException e) 
			  {
			  e.printStackTrace();
			  }
		}
}
