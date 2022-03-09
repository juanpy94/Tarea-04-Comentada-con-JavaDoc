/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huevoSorpresa;

/**
 * Clase main del programa, define un objeto huevo sorpresa y realiza
 * las acciones de intentar sacar 2 huevos sorpresa y aumentar el precio
 * 
 * @author Juan Pablo Peñuela
 */
public class Main {

    /**
     * Método main, este método es el pricipal de ejecucién del programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HuevoSorpresaPenuelaCamaraJuanPablo2122 h_sorpresa;
       
        
        h_sorpresa=new HuevoSorpresaPenuelaCamaraJuanPablo2122(10,5,"peluche",10);
        opera_PrecioPenuelaCamaraJuanPablo2122(h_sorpresa);
        
        opera_UnidadesPenuelaCamaraJuanPablo2122(h_sorpresa);
        
    }

    /**
     * método opera_UnidadesPenuelaCamaraJuanPablo2122
     * En este método se va realizar la accién de intentar sacar 2 huevos sorpresa,
     * pero como no hay dinero suficiente saltará una excepcién y no se modificará el
     * nº de unidades de la tienda
     * 
     * @param h_sorpresa son los parámetros que tiene el huevo sorpresa
     */
    public static void opera_UnidadesPenuelaCamaraJuanPablo2122(HuevoSorpresaPenuelaCamaraJuanPablo2122 h_sorpresa) {
        /*Vamos a intentar sacar 2 huevos sorpresa, como no hay dinero suficiente saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("Vamos a sacar huevos sorpresa");
            h_sorpresa.sacarHuevosSorpresas(2, 4, "llavero");
            System.out.println("Operación realizada, ahora tiene "+h_sorpresa.obtenerUnidades()+" unidades en la tienda");
        } catch (Exception e) {
            System.out.println("Error al sacar huevos sorpresa, el nº de unidades sigue siendo: "+h_sorpresa.obtenerUnidades());
            
        }
    }

    /**
     * método opera_PrecioPenuelaCamaraJuanPablo2122
     * en este método se va aumentar el precio del huevo sorpresa en 3€, como no supera
     * el precio máximo establecido la operación tendra éxito
     * 
     * @param h_sorpresa son los parametros que tendrá el huevo sorpresa en este método
     */
    public static void opera_PrecioPenuelaCamaraJuanPablo2122(HuevoSorpresaPenuelaCamaraJuanPablo2122 h_sorpresa) {
        /*Vamos a aumentar el precio 3€, como no supera el precio máximo establecido la operación
        tendrá éxito y el nuevo precio será de 8€*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un huevo sorpresa");
            h_sorpresa.aumentarPrecio(3);
            System.out.println("El precio actual es "+h_sorpresa.obtenerPrecio()+" €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio");
        }
    }
    
    
}
