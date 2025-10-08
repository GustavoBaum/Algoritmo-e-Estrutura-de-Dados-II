import javax.swing.JOptionPane;

public class ListaEstatica {

    private int[] info;

    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar() {
        int[] novo;

        int novoTamanho = info.length + 10;
        novo = new int[novoTamanho];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(int valor) {
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
        JOptionPane.showMessageDialog(null, numeros);
    }

    public int buscar(int valor) {
        int indice = -1;
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                indice = i;
            }
        }

        return indice;
    }

    public void retirar(int valor) {
        int indice = buscar(valor);
        if (indice != -1) {
            for (int i = indice; i < tamanho; i++) {
                info[i] = info[i + 1];
            }
        }
        tamanho--;
    }

    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int posicao) throws IndexOutOfBoundsException {
        if (posicao < tamanho) {
            return info[posicao];
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
}