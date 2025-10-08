public class TestesArvoreBinaria {

    private ArvoreBinaria<Integer> a;

    public TestesArvoreBinaria() {
        // @Teste1:
        a = new ArvoreBinaria<>();
        System.out.println(a.estaVazia());

        // @Teste2: 
        a = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> no = new NoArvoreBinaria<Integer>(5);
        a.setRaiz(no);
        System.out.println(a.estaVazia());

        // @Teste3: 
        a = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
        no2.setDireita(no4);
        no3.setEsquerda(no5);
        no3.setDireita(no6);
        no1.setEsquerda(no2);
        no1.setDireita(no3);
        a.setRaiz(no1);
        System.out.println(a.toString());
        
        // @Teste4: 
        System.out.println(a.pertence(1));

        // @Teste5:
        System.out.println(a.pertence(3));

        // @Teste6:
        System.out.println(a.pertence(6));

        // @Teste7:
        System.out.println(a.pertence(10));

        // @Teste8:
        System.out.println(a.contarNos());
    }
    public static void main(String[] args) {
        new TestesArvoreBinaria();
    }
}
