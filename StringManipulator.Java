package learning.string;

public class StringManipulator {

    // Compte le nombre de fois qu’un caractère apparait
    public static int occurence(String s, char a) {

        int nb = 0;
        int index = s.indexOf(a);

        while (index >= 0) {
            nb++;
            index = s.indexOf(a, index + 1);
        }

        return nb;
    }

    // Compte le nombre de fois qu’une sous-chaine apparait
    public static int occurence(String s, String subs) {

        int nb = 0;
        int index = s.indexOf(subs);

        while (index >= 0) {
            nb++;
            index = s.indexOf(subs, index + 1);
        }

        return nb;
    }
}
