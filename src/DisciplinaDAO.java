import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DisciplinaDAO {

	public ArrayList<Disciplina> todos() {
		ArrayList<Disciplina> lista = new ArrayList<>(); 
		Connection conexao = FabricaDeConexao.getConnection(); 
		String sql = "select * from disciplina";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql); 
			
			ResultSet retorno = stmt.executeQuery(); 
			while(retorno.next()) {
				Disciplina disciplina = new Disciplina(retorno.getInt("id"), 
										retorno.getString("nome"), 
										retorno.getString("professor"),
										retorno.getInt("periodo"),
										retorno.getString("codigo_sala_classroom"));
				lista.add(disciplina);			
			} 	
			retorno.close();
			stmt.close();
			conexao.close();
		} catch (Exception err) {
			System.out.println("Erro no metodo de listagem: " + err.getMessage());
		}
		return lista; 
	}
}
