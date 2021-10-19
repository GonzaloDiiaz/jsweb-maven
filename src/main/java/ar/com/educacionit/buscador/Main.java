package ar.com.educacionit.buscador;

public class Main {
    public static void main(String[] args) {

        String claveBuscadaEnLaPantalla = "Harry Potter";

        Buscador buscador = new Buscador(claveBuscadaEnLaPantalla);

        Articulo[] resultados = buscador.buscar();
        System.out.println("Mostrando...");

        for (Articulo articulo : resultados) {
            System.out.println(articulo.getAutor());
            System.out.println(articulo.getTitulo());
            System.out.println(articulo.getPrecio());
        }
    }
}
