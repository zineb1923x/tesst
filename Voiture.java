public class Voiture {
    //Attributs (etat de l objet)
    String marque = "Marks";
    String modele = "generic model";

    //Methode (comportement )
    public void demmarer () {
        System.out.println("La voiture "+marque+" "+modele+" demmare.");
    }
    // Méthode principale pour tester la classe 
    public static void main(String[] args) {
        Voiture myCar = new Voiture();

        myCar.demmarer();
    }
}