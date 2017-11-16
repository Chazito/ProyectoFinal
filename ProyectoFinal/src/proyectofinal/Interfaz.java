
package proyectofinal;

import java.util.ArrayList;


public class Interfaz {

    private Sistema sistema;
    private Lector lector;
    private ArrayList<Objeto> listaObjetosTemporal;

    public Interfaz()
    {
        this.sistema = new Sistema();
        this.lector =  new Lector();
        this.listaObjetosTemporal = new ArrayList();
    }
    
    public void iniciar()
    {
        sistema.cargarArchivo();
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
        }
        else{
            System.out.println("No existen objetos con ese codigo");
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
            switch(sub){
                case 1:
                    for(int i = 0; i < listaTemp.get(0).sizeLista(sub); i++){
                        Objeto objTemp = listaTemp.get(0).getObjeto(sub, i);
                        System.out.println("-   " + objTemp.getCodigo() + " - " + objTemp.getNombre() + " - " + objTemp.getPrecio());
                        listaObjetosTemporal.add(objTemp);
                    }
                    break;
                case 2:
                    for(int i = 0; i < listaTemp.get(0).sizeLista(sub); i++){
                        Objeto objTemp = listaTemp.get(0).getObjeto(sub, i);
                        System.out.println("-   " + objTemp.getCodigo() + " - " + objTemp.getNombre() + " - " + objTemp.getPrecio());
                        listaObjetosTemporal.add(objTemp);
                    }
                    break;
                case 3:
                    for(int i = 0; i < listaTemp.get(0).sizeLista(sub); i++){
                        Objeto objTemp = listaTemp.get(0).getObjeto(sub, i);
                        System.out.println("-   " + objTemp.getCodigo() + " - " + objTemp.getNombre() + " - " + objTemp.getPrecio());
                        listaObjetosTemporal.add(objTemp);
                    }
                    break;
                case 4:
                    for(int i = 0; i < listaTemp.get(0).sizeLista(sub); i++){
                        Objeto objTemp = listaTemp.get(0).getObjeto(sub, i);
                        System.out.println("-   " + objTemp.getCodigo() + " - " + objTemp.getNombre() + " - " + objTemp.getPrecio());
                        listaObjetosTemporal.add(objTemp);
                    }
                    break;
                case 5:
                    for(int i = 0; i < listaTemp.get(0).sizeLista(sub); i++){
                        Objeto objTemp = listaTemp.get(0).getObjeto(sub, i);
                        System.out.println("-   " + objTemp.getCodigo() + " - " + objTemp.getNombre() + " - " + objTemp.getPrecio());
                        listaObjetosTemporal.add(objTemp);
                    }
                    break;
                case 6:
                    for(int i = 0; i < listaTemp.get(0).sizeLista(sub); i++){
                        Objeto objTemp = listaTemp.get(0).getObjeto(sub, i);
                        System.out.println("-   " + objTemp.getCodigo() + " - " + objTemp.getNombre() + " - " + objTemp.getPrecio());
                        listaObjetosTemporal.add(objTemp);
                    }
                    break;
                case 7:
                    for(int i = 0; i < listaTemp.get(0).sizeLista(sub); i++){
                        Objeto objTemp = listaTemp.get(0).getObjeto(sub, i);
                        System.out.println("-   " + objTemp.getCodigo() + " - " + objTemp.getNombre() + " - " + objTemp.getPrecio());
                        listaObjetosTemporal.add(objTemp);
                    }
                    break;
            }
        }
    }
}
