package org.gsproducts;

import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        String resp;
        while(true){
         resp=drawMenu();
         takeAction(resp);
        }

    }
    public static String drawMenu(){
        System.out.println( "Tapper Pour " );
        System.out.println( "Ajouter Produit 1" );
        System.out.println( "Supprimer Produit 2" );
        System.out.println( "Modifier Produit 3" );
        System.out.println( "Afficher Les Produits 4" );
        System.out.println( "Afficher Un Produit Par Id 5" );
        System.out.println( "Quiter Q" );
        System.out.println( "--->>>> " );
        String str = sc.nextLine();
        return str;
    }
    public static void takeAction(String action){

    }
}
