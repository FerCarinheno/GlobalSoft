

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaProdutos {
    
    private static ArrayList<Produto> LProduto = new ArrayList<Produto>();
    
    public static boolean adicionarProduto(Produto p) {
        p.setId(LProduto.size() + 1);
        LProduto.add(p);
        return true;
    }
    
    public static ArrayList<Produto> ListarProdutos(){
        return LProduto;
    }
    
    public static boolean excluirDaListaProduto(int id) {
        try {
            if (id < 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item da tabela!");
            } else {
                LProduto.remove(id);
                return true;
            }
        }catch (Exception e) {
            System.out.println("Ocorreu um erro ao excluir da lista");
        }
        return false;
    } 
}
