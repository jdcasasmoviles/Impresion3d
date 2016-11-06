package beans;
public class beanAdjunarDiseno {
     private String nombreDiseno;
     private String ancho;
     private String largo;
     private String altura;
     private String descripcion;
     private String precioDiseno;
     private String idUsuario;
     private String nombreArchivo;
    private String datosInsertados[]=new String[20];
     public beanAdjunarDiseno(){
     }


    public String[] getDatosInsertados() {
        return datosInsertados;
    }

    public void setDatosInsertados() {
       //LLENANDO DATOS PARA INSERTAR
     datosInsertados[0]=getNombreDiseno();
     datosInsertados[1]=getAncho();
     datosInsertados[2]=getLargo();
     datosInsertados[3]=getAltura();
     datosInsertados[4]=getDescripcion();
     datosInsertados[5]=getPrecioDiseno();
     datosInsertados[6]=getIdUsuario();
     datosInsertados[7]=getNombreArchivo();
    }
    
     public boolean validarCampos(){
     for(int i=0;i<8;i++){
      if(datosInsertados[i]==null || datosInsertados[i].equals("")){
       return false;
       }
     }
    return true;
    }

    public String getNombreDiseno() {
        return nombreDiseno;
    }

    public void setNombreDiseno(String nombreDiseno) {
        this.nombreDiseno = nombreDiseno;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPrecioDiseno() {
        return precioDiseno;
    }

    public void setPrecioDiseno(String precioDiseno) {
        this.precioDiseno = precioDiseno;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nombreArchivo
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * @param nombreArchivo the nombreArchivo to set
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
}
