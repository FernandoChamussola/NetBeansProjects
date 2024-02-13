/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author User
 */
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public Conta(boolean status) {
        this.status = false;
    }
    
    public void abrirConta(){
        if(this.tipo=="cc"){
       this.status = true;
       this.saldo += 50;
      }else if(this.tipo=="cp"){
          this.saldo += 150;
          this.status = true;
      }
    }
    public void fecharConta(){
        if(saldo==0){
        this.status = false;
        }else{
            System.out.println("Erro! tens saldo na conta retire antes de fechar");
        }
    }
    public void depositar(int n){
        if(this.status==true){
        this.saldo += n;
        }else{
            System.out.println("conta fechada");
        }
    }
   public void sacar(int a){
       if(saldo>a){
       this.saldo -= a;
           System.out.println("levantaste " + a + " e o teu saldo actual e " + saldo+".");
       }else if(saldo<a){
           System.out.println("Erro! tentaste levantar " + a + " sendo que o seu saldo e " + saldo+".");
       }
   }
   public void mes(){
       
       if(this.status == true){
           if(this.tipo == "cc"){
           saldo -= 12;
           }else if(this.tipo == "cp"){
               saldo -= 20;
           }
       }
   }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
   
   public void s(){
       System.out.println(saldo);
   }
    
    
    
}
