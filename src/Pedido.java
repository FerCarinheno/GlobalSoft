
public class Pedido {
    private int id;
    private String cliente;
    private String data;
    private String produto;
    private double quantidadeP;
    private double valorProduto;
    private String servico;
    private double quantidadeS;
    private double valorServico;
    private String obs;
    private Double valorTotal;
    

    public Pedido() {
    }

    public Pedido(int id, String cliente, String data, String produto, double quantidadeP, double valorProduto, String servico, double quantidadeS, double valorServico, String obs, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.produto = produto;
        this.quantidadeP = quantidadeP;
        this.valorProduto = valorProduto;
        this.servico = servico;
        this.quantidadeS = quantidadeS;
        this.valorServico = valorServico;
        this.obs = obs;
        this.valorTotal = valorTotal;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(double quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getQuantidadeS() {
        return quantidadeS;
    }

    public void setQuantidadeS(double quantidadeS) {
        this.quantidadeS = quantidadeS;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    
    
    
    
    
}
