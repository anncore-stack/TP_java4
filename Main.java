package learning.string;

public class Main {

    public static void main(String[] args) {

        // Création et concaténation
        String salam = "Assalam";
        String alaykoum = new String("Alaykoum");

        String salamAlaykoum = salam + " " + alaykoum;
        String assalamouAlaykoumou = salam + "ou" + " " + alaykoum + "ou";

        System.out.println("La chaine localisée par la référence salam est : " + salam);
        System.out.println("La chaine localisée par la référence alaykoum est : " + alaykoum);
        System.out.println("La chaine localisée par la référence salamAlaykoum est : " + salamAlaykoum);

        System.out.println("Le nombre de caractère de " + salam + " est: " + salam.length());
        System.out.println("Le nombre de caractère de " + alaykoum + " est: " + alaykoum.length());
        System.out.println("Le nombre de caractère de " + salamAlaykoum + " est: " + salamAlaykoum.length());

        System.out.println("La position du caractère 'l' dans la chaine "
                + salamAlaykoum + " est: " + salamAlaykoum.indexOf('l'));

        System.out.println("La position du dernier caractère 'l' dans la chaine "
                + salamAlaykoum + " est: " + salamAlaykoum.lastIndexOf('l'));

        System.out.println("La position du caractère 'm' qui se trouve après la position 7 dans la chaine "
                + salamAlaykoum + " est: " + salamAlaykoum.indexOf('m', 7));

        System.out.println("Le caractère qui se trouve à la position 10 de la chaine "
                + salamAlaykoum + " est: " + salamAlaykoum.charAt(10));

        System.out.println("Le nombre de fois que le caractère 'm' apparait dans la chaine "
                + salamAlaykoum + " est: "
                + StringManipulator.occurence(salamAlaykoum, 'm'));

        System.out.println("La première position de la sous chaine \"ou\" dans la chaine "
                + assalamouAlaykoumou + " est: "
                + assalamouAlaykoumou.indexOf("ou"));

        System.out.println("La dernière position de la sous chaine \"ou\" dans la chaine "
                + assalamouAlaykoumou + " est: "
                + assalamouAlaykoumou.lastIndexOf("ou"));

        System.out.println("La position de la sous chaine \"ou\" après la position 8 dans la chaine "
                + assalamouAlaykoumou + " est: "
                + assalamouAlaykoumou.indexOf("ou", 8));

        System.out.println("Le nombre de fois que la sous chaine \"ou\" apparait dans la chaine "
                + assalamouAlaykoumou + " est: "
                + StringManipulator.occurence(assalamouAlaykoumou, "ou"));

        System.out.println("La chaine " + assalamouAlaykoumou
                + " tout en MAJUSCULE est: "
                + assalamouAlaykoumou.toUpperCase());

        System.out.println("La chaine " + assalamouAlaykoumou
                + " tout en minuscule est: "
                + assalamouAlaykoumou.toLowerCase());
    }
}
