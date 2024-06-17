public class Loops {
    public static void main(String[] args) {


        for(int i=0; i<8; i++){
            System.out.println(i);
        }

        String cars[] = {"BMW", "Audi", "Fiat", "Porsche"};
        for (String c: cars){
            System.out.println(c);
            System.out.println("Azi vreau sa conduc " +c);

            if (c=="BMW"){
                System.out.println("Sa o conduca altcineva");
            }
        }

        int i = 0;
        while (i<5){
            System.out.println(i++);
        }

        int j =1;
        do {
            System.out.println(j);
            j++;
        }
        while (j<4);


    }
}
