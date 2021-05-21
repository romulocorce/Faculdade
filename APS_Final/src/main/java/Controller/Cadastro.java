package Controller;

public class Cadastro extends Endereco {

    // Atributos
    private String id;
    private String nome;
    private String telefone;
    private String celular;
    private String email;
    private Endereco endereco;

    // Construtores
    public Cadastro() {
    }

    public Cadastro(String id, String nome, String telefone, String celular, String email, Endereco endereco, String logradouro, String numero, String bairro, String cep, String complemento, String cidade, String estado) {
        super(logradouro, numero, bairro, cep, complemento, cidade, estado);
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
    }

    // Getter's e Setter's 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
