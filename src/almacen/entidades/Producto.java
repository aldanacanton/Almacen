package almacen.entidades;

public class Producto {

    long idproducto;
    String nombre;
    Integer precio;
    String proveedor;
    int cantidad;

    public void Asignacion() {
    }

    public Producto() {
    }

    public Producto(long idproducto, String nombre, Integer precio, String proveedor, int cantidad) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
    }

    public long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(long idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", precio=" + precio + ", proveedor=" + proveedor + ", cantidad=" + cantidad + '}';
    }

    
}
