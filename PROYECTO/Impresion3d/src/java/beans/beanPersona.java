package beans;
import java.util.Random;
import Modelo.cifrar_decifrar;
public class beanPersona {
    private String nombres;
    private String apellidos;
    private String dni;
    private String fechaNacimiento;
    private String email;
    private String telefono;
    private String cuenta;
    private String usuario;
    private String password;
    private byte passCifrado[]=new byte[1000];
    private String keyEncriptacion;
    private String datosInsertados[]=new String[20];
   
    public beanPersona(){

    }
     
    public String getCadenaAlfanumAleatoria (int longitud){
    String cadenaAleatoria = "";
    long milis = new java.util.GregorianCalendar().getTimeInMillis();
    Random r = new Random(milis);
    int i = 0;
    while ( i < longitud){
        char c = (char)r.nextInt(255);
        if ( (c >= '0' && c <='9') || (c >='A' && c <='Z') ){
        cadenaAleatoria += c;
        i ++;
        }
    }
    return cadenaAleatoria;
    }
    
  
    public String getKeyEncriptacion() {
        return keyEncriptacion;
    }

    public void setKeyEncriptacion( ) {
        this.keyEncriptacion = "llave";
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getDatosInsertados() {
        return datosInsertados;
    }

    public void setDatosInsertados() {
  //LLENANDO DATOS PARA INSERTAR
     datosInsertados[0]=getNombres();
     datosInsertados[1]=getApellidos();
     datosInsertados[2]=getDni();
     datosInsertados[3]=getFechaNacimiento();
     datosInsertados[4]=getEmail();
     datosInsertados[5]=getTelefono();
     datosInsertados[6]=getCuenta();
     datosInsertados[7]=getUsuario();
      datosInsertados[8]="U";
     try{
    //generando password aleatorio
    setPassword(getCadenaAlfanumAleatoria(8));
    //encriptando
    cifrar_decifrar aesDC=new cifrar_decifrar();
    setPassCifrado(aesDC.cifra(getPassword()));
    }catch(Exception e3){
    System.out.println("Error al encripat contraseña");
    }      
    }

    public byte[] getPassCifrado() {
        return passCifrado;
    }

    public void setPassCifrado(byte[] passCifrado) {
        this.passCifrado = passCifrado;
    }
    
    
}
