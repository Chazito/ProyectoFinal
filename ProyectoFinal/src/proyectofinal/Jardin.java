/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author Franco Nuñez
 */
public class Jardin extends Categoria{
   private ArrayList<Objeto> plantasLista;
   private ArrayList<Objeto> fertilizantesLista;
   private ArrayList<Objeto> riegoLista;
   private ArrayList<Objeto> mueblesLista;
   private ArrayList<Objeto> parrilasLista;
   private ArrayList<Objeto> piscinasLista;
   private ArrayList<Objeto> herramientasLista;

    public Jardin() {
        this.plantasLista = new ArrayList<>();
        this.fertilizantesLista = new ArrayList<>();
        this.riegoLista = new ArrayList<>();
        this.mueblesLista = new ArrayList<>();
        this.parrilasLista = new ArrayList<>();
        this.piscinasLista = new ArrayList<>();
        this.herramientasLista = new ArrayList<>();
    }
    
    //Añadir objetos usando esta funcion. Se le entrega el objeto junto con la categoria correspondiente
    @Override
    public void addObjeto(Objeto objeto, int cat){
        switch(cat){
            case 1:
                addToList(plantasLista, objeto);
                break;
            case 2:
                addToList(fertilizantesLista, objeto);
                break;
            case 3:
                addToList(riegoLista, objeto);
                break;
            case 4:
                addToList(mueblesLista, objeto);
                break;
            case 5:
                addToList(parrilasLista, objeto);
                break;
            case 6:
                addToList(piscinasLista, objeto);
                break;
            case 7:
                addToList(herramientasLista, objeto);
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
                returned = plantasLista.get(index);
                break;
            case 2:
                returned = fertilizantesLista.get(index);
                break;
            case 3:
                returned = riegoLista.get(index);
                break;
            case 4:
                returned = mueblesLista.get(index);
                break;
            case 5:
                returned = parrilasLista.get(index);
                break;
            case 6:
                returned = piscinasLista.get(index);
                break;
            case 7:
                returned = herramientasLista.get(index);
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
                size = plantasLista.size();
                break;
            case 2:
                size = fertilizantesLista.size();
                break;
            case 3:
                size = riegoLista.size();
                break;
            case 4:
                size = mueblesLista.size();
                break;
            case 5:
                size = parrilasLista.size();
                break;
            case 6:
                size = piscinasLista.size();
                break;
            case 7:
                size = herramientasLista.size();
                break;
        }
        return size;
    }
    //Devuelve una lista de objetos que tengan el codigo ingresado
    @Override
    public ArrayList<Objeto> buscarCodigo(int codigo){
        ArrayList<Objeto> temp = new ArrayList();
        for(int i = 0; i < 7; i++){
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
