public class Algorithm {
    public static void main(String[] args) {

        int[] number = {1, -25, 34, -2, 67, 5};

        System.out.println(number[5]);

        for (int n : number) {
            System.out.println(n);
        }

        for (int n : number) {
            System.out.println((n - 1) + " " + (n + 1));

        }


        String text = "abra";
        System.out.println(text.charAt(0));

        String text2 = "abra";
        System.out.println(text.compareTo(text2));
        System.out.println(text.concat(text2));


        String[] tari = {"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China", "SUA", "Australia"};

        for (String t : tari) {
            if (t.charAt(0) == 'A') {
                System.out.println(t);

            }

        }
        for(String t:tari) {
            System.out.println(t);
            System.out.println(t.charAt(0));
            System.out.println(t.length());

    }


    }

}











