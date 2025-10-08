public class FilaVaziaException extends RuntimeException {
    public FilaVaziaException() {
        super();
        System.out.println("A fila está vazia");
    }
}