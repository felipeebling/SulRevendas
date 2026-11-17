import javax.swing.JPanel;

import com.mysql.jdbc.Connection;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class TelaConsulta extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	private Connection bd ;
	private Banco a;
	private JComboBox opcoes;
	private JTextField valor;
	private JLabel lblNewLabel;
	private JLabel lblInsiraOValor;
	private JScrollPane scrollPane;
	private JTextArea texto;
	/**
	 * @wbp.nonvisual location=207,388
	 */
	private final JButton button = new JButton("New button");
	private JButton btConsultar;
	
	
	public TelaConsulta() {
		 
		 
		 
		
		

		createContents();
	}
	
	public String  printarLista(LinkedList<veiculos> lista) {
		String retorno = "";
		
		for (veiculos v : lista) {
			retorno += v.toString();
			retorno += "\n";
			
		}
		
		return retorno;
		
		
	}
	
	private void consultar() {
		String acao = opcoes.getSelectedItem().toString();
		String valo = valor.getText();
		VeiculosDAO v = new VeiculosDAO();
		
		
		System.out.print(acao);
		System.out.print(valo);
		
		switch(acao) {
		case "Nome" :
				texto.setText(printarLista( v.procurarnome(valo,"nome") ) );
				break;
		case "Marca" :
			texto.setText(printarLista( v.procurarnome(valo,"marca") ) );
			 break;
				
		
			
		
		
		}
		
	}
	
		
	private void createContents() {
		
		 bd =  (Connection) a.getConexao();
		 
		setLayout(new MigLayout("", "[grow]", "[][][][][grow][]"));
		
		this.lblNewLabel = new JLabel("Selecione a Consulta");
		add(this.lblNewLabel, "cell 0 0,alignx center");
		
		this.opcoes = new JComboBox();
		this.opcoes.setModel(new DefaultComboBoxModel(new String[] {"Marca", "Nome", "Valor", "Ano", "Valor menor que ", "Valor maior que "}));
		add(this.opcoes, "cell 0 1,growx");
		
		this.lblInsiraOValor = new JLabel("Insira o valor");
		add(this.lblInsiraOValor, "cell 0 2,alignx center");
		
		this.valor = new JTextField();
		add(this.valor, "cell 0 3,growx");
		this.valor.setColumns(10);
		
		this.scrollPane = new JScrollPane();
		add(this.scrollPane, "cell 0 4,grow");
		
		this.texto = new JTextArea();
		this.scrollPane.setViewportView(this.texto);
		
		this.btConsultar = new JButton("Consultar");
		this.btConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consultar();
			}

			
			
			
		});
		add(this.btConsultar, "cell 0 5,growx");
	}
	
	

}
