package projetoanimal;
public class ProjetoAnimal {
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        m.setPeso(18.5f);
        m.setCorPelo("branco");
        Reptil r = new Reptil();
        r.setPeso(12.5f);
        r.locomover();
        m.locomover();
    }
    
}
