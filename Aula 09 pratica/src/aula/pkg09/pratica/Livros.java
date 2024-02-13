package aula.pkg09.pratica;
public class Livros implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPagina;
    private int paginaActual;
    private boolean aberto;
    private Pessoa leitor;

    
    public String detalhes() {
        return "Livros{" + "titulo=" + titulo + ", autor=" + autor + ", totalPagina=" + totalPagina + ", paginaActual=" + paginaActual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + '}';
    }
    
    

    public Livros(String titulo, String autor, int totalPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPagina = totalPagina;
        this.leitor = leitor;
        this.aberto = false;
        this.paginaActual = 0;
    }
    

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotalPagina() {
        return totalPagina;
    }

    private void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    private int getPagActual() {
        return paginaActual;
    }

    private void setPagActual(int pagActual) {
        this.paginaActual = pagActual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhar(int p) {
        if(p<=30){
        this.paginaActual = p;
        }else{
            System.out.println("pagina inexistente");
        } 
    }

    @Override
    public void avancarPag() {
        paginaActual++;
    }

    @Override
    public void voltarPag() {
        paginaActual--;
    }
    
    
    
}
