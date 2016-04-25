public class Prestamo{

    //Datos de Prestamo
    private String tipoArticulo,nombreArticulo;
    private Object fechaInicial,fechaFinal;
    private int diasPrestamo;

    //Datos Persona
    private String nombrePersona;
    private int edadPersona;
    private Object correoPersona,telefonoPersona;

    public Prestamo(String tipoArticulo, String nombreArticulo,Object fechaInicial,Object fechaFinal,int diasPrestamo,String nombrePersona,int edadPersona,Object correoPersona,Object telefonoPersona){
        this.tipoArticulo = tipoArticulo;
        this.nombreArticulo = nombreArticulo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.diasPrestamo = diasPrestamo;
        this.nombrePersona = nombrePersona;
        this.edadPersona = edadPersona;
        this.correoPersona = correoPersona;
        this.telefonoPersona = telefonoPersona;
    }//constructor

    //GET Y SET Prestamo

    public String getTipoArticulo() {
       return tipoArticulo;
    }//get tipoArticulo

    public void setTipoArticulo(String tipoArticulo) {
       this.tipoArticulo = tipoArticulo;
    }//set tipoArticulo

    public String getNombreArticulo() {
       return nombreArticulo;
    }//get nombreArticulo

    public void setNombreArticulo(String nombreArticulo) {
       this.nombreArticulo = nombreArticulo;
    }//set nombreArticulo

    public Object getFechaInicial() {
       return fechaInicial;
    }//get fechaInicial

    public void setFechaInicial(Object fechaInicial) {
       this.fechaInicial = fechaInicial;
    }//set fechaInicial

    public Object getFechaFinal() {
       return fechaFinal;
    }//get fechaFinal

    public void setFechaFinal(Object fechaFinal) {
       this.fechaInicial = fechaInicial;
    }//set fechaFinal

    public int getDiasPrestamo() {
       return diasPrestamo;
    }//get diasPrestamo

    public void setDiasPrestamo(int diasPrestamo) {
       this.diasPrestamo = diasPrestamo;
    }//set diasPrestamo

    //GET Y SET Persona

    public String getNombrePersona() {
       return nombrePersona;
    }//get nombrePersona

    public void setNombrePersona(String nombrePersona) {
       this.nombrePersona = nombrePersona;
    }//set nombrePersona

    public int getEdadPersona() {
       return edadPersona;
    }//get edadPersona

    public void setEdadPersona(int edadPersona) {
       this.edadPersona = edadPersona;
    }//set edadPersona

    public Object getCorreoPersona() {
       return correoPersona;
    }//get correoPersona

    public void setCorreoPersona(Object correoPersona) {
       this.correoPersona = correoPersona;
    }//set correoPersona

    public Object getTelefonoPersona() {
       return telefonoPersona;
    }//get telefonoPersona

    public void setTelefonoPersona(Object telefonoPersona) {
       this.telefonoPersona = telefonoPersona;
    }//set telefonoPersona


}//class
