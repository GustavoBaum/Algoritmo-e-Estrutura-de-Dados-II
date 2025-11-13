public class BuscaLinaerVetorOrdenado<T extends Comparable<T>> extends BuscaAbstract {
    
    @SuppressWarnings("unchecked")
    public int buscaVetorOrdenado(T info[], T valorBuscar) {
        int n = info.length;

        for (int i = 0; i < n - 1; i++) {
            if (info[i] == valorBuscar) {
                return i;
            }
            if (((Comparable<Integer>) valorBuscar).compareTo((Integer) info[i]) < 0) { // valorBuscar < info[i]
                break;
            }
        }
        return -1;
    }
}