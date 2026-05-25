package exercicioheranca;

public class Caminhonete extends Automovel {


    public Caminhonete() {
        super();
    }


    public Caminhonete(String nome, String fabricante, double precoVenda, int potencia) {
        super(nome, fabricante, precoVenda, potencia);
    }

    @Override
    public double calcularIPVA() {
        double ipvaBase = super.calcularIPVA(); 
        return ipvaBase * 1.20;
    }
}