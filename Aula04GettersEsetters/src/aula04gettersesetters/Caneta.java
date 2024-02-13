/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04gettersesetters;

/**
 *
 * @author User
 */
public class Caneta {
   public  String modelo;
   private float ponta;
   public boolean tampada;
   //CRIANDO UM METODO CONTRUTOR 
//   public Caneta(){ 
//      this.tampar();
//   }
//   public void tampar (){
//        this.tampada = true;
//   }
//   public void destampar(){
//        this.tampada = false;
//   }
//   
//   public String getModelo(){
//       return this.modelo;
//   }
//   public void setModelo(String m){
//       this.modelo = m;
//   }
//   public double getPonta(){
//       return this.ponta;
//   }
//   public void setPonta(float p){
//      this.ponta = p;
//   }
//   public void status(){
//       System.out.println("Modelo: " + this.modelo);
//       System.out.println("Ponta: " + this.ponta);
//       System.out.println("tampada? " + this.tampada);
//   } AGORA VOU CRIAR TUDO ISSO USANDO ALT + INSERT

//    public Caneta(String modelo, float ponta, boolean tampada) {
//        this.modelo = modelo;
//        this.ponta = ponta;
//        this.tampada = tampada;
//    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
   
   
    
}
