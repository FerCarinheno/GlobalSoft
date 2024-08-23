
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaClientes {
    public static ArrayList<Cliente> LCliente = new ArrayList<Cliente>();
    
    public static boolean adicionarCliente(Cliente c) {
        c.setId(LCliente.size() + 1);
        LCliente.add(c);
        return true;
    }
    
    public static ArrayList<Cliente> ListarClientes(){
        return LCliente;
    }
    
    public static boolean excluirDaListaCliente(int id) {
        try {
            if (id < 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item da tabela!");
            } else {
                LCliente.remove(id);
                return true;
            }
        }catch (Exception e) {
            System.out.println("Ocorreu um erro ao excluir da lista");
        }
        return false;
    } 
}
