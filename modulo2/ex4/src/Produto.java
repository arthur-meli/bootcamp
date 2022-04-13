public class Produto {
    double preco;
    String nome;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }

    public double calcular(int QuantidadequantidadeDeProdutos){

        return  QuantidadequantidadeDeProdutos * preco;
    }
}
