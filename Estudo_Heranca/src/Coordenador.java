public class Coordenador extends Professor{
    private int qtdTurmas;
    public Coordenador() {
        super();
        qtdTurmas = 0;
    }

    public Coordenador(int qtdTurmas, int cargaHoraria, int matricula, String nome) {
        super(cargaHoraria, matricula, nome);
        this.qtdTurmas = qtdTurmas;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }
     @Override
    public void calcularSalario() {
        super.calcularSalario();
        
        double salarioCoordenador = getSalario() + (qtdTurmas * 150.00);
        
        setSalario(salarioCoordenador);
    }

    @Override
    public String toString() {
       String resposta = String.format("Coordenador %d - %s - R$ %.2f", getMatricula(),getNome(),getSalario());
       
       return resposta;
    }
}
