package beans;
public class beanPedido {
    
 private String nombreApellido;
 private String direccion;
 private String fecha;
 private String hora;
 private String fechaEmision;
 private String horaEmision;
 private String password;
 private String total;
 private String datosFactura[]=new String[10];   
 public beanPedido(){
 }   

    /**
     * @return the nombreApellido
     */
    public String getNombreApellido() {
        return nombreApellido;
    }

    /**
     * @param nombreApellido the nombreApellido to set
     */
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return the datosFactura
     */
    public String[] getDatosFactura() {
        return datosFactura;
    }

    /**
     * @param datosFactura the datosFactura to set
     */
    public void setDatosFactura() {
         datosFactura[0]=getNombreApellido();
         datosFactura[1]=getDireccion();
         datosFactura[2]=getFecha();
         datosFactura[3]=getHora();
         datosFactura[4]=getFechaEmision();
         datosFactura[5]=getHoraEmision();  
         datosFactura[6]=getPassword();
         datosFactura[7]=getTotal();
    }
    
      public boolean validarCampos(){
     for(int i=0;i<8;i++){
         System.out.println(" campo  : "+datosFactura[i]);
      if(datosFactura[i]==null || datosFactura[i].equals("")){
          System.out.println("invalido : " +datosFactura[i]);
       return false;
       }
     }
    return true;
    }

    /**
     * @return the fechaEmision
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * @param fechaEmision the fechaEmision to set
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * @return the horaEmision
     */
    public String getHoraEmision() {
        return horaEmision;
    }

    /**
     * @param horaEmision the horaEmision to set
     */
    public void setHoraEmision(String horaEmision) {
        this.horaEmision = horaEmision;
    }
      
}
