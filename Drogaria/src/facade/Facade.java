package facade;

import control.ClienteControl;
import model.Cliente;

/**
 *
 * @author Dieg0 MigueL
 */
public class Facade {
    public static boolean cadastrarCliente(Cliente cliente){
        return ClienteControl.cadastrarCliente(cliente);
    }
}
