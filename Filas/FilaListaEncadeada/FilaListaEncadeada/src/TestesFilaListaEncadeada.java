import static org.junit.Assert.assertEquals;

public class TestesFilaListaEncadeada {
    
    FilaLista a;

    public TestesFilaListaEncadeada() {
        // @Teste1:
        a = new FilaLista<>();
        assertEquals(a.estaVazia(), true);

        // @Teste2: 
        a = new FilaLista<>();
        a.inserir(10);
        assertEquals(a.estaVazia(), false);

        // @Teste3:
        a = new FilaLista<>();
        a.inserir(10);
        a.inserir(20);
        a.inserir(30);
        assertEquals(a.retirar(), 10);
        assertEquals(a.retirar(), 20);
        assertEquals(a.retirar(), 30);
        assertEquals(a.estaVazia(), true);

        // @Teste4:
        a = new FilaLista<>();
        a.inserir(10);
        a.inserir(20);
        a.inserir(30);
        assertEquals(a.peek(), 10);
        assertEquals(a.retirar(), 10);

        // @Teste5:
        a = new FilaLista<>();
        a.inserir(10);
        a.inserir(20);
        a.inserir(30);
        a.liberar();
        assertEquals(a.estaVazia(), true);
    }
}