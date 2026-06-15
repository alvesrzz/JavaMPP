import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Fiat Pulse", "EPC-1A34"));
        veiculos.add(new Moto("Honda Hornet", "XYZ-5T78"));

        for (Veiculo v : veiculos) {
            v.exibirDados();
        }
    }
}