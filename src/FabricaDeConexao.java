import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//implementa o design pattern Factory
public class FabricaDeConexao {
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/sistemacrud?serverTimezone=UTC", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
