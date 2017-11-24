/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Hachi
 */
public class Descuento 
{
    Calendar calendar = Calendar.getInstance();
    int currentDay = calendar.get(Calendar.DAY_OF_WEEK);
    
    ArrayList<String> descuentosCategoria;
    ArrayList<Integer> descuentosTipo;
    ArrayList<String> descuentosTexto;
    
    public Descuento(){
        this.descuentosCategoria = new ArrayList();
        this.descuentosTipo = new ArrayList();
        this.descuentosTexto = new ArrayList();
    }
    
    public void crearListaDescuentos(){
        switch(currentDay){
            /*
            Categoria --> "1.1" "1.2" "2.3" "4.5"
            Tipo --> 0. Efectivo
                     1. Cheque  <-- ESTE NO SE USA
                     2. Tarjeta Bancaria
                     3. Tarjeta Tienda
            Texto --> generarTexto("categoria o descuentosCategoria.get(index)" , Tipo)
            Ejemplo > descuentosTexto(generarTexto("1.1",0));
            */
            case Calendar.MONDAY:
                //Ejemplo de dia con categoria completa con descuento
                descuentosCategoria.add("1.1");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(0),descuentosTipo.get(0))); //Aqui uso el indice 0 para ambos por ser el primer descuento
                descuentosCategoria.add("1.2");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(1),descuentosTipo.get(1))); //Indice 1 al ser el segundo
                descuentosCategoria.add("1.3");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(2),descuentosTipo.get(2))); //Indice 3... Si se agregan mas seria de la misma manera pero el indice sube
                descuentosCategoria.add("1.4");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(3),descuentosTipo.get(3)));
                descuentosCategoria.add("1.5");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(4),descuentosTipo.get(4)));
                descuentosCategoria.add("1.6");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(5),descuentosTipo.get(5)));
                descuentosCategoria.add("1.7");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(6),descuentosTipo.get(6)));
                break;
            case Calendar.TUESDAY:
                descuentosCategoria.add("2.1");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(0),descuentosTipo.get(0)));
                descuentosCategoria.add("2.2");
                descuentosTipo.add(2);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(1),descuentosTipo.get(1)));
                descuentosCategoria.add("2.3");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(2),descuentosTipo.get(2)));
                descuentosCategoria.add("2.4");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(3),descuentosTipo.get(3)));
                descuentosCategoria.add("2.5");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(4),descuentosTipo.get(4)));
                descuentosCategoria.add("2.6");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(5),descuentosTipo.get(5)));
                
                break;
            case Calendar.WEDNESDAY:
                descuentosCategoria.add("4.1");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(0),descuentosTipo.get(0)));
                descuentosCategoria.add("4.2");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(1),descuentosTipo.get(1)));
                descuentosCategoria.add("4.3");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(2),descuentosTipo.get(2)));
                break;
            case Calendar.THURSDAY:
                descuentosCategoria.add("4.4");
                descuentosTipo.add(2);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(0),descuentosTipo.get(0)));
                descuentosCategoria.add("4.5");
                descuentosTipo.add(2);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(1),descuentosTipo.get(1)));
                descuentosCategoria.add("4.6");
                descuentosTipo.add(2);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(2),descuentosTipo.get(2)));
                break;
            case Calendar.FRIDAY:
                descuentosCategoria.add("2.3");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(0),descuentosTipo.get(0)));
                descuentosCategoria.add("4.1");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(1),descuentosTipo.get(1)));
                descuentosCategoria.add("3.3");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(2),descuentosTipo.get(2)));
                break;
            case Calendar.SATURDAY:
                descuentosCategoria.add("1.3");
                descuentosTipo.add(2);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(0),descuentosTipo.get(0)));
                descuentosCategoria.add("4.2");
                descuentosTipo.add(2);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(1),descuentosTipo.get(1)));
                descuentosCategoria.add("3.6");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(2),descuentosTipo.get(2)));
                descuentosCategoria.add("3.7");
                descuentosTipo.add(3);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(3),descuentosTipo.get(3)));
                break;
            case Calendar.SUNDAY:
                descuentosCategoria.add("3.1");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(0),descuentosTipo.get(0)));
                descuentosCategoria.add("3.2");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(1),descuentosTipo.get(1)));
                descuentosCategoria.add("3.3");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(2),descuentosTipo.get(2)));
                descuentosCategoria.add("3.4");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(3),descuentosTipo.get(3)));
                descuentosCategoria.add("3.5");
                descuentosTipo.add(0);
                descuentosTexto.add(generarTexto(descuentosCategoria.get(4),descuentosTipo.get(4)));
                break;
        }
    }
    
    private String generarTexto(String categoria, int tipo){
        StringBuilder sb = new StringBuilder();
        String[] cat = categoria.split("\\.");
        int cat1 = Integer.parseInt(cat[0]);
        int cat2 = Integer.parseInt(cat[1]);
        switch(cat1){
            case 1:
                sb.append("Hogar -> ");
                switch(cat2){
                    case 1:
                        sb.append("Baño ");
                        break;
                    case 2:
                        sb.append("Cocina ");
                        break;
                    case 3:
                        sb.append("Iluminacion ");
                        break;
                    case 4:
                        sb.append("Menaje ");
                        break;
                    case 5:
                        sb.append("Muebles ");
                        break;
                    case 6:
                        sb.append("Decoracion ");
                        break;
                    case 7:
                        sb.append("Textil ");
                        break;
                }
                break;
            case 2:
                sb.append("Electrohogar -> ");
                switch(cat2){
                    case 1:
                        sb.append("Calefaccion ");
                        break;
                    case 2:
                        sb.append("Ventilacion ");
                        break;
                    case 3:
                        sb.append("Aire Acondicionado ");
                        break;
                    case 4:
                        sb.append("Electrodomesticos ");
                        break;
                    case 5:
                        sb.append("Electronica y Computacion ");
                        break;
                    case 6:
                        sb.append("Linea Blanca ");
                        break;
                }
                break;
            case 3:
                sb.append("Jardin -> ");
                switch(cat2){
                    case 1:
                        sb.append("Plantas ");
                        break;
                    case 2:
                        sb.append("Fertilizantes ");
                        break;
                    case 3:
                        sb.append("Riego ");
                        break;
                    case 4:
                        sb.append("Muebles ");
                        break;
                    case 5:
                        sb.append("Parrillas ");
                        break;
                    case 6:
                        sb.append("Piscinas ");
                        break;
                    case 7:
                        sb.append("Herramientas ");
                        break;
                }
                break;
            case 4:
                sb.append("Ferreteria -> ");
                switch(cat2){
                    case 1:
                        sb.append("Pintura ");
                        break;
                    case 2:
                        sb.append("Electricidad ");
                        break;
                    case 3:
                        sb.append("Gasfiteria ");
                        break;
                    case 4:
                        sb.append("Herramientas ");
                        break;
                    case 5:
                        sb.append("Maquinaria ");
                        break;
                    case 6:
                        sb.append("Construccion ");
                        break;
                }
                break;
        }
        switch(tipo){
            case 0:
                sb.append("(10% desc. pagando con efectivo)");
                break;
            case 2:
                sb.append("(15% desc. pagando con tarjeta bancaria)");
                break;
            case 3:
                sb.append("(20% desc. pagando con tarjeta de tienda)");
                break;
        }
        String texto = sb.toString();
        return texto;
    }
    
    public void mostrarDescuentos(){
        System.out.println("Descuentos del dia");
        for(int i = 0; i < descuentosTexto.size(); i++){
            System.out.println(""+ descuentosCategoria.get(i) + " - " +descuentosTexto.get(i));
        }
    }
    
    //METODO PARA APLICAR DESCUENTO EN EL PAGO
    public int aplicarDescuento(int tipoDePago, String categoria ,int precio)
    {
        int precioNuevo = precio;
        for(int i = 0; i < descuentosCategoria.size(); i++){
            if(categoria.equals(descuentosCategoria.get(i))){
                if(tipoDePago == descuentosTipo.get(i)){
                    switch(tipoDePago){
                        case 0:
                            precioNuevo *= 0.90;
                            break;
                        case 2:
                            precioNuevo *= 0.85;
                            break;
                        case 3:
                            precioNuevo *= 0.80;
                            break;
                    }
                }
            }
        }
        return precioNuevo;
    }       
}
