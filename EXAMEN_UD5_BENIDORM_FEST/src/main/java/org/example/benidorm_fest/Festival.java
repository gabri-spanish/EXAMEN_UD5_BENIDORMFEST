package org.example.benidorm_fest;

import java.util.ArrayList;
import java.util.Scanner;

public class Festival {

    static Scanner teclado = new Scanner(System.in);
    private int edicion = 0;
    private ArrayList<Cancion> listaCanciones;

    public Festival (){
        listaCanciones = new ArrayList<Cancion>();
    }

    public Festival (int edicion){
        this.edicion=edicion;
        listaCanciones = new ArrayList<Cancion>();
    }

    public void inscribirCancion (Cancion cancion){
        listaCanciones.add(cancion);

    }

    public int VotosTotales(){

        int votos = 0;

        System.out.println("El festival ha tenido el siguiente total de votos");
        for (Cancion cancion :  listaCanciones){
            votos += cancion.getVotos();
        }

        return votos;
    }

    public Cancion cancionTOP(){

        Cancion top = listaCanciones.get(0);

        for (Cancion cancion : listaCanciones){
            if (cancion.getVotos()>top.getVotos()){
                top = cancion;
            }
        }

        return top;

    }

    public void verRanking(){

        System.out.println("\n Ranking de canciones");

        for (Cancion cancion : listaCanciones){
            if (cancion.getVotos()==0){
                teclado.nextLine();
            } else {
                System.out.println("1. " + cancion.getTitulo() + " con " + cancion.getVotos() + " votos");
            }
        }

    }

    public void verCanciones(){

        System.out.println("Canciones en el festival");

        for (Cancion cancion : listaCanciones){
            System.out.println("- " + cancion.getTitulo());
        }


    }



    public void inscribirArtista(String nombre){

        System.out.println("Quién es el artista que interpreta " + nombre);

    }

    public Cancion CancionMasLarga (){

        Cancion larga = listaCanciones.get(0);

        for (Cancion cancion : listaCanciones){
            if (cancion.getDuracion() > larga.getDuracion()){
                larga = cancion;
            }
        }
        return larga;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setPais(int edicion) {
        this.edicion = edicion;
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    @Override
    public String toString() {
        return "Festival{" +
                "edicion='" + edicion + '\'' +
                ", listaCanciones=" + listaCanciones +
                '}';
    }

}
