
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaServicos {
    private static ArrayList<Servico> LServico = new ArrayList<Servico>(); 
    
    public static boolean AdicionarServico (Servico s) {
        s.setId(LServico.size()+1);
        LServico.add(s);
        return true;
    }
    
    public static ArrayList<Servico> ListarServicos (){
        return LServico;
    }
    
    public static boolean excluirDaListaServico(int id) {
        try {
            if (id < 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item da tabela!");
            } else {
                LServico.remove(id);
                return true;
            }
        }catch (Exception e) {
            System.out.println("Ocorreu um erro ao excluir da lista");
        }
        return false;
    } 
    
}
