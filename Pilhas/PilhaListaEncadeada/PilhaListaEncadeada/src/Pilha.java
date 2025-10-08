public interface Pilha<T> {

    public void push(T valor);

    public T pop() throws PilhaVaziaException;

    public T peek() throws PilhaVaziaException;

    public boolean estaVazia();

    public void liberar();
}
