public class TestesListaEstatica {
    public TestesListaEstatica() {
        //Teste1:
        ListaEstatica<Integer> l = new ListaEstatica<>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        l.inverter();
        System.out.println(l.toString());

        //Teste2:
        ListaEstatica<Integer> a = new ListaEstatica<>();
        a.inserir(5);
        a.inserir(10);
        a.inserir(15);
        a.inserir(20);
        a.inserir(25);
        a.inverter();
        System.out.println(a.toString());
    }
    public static void main(String[] args) {
        new TestesListaEstatica();
    }
}
