public class MyArray123 {
    public static <num> void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        String[] cursanti = {"Mihail", "Nicu", "Rebeca"};

        System.out.println(cursanti[0]);
        System.out.println(cursanti[2]);
        cursanti[2] = "Raluca";
        System.out.println(cursanti[2]);
        System.out.println(numbers[3]);
        System.out.println(cursanti.length);
        System.out.println(numbers.length);

        for (int i = 0; i < cursanti.length; i++){;
            System.out.println(cursanti[i]);

        }


        int myNum = 9;
        float MyFloat = 3.41f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        String myOtherText = "1a2b3c";

        System.out.println(myOtherText);

        byte myByte = 88;
        int number123 = myByte;
        System.out.println(number123);


        float myFloat = 3.44f;
        int gecimala = (int) myFloat;
        System.out.println(gecimala);

        String tara = "Romania";
        int lungimeatarii = tara.length();
        System.out.println(lungimeatarii);



        int[] numere = {4,9,32,78};
        System.out.println(numere[1]);
        System.out.println(numere[3]);

        int[] ani = {1991, 1987, 2001, 2019, 2018, 2024};
        System.out.println(ani[3]);
        for (int i = 0; i<ani.length;i++){
            System.out.println(ani[i]);
        }

        String serial1 = "The \"Dark\" series is the best series ";
        System.out.println(serial1);

        float myfloat1 = 3.44f;
        float myfloat2 = 3.11f;

        System.out.println(myfloat1+myfloat2);
        System.out.println(myfloat1-myfloat2);
        System.out.println(myfloat1*myfloat2);
        System.out.println(myfloat1/myfloat2);

        String MyFavoriteMovie = "\"Interstelar\"";
        System.out.println(MyFavoriteMovie);

       String MyFavoriteMovieMare = MyFavoriteMovie.toUpperCase();
        System.out.println(MyFavoriteMovieMare);

        String MyFavoriteMovieMic = MyFavoriteMovie.toLowerCase();
        System.out.println(MyFavoriteMovieMic);
        System.out.println(MyFavoriteMovie.length());







    }
}