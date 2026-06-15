public class Professor extends Funcionarios{
    private int cargaHoraria;

    public Professor() {
        super();
        cargaHoraria = 0;
    }

    public Professor(int cargaHoraria, int matricula, String nome) {
        super(matricula, nome);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        
        double salarioProfessor = cargaHoraria * 50.0 * 4.5;
        
        setSalario(salarioProfessor);
    }

    @Override
    public String toString() {
       String resposta = String.format("Prof %d - %s - R$ %.2f", getMatricula(),getNome(),getSalario());
       
       return resposta;
    }
    
    
    
    
}
