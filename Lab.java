import java.util.*;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        
        Queue likes = new Queue<String>();
        
        actions();
        
        while(opcion != 0) {
            
            switch(opcion){
                case 0: // salir
                    break;

                case 1: // sgte canción
                    playlist.next();
                    break;

                case 2: // skip N
                    int N = getN();

                    skipN(N);
                    break;

                case 3: // like (queue)                    
                    String likedSong = playlist.top();
                    
                    likes.add(likedSong);
                    break;

                case 4: // historial
                    
                    while(!likes.empty()){
                        System.out.println(likes.top());
                    }
                    break;
            }
        }
            
        
    }
    
    private static void actions(){
        System.out.println("0.- Salir del menu");
        System.out.println("1.- Siguiente canción");
        System.out.println("2.- Saltar N canciones");
        System.out.println("3.- Dar like");
        System.out.println("4.- Historial de likes");
    }
    
    private static int getN(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántas canciones desea saltar?: ");
        int N = sc.nextInt();
        
        return N;
    }
}

