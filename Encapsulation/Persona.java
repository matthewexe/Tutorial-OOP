public class Persona {

    private String nome;

    public Persona(String nome) {
        this.nome = nome;
    }

    // Write-Only - Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Read-Only - Getter
    public String getNome() {
        return this.nome;
    }

}
