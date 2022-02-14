package paquete;

import java.util.Scanner;

public class EjercicioCine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int llave = 0;

    do {
        System.out.println("*** Gestion Cinematografica \n" +
                "1-Nuevo Actor \n" +
                "2-Buscar Actor \n" +
                "3-Eliminar Actor \n" +
                "4-Modificar Actor \n" +
                "5-Ver todos los actores \n" +
                "6-Ver pelicular de los actores \n" +
                "7-ver categorias de peliculas de los actores \n" +
                "8-Salir");
        String opcionElegida = scan.next();

        switch (opcionElegida){
            case "1":System.out.println("Nuevo actor agregado");break;
            case "2":System.out.println("Actor Buscado");break;
            case "3":System.out.println("Actor Elimiminado");break;
            case "4":System.out.println("Actor Modificado");break;
            case "5":System.out.println("Mostrando todos los actores");break;
            case "6":System.out.println("Mostrando peliculas de los actores");break;
            case "7":System.out.println("Mostrando la categoria de las pelis de los actores");break;
            case "8": llave = 1;break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }while (llave ==0);
    }
}
