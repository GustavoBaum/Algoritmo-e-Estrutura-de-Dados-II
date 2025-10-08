public class FilaVetor<T> implements Fila<T> {

    private Object[] info;
    private int tamanho;
    private int limite;
    private int inicio;

    public FilaVetor(int limite) {
        info = new Object[limite];
        this.tamanho = 0;
        this.inicio = 0;
        this.limite = limite;
    }

    @Override
    public void inserir(T valor) throws FilaCheiaException {
        if (tamanho == limite) {
            throw new FilaCheiaException();
        }
        int posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    @Override
    public T peek() throws FilaVaziaException {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return (T) info[inicio];
    }

    @Override
    public T retirar() {
        T valor = peek();
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        info = new Object[limite];
        this.tamanho = 0;
        this.inicio = 0;
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> f3 = new FilaVetor<>(this.limite + f2.limite);
        
        for (int i = 0; i < this.tamanho; i++) {
            int posicao = (inicio + i) % this.limite;
            f3.inserir((T) info[posicao]);
        }

        for (int i = 0; i < f2.tamanho; i++) {
            int posicao = (inicio + i) % f2.limite;
            f3.inserir((T) info[posicao]);
        }

        return f3;
    }

    public String toString() {
        String valores = "";
        int posicao = inicio;

        for (int i = 0; i < tamanho; i++) {
            if (i > 0) {
                valores += ", ";
            }
            valores = valores + info[posicao];
            posicao = (posicao + 1) % limite;
        }
        return valores;
    }

    public int getLimite() {
        return this.limite;
    }
}
