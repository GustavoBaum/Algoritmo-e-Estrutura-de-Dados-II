public class PilhaLista<T> implements Pilha<T> {

    private ListaEncadeada lista;

    public PilhaLista() {
        lista = new ListaEncadeada<>();
    }

    @Override
    public void push(T valor) {
        lista.inserir(valor);
    }

    @Override
    public T pop() throws PilhaVaziaException {
        T valor = peek();
        lista.retirar(valor);
        return valor;
    }

    @Override
    public T peek() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return (T) lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public void liberar() {
        lista = new ListaEncadeada<>();
    }

    public String toString() {
        return lista.toString();
    }   
}
