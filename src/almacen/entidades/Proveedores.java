/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen.entidades;

/**
 *
 * @author Aldana
 */
public class Proveedores {
    
    private Long telefono;
    private Long nit;
    private String direccion;
    private Double cantidad;
    private Producto producto;
    private String nombre;

    public Proveedores() {
    }

    public Proveedores(Long telefono, Long nit, String direccion, Double cantidad, Producto producto, String nombre) {
        this.telefono = telefono;
        this.nit = nit;
        this.direccion = direccion;
        this.cantidad = cantidad;
        this.producto = producto;
        this.nombre = nombre;
    }

    
    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "telefono=" + telefono + ", nit=" + nit + ", direccion=" + direccion + ", cantidad=" + cantidad + ", producto=" + producto + ", nombre=" + nombre + '}';
    }
    
    
}
