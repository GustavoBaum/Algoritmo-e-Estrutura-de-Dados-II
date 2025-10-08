public class PilhaVetor<T> {

    private Object[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        info = new Object[limite];
        limite = this.limite;
        this.tamanho = 0;
    }

    public void push(T valor) throws PilhaCheiaException {
        if (limite == tamanho) {
            throw new PilhaCheiaException();
        }
        this.info[tamanho++] = valor;
    }

    public T pop() throws PilhaVaziaException {
        T valor = peek();
        tamanho--;
        return valor;
    }

    public T peek() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return (T) info[tamanho - 1];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void liberar() {
        info = new Object[limite];
        this.tamanho = 0;
    }

    public String toString() {
        String valores = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            valores += info[i];
            if (i > 0) {
                valores += ", ";
            }
        }
        return valores;
    }

    public void concatenar(PilhaVetor<T> p) throws PilhaCheiaException {
        if (this.tamanho + p.tamanho > this.limite) {
            throw new PilhaCheiaException();
        }
        for (int i = 0; i < p.tamanho; i++) {
            this.push((T) p.info[i]);
        }
    }
}
