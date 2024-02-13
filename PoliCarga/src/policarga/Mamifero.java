/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package policarga;

/**
 *
 * @author User
 */
public class Mamifero extends Cachoro{
    protected String corPelo;
    protected String nome = "fernando";

    @Override
    public void emitirsom() {
        System.out.println("au au ");
    }
    public void reagir(String f){
        if(f == "au au " ||f == "toma comida"){
            System.out.println("abanar calda");
            
        }else{
            System.out.println("rsrsrsrsrs");
        }
        

    }
    public void reagir(int hr , int min){ //apesar de ter mesmo nome eles tem assinatura diferentes
        
    }
    public void reagir(boolean dono){
        
        
    }
    
    
}
