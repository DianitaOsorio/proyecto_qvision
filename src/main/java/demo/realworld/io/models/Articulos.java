package demo.realworld.io.models;

public class Articulos {

    private String articulo;
    private String clase;
    private String descripcion;
    private String etiqueta;

    public Articulos(String articulo, String clase, String descripcion, String etiqueta) {
        this.articulo = articulo;
        this.clase = clase;
        this.descripcion = descripcion;
        this.etiqueta = etiqueta;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
}
