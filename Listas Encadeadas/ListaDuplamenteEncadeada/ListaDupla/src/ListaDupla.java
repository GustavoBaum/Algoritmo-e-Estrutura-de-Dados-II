public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla<T> novo = new NoListaDupla<>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            if (p == valor) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> p = buscar(valor);
        if (p != null) {
            if (p == primeiro) {
                primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getProximo());
            }
            if (p.getProximo() != null) {
                p. getProximo().setAnterior(p.getAnterior());
            }
        }
    }

    public void exibirOrdemInversa() {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            p.getProximo();
        }
        while (p.getAnterior() != null) {
            System.out.print(p.getInfo() + ", ");
            p.getAnterior();
        }
    }

    public void liberar() {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            NoListaDupla<T> a = p;
            a.setProximo(null);
            a.setAnterior(null);
            p.getProximo();
        }
        primeiro = null;
    }

    public String toString() {
        String infos = "";
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            infos += p.getInfo();
            if (!(p.getProximo() != null)) {
                infos += ", ";
            }
        }
        return infos;
    }
}