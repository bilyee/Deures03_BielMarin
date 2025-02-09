package com.exercici0300;

public class Estudiant {

    private String nom;
    private String id;
    private static Integer comptadorEstudiants = 0;
    private static final Integer capacitat_maxima = 5;
    
    // Constructor
    public Estudiant(String nom, String id) {
        if (comptadorEstudiants < capacitat_maxima) {
            this.nom = nom;
            this.id = id;
            comptadorEstudiants++;
        } else {
            System.out.println("Error: No es poden registrar més estudiants. Capacitat màxima assolida.");
        }
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    // Mètodes públics estàtics
    public static int getComptadorEstudiants() {
        return comptadorEstudiants;
    }

    public static boolean hiHaCapacitat() {
        return comptadorEstudiants < capacitat_maxima;
    }
}
