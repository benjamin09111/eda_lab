package com.mycompany.labpila;

public class Labpila {
    public static void main(String[] args) {
        
    }
}

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

        if(popularidad < s.getPopularidad()){
            return 1;
        } else {
            if(popularidad > s.getPopularidad()){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
class Node{
    private Song value;
    private Node next;
    
    public Node(){
        this.value = null;
        this.next = null;
    }
    
    public Node(Song s){
        this.value = s;
    }
    
    public Node(Song value, Node next) {
        this.value = value;
        this.next = next;   
    }
    
    public Song getValue() { return this.value; }
    public Node getNext() { return this.next; }
    
    public void setValue(Song value) { this.value = value; }
    public void setNext(Node next) { this.next = next; }
}

class Pilalab {
    private Node head;
    
    public Pilalab() {
        this.head = null;
    }
    
    public void push(Song value) {
        Node n_node = new Node(value);
        this.head  = n_node;
    }
    
    public void pop() {
        if(this.head != null) {
            this.head = this.head.getNext();
        }
    }
    
    public boolean empty() {
        if(this.head == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public Song top() {
        return this.head.getValue();
    }
}
