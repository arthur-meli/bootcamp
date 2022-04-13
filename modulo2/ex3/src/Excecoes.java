


class PraticaExcecoes {
    int a = 0;
    int b = 300;

    public PraticaExcecoes() {
    }

    public void razaoExceptionTratada() {
        try {
            int resultado = b / a;
        } catch (ArithmeticException ex) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Programa Finalizado 1 ");
        }
    }

    public void razaoIllegalException() {
        try {
            int resultado = b / a;
        } catch (ArithmeticException ex) {
            throw new IllegalArgumentException("Não Pode ser dividido por zero");
        } finally {
            System.out.println("Programa Finalizado2");
        }
    }
}
