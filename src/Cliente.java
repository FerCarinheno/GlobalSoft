
public class Cliente {
    public int id;
    private String Nome;
    private String Cpf;
    private String Rg;
    private String Telefone;
    private String Cep;
    private String Endereco;
    private String Numero;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Email;
    private String Contato;

    public Cliente() {
    }

    public Cliente(int id, String Nome, String Cpf, String Rg, String Telefone, String Cep, String Endereco, String Numero, String Bairro, String Cidade, String Estado, String Email, String Contato) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Rg = Rg;
        this.Telefone = Telefone;
        this.Cep = Cep;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Email = Email;
        this.Contato = Contato;
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
    
    
}
