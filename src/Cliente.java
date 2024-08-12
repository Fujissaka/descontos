public class Cliente {
    private String nome;
    private String email;
    private boolean fidelidade;
    
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void fidelizar() {
        fidelidade = true;
    }

    public void desfidelizar() {
        fidelidade = false;
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

    public boolean isFidelidade() {
        return fidelidade;
    }
}
