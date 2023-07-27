public class Serie {
    private String nome;
    private int temporada;
    private int ano;
    
    public Serie(String nome, int temporada, int ano) {
        this.nome = nome;
        this.temporada = temporada;
        this.ano = ano;
    }
    
    // Metodos espcificos da classe
    public void imprimirInformacoes(){
        // Nome: Sobrenatura (2005) - 15 Temporada(s)
        System.out.printf("Nome: %s (%d) - %d temporada(s).", nome, ano, temporada);
    }
    
    // Metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
