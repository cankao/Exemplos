package aula20130520.arrays;

public class App {

    public static void main(String[] args) {
        //iteracaoSobreArrays(args);       
        exemploComLampadas();
    }
    public static void exemploComLampadas() {
        Lampada especial = new Lampada();
        Lampada[] arrayDeLampadas = {new Lampada(), new Lampada(), new Lampada(), especial};
        for (Lampada bulb : arrayDeLampadas) {
            System.out.println("lampada=" + bulb.toString() + " acesa=" + bulb.isAcesa());
            bulb.desligar();
            System.out.println("Agora, acesa=" + bulb.isAcesa());
            
        }
    }

    private static void iteracaoSobreArrays(String[] args) {
        System.out.println("Tamanho do array args ==> " + args.length);
        System.out.println("Elementos do array com laço for");
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " ==> " + args[i]);
        }
        System.out.println("Elementos do array com laço for each");
        for (String s : args) {
            System.out.println(" ==> " + s);
        }
        System.out.println("Elementos do array com laço while");
        int contador = 0;
        while (contador < args.length) {
            System.out.println(contador + " ==> " + args[contador]);
            contador++;
        }
        contador = 0;
        System.out.println("Elementos do array com laço do while");
        do {
            if (args.length ==0) {
                break;
            }
            System.out.println(contador + " ==> " + args[contador]);
            contador++;
        } while (contador < args.length);
    }
}
