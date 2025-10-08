public class TestesListaEncadeada {
    public TestesListaEncadeada() {
        // @Teste1:
        ListaEncadeada l = new ListaEncadeada<>();
        System.out.println(l.estaVazia());

        // @Teste2:
        ListaEncadeada l2 = new ListaEncadeada<>();
        l2.inserir(5);
        System.out.println(l2.estaVazia());

        // @Teste3:
        ListaEncadeada l3 = new ListaEncadeada<>();
        l3.inserir(5);
        System.out.println(l3.getPrimeiro() + ", " + l3.obterNo(5));

        // @Teste4:
        ListaEncadeada l4 = new ListaEncadeada<>();
        l4.inserir(5);
        l4.inserir(10);
        l4.inserir(15);
        System.out.println(l4.obterComprimento() + ", " + l4.toString());

        // @Teste5:
        ListaEncadeada l5 = new ListaEncadeada<>();
        l5.inserir(5);
        l5.inserir(10);
        l5.inserir(15);
        l5.inserir(20);
        System.out.println(l5.buscar(5));

        // @Teste6:
        ListaEncadeada l6 = new ListaEncadeada<>();
        l6.inserir(5);
        l6.inserir(10);
        l6.inserir(15);
        System.out.println(l6.buscar(15));

        // @Teste7:
        ListaEncadeada l7 = new ListaEncadeada<>();
        l7.inserir(5);
        l7.inserir(10);
        l7.inserir(15);
        l7.inserir(20);
        System.out.println(l7.buscar(50));

        // @Teste8:
        ListaEncadeada l8 = new ListaEncadeada<>();
        l8.inserir(5);
        l8.inserir(10);
        l8.inserir(15);
        l8.inserir(20);
        l8.retirar(20);
        System.out.println(l8.toString());

        // Teste9:
        ListaEncadeada l9 = new ListaEncadeada<>();
        l9.inserir(5);
        l9.inserir(10);
        l9.inserir(15);
        l9.inserir(20);
        l9.retirar(15);
        System.out.println(l9.toString());

        // @Teste10:
        ListaEncadeada l10 = new ListaEncadeada<>();
        l10.inserir(5);
        l10.inserir(10);
        l10.inserir(15);
        l10.inserir(20);
        System.out.println(l10.obterNo(0));

        // @Teste11:
        ListaEncadeada l11 = new ListaEncadeada<>();
        l11.inserir(5);
        l11.inserir(10);
        l11.inserir(15);
        l11.inserir(20);
        System.out.println(l11.obterNo(3));

        // @Teste12:
        ListaEncadeada l12 = new ListaEncadeada<>();
        l12.inserir(5);
        l12.inserir(10);
        l12.inserir(15);
        l12.inserir(20);
        System.out.println(l12.obterNo(10));

        // @Teste13:
        ListaEncadeada l13 = new ListaEncadeada<>();
        System.out.println(l13.obterComprimento());

        // @Teste14:
        ListaEncadeada l14 = new ListaEncadeada<>();
        l14.inserir(5);
        l14.inserir(10);
        l14.inserir(15);
        l14.inserir(20);
        System.out.println(l14.obterComprimento());
    }
    public static void main(String[] args) {
        new TestesListaEncadeada();
    }
}
