package projetoanimal;
public abstract  class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    protected abstract void locomover();
    protected abstract void alimentar(); //Podiam tambem ser publicos
    protected abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
