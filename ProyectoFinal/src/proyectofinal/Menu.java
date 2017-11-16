/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Hachi
 */
public class Menu {
    public static void mostrarMensajeBienvenida()
   {
       System.out.println(" Bienvenido al menu de la tienda.");
   }
   
   public static void mostrarMenuPrincipal()
   {
       System.out.println("1 - Menu de cotizaciones");
       System.out.println("2 - Compra Directa");
       System.out.println("3 - Menu de consultas");    
       System.out.println("0 - Salir");
   }
   public static void mostrarMenuCotizacion()
   {
       System.out.println("1 - Generar una Cotizacion");
       System.out.println("2 - Pagar cotizacion previa");
       System.out.println("0 - Volver");
   }
   public static void mostrarMenuCompraDirecta()
   {
       System.out.println("1 - Realizar compra directa");
       System.out.println("0 - Volver al Menu Principal");
   }
   public static void mostrarMenuFormaDePago()
   {
       System.out.println("1 - Efectivo");
       System.out.println("2 - Cheque");
       System.out.println("3 - Tarjeta de Credito Bancaria");
       System.out.println("4 - Tarjeta de Credito de la tienda");
       System.out.println("0 - Volver");
   }
   public static void mostrarMenuConsultas()
   {
       System.out.println("1 - Consulta de producto por codigo");
       System.out.println("2 - Consulta de producto por categoria");
       System.out.println("2 - Consulta de descuento");
       System.out.println("0 - Volver al Menu Principal");
   }
   public static void mostrarMenuConsultaProducto()
   {
       System.out.println("1 - Agregar producto al carro de compras.");
       System.out.println("0 - Volver");
   }
   
}

