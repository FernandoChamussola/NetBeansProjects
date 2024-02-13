
package aula02;
public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;  //estes sao os atributos.
   protected int carga;
   private boolean tampada;
   public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("uma ponta " + this.ponta);
        System.out.println("uma caneta com carga de " + this.carga);
        System.out.println("esta tampadaa? " + this.tampada);
        System.out.println("uma caneta de modelo " + this.modelo);
    }
    
   protected void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro!");
        }else{
            System.out.println("estou rabiscando");
        }
            
    }
    public void tampar(){
        this.tampada = true;
        
    }
     
    public void destampar(){
        this.tampada = false;
        
    }
}
