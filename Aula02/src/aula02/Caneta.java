
package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;  //estes sao os atributos.
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("uma ponta " + this.ponta);
        System.out.println("uma caneta com carga de " + this.carga);
        System.out.println("esta tampadaa? " + this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro!");
        }else{
            System.out.println("estou rabiscando");
        }
            
    }
    void tampar(){
        this.tampada = true;
        
    }
     
    void destampar(){
        this.tampada = false;
        
    }
}
