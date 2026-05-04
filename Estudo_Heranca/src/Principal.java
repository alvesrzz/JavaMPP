public class Principal {

    
    public static void main(String[] args) {
        AuxiliarAdministrativo func1 = new AuxiliarAdministrativo();
        
        func1.setMatricula(1001);
        func1.setNome("Gabriel Alves");
        func1.calcularSalario();
        
        System.out.println(func1);
        
        AuxiliarAdministrativo func2 = new AuxiliarAdministrativo(1002,"alves");
        func2.calcularSalario();
        System.out.println(func2);
        
        Professor func3 = new Professor (40,1003,"gabriel");
        func3.calcularSalario();
        System.out.println(func3);
    }
        
    
}
