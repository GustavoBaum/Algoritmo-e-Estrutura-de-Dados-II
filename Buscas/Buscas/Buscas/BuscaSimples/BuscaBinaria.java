public class BuscaBinaria<T extends Comparable<T>> extends BuscaAbstract {

    @SuppressWarnings("unchecked")
    public int buscarBinaria(T info[], Comparable<T> valorBuscar) {

        int n = info.length;
        int inicio = 0;
        int fim = n - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            /*if (((Comparable<Integer>) valorBuscar).compareTo((Integer) info[meio]) < 0) { // valorBuscar < info[meio]
                fim = meio - 1;
            } else {
                if (((Comparable<Integer>) valorBuscar).compareTo((Integer) info[meio]) > 0) { // valorBuscar > info[meio]
                    inicio = meio + 1;
                } else {
                    return meio;
                }
            }*/

            int comparacao = valorBuscar.compareTo((T) getInfo()[meio]);
            if (comparacao < 0) { //  se (valorBuscar < info[meio])
                fim = meio -1;
            } else {
                if (comparacao > 0) { // se (valorBuscar > info[meio])
                    inicio = meio + 1;
                } else {
                    return meio;
                }
            }
        }
        return -1;
    }
}