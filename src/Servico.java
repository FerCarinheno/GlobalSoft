
public class Servico {
    private int id;
    private String servico;
    private double valorserv;

    public Servico() {
    }

    public Servico(int id, String servico, double valorserv) {
        this.id = id;
        this.servico = servico;
        this.valorserv = valorserv;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getValorserv() {
        return valorserv;
    }

    public void setValorserv(double valorserv) {
        this.valorserv = valorserv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
