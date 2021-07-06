
package almacenEntidades;

import almacen.entidades.Producto;

public class Ventas {
    private Producto profucto;
    private int precio;
    private int caantidad;

    public Ventas() {
    }

    public Ventas(Producto profucto, int precio, int caantidad) {
        this.profucto = profucto;
        this.precio = precio;
        this.caantidad = caantidad;
    }

    public Producto getProfucto() {
        return profucto;
    }

    public void setProfucto(Producto profucto) {
        this.profucto = profucto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCaantidad() {
        return caantidad;
    }

    public void setCaantidad(int caantidad) {
        this.caantidad = caantidad;
    }

    @Override
    public String toString() {
        return "Ventas{" + "profucto=" + profucto + ", precio=" + precio + ", caantidad=" + caantidad + '}';
    }
    
    
}
