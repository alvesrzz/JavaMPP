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
        
        DiretorServico func4 = new DiretorServico (1004,"gabriel");
        func4.calcularSalario();
        System.out.println(func4);
        
        DiretorEscola func5 = new DiretorEscola (20,1005,"gabriel");
        func5.calcularSalario();
        System.out.println(func5);
        
        Coordenador func6 = new Coordenador (3,40,1006,"gabriel");
        func6.calcularSalario();
        System.out.println(func6);
    }
        
    
}
