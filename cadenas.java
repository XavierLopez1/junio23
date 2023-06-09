import java.util.Scanner;

public class cadenas {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        String nombre1,nombre2;
        int edad1,edad2;
        System.out.print("Ingrese el nombre: "); //ingresa el nombre del primer usuario
        nombre1=teclado.next();
        System.out.print("Ingrese edad:"); //ingresa la edad del primer usuario
        edad1=teclado.nextInt();
        System.out.print("Ingrese el nombre: ");//ingresa el nombre del segundo usuario
        nombre2=teclado.next();
        System.out.print("Ingrese edad: ");//ingresa la edad del segundo usuario
        edad2=teclado.nextInt();
        System.out.print("La persona de mayor edad es: ");
        if (edad1>edad2) {
            System.out.print(nombre1);
        } else {
            System.out.print(nombre2);
        }
    }
}