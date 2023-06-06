public class Midia {
    private String nome ;

    public Midia(String nome) {
        super();
        this.nome = nome;
    }

    public Midia() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return String.format("Tipo: %s - Nome: %s", this.getClass().getSimpleName(), getNome());
    }
}