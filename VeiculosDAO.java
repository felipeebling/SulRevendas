import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.mysql.jdbc.PreparedStatement;

public class VeiculosDAO {
	private Banco bd ;
	private Connection conexao = bd.getConexao();

	
	
	public LinkedList<veiculos> listar() {
		String sql = "select * from funcionario";
		
		try {
			LinkedList<veiculos> listav = new LinkedList<veiculos>();
			PreparedStatement stmt = (PreparedStatement) this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
			veiculos v = new veiculos(rs.getString("nome"), rs.getString("marca"),
					                  rs.getString("motor"),rs.getInt("ano"),
					                  rs.getInt("valor"),rs.getInt("kmatual") );
			v.setId(rs.getInt("id"));
				listav.add(v);
			}
			rs.close();
			stmt.close();
			return listav;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public LinkedList<veiculos> procurarnome(String nome, String campo) {
		String sql = "select * from veiculos where "+ campo + " like ?";
		
				
		try {
			LinkedList<veiculos> listav = new LinkedList<veiculos>();
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, campo);
			
			stmt.setString(2, "%" + nome+ "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {		
				System.out.print("aqui2");
				
				veiculos v = new veiculos(rs.getString("nome"), rs.getString("marca"),
		                  rs.getString("motor"),rs.getInt("ano"),
		                  rs.getInt("valor"),rs.getInt("kmatual") );
						  v.setId(rs.getInt("id"));
						  listav.add(v);
	       
								}
			rs.close();
			stmt.close();
			
			return listav;	
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		}
	}
	
	
	
	
}
