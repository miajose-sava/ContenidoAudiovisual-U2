package uni1a;
import java.util.ArrayList;

public class Podcast extends ContenidoAudiovisual {
    private String plataforma;
    // Composición: El podcast tiene temporadas
    private ArrayList<Temporada> temporadas;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String plataforma) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Género: " + getGenero());
        System.out.println("Total de temporadas: " + temporadas.size());
        
        for (Temporada t : temporadas) {
            System.out.println("- Temp " + t.getNumTemporada() + ": " + t.getNumEpisodios() + " episodios.");
        }
        System.out.println();
    }
}