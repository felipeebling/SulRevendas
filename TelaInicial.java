import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem menuConsultar;
	private JMenuItem menuCadastrar;
	private JMenuItem menuAlterar;
	private JMenuItem menuExcluir;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		

		createContents();
	}
	private void createContents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 357);
		
		this.menuBar = new JMenuBar();
		setJMenuBar(this.menuBar);
		
		this.mnNewMenu = new JMenu("Veiculo");
		this.menuBar.add(this.mnNewMenu);
		
		this.menuConsultar = new JMenuItem("Consultar");
		this.menuConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(new TelaConsulta());
				setVisible(true);
				
				
			}
		});
		this.mnNewMenu.add(this.menuConsultar);
		
		this.menuCadastrar = new JMenuItem("Cadastrar");
		this.menuCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(new TelaCadastro());
				setVisible(true);
				
			}
		});
		this.mnNewMenu.add(this.menuCadastrar);
		
		this.menuAlterar = new JMenuItem("Alterar");
		this.menuAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(new TelaAlterar());
				setVisible(true);
				
			}
		});
		this.mnNewMenu.add(this.menuAlterar);
		
		this.menuExcluir = new JMenuItem("Excluir");
		this.menuExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(new TelaExcluir());
				setVisible(true);
				
				
				
			}
		});
		this.mnNewMenu.add(this.menuExcluir);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new MigLayout("", "[grow][][grow]", "[grow][][][][][grow]"));
	}

}
