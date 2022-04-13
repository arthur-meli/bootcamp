public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa arthur = new Pessoa("123", "Arthur", 23);
        Pessoa fiama = new Pessoa("456", "Fiama", 25, 70.0, 1.80);


        short imcFiama = fiama.calculateIMC();

        if (imcFiama == -1) {
            System.out.println("Abaixo do peso");
        } else if (imcFiama == 0) {
            System.out.println("Peso saudavel ");
        } else {
            System.out.println("Sobrepeso");
        }

        if (fiama.isOfAge()) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        System.out.println(fiama.toString());
    }
}

