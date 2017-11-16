
package proyectofinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lector
{

    private Scanner scanner;

    public Lector()
    {
        this.scanner = new Scanner(System.in);
    }

    public String leerLinea(String mensaje)
    {
        String str;
        System.out.print(mensaje);
        str = scanner.nextLine();
        return str;
    }
    
    public int leerOpcion(String mensaje, int minimo, int maximo)
    {
        int opcion = 0;
        boolean continuar = true;
        while (continuar)
        {
            try
            {
                System.out.print(mensaje);
                opcion = Integer.parseInt(scanner.nextLine());

                while (!(minimo <= opcion && opcion <= maximo))
                {
                    System.out.println("La opcion es invalida, recuerda la opcion debe ser entre" + minimo + " y " + maximo);
                    System.out.print(mensaje + ": ");
                    opcion = Integer.parseInt(scanner.nextLine());
                }

                continuar = false;
            } catch (NumberFormatException e)
            {
                System.out.println("Solo se permiten numeros enteros.");
            }
        }

        return opcion;
    }
    
    //Lee el archivo de objetos
    public ArrayList<Objeto> leerArchivoLista(){
        ArrayList<Objeto> lista = new ArrayList();
        Scanner file = null;
        try{
            file = new Scanner(new File("Objetos.txt")); 
            System.out.println("File found");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        if(file != null){
            //System.out.println(""+file.hasNext());
            while(file.hasNext()){
                String cat = file.next();
                int codigo = Integer.parseInt(file.next());
                StringBuilder sb = new StringBuilder();
                while(!file.hasNextInt()){
                    sb.append(file.next());
                    sb.append(" ");
                }
                String nombre = sb.toString();
                int precio = Integer.parseInt(file.next());
                //System.out.println("" + cat + codigo + nombre + precio);
                Objeto objeto = new Objeto(cat,codigo,nombre,precio);
                int checker = 0;
                for(int i = 0; i < lista.size(); i++){
                    Objeto check = lista.get(i);
                    if(check.getCodigo() == objeto.getCodigo()){
                        //System.out.println("Codigo duplicado: " + check.getCodigo() + " - " + check.getNombre() + " / " + objeto.getCodigo() + " - " + objeto.getNombre());
                        checker = 1;
                    }
                }
                if(checker == 0) lista.add(objeto);
                //lista.add(objeto);
            }
            file.close();
        }
        return lista;
    }
    
    //Leer string como int
    public int leerInt(String mensaje){
        System.out.println(mensaje);
        int respuesta = 0;
        while(true){
            try{
                respuesta = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Valor invalido. Solo puede ingresar numeros.");
            }
        }
        return respuesta;
    }
}
