package exercices.lifegarage;

/**
 * Created by jerome on 01/02/17.
 */

public enum Color {

    RED("#FFFF00"),GREEN("#008000"),BLUE("#0000FF");

    private String couleur= "";

    Color(String couleur) {
        this.couleur = couleur ;
    }

    public String toString() {
        return couleur ;
    }
}
