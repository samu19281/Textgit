/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgit;
import java.util.Scanner;

/**
 *
 * @author samgomgom
 */
public class Testgit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    System.out.print("concatenar");
                    System.out.print("Ingrese la primera palabra: ");
                    String word1 = scanner.nextLine();
                    System.out.print("Ingrese la segunda palabra: ");
                    String word2 = scanner.nextLine();
                    System.out.println("Resultado: " + word1 + word2);
                    break;

                case 2:
                    System.out.print("palabra ");
                    System.out.print("Ingrese una frase: ");
                    String phrase = scanner.nextLine();
                    String[] words = phrase.trim().split("\\s+");
                    System.out.println("La frase contiene " + words.length + " palabra(s)." );
                    
                    break;

                case 3:
                    System.out.print("letra ");
                    
                    break;

                case 4:
                    System.out.print("¿Está seguro de que desea salir? (s/n): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("s")) {
                        exit = true;
                        System.out.println("Saliendo del programa. ¡Hasta pronto!");
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
    
    

