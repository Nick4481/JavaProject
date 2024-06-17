public class MyStringxd {
    public static void main(String[] args) {
        String text = "Hello ";
        String nume = "Nicu";
        System.out.println(text+nume);
        String numemare = nume.toUpperCase();
        System.out.println(numemare);
        String numemic = nume.toLowerCase();
        System.out.println(numemic);

        String propozitie = "Ana are mere!";
        System.out.println(propozitie.length());
        System.out.println(nume.length());
        char primalitera = propozitie.charAt(0);
        System.out.println(primalitera);
        char treialitera = propozitie.charAt(6);
        System.out.println(treialitera);

        String filmulPreferat = "Filmul meu preferat este \"Interstelar\"";
        System.out.println(filmulPreferat);
        String filmulPreferat1= "Filmul meu preferat este \n\"Arrival\"";
        System.out.println(filmulPreferat1);

        String serialulpreferat = "Dark";
        System.out.println(serialulpreferat);

    }
}
