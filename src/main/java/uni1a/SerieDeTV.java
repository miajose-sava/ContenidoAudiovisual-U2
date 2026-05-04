/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	private ArrayList<Temporada> listaTemporadas;

	public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
	    super(titulo, duracionEnMinutos, genero);
	    this.listaTemporadas = new ArrayList<>(); // Inicializamos la lista vacía
	}

    public void agregarTemporada(Temporada temporada) {
        this.listaTemporadas.add(temporada);
    }

    public ArrayList<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    public void setListaTemporadas(ArrayList<Temporada> listaTemporadas) {
        this.listaTemporadas = listaTemporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Cantidad de temporadas: " + listaTemporadas.size());
        System.out.println();
    }
}