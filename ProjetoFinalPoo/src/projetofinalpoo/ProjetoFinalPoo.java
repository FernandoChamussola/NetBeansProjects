package projetofinalpoo;
public class ProjetoFinalPoo {
    public static void main(String[] args) {
        Vidio v[] = new Vidio[5];
        v[0]=new Vidio("Curso em vidio");
        v[1]=new Vidio("ultimas aulas");
        v[2]=new Vidio("ultimas aulas de poo com java");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("fernano",18,'M',"FE");
        g[1] = new Gafanhoto("fredson",10,'M',"fre");
        
       // System.out.println(g[0].toString());
        
       // v[0].like();
        
       // System.out.println(v[0].toString());
       Vizualizacao v1 = new Vizualizacao(g[0],v[0]);
       v1.avaliar();
       
       
        System.out.println(v1.toString());
    }
    
}
