public class TestesListaEstatica {
    public TestesListaEstatica() {

        //Teste1
        ListaEstatica lista1 = new ListaEstatica();
        lista1.inserir(5);
        lista1.inserir(10);
        lista1.inserir(15);
        lista1.inserir(20);
        System.out.println("Teste1 : " + lista1.toString());

        //Teste2
        ListaEstatica lista2 = new ListaEstatica();
        lista2.inserir(5);
        lista2.inserir(10);
        lista2.inserir(15);
        lista2.inserir(20);
        System.out.println("Teste2 : " + lista2.getTamanho());

        //Teste3
        ListaEstatica lista3 = new ListaEstatica();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        System.out.println("Teste3 : " + lista3.buscar(15));

        //Teste4
        ListaEstatica lista4 = new ListaEstatica();
        lista4.inserir(5);
        lista4.inserir(10);
        lista4.inserir(15);
        lista4.inserir(20);
        System.out.println("Teste4 : " + lista4.buscar(30));

        //Teste5
        ListaEstatica lista5 = new ListaEstatica();
        lista5.inserir(5);
        lista5.inserir(10);
        lista5.inserir(15);
        lista5.inserir(20);
        lista5.retirar(10);
        System.out.println("Teste5 : " + lista5.toString() + ",\n " + lista5.getTamanho());

        //Teste6
        ListaEstatica lista6 = new ListaEstatica();
        lista6.inserir(1);
        lista6.inserir(2);
        lista6.inserir(3);
        lista6.inserir(4);
        lista6.inserir(5);
        lista6.inserir(6);
        lista6.inserir(7);
        lista6.inserir(8);
        lista6.inserir(9);
        lista6.inserir(10);
        lista6.inserir(11);
        lista6.inserir(12);
        lista6.inserir(13);
        lista6.inserir(14);
        lista6.inserir(15);
        System.out.println("Teste6 : " + lista6.toString() + "\n" + lista6.getTamanho());

        //Teste7
        ListaEstatica lista7 = new ListaEstatica();
        lista7.inserir(5);
        lista7.inserir(10);
        lista7.inserir(15);
        lista7.inserir(20);
        System.out.println("Teste7 : " + lista7.obterElemento(3));

        //Teste8
        ListaEstatica lista8 = new ListaEstatica();
        lista8.inserir(5);
        lista8.inserir(10);
        lista8.inserir(15);
        lista8.inserir(20);
        System.out.println("Teste8 : " + lista8.obterElemento(5));

        //Teste9
        ListaEstatica lista9 = new ListaEstatica();
        lista9.inserir(5);
        lista9.inserir(10);
        lista9.inserir(15);
        lista9.inserir(20);
        lista9.liberar();
        System.out.println("Teste9 : " + lista9.estaVazia());
    }
    public static void main(String[] args) {
        new TestesListaEstatica();
    }
}
