import java.util.ArrayList;

public class Distribuidora {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        double valorTotal = 0;

        Produto produto1 = new Pereciveis("Batata", 3.20,2);
        produtos.add(produto1);
        Produto produto2 = new Pereciveis("Tuberculos", 0.00,3);
        produtos.add(produto2);
        Produto produto3 = new NaoPereciveis("Mandioca", 9.39,"Fruta");
        produtos.add(produto3);
        Produto produto4 = new NaoPereciveis("Bannaa", 6.50,"Fruta");
        produtos.add(produto4);
        Produto produto5 = new Pereciveis("Pão", 7.00,1);
        produtos.add(produto5);

        for (Produto produto: produtos) {
            valorTotal += produto.calcular(2);
        }

        System.out.println("Valor total: " + valorTotal);
    }
}
