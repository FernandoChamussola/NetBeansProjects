package aula.pkg09.pratica;
public class Aula09Pratica {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livros[] l = new Livros[3];
        
        p[0] = new Pessoa("Fernando",18,'M');
        p[1] = new Pessoa("Lila",18,'F');
        p[2] = new Pessoa("Alga",22,'F');
        
        l[0] = new Livros("Programacao","curso em vidio",30,p[0]);
        l[1] = new Livros("Programacao","curso em vidio",30,p[1]);
        l[2] = new Livros("Programacao","curso em vidio",30,p[2]);
        l[0].abrir();
        l[0].folhar(18);
        l[0].avancarPag();
        l[0].voltarPag();
        
        System.out.println(l[0].detalhes()); 
        System.out.println(l[1].detalhes());
        
    }
    
}
