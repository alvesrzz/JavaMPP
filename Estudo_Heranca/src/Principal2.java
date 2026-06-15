public class Principal2 {

    public static void main(String[] args) {
        
        FolhaPagamento folha = new FolhaPagamento();
        folha.adicionarFuncionario(new AuxiliarAdministrativo(1001,"marcelo"));
        folha.adicionarFuncionario(new DiretorServico(1002,"Danilo"));
        
        folha.adicionarFuncionario(new Professor(40,1003,"João"));
        folha.adicionarFuncionario(new Coordenador(5,40,1004,"Luis"));
        folha.adicionarFuncionario(new DiretorEscola(40,1005,"Victor"));
        
        System.out.println(String.format("O valor total da folha de pagamento é %.2f", folha.calcularTotalSalarios()));
        
        System.out.println("\nAbaixo serão exibidos os funcionários:");
        folha.exibirFuncionarios();
        
    }
    
}
