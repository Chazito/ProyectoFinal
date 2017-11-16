
package proyectofinal;

import java.io.File;
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
            } catch (Exception e)
            {
                System.out.println("Solo se permiten numeros enteros.");
            }
        }

        return opcion;
    }
    
    public ArrayList<Objeto> leerArchivoLista(){
        ArrayList<Objeto> lista = new ArrayList();
        Scanner file = null;
        try{
           file = new Scanner(new File("Objetos.txt")); 
        }
        catch(Exception e){
            System.out.println("File not found");
        }
        if(file != null){
            while(file.hasNext()){
                String cat = file.next();
                int codigo = Integer.parseInt(file.next());
                String nombre = file.next();
                int precio = Integer.parseInt(file.next());
                System.out.println(cat + codigo + nombre + precio);
                Objeto objeto = new Objeto(cat,codigo,nombre,precio);
                lista.add(objeto);
            }
            file.close();
        }
        return lista;
    }
}
