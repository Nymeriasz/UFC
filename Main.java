package UFC;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[5];

        l[0] = new Lutador("Pâmella", "Brasileira", 20, 1.50f, 50.5f, 1, 6, 3);
        l[1] = new Lutador("Maria", "Brasileira", 20, 1.50f, 50.5f, 6, 1, 3);
        l[2] = new Lutador("Pâmella", "Brasileira", 20, 1.50f, 50.5f, 1, 6, 3);
        l[3] = new Lutador("Maria", "Brasileira", 20, 1.50f, 50.5f, 6, 1, 3);
        l[4] = new Lutador("Pâmella", "Brasileira", 20, 1.50f, 50.5f, 1, 6, 3);
       
        //l[0].status();
        //l[1].apresentar();
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();


    }
   
}
