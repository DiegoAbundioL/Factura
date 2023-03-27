
public class factura {
    private String npieza;
    private String descripcion;
    private int cantidadcompra;
    private double precio;
    private double monto;
    
    public factura(String np, String d, int cc, double p, double m){
        npieza = np;
        descripcion = d;
        cantidadcompra = cc;
        precio = p;
        monto = m;
    }

    public void setNpieza(String np) {
        this.npieza = np;
    }
    public String getNpieza() {
        return npieza;
    }
    
    public void setDescripcion(String d) {
        this.descripcion = d;
    }
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setCantidadcompra(int cc) {
        this.cantidadcompra = cc;
    }
    public int getCantidadcompra() {
        return cantidadcompra;
    }

    public void setPrecio(double p) {
        this.precio = p;
    }
    public double getPrecio() {
        return precio;
    }
    public double getMontoFactura(){
        monto = cantidadcompra * precio;
        return this.monto;
        }     
}
