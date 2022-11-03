public class Jogo{

    public static void main (String... args) throws Exception {

        Personagem p = new Personagem(5, 5, 5);
        p.nome = "John";
        
        //for, while,do/while, recursão
         while (true){
        p.cacar();
        p.comer();
        p.dormir();
        p.cacar();
        p.cacar();
        p.cacar();
        System.out.printf("============================");
        Thread.sleep(5000);
    }
      
    }
}