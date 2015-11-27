package com.example.chtit.smsauto;

/**
 * Created by chtit on 21/10/2015.
 */
public class Song {
    String auteur;
    String titre;
    int image;


    public Song(String auteur, String titre, int image) {
        this.auteur = auteur;
        this.titre = titre;
        this.image = image;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}