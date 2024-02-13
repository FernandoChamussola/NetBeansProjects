package projetoanimal;
public class Mamifero extends Animal{
    private String corPelo;

    @Override
    protected void locomover() {
        System.out.println("Correndo");
    }

    @Override
    protected void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    protected void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
