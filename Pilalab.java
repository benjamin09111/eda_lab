package pilalab;

class Song{
    private String name;
    private int popularidad;
    private int bailabilidad;
    private String artista;

    public Song(String n, String a, int pp, int bb){
      name = n;
      artista = a; 
      popularidad = pp;
      bailabilidad = bb;
}

    public String getName(){ 
        return name;
    }

    public int getPopularidad(){ 
        return popularidad;
    }

    public int getBailabilidad(){ 
        return bailabilidad;
    }
    
    public String getArtista(){ 
        return artista;
    }

    public int compareTo(Song s){

    if(popularidad<s.getPopularidad()){
        return 1;
    }else{
        
       if(popularidad>s.getPopularidad()){
           return -1;
        }else{
            return 0;
            }
        }
    }

class Node{
    private Song s;
    private Node next;
    
    public Node(){
        this.s = null;
        this.next = null;
    }
    
    public Node(Song s){
        this.s = s;
    }
    
    public Node(Song s, Node next) {
        this.s = s;
        this.next = next;   
    }
}

public class Pilalab {
    public static void main(String[] args) {
        
    }
    
}
