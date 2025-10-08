public class ListaEstatica<T> {

    private Object[] info;

    private int tamanho;

    public ListaEstatica() {
        info = new Object[10];
        tamanho = 0;
    }

    private void redimensionar() {
        Object[] novo = new Object[info.length + 10];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        String numeros = "";
        for (int i = 0; i < tamanho; i++) {
            numeros += info[i] + " ";
        }
        System.out.println(numeros);
    }

    public int buscar(T valor) {
        int indice = -1;
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                indice = i;
            }
        }

        return indice;
    }

    public void retirar(T valor) {
        int indice = buscar(valor);
        if (indice != -1) {
            for (int i = indice; i < tamanho; i++) {
                info[i] = info[i + 1];
            }
        }
        tamanho--;
    }

    public void liberar() {
        info = new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao) throws IndexOutOfBoundsException {
        if (posicao < tamanho) {
            return (T) info[posicao];
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

    public boolean estaVazia() {
        return (tamanho == 0);
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String toString() {
        String numeros = " ";
        for (int i = 0; i < tamanho; i++) {
            numeros += info[i];
            if (i < tamanho - 1) {
                numeros += ", ";
            }
        }
        return numeros;
    }

    public void inverter() {
        for (int i = 0; i < tamanho / 2; i++) {
            T a = (T) info[i];
            info[i] = info[tamanho - 1 - i];
            info[tamanho - 1 - i] = a;
        }
    }
}