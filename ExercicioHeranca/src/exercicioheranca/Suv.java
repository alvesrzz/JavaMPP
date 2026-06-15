package exercicioheranca;

public class Suv extends Automovel {

    public Suv() {
        super();
    }

    public Suv(String nome, String fabricante, double precoVenda, int potencia) {
        super(nome, fabricante, precoVenda, potencia);
    }

    @Override
    public double calcularIPVA() {
        double ipvaBase = super.calcularIPVA();
        return ipvaBase * 0.90;
    }
}
