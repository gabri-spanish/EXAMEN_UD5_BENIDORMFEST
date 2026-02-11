package org.example.benidorm_fest;

public class benidormfestApp {
    public static void main(String[] args) {

        Festival benidorm2026 = new Festival(2026);

        Cancion bailandote = new Cancion("Bailandote", 300);
        Cancion turista = new Cancion("Turista", 245);
        Cancion dopamina = new Cancion("Dopamina", 444);

        benidorm2026.inscribirCancion(bailandote);
        benidorm2026.inscribirCancion(turista);
        benidorm2026.inscribirCancion(dopamina);

        benidorm2026.verCanciones();

        bailandote.setVotos(112);
        turista.setVotos(67);
        dopamina.setVotos(0);

        System.out.println("\n Ha habido un total de " + benidorm2026.VotosTotales());

        benidorm2026.verRanking();

        System.out.println("\n La canción que más votos ha recibido en el fesitval es " + benidorm2026.cancionTOP().getTitulo());

        System.out.println("\n La canción más larga del festivar es " + benidorm2026.CancionMasLarga().getTitulo());

    }
}
