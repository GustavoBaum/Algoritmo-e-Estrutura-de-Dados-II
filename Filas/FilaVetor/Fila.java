public interface Fila<T> {

    void inserir(T valor);
    boolean estaVazia();
    T peek() throws FilaVaziaException;
    T retirar();
    void liberar();
}