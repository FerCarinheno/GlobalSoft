
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaPedidos {
    public static ArrayList<Pedido> LPedido = new ArrayList<Pedido>();
    
    public static boolean AdicionarPedido (Pedido p) {
        p.setId(LPedido.size()+1);
        LPedido.add(p);
        return true;
    }
    
    public static ArrayList<Pedido> ListarPedidos (){
        return LPedido;
    }
    
    public static boolean excluirDaListaPedido(int id) {
        try {
            if (id < 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item da tabela!");
            } else {
                LPedido.remove(id);
                return true;
            }
        }catch (Exception e) {
            System.out.println("Ocorreu um erro ao excluir da lista");
        }
        return false;
    } 
}
