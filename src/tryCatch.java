import java.lang.reflect.Array;

public class tryCatch {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9};
        try {
            System.out.println(numbers[9]);
        }
        catch (Exception e){
            System.out.println("A aparut o eroare");
        }

        // TEMA

        for (int i=0; i<11; i++){
            System.out.println(i);

        }

        for (int i=20; i>9; i--){
            System.out.println(i);
        }

       for (int i=0; i<=100; i++) if (i%2==0){
           System.out.println(i);

       }

       String fructe [] = {"mere", "pere", "banane", "capsuni"};
       for (String c: fructe){
           System.out.println(c);
           System.out.println("Azi vreau sa mananc "+c);

       }

       int monthday = 8;
       switch (monthday) {
           case 1: System.out.println("Ianuarie"); break;
           case 2: System.out.println("Februarie"); break;
           case 3: System.out.println("Martie"); break;
           case 4: System.out.println("Aprilie"); break;
           case 5: System.out.println("Mai"); break;
           case 6: System.out.println("Iunie"); break;
           case 7: System.out.println("Iulie"); break;
           case 8: System.out.println("August"); break;
           case 9: System.out.println("Septembrie"); break;
           case 10: System.out.println("Octombrie"); break;
           case 11: System.out.println("Noiembrie"); break;
           case 12: System.out.println("Decembrie"); break;
       }


       // Tema optionala


        char gender = 'f';

       boolean married = true;

       if (gender =='m'){
           System.out.println("Domnu");
       }
       else if (gender=='f') {
           if (married){
               System.out.println("Domnisoara");
           }
       }

       int x = 10;
       int y = 15;
       int z = 3;


       if (x>y){
           System.out.println("X este mai mare decat y");
       }
       else if (x<y) {
           System.out.println("Y este mai mare decat X");

       }
       else System.out.println("X este egal cu Y");


       int max = 4;

       if (y>x){
           max = y;

       }

       if (z>max){
           max = z;

       }
        System.out.println(max);

       char letter = 'm';

       if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'u'){
           System.out.println("vocala");
       }
       else System.out.println("consoana");


       // Happy birthday to you
        // Happy birthday to you
        // Happy birthday dear Gabriel
        // Happy birthday to you
        // Happy birthday to you
        // Happy birthday to you
        // Happy birthday dear Gabriel
        // Happy birthday to you

        String happyBirthday = "Happy Birthday to you";
        String happyBirthdayGabriel = "Happy Birthday dear Gabriel";


        for (int i=0; i<2; i++){
            System.out.println(happyBirthday);
        }
        System.out.println(happyBirthdayGabriel);
        System.out.println(happyBirthday);

        String HappyBirhday2 = "Happy Birthday to you";
        String HappyBirthdayGabriel2 = "Happy Birthday dear Gabriel";



        for (int i=0; i<2; i++){
            System.out.println(HappyBirhday2);
        }
        System.out.println(HappyBirthdayGabriel2);
        System.out.println(HappyBirhday2);





    }
}
