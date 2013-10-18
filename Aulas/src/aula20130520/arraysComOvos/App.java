package aula20130520.arraysComOvos;

public class App {
    
    public static void main(String[] args) {
        
        //Ovo[] caixaComSeis = { new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo() };
        //Ovo[] caixaComDoze = { new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo(), new Ovo() };
        
        Ovo[] caixaComSeis = criarCaixaDeOvos(6);
        Ovo[] caixaComDoze = criarCaixaDeOvos(12);
        
        quebrarOsOvos(caixaComDoze);
        quebrarOsOvos(caixaComSeis);
        
    }

    private static void quebrarOsOvos(Ovo[] caixaComOvos) {
        for (Ovo o : caixaComOvos) {
            System.out.println(o.toString());
            o.quebrar();
            System.out.println(o.toString());
        }
        
    }

    private static Ovo[] criarCaixaDeOvos(int quantos) {
        Ovo[] novaCaixa = new Ovo[quantos];
        for (int i = 0; i < quantos; i++) {
            novaCaixa[i] = new Ovo();
        }
        return novaCaixa;
    }
    
}
