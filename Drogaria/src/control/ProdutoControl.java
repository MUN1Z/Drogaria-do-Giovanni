
package control;

import database.ConectaDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;

/**
 *
 * @author Raiff
 */
public class ProdutoControl {
    
    public static boolean cadastrarProduto(Produto produto){
    
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        String sql = "INSERT INTO produto() VALUES(?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, produto.getNome());
            pst.setDouble(3, produto.getValorUnitario());
            pst.setString(4, produto.getFabricante());
            pst.setString(5, produto.getFornecedor());
            pst.setInt(6, produto.getQuantidadeEstoque());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
}
