package ultraemojicombat;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, float altura, float peso, int vitorias, int derrotas,
            int empates , int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.setCategoria(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.peso = peso;
        this.idade = idade;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float p) {
        if(p < 52.2){
            this.categoria = "invalido";
        }else if (p <= 70.3){
            this.categoria = "leve";
        }else if (p <= 83.9){
            this.categoria = "medio";
        }else if (p <= 120.2){
            this.categoria = "pesado";
        }else{
            this.categoria = "invalido";
        }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void apresentar(){
        System.out.println("---------------------------");
        System.out.println("Chegou a hora1 Apresentamos " + this.getNome());
        System.out.println("Diretamente "+this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e "+this.getAltura()+" de altura");
        System.out.println("pesando: " +this.peso +"kg");
        System.out.println("vitorias: "+this.getVitorias());
        System.out.println("derrotas: "+this.getDerrotas());
        System.out.println("empates: "+this.getEmpates());
        System.out.println("categoria: "+this.categoria);
        
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("vitorias: "+this.getVitorias());
        System.out.println("derrotas: "+this.getDerrotas());
        System.out.println("empates: "+this.getEmpates());
    }
    public void ganhar(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perder(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatar(){
        this.setEmpates(this.getEmpates()+1);
    }
}
