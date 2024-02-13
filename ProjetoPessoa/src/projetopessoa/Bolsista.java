/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoa;

/**
 *
 * @author User
 */
public class Bolsista extends Aluno{
    private float Bolsa;
    
    public void renovarBolasa(){
        System.out.println("Renovando Bolsa de "+this.nome);
    }
    @Override
    public void PagarMensalidade(){ //da erro prq o pagar do aluno e final
        System.out.println(this.nome + "e Bolsista");
    }

    public float getBolsa() {
        return Bolsa;
    }

    public void setBolsa(float Bolsa) {
        this.Bolsa = Bolsa;
    }
    
    
}
