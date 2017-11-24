
package proyectofinal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Calendar;
import java.util.Date;


public class Interfaz {

    private Sistema sistema;
    private Lector lector;
    private ArrayList<Objeto> listaObjetosTemporal;
    CarroCompra carrito;

    public Interfaz()
    {
        this.sistema = new Sistema();
        this.lector =  new Lector();
        this.listaObjetosTemporal = new ArrayList();
        this.carrito = new CarroCompra();
    }
    
    public void iniciar()
    {
        sistema.cargarArchivo();
        sistema.cargarCotizaciones();
        
        while(true){
            Menu.mostrarMensajeBienvenida();
            Menu.mostrarMenuPrincipal();
            int op1 = lector.leerOpcion("Ingrese la opcion deseada: ", 0, 3);
            int op2 = 0;
            int op3 = 0;
            switch(op1){
                case 0:
                    System.exit(0);;
                    break;
                case 1:
                    Menu.mostrarMenuCotizacion();
                    op2 = lector.leerOpcion("Ingrese la opcion deseada: ", 0, 2);
                    switch(op2){
                        case 0:
                            break;
                        case 1:
                            generarCotizacion();
                            break;
                        case 2:
                            pagarCotizacionPrevia();
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    Menu.mostrarMenuConsultas();
                    op2 = lector.leerOpcion("Ingrese la opcion deseada: ", 0, 3);
                    switch(op2){
                        case 0:
                            break;
                        case 1:
                            buscarPorCodigo();
                            break;
                        case 2:
                            buscarPorCategoria();
                            break;
                        case 3:
                            break;
                    }
                    break;
            }
        }
    }
    
    private void generarCotizacion(){
        if(this.carrito.size() > 0){
            int check = 1;
            String codigo = null;
            do{
                Random rn = new Random(System.currentTimeMillis());
                StringBuilder str = new StringBuilder();
                for(int i = 0; i < 10; i++){
                    str.append(rn.nextInt(10));
                }
                codigo = str.toString();
                if(sistema.sizeCotizacion() > 0){
                    for(int i = 0; i < sistema.sizeCotizacion(); i++){
                        Cotizacion checker = sistema.getCotizacion(i);
                        if(checker.getCodigo().equals(codigo)){
                            check = 1;
                        }
                        else{
                            check = 0;
                        }
                    }
                }
                else{
                    check = 0;
                }
            } while(check == 1);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            String fecha = sdf.format(date);
            Cotizacion cotizacion = new Cotizacion(codigo, fecha);
            for(int i = 0; i < this.carrito.size(); i++){
                cotizacion.add(this.carrito.get(i));
            }
            this.sistema.addCotizacion(cotizacion);
            System.out.println("Su codigo de cotizacion es: " + cotizacion.getCodigo() + ". Esta cotizacion es valida por 7 dias.");
            this.sistema.guardarCotizaciones();
        }
    }
    
    private void pagarCotizacionPrevia(){
        if(this.sistema.sizeCotizacion() > 0){
            String codigo = lector.leerLinea("Ingrese el codigo de la cotizacion a´pagar: ");
            Cotizacion pagar;
            for(int i = 0; i < this.sistema.sizeCotizacion(); i++){
                Cotizacion checker = this.sistema.getCotizacion(i);
                if(checker.getCodigo().equals(codigo)){
                    pagar = checker;
                    System.out.println(""+pagar.getCodigo()+ " " + pagar.getFecha());
                    System.out.println("Esta cotizacion contiene: ");
                    for(int a = 0; a < pagar.size(); a++){
                        System.out.println("" + pagar.get(a).getNombre() + " - Precio normal: " + pagar.get(a).getPrecio());
                    }
                    System.out.println("Escoja metodo de pago: ");
                    Menu.mostrarMenuFormaDePago();
                    int op = lector.leerOpcion("", 0, 4);
                    float desc = (float) 0.1;
                    switch(op){
                        case 0:
                            break;
                        case 1:
                            pagar(0, pagar.getCarroCompras());
                            break;
                        case 2:
                            pagar(1, pagar.getCarroCompras());
                            break;
                        case 3:
                            pagar(2, pagar.getCarroCompras());
                            break;
                        case 4:
                            pagar(3, pagar.getCarroCompras());
                            break;
                    }
                    break;
                }
                else{
                    System.out.println("Cotizacion no encontrada.");
                }
            }
            
        }
        else{
            System.out.println("No existen cotizaciones guardadas en el sistema.");
        }
    }
    
    private void pagar(int formaDePago, ArrayList<Objeto> objetos){
        ArrayList<Objeto> listaBoleta = new ArrayList();
        for(int i = 0; i < objetos.size(); i++){
            Objeto origin = objetos.get(i);
            Objeto copy = new Objeto(origin.getCategoria(), origin.getCodigo(), origin.getNombre(), origin.getPrecio());
            listaBoleta.add(copy);
        }
        
    }
    
    private void buscarPorCodigo(){
        int codigo = lector.leerInt("Ingrese el codigo a buscar: ");
        listaObjetosTemporal.clear();
        ArrayList<Categoria> listaTemp = sistema.getListaCategorias();
        for(int i = 0; i < listaTemp.size(); i++){
            Categoria temp = listaTemp.get(i);
            listaObjetosTemporal.addAll(temp.buscarCodigo(codigo));
        }
        if(listaObjetosTemporal.size()>0){
            for(int i = 0; i < listaObjetosTemporal.size(); i++){
                Objeto objeto = listaObjetosTemporal.get(i);
                String cat = objeto.getCategoria();
                int cod = objeto.getCodigo();
                String nom = objeto.getNombre();
                int precio = objeto.getPrecio();
                System.out.println(""+ cat + " - " + cod + " - " + nom + " - " + precio);
            }
            System.out.println("¿Desea agregar el producto al carrito?");
            int op = lector.leerOpcion("1. Si   2. No\n", 1, 2);
            if(op == 1){
                carrito.add(listaObjetosTemporal.get(0));
                System.out.println("Producto agregado.");
            }
        }
        else{
            System.out.println("No existen productos con ese codigo");
        }
    }
    
    private void buscarPorCategoria(){
        Menu.mostrarCategorias();
        listaObjetosTemporal.clear();
        int cat = lector.leerOpcion("Ingrese el indice de la categoria deseada: ", 0, 4);
        if(cat != 0){
            Menu.mostrarSubcategoria(cat);
            int sub = 0;
            if(cat == 1 || cat == 3){
                sub = lector.leerOpcion("Ingrese el indice de la subcategoria deseada: ", 1, 7);
            }
            else{
                sub = lector.leerOpcion("Ingrese el indice de la subcategoria deseada: ", 1, 6);
            }
            ArrayList<Categoria> listaTemp = sistema.getListaCategorias();
            if(listaTemp.get(cat-1).sizeLista(sub)==0){
                System.out.println("No existen productos disponibles. ");
            }
            for(int i = 0; i < listaTemp.get(cat-1).sizeLista(sub); i++){
                Objeto objTemp = listaTemp.get(cat-1).getObjeto(sub, i);
                System.out.println("-   " + (i+1) + ". " + objTemp.getCodigo() + " - " + objTemp.getNombre() + " - " + objTemp.getPrecio());
                listaObjetosTemporal.add(objTemp);
                
            }
            int op = 0;
            do{
                op = lector.leerOpcion("Ingrese el indice del producto a agregar al carro de compras. Ingrese 0 para guardar y volver.", 0, listaObjetosTemporal.size());
                if(op != 0){
                    Objeto e = listaObjetosTemporal.get(op-1);
                    carrito.add(e);
                    System.out.println("Se añadio el producto: " + e.getNombre() + " - Precio: " + e.getPrecio());
                }
            }while(op != 0);
        }
    }
}
