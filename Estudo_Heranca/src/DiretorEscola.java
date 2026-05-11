public class DiretorEscola extends Professor {

    public DiretorEscola() {
    }

    public DiretorEscola(int cargaHoraria, int matricula, String nome) {
        super(cargaHoraria, matricula, nome);
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario(); 
        double salarioDiretorEscola = getSalario() * 1.5 + 2500.00 ;
        
        setSalario(salarioDiretorEscola);
    }
    @Override
    public String toString() {
       String resposta = String.format("Diretor Escola %d - %s - R$ %.2f", getMatricula(),getNome(),getSalario());
       
       return resposta;
    }
}
