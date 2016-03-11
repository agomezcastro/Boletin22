package boletin22;

/**
 *
 * @author agomezcastro
 */
public class Libro {
    private String nome, autor;
    private float precio;
    private int unidades;

    public Libro() {
    }

    public Libro(String nome, String autor, float precio, int unidades) {
        this.nome = nome;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }
    
    
}
