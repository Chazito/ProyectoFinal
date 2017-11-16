 
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author Franco Nuñez
 */
public class ElectroHogar extends Categoria{
    private ArrayList<Objeto> calefaccionLista;
    private ArrayList<Objeto> ventilacionLista;
    private ArrayList<Objeto> aireAcondicionadoLista;
    private ArrayList<Objeto> electroDomesticosLista;
    private ArrayList<Objeto> electronicaYComputacionLista;
    private ArrayList<Objeto> lineaBlancaLista;

    public ElectroHogar() 
    {
        this.calefaccionLista = new ArrayList<>();
        this.ventilacionLista = new ArrayList<>();
        this.aireAcondicionadoLista = new ArrayList<>();
        this.electroDomesticosLista = new ArrayList<>();
        this.electronicaYComputacionLista = new ArrayList<>();
        this.lineaBlancaLista = new ArrayList<>();
    }
    
    //Añadir objetos usando esta funcion. Se le entrega el objeto junto con la categoria correspondiente
    @Override
    public void addObjeto(Objeto objeto, int cat){
        switch(cat){
            case 1:
                addToList(calefaccionLista, objeto);
                break;
            case 2:
                addToList(ventilacionLista, objeto);
                break;
            case 3:
                addToList(aireAcondicionadoLista, objeto);
                break;
            case 4:
                addToList(electroDomesticosLista, objeto);
                break;
            case 5:
                addToList(electronicaYComputacionLista, objeto);
                break;
            case 6:
                addToList(lineaBlancaLista, objeto);
                break;
        }
    }
    
    @Override
    public boolean addToList(ArrayList<Objeto> lista, Objeto objeto){
        if(lista.contains(objeto)){
            return false;
        }
        if(lista.size()>0){
            for(int i = 0; i < lista.size(); i++){
                Objeto check = lista.get(i);
                if(check.getCodigo()==objeto.getCodigo()) return false;
            }
        }
        
        lista.add(objeto);
        return true;
    }
    
    @Override
    public Objeto getObjeto(int cat, int index){
        Objeto returned = null;
        switch(cat){
            case 1:
                returned = calefaccionLista.get(index);
                break;
            case 2:
                returned = ventilacionLista.get(index);
                break;
            case 3:
                returned = aireAcondicionadoLista.get(index);
                break;
            case 4:
                returned = electroDomesticosLista.get(index);
                break;
            case 5:
                returned = electronicaYComputacionLista.get(index);
                break;
            case 6:
                returned = lineaBlancaLista.get(index);
                break;
            default:
                break;
        }
        return returned;
    }
    
    @Override
    public int sizeLista(int cat){
        int size = 0;
        switch(cat){
            case 1:
                size = calefaccionLista.size();
                break;
            case 2:
                size = ventilacionLista.size();
                break;
            case 3:
                size = aireAcondicionadoLista.size();
                break;
            case 4:
                size = electroDomesticosLista.size();
                break;
            case 5:
                size = electronicaYComputacionLista.size();
                break;
            case 6:
                size = lineaBlancaLista.size();
                break;
        }
        return size;
    }
    
    //Devuelve una lista de objetos que tengan el codigo ingresado
    @Override
    public ArrayList<Objeto> buscarCodigo(int codigo){
        ArrayList<Objeto> temp = new ArrayList();
        for(int i = 0; i < 6; i++){
            for(int s = 0; s < sizeLista(i);s++){
                Objeto objeto = getObjeto(i, s);
                if(codigo == objeto.getCodigo()){
                    temp.add(objeto);
                }
            }
        }
        return temp;
    }
}
