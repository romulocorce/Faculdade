package Controller;

public class Cliente extends Cadastro {

    // Atributos
    private String rg;
    private String cpf;
    private String Sexo;
    private String dataNascimento;

    // Construtores
    public Cliente() {
    }

    public Cliente(String rg, String cpf, String Sexo, String dataNascimento, String id, String nome, String telefone, String celular, String email, Endereco endereco, String logradouro, String numero, String bairro, String cep, String complemento, String cidade, String estado) {
        super(id, nome, telefone, celular, email, endereco, logradouro, numero, bairro, cep, complemento, cidade, estado);
        this.rg = rg;
        this.cpf = cpf;
        this.Sexo = Sexo;
        this.dataNascimento = dataNascimento;
    }

    // Getter's e Setter's
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
