public abstract class Veiculo implements Servico {
    protected String modelo;
    protected String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Valor do serviço: R$ " + calcularServico());
        System.out.println();
    }

    @Override
    public abstract double calcularServico();
}