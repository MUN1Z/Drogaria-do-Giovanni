
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Raiff
 */
public class ConectaDB {
    
    public Statement stm;
    public  ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/drogaria";// MYDB é o nome do provavel banco
    private String usuario = "root";
    private String senha = "";
    public Connection conn;
	
	public void conexao(){
		
		try {
			System.setProperty("jdbc.Drivers", driver);
			conn = DriverManager.getConnection(caminho, usuario, senha);
			JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de conexão no banco de dados!! \n Erro:" + e.getMessage());
		}
	}
	
	public void desconecta(){
		try {
			conn.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com banco de dados! \n Erro:" + e.getMessage());
		}
	}
       
    
}
