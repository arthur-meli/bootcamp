public class NaoPereciveis extends Produto {
   String tipo;

    public NaoPereciveis(double preco, String nome, String tipo) {
        super(preco,nome);
        this.tipo = tipo
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
        return "NaoPereciveis{" +
                "preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }

    public double calcular(int QuantidadequantidadeDeNaoPereciveiss){

        return  QuantidadequantidadeDeNaoPereciveiss * preco;
    }
}
