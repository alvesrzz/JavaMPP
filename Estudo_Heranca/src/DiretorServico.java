public class DiretorServico extends AuxiliarAdministrativo {

    public DiretorServico() {
    }
    
    public DiretorServico(int matricula, String nome) {
        super(matricula, nome);
    }
@Override
    public void calcularSalario() {
        super.calcularSalario();
        
        double salarioDiretor = getSalario() * 1.5;
        
        setSalario(salarioDiretor);
    }

    @Override
    public String toString() {
       String resposta = String.format("Diretor %d - %s - R$ %.2f", getMatricula(),getNome(),getSalario());
       
       return resposta;
    }
    
    
}
