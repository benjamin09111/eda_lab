import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Song { // nombre, popularidad, bailabilidad, artista
	private String name;
	private int popularidad;
	private int bailabilidad;
	private String artista;
	
	public Song(String name, String artista, int popularidad, int bailabilidad) {
		this.name = name;
		this.popularidad = popularidad; 
		this.bailabilidad = bailabilidad;
		this.artista = artista;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPopularidad() {
		return this.popularidad;
	}
	
	public int getBailabilidad() {
		return this.bailabilidad;
	}
	
	public String getArtista() {
		return this.artista;
	}
	
	public int compareTo(Song s) {
		if(popularidad > s.getPopularidad()) {
			return 1;
		} else if (popularidad < s.getPopularidad()){
			return -1;
		} else {
			return 0;
		}		
	}
}

class Artist { // numerotracks, popularidad promedio, bailabilidadpromedio,name 
	private int numero_tracks;
	private int popularidad_promedio;
	private int bailabilidad_promedio;
	private String name;
	
	public Artist(int numero_tracks, int popularidad_promedio, int bailabilidad_promedio, String name) {
		this.numero_tracks = numero_tracks;
		this.popularidad_promedio = popularidad_promedio;
		this.bailabilidad_promedio = bailabilidad_promedio;
		this.name = name;
	}
	
	public void mostrar() {
		System.out.println("Nombre artista: " + name);
		System.out.println("Cantidad tracks: " + numero_tracks);
		System.out.println("Popularidad promedio: " + popularidad_promedio);
		System.out.println("Bailabilidad promedio: " + bailabilidad_promedio);
	}
}

class Pila {
	
}

class Playlist {
	public void next() {
		
	}
	
	public void skipN(int N) {
		
	}
}

public class Spotify {
	public static void main(String args[]) {
		String path = "./tracks.csv";

    ArrayList<Song> songs = new ArrayList<>();
    ArrayList<Artist> artists = new ArrayList<>();

    String line = "";

    try {
      BufferedReader bf = new BufferedReader(new FileReader(path));

      while((line = bf.readLine()) != null) {
        int i = 0;
      }

      String[] values = line.split(",(?=(?:[^\"]\"[^\"]\")[^\"]$)", -1);

      String popularity = values[2];
      String danceability = values[8];

      int pp = Integer.parseInt(popularity);
      int bb = Integer.parseInt(danceability);

      songs.add(new Song(values[1], values[5], pp, bb));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

	}
}