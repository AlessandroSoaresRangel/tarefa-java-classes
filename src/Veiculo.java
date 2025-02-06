public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;

    public Veiculo(String marca, String modelo, int ano, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprime() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
    }
}
