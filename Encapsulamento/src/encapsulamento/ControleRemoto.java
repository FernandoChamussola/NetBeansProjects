package encapsulamento;
public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
//construtor    
    public ControleRemoto() {
        this.volume = 50;
        this.tocando = false;
        this.ligado = false;
    }
//metodos especiais    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //sobreescrevendo os metodos abstratos da interface
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---Menu---");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 1; i <=this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && this.getTocando() == false){
            this.tocando = true;
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando() == true){
            this.tocando = false;
        }
    }

    
    
}
