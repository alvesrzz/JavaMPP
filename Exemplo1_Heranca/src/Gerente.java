public class Gerente extends Empregado{

    public Gerente() {
    }
    
    public Gerente(String nome, int tempo) {
        super(nome, tempo);
    }

    @Override
    public void calcularSalario() {
    double salarioBase = 15000;
        
        if (getTempo() >= 5)
        {
            salarioBase = salarioBase * 1.20;
        }
        
        this.salario = salarioBase;
    }

    
    
}
