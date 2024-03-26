package mg.inclusiv.cdan8;

import mg.inclusiv.cdan8.fonctions.Fonctions;

public class Main {
    public static void main(String[] args) {

     int [] list= Fonctions.integerSorting(Fonctions.insertInteger());
        Fonctions.tableView(list);

    }
}