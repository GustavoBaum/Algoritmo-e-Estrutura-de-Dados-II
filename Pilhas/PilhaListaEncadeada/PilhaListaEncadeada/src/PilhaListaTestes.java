import static org.junit.Assert.assertEquals;

public class PilhaListaTestes {

    private PilhaLista<Integer> p;

    public PilhaListaTestes() {
        p = new PilhaLista();

        // @Teste1:
        assertEquals(p.estaVazia(), true);

        // @Teste2:
        p.push(10);
        assertEquals(p.estaVazia(), false);

        // @Teste3:
        p.push(10);
        p.push(20);
        p.push(30);
        assertEquals(p.pop(), 30);
        assertEquals(p.pop(), 20);
        assertEquals(p.pop(), 10);
        assertEquals(p.estaVazia(), true);

        // @Teste4:
        p.push(10);
        p.push(20);
        p.push(30);
        assertEquals(p.peek(), 30);
        assertEquals(p.pop(), 30);

        // @Teste5:
        p.push(10);
        p.push(20);
        p.push(30);
        p.liberar();
        assertEquals(p.estaVazia(), true);
    }
}
