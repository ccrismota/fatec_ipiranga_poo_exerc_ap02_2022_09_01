public class Personagem {
   
    String nome = "Visitante";
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    //Sobrecarga de construtores (Overload)
    public Personagem(String nome, int energia, int fome, int sono){
        this(energia, fome, sono);
        this.nome = nome;
    }

    public Personagem(int energia, int fome, int sono){
        if(energia >= 0 && energia <=10)
            this.energia = energia;
        if(fome >= 0 && fome <= 10)
            this.fome = fome;
        if(sono >= 0 && sono <= 10)
            this.sono = sono;
    }

    public void cacar(){
        if(this.energia >= 2){
            System.out.printf("%s Cacando ...", nome);
            this.energia -= 2;
        }else{
            System.out.printf("%s sem energia para cacar ...\n", nome);
        }

        this.fome = Math.min(fome + 1, 10);
        this.sono = Math.min(sono + 1, 10);
        
    }

    public void comer(){
        if(this.fome >= 1){
            System.out.printf("%s Comendo ...", nome);
            this.energia = Math.min(energia + 1, 10);
            this.fome -= 1;
        }else{
            System.out.printf("%s sem fome..\n", nome);
        }
    }

        public void dormir(){
            if(this.sono >= 1){
            System.out.printf("%s Dormindo ...", nome);
            this.sono--;
            this.energia = energia + 1 <= 10  ? energia + 1 : 10;
        }else{
            System.out.printf("%s sem sono ...", nome);
        }
    }

}