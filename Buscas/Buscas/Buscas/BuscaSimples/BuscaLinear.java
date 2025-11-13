public class BuscaLinear<T> extends BuscaAbstract {
    public int buscaLinear(T[] info, T valorBuscar) {
        int n = info.length;

        for (int i = 0; i < n - 1; i++) {
            if (info[i] == valorBuscar) {
                return i;
            }
        }
        return -1;
    }
}