package mg.inclusiv.cdan8.fonctions;

import java.util.ArrayList;
import java.util.Scanner;

public class Fonctions {
       //Scanner pour récupérer les saisies
        static Scanner scan = new Scanner(System.in);


    // Saisie des entiers à trier
    public static int [] insertInteger() {
        System.out.println("veuillez entrer la suite de nombre à trier par ordre croissant (à séparer par virgule (,) : ");
        String inputChar = scan.nextLine();

        try {
            String[] charToSplit = inputChar.split(",\\s*");
            int [] list = new int[charToSplit.length];
            for (int i = 0; i < charToSplit.length; i++) {
                list[i] = Integer.parseInt(charToSplit[i]);

                return list;
            }
        } catch (NumberFormatException n) {
            System.out.println("Il existe un caractère non entier dans la suite");

        }

        return null;
    }

    // Fonction pour trier le nombre à l'ordre croissant
    public static int [] integerSorting (int [] list){
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }

        }

        return list;
    }

    //Afficher un tableau
    public static void tableView (int [] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

