public class ListaEncadeada<T> {

    private NoLista<T> primeiro;
    private NoLista<T> ultimo; 

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return this.primeiro;
    }

    public void inserir(T valor) {
        NoLista<T> novo = new NoLista();
        novo.setInfo(valor);
        novo.setProximo(primeiro);

        if (estaVazia()) {
            ultimo = novo;
        }

        this.primeiro = novo;
    }

    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public NoLista<T> buscar(T valor) {
        NoLista<T> p = primeiro;
        while (primeiro != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;

        while (p != null && p.getInfo() != valor) {
            anterior = p;
            p = p.getProximo();
        }
        if (p != null) {
            if (p == primeiro) {
                this.primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
            if (p == ultimo) {
                ultimo = anterior;
            }
        }
    }

    public void exibir() {
        NoLista<T> p = primeiro;
        while (p != null) {
            System.out.print(p.getInfo() + ", ");
            p = p.getProximo();
        }
    }

    public int obterComprimento() {
        NoLista<T> p = primeiro;
        int contagem = 0;
        while (p != null) {
            contagem++;
            p.getProximo();
        }
        return contagem;
    }

    public NoLista<T> obterNo(int idx) throws IndexOutOfBoundsException {
        if (idx < 0 || idx > obterComprimento() - 1) {
            throw new IndexOutOfBoundsException();
        }

        int indice = 0;
        NoLista<T> p = primeiro;
        while (p != null) {
            if (indice == idx) {
                return p;
            }
            indice++;
            p = p.getProximo();
        }
        return null;
    }

    public NoLista<T> obterNoOtimizado(int idx) throws IndexOutOfBoundsException {
        if (idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        NoLista<T> p = getPrimeiro();
        while (p != null && idx > 0) {
            idx--;
            p = p.getProximo();
        }
        if (p == null) {
            throw new IndexOutOfBoundsException();
        }
        return p;
    }

    public String toString() {
        String numeros = "";
        NoLista<T> p = primeiro;
        while (p != null) {
            numeros += p.getInfo();
            if (p.getProximo() != null) {
                numeros += ", ";
            }
        }
        return numeros;
    }

    public void inserirNoFinal(T valor) {
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(valor);
        novo.setProximo(null);

        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
}