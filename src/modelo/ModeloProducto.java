
package modelo;

import java.sql.Blob;

/**
 *
 * @author dave_
 */
public class ModeloProducto {
    
    private int id_producto;
    private String nombre_producto;
    private String numeroserie_producto;
    private double precio_producto;
    private int cantidad_producto;
    private int estado_producto;
    private int categoria_producto;
    private Blob foto_producto;
    private double preciocompra_producto;

    //Constructor de la clase
    public ModeloProducto() {
    }

    public ModeloProducto(int id_producto, String nombre_producto, String numeroserie_producto, double precio_producto, int cantidad_producto, int estado_producto, int categoria_producto, Blob foto_producto, double preciocompra_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.numeroserie_producto = numeroserie_producto;
        this.precio_producto = precio_producto;
        this.cantidad_producto = cantidad_producto;
        this.estado_producto = estado_producto;
        this.categoria_producto = categoria_producto;
        this.foto_producto = foto_producto;
        this.preciocompra_producto = preciocompra_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getNumeroserie_producto() {
        return numeroserie_producto;
    }

    public void setNumeroserie_producto(String numeroserie_producto) {
        this.numeroserie_producto = numeroserie_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public int getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(int estado_producto) {
        this.estado_producto = estado_producto;
    }

    public int getCategoria_producto() {
        return categoria_producto;
    }

    public void setCategoria_producto(int categoria_producto) {
        this.categoria_producto = categoria_producto;
    }

    public Blob getFoto_producto() {
        return foto_producto;
    }

    public void setFoto_producto(Blob foto_producto) {
        this.foto_producto = foto_producto;
    }

    public double getPreciocompra_producto() {
        return preciocompra_producto;
    }

    public void setPreciocompra_producto(double preciocompra_producto) {
        this.preciocompra_producto = preciocompra_producto;
    }

}
