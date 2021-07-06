
package almacen.entidades;



public class Ventas {
    private Producto producto;
    private int precio;
    private int cantidad;

    public Ventas() {
    }

    public Ventas(Producto producto, int precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto getProfucto() {
        return producto;
    }

    public void setProfucto(Producto profucto) {
        this.producto = profucto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCaantidad() {
        return cantidad;
    }

    public void setCaantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ventas{" + "profucto=" + producto + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
}
