package ar.com.educacionit.buscador;

public class Buscador {

    private String clave;

    public Buscador(String clave) {
        this.clave = clave;
    }

    public Articulo[] buscar(){

        System.out.println("Buscando " + this.clave);
        Libro l = new Libro();
        Musica m = new Musica();
        Pelicula p = new Pelicula();

        Articulo[] articulos = {l,m,p};
        System.out.println("Se encontraron " + articulos.length + " resultados");

        return articulos;
    }
}
