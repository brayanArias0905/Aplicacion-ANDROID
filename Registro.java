class Registro{
    protected java.util.ArrayList<Prestamo> arrayPrestamo;

    Registro(){
        arrayPrestamo = new java.util.ArrayList<>();
    }//constructor

    void nuevo(int dx,Prestamo prestamo){
        arrayPrestamo.add(dx,prestamo);
    }//nuevo

    void elimnar(int dx){
        arrayPrestamo.remove(dx);
    }//eliminar

    void editar(int dx,Prestamo prestamo){
        elimnar(dx);
        nuevo(dx,prestamo);
    }//editar
}//class
