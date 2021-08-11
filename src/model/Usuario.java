package model;

public class Usuario {
    private Long cpf;
    private String nome;
    private String email;

    public Usuario() {
    }

    public Usuario(Long cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "\ncpf=" + cpf +
                "\n, nome='" + nome + '\'' +
                "\n, email='" + email + '\'' +
                '}';
    }
}
