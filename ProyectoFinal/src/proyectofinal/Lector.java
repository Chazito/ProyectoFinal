/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

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
}
