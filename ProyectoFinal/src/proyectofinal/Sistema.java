
package proyectofinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Sistema {
    
    private Categoria hogar;
    private Categoria jardin;
    private Categoria electroHogar;
    private Categoria ferreteria;
    private ArrayList<Cotizacion> listaCotizaciones;

    public Sistema() {
        this.hogar = new Hogar();
        this.jardin = new Jardin();
        this.electroHogar = new ElectroHogar();
        this.ferreteria = new Ferreteria();
        this.listaCotizaciones = new ArrayList();
    }

    public int sizeCotizacion() {
        return listaCotizaciones.size();
    }

    public Cotizacion getCotizacion(int index) {
        return listaCotizaciones.get(index);
    }

    public boolean addCotizacion(Cotizacion e) {
        if(this.listaCotizaciones.contains(e)){
            return false;
        }
        for(int i = 0; i < this.listaCotizaciones.size(); i++){
            Cotizacion c = this.listaCotizaciones.get(i);
            if(e.getCodigo().equals(c.getCodigo())){
                return false;
            }
        }
        return listaCotizaciones.add(e);
    }

    public Cotizacion removeCotizacion(int index) {
        return listaCotizaciones.remove(index);
    }
    
    //Carga el archivo de texto y automaticamente lo ordena. (.txt debe ser UTF-8)
    public void cargarArchivo(){
        Lector lector = new Lector();
        ArrayList<Objeto> listaTemp = new ArrayList();
        listaTemp.addAll(lector.leerArchivoLista());
        sortToCat(listaTemp);
    }
    
    public void guardarCotizaciones(){
        try{
            FileOutputStream fileOut = new FileOutputStream("listaCotizaciones.fjg");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.listaCotizaciones);
            out.close();
            fileOut.close();
            System.out.println("Lista de cotizaciones ha sido guardada en 'listaCotizaciones.fjg'");
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }
    
    public void cargarCotizaciones(){
        ArrayList<Cotizacion> listaTemp = new ArrayList();
        try {
            FileInputStream fileIn = new FileInputStream("listaCotizaciones.fjg");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            listaTemp = (ArrayList<Cotizacion>) in.readObject();
            in.close();
            fileIn.close();
        } 
        catch (IOException | ClassNotFoundException i) {
            //i.printStackTrace();
        }
        this.listaCotizaciones.addAll(listaTemp);
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
