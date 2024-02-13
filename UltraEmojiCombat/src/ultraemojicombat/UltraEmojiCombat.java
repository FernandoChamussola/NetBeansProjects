package ultraemojicombat;
public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Fernando","moz",1.75f,81.9f,12,2,1,18);
//        l[0].ganhar();
//        l[0].empatar();
//        l[0].perder();
//        l[0].status();
//        l[0].apresentar();
       l[1] = new Lutador("Fredson","moz",1.45f,70.8f,12,2,1,10);
       //criar um objeto da classe luta
       Luta UEC1 = new Luta();
       UEC1.marcarLuta(l[0], l[1]);
       UEC1.lutar();
     
     
    }
    
    
}
