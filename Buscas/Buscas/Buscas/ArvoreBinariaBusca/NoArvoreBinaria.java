package ArvoreBinariaBusca;

public class NoArvoreBinaria<T> {
    
    private T info;
    private NoArvoreBinaria<T> esquerda;
    private NoArvoreBinaria<T> direita;

    public NoArvoreBinaria(T info) {
        setInfo(info);
    }

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
        setDireita(dir);
        setEsquerda(esq);
        setInfo(info);
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return this.info;
    }

    public void setEsquerda(NoArvoreBinaria<T> esq) {
        this.esquerda = esq;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return this.esquerda;
    }

    public void setDireita(NoArvoreBinaria<T> dir) {
        this.direita = dir;
    }

    public NoArvoreBinaria<T> getDireita() {
        return this.direita;
    }
}
