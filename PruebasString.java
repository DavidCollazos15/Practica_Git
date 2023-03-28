package Trimestre_1.b;

import java.util.Scanner;

public class PruebasString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        String nombre=sc.nextLine();

        System.out.println("Introduce el apellido");
        String apellido=sc.nextLine();

        System.out.println("voy a pasar a mayusculas el nombre: "+nombre);
        System.out.println("voy a pasar a minusculas el apellido: "+apellido);
        System.out.println("concatenar caracteres: "+nombre.concat(" "+apellido));
        System.out.println("mostrar la inicial de mi apellido: "+apellido.charAt(0));
        System.out.println("el numero de caracteres de "+nombre+" es: "+nombre.length());

        System.out.println("Ejemplo entornos de desarrollo");
        System.out.println("Ejemplo entornos de desarrollo");

        System.out.println("Hola David");
        System.out.println("Hola David");
        System.out.println("Hola David");
        System.out.println("Hola David");
        
        System.out.println("Ejemplo entornos de desarrollo");


    }
}
