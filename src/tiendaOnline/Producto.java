package tiendaOnline;

/**
 * La clase Producto representa un artículo disponible para la venta en la tienda online.
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    private String descripcion;

    /**
     * Constructor de la clase Producto.
     *
     * @param nombre          El nombre del producto.
     * @param precio          El precio del producto.
     * @param cantidadEnStock La cantidad disponible en stock del producto.
     * @param descripcion     La descripción del producto.
     */
    public Producto(String nombre, double precio, int cantidadEnStock, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.descripcion = descripcion;
    }

    // Getters y Setters para los atributos nombre, precio, cantidadEnStock y descripcion
    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCantidadEnStock() {
        return this.cantidadEnStock;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Aumenta la cantidad de stock del producto.
     *
     * @param cantidad La cantidad a agregar al stock del producto.
     */
    public void agregarStock(int cantidad) {
        this.cantidadEnStock += cantidad;
    }

    /**
     * Reduce la cantidad de stock del producto.
     *
     * @param cantidad La cantidad a restar del stock del producto.
     */
    public void restarStock(int cantidad) {
        this.cantidadEnStock -= cantidad;
    }

    /**
     * Actualiza el precio del producto.
     *
     * @param nuevoPrecio El nuevo precio a establecer para el producto.
     */
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    /**
     * Muestra la información del producto por consola.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad en Stock: " + this.cantidadEnStock);
        System.out.println("Descripción del producto: " + this.descripcion);
    }

    /**
     * Busca una palabra clave en el nombre del producto.
     *
     * @param palabraBuscada La palabra a buscar en el nombre del producto.
     * @return true si la palabra buscada se encuentra en el nombre del producto, de lo contrario false.
     */
    public boolean buscarPorPalabra(String palabraBuscada) {
        if (nombre.toLowerCase().contains(palabraBuscada.toLowerCase())) {
            return true;
        }
        return false;
    }
}
