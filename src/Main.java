import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int nombre1 = 0;
    int nombre2 = 0;
    int choix = -1;
    //int resultat = 0;
    
    Scanner sc = new Scanner(System.in);

   


    while(choix !=0){
         System.out.println("\n====CALCULATRICE====");

    System.out.println("1 - Addition");
    System.out.println("2 - Soustraction");
    System.out.println("3 - Division");
    System.out.println("4 - Multiplication");
    System.out.println("5 - Modulo");
    System.out.println("0 - Fin du programme");
        
        System.out.print("\nVotre choix : ");
        choix = sc.nextInt();
        if (choix < 0 || choix > 5) {
    System.out.println("Choix invalide, réessayez !");
    continue; 
}

        System.out.println("Entrer le premier nombre ");
        nombre1 = sc.nextInt();
        System.out.println("Entrer le deuxieme nombre");
        nombre2 = sc.nextInt();

        switch(choix){
            case 0 -> System.out.println("Fin");
            case 1 -> System.out.println("Resultat : "+ (nombre1 + nombre2));
            case 2 -> System.out.println("Resultat : "+ (nombre1 - nombre2));
            case 3 -> {
    if (nombre2 == 0) {
        System.out.println("Erreur : Division par zéro impossible !");
    } else {
        System.out.println("Resultat : " + (nombre1 / (double) nombre2));
    }
}
            case 4 -> System.out.println("Resultat : "+ (nombre1 * nombre2));
            case 5 -> System.out.println("Resultat : "+ (nombre1 % nombre2));
            //default -> System.out.println("Fin du programme");
        }
    }
    sc.close();

    }
}
