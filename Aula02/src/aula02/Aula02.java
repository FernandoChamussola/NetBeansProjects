
package aula02;
public class Aula02 {
    public static void main(String[] args) {
      Caneta c1 = new Caneta();
//      c1.cor = "azul";
//      c1.ponta = 0.5f;
//      c1.destampar();
//      c1.rabiscar();
//      c1.status();
      Caneta c2 = new Caneta();
      c2.modelo = "fernando";
      c2.carga = 100;
      c2.cor = "preta";
      c2.tampada = true;
      c2.destampar();//istos muda o tampar para false
      c2.status();// chama o metodo status como nos colocamos o this no metodo ele vai mostrar o status de c2
        
    }
    
}
