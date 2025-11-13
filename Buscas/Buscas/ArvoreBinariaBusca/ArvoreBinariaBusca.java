package ArvoreBinariaBusca;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract {

    public ArvoreBinariaBusca(NoArvoreBinaria raiz) {
        super(raiz);
    }

    @Override
    public NoArvoreBinaria buscar(Object info) {
        NoArvoreBinaria<T> p = raiz;
        while ((p != null) && !p.getInfo().equals(info)) {
            if (((Comparable<T>) info).compareTo(p.getInfo()) < 0) { // info < p.getInfo();
                p = p.getEsquerda();
            } else {
                p = p.getDireita();
            }
        }
        return p;
    }

    public void inserir(T info) {
        NoArvoreBinaria<T> novo = new NoArvoreBinaria<>(info);
        NoArvoreBinaria<T> p = raiz;
        NoArvoreBinaria<T> pai = null;
        
        if (raiz == null) {
            raiz = novo;
        } else {
            p = raiz;
            while (true) {
                pai = p;
                if (info.compareTo(p.getInfo()) < 0) {
                    p = pai.getEsquerda(); 
                    return;
                } else {
                    p = pai.getDireita();
                    if (p == null) {
                        pai.setDireita(novo);
                        return;
                    }
                }
            }
        }
    }
}
