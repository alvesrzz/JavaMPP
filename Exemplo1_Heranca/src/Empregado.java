public class Empregado {
    private String nome;
    private int tempo;
    protected double salario;

    public Empregado(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        this.salario = 0;
    }

    public Empregado() {
        this.nome = "";
        this.tempo = 0;
        this.salario = 0;
    }
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tempo
     */
    public int getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }
    
    public void calcularSalario()
    {
        
    }
}
