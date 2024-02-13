/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopessoa;

/**
 *
 * @author User
 */
public class ProjetoPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //P1 da erro porque e uma classe abstract entao nao pode criar um objeto
      //  Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
//        Professor p3 = new Professor();
//        Funcionario p4 = new Funcionario();
//       // p1.setNome("Fernando");
//        p2.setNome("Fredson");
//        System.out.println(p2.toString());
//         Visitante v = new Visitante();
//         v.setNome("Andre");
//         v.setIdade(18);
//         v.setSexo('M');
//         System.out.println(v.toString());
          Bolsista b = new Bolsista();
          
          b.setMatricula(123);
          b.setNome("fernando");
          b.setSexo('m');
          b.setBolsa(12.5f);
          b.PagarMensalidade();
          p2.PagarMensalidade();
          Tecnico t = new Tecnico();
          t.praticar();
    }
    
}
