
public class Produto {
   private int id;
    private String descricao;
    private double valorCusto;
    private double valorVenda;
    private int quantidade;

    public Produto() {
    }

    public Produto(int id, String descricao, double valorCusto, double valorVenda, int quantidade) {
        this.descricao = descricao;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.quantidade = quantidade;
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
