public class Pereciveis extends  Produto{
    private int diasParaVencer;

    public Pereciveis(double preco, String nome, int diasParaVencer) {
        super(preco, nome);
        this.diasParaVencer = diasParaVencer;
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
        return "Pereciveis{" +
                "preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        int multiplicador = 1;
        switch (diasParaVencer) {
            case 1:
                multiplicador = 4;
                break;
            case 2:
                multiplicador = 3;
                break;
            case 3:
                multiplicador = 2;
                break;
            default:
        }
        return super.calcular(quantidadeDeProdutos) / multiplicador ;
    }
}
