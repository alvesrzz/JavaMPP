public class Principal 
{
    
    public static void main(String[] args) 
    {
       Supervisor objeto = new Supervisor();
       objeto.setNome("Gabriel");
       objeto.setTempo(10);
       objeto.calcularSalario();
       
       System.out.println("O salario do Supervisor é " + objeto.getSalario());
       
       Gerente objeto2 = new Gerente("Gabriel",4);
       objeto2.calcularSalario();
       
       System.out.println("O salario do Gerente é " + objeto2.getSalario());
       
    }
    
}
