
package control;

import database.ConectaDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Funcionario;

/**
 *
 * @author Raiff
 */
public class FuncionarioControl {
    
    public static boolean cadastrarFuncionario(Funcionario funcionario){
    
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        String sql = "INSERT INTO funcionario() VALUES(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, funcionario.getNome());
            pst.setDouble(3, funcionario.getSalarioBase());
            pst.setString(4, funcionario.getCpf());
            pst.setString(5, funcionario.getEndereco());
            pst.setString(6, funcionario.getTelefone());
            pst.setDouble(7, funcionario.getComissao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro cadastrar cliente! \n Erro: " + ex.getMessage());
        }
        
        
        return true;
    }
    
}
