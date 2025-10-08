public class TestesListaDupla {
    
    public TestesListaDupla() {

        //@Teste1:
        ListaDupla<Integer> l = new ListaDupla<>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        System.out.println(l.toString());
    }
}
