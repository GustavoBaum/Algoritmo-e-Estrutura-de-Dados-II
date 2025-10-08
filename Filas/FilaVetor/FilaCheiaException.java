public class FilaCheiaException extends RuntimeException {
    public FilaCheiaException() {
        super();
        System.out.println("A fila está cheia");
    }
}