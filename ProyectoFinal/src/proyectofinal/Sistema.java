
package proyectofinal;

import java.util.ArrayList;

public class Sistema {
    
    private Categoria hogar;
    private Categoria jardin;
    private Categoria electroHogar;
    private Categoria ferreteria;

    public Sistema() {
        this.hogar = new Hogar();
        this.jardin = new Jardin();
        this.electroHogar = new ElectroHogar();
        this.ferreteria = new Ferreteria();
    }
    
    //Carga el archivo de texto y automaticamente lo ordena. (.txt debe ser UTF-8)
    public void cargarArchivo(){
        Lector lector = new Lector();
        ArrayList<Objeto> listaTemp = new ArrayList();
        listaTemp.addAll(lector.leerArchivoLista());
        sortToCat(listaTemp);
    }
    
    //Toma una lista de objetos desordenada y pasa los objetos a las categorias disponibles
    public void sortToCat(ArrayList<Objeto> lista){
        for(int i = 0; i < lista.size(); i++){
            Objeto temp = lista.get(i);
            String[] cat = temp.getCategoria().split("\\.");
            int categoria = Integer.parseInt(cat[0]);
            int subcategoria = Integer.parseInt(cat[1]);
            switch(categoria){
                case 1:
                    hogar.addObjeto(temp, subcategoria);
                    break;
                case 2:
                    electroHogar.addObjeto(temp, subcategoria);
                    break;
                case 3:
                    jardin.addObjeto(temp, subcategoria);
                    break;
                case 4:
                    ferreteria.addObjeto(temp, subcategoria);
                    break;
            }
        }
    }
    
    public ArrayList<Categoria> getListaCategorias(){
        ArrayList<Categoria> listaTemp = new ArrayList();
        listaTemp.add(hogar);
        listaTemp.add(electroHogar);
        listaTemp.add(jardin);
        
        listaTemp.add(ferreteria);
        
        return listaTemp;
    }
}
