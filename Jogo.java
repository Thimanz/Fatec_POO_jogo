public class Jogo{
    public static void main(String [] args) throws Exception{
        Personagem player1 = new Personagem("Jhon", 5, 5, 5);
    
        while (true){
            player1.cacar();
            player1.comer();
            player1.dormir();
            player1.cacar();
            player1.cacar();
            player1.cacar();
            System.out.println("==================================================================================");
            Thread.sleep(5000);
        }

    }
}