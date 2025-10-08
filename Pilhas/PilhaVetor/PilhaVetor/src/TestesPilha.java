import static org.junit.Assert.assertEquals;

public class PilhaVetorException {

    FilaVetor<Integer> a;

    public TestesFilaVetor() {
        // @Teste1:
        a = new FilaVetor<>(5);
        assertEquals(a.estaVazia(), true);

        // @Teste2:
        a = new FilaVetor<>(5);
        a.inserir(10);
        assertEquals(a.estaVazia(), false);

        // @Teste3:
        a = new FilaVetor<>(10);
        a.inserir(10);
        a.inserir(20);
        a.inserir(30);
        assertEquals(a.retirar(), 10);
        assertEquals(a.retirar(), 20);
        assertEquals(a.retirar(), 30);
        assertEquals(a.estaVazia(), true);

        // @Teste4:
        a = new FilaVetor<>(3);
        a.inserir(10);
        a.inserir(20);
        a.inserir(30);
        assertThrows(FilaCheiaException.class, () -> {
            a.inserir(40);
        });

        // @Teste5:
        a = new FilaVetor<>(10);
        assertThrows(FilaVaziaException.class, () -> {
            a.estaVazia();
        });

        // @Teste6:
        a = new FilaVetor<>(5);
        a.inserir(10);
        a.inserir(20);
        a.inserir(30);
        assertEquals(a.peek(), 10);
        assertEquals(a.retirar(), 10);

        // @Teste7:
        a = new FilaVetor<>(5);
        a.inserir(10);
        a.inserir(20);
        a.inserir(30);
        a.liberar();
        assertEquals(a.estaVazia(), true);

        // @Teste8:
        a = new FilaVetor<>(5);
        a.inserir(10);
        a.inserir(20);
        a.inserir(30);

        FilaVetor<Integer> b = new FilaVetor<>(3);
        b.inserir(40);
        b.inserir(50);

        assertEquals(a.toString(), "10, 20, 30");
        assertEquals(b.toString(), "40, 50");
        assertEquals(a.criarFilaConcatenada(b), "10, 20, 30, 40, 50");
        assertEquals(a.getLimite(), 8);
    }
}
