
package control;

import database.ConectaDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Raiff
 */
public class ClienteControl {
    
    public static boolean cadastrarCliente(Cliente cliente){
        
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        String sql = "INSERT INTO cliente() VALUES(?,?,?,?,?)";
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, cliente.getNome());
            pst.setString(3, cliente.getTelefone());
            pst.setString(4, cliente.getCpf());
            pst.setString(5, cliente.getEndereco());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro cadastrar cliente! \n Erro: " + ex.getMessage());
        }
        
        return true;
    }
    
}
