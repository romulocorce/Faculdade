package Controller;

public class Fornecedor extends Cadastro {

    // Atributos
    private String cnpj;
    private String razaoSocial;

    // Construtores
    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String razaoSocial, String id, String nome, String telefone, String celular, String email, Endereco endereco, String logradouro, String numero, String bairro, String cep, String complemento, String cidade, String estado) {
        super(id, nome, telefone, celular, email, endereco, logradouro, numero, bairro, cep, complemento, cidade, estado);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // Getter's e Setter's
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
