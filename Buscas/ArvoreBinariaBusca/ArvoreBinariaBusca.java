package ArvoreBinariaBusca;

@SuppressWarnings("rawtypes")
public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract {

    @SuppressWarnings({ "unchecked" })
    public ArvoreBinariaBusca(NoArvoreBinaria raiz) {
        super(raiz);
    }

    @SuppressWarnings("unchecked")
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

    @SuppressWarnings("unchecked")
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

    @SuppressWarnings("unchecked")
    public void retirar(T info) {

        NoArvoreBinaria<T> p = raiz;
        NoArvoreBinaria<T> pai = null;

        boolean filhoEsquerda = false;

        // Localiza o nó a ser removido
        while ((p != null) && (p.getInfo() != info)) {
            pai = p;
            if (info.compareTo(p.getInfo()) < 0) {
                filhoEsquerda = false;
                p = p.getEsquerda();
            } else {
                filhoEsquerda = false;
                p = p.getDireita();
            }
        }

        // Remoção de nó folha, sem filhos a esquerda ou direita.
        if (p != null) {
            if ((p.getEsquerda() == null) && (p.getDireita() == null)) {
                if (p == raiz) {
                    raiz = null;
                } else {
                    if (filhoEsquerda = true) {
                        pai.setEsquerda(null);
                    } else {
                        pai.setDireita(null);
                    }
                }
            } else { // Remoção de nó com filho a esquerda OU a direita
                if (p.getDireita() == null) { // Filho a esquerda
                    if (p == raiz) {
                        raiz = p.getEsquerda();
                    } else {
                        if (filhoEsquerda == true) {
                            pai.setEsquerda(p.getEsquerda());
                        } else {
                            pai.setDireita(p.getEsquerda());
                        }
                    }
                } else {
                    if (p.getEsquerda() == null) { // Filho a direita
                        if (p == raiz) {
                            raiz = p.getDireita();
                        } else {
                            if (filhoEsquerda == true) {
                                pai.setEsquerda(p.getDireita());
                            } else {
                                pai.setDireita(p.getDireita());
                            }
                        }
                    } else { // Remoção de nó com dois filhos
                        NoArvoreBinaria<T> sucessor = extrairSucessor(p);

                        if (p == raiz) {
                            raiz = sucessor;
                        } else {
                            if (filhoEsquerda == true) {
                                pai.setEsquerda(sucessor);
                            } else {
                                pai.setDireita(sucessor);
                            }
                        }
                        sucessor.setEsquerda(p.getEsquerda());
                    }
                }
            }
        }
    }

    private NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> p) {
        NoArvoreBinaria<T> atual = p.getDireita();
        NoArvoreBinaria<T> paiSucessor = p;
        NoArvoreBinaria<T> sucessor = p;

        while (atual != null) {
            paiSucessor = sucessor;
            sucessor = atual;
            atual = atual.getEsquerda();
        }
        if (sucessor != p.getDireita()) {
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(p.getDireita());
        }
        return sucessor;
    }
}
