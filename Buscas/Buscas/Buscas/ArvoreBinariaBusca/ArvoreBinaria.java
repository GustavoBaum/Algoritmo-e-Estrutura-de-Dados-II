package ArvoreBinariaBusca;

public class ArvoreBinaria<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

    public ArvoreBinaria(NoArvoreBinaria<T> raiz) {
        super(raiz);
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        super.setRaiz(raiz);
    }

    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(null, info);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return null;
        }
        if (no.getInfo().equals(info)) {
            return no;
        } else {
            if (info.compareTo(no.getInfo()) < 0) { // info < no.getInfo()
                return buscar(no.getEsquerda(), info);
            } else {
                return buscar(no.getDireita(), info);
            }
        }
    }
}
