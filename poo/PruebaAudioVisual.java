package poo;
import java.util.ArrayList;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Sistema de Gestión Audiovisual");

        // Datos que van dentro de los contenidos
        Actor actor1 = new Actor("Sam Worthington");
        Actor actor2 = new Actor("Zendaya");
        Investigador inv = new Investigador("Neil deGrasse Tyson");
        Temporada tempSerie = new Temporada(1, 10);
        Temporada tempPodcast = new Temporada(1, 5);

        // Lista
        ArrayList<ContenidoAudiovisual> lista = new ArrayList<>();

        // Pelicula (relacion de asociacion)
        Pelicula avatar = new Pelicula("Avatar", 162, "Ciencia Ficción", "20th Century Studios");
        avatar.agregarActor(actor1); // Conexión con Actor
        lista.add(avatar);

        // Serie de tv (relacion de composicion)
        // Nota: El constructor ya no pide el número '8' porque usa la lista de temporadas
        SerieDeTV got = new SerieDeTV("Game of Thrones", 60, "Fantasía");
        got.agregarTemporada(tempSerie); // Conexión con Temporada
        lista.add(got);

        // Documental (relacion de agregacion)
        Documental cosmos = new Documental("Cosmos", 45, "Ciencia", "Astronomía");
        cosmos.setInvestigador(inv); // Conexión con Investigador
        lista.add(cosmos);

        // Podcast (relacion de composicion)
        Podcast pod = new Podcast("Se regalan dudas", 20, "Desarrollo Personal", "Spotify");
        pod.agregarTemporada(tempPodcast);
        lista.add(pod);

        // VideoJuego (relacion de asociacion)
        VideoJuego juego = new VideoJuego("Spider-Man", 0, "Aventura", "PS5");
        juego.agregarActorVoz(actor2);
        lista.add(juego);

        // Mostrar detalles
        for (ContenidoAudiovisual contenido : lista) {
            contenido.mostrarDetalles();
            System.out.println("---------------------------------------");
        }
    }
}