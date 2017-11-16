
package proyectofinal;


public class Interfaz {

    public Sistema sistema;
    public Lector lector;

    public Interfaz()
    {
        this.sistema = new Sistema();
        this.lector =  new Lector();
    }
    
    public void iniciar()
    {
        sistema.cargarArchivo();
        Menu.mostrarMensajeBienvenida();
    }
}
