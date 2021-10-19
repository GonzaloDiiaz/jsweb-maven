package ar.com.educacionit.buscador;

public class Articulo {

    protected String titulo;
    protected Float precio;
    protected String autor;

    public Articulo(){
        this.autor = "ROWLING, J. K.";
        this.precio = 2500f;
        this.titulo = "Harry Potter";
    }

    public Articulo(String titulo, Float precio, String autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
