public class IfClass {
    public static void main(String[] args) {
        int time = 21;
        if (time>18){
            System.out.println("GoodEvening!");
        }
        else if (time>2){
            System.out.println("Hello");

        }
        else if (time>20){
            System.out.println("Hello!2");
        }


        int daynumber = 4;

        switch (daynumber) {
            case 1: System.out.println("Luni"); break;
            case 2: System.out.println("Marti");break;
            case 3: System.out.println("Miercuri");break;
            case 4: System.out.println("Joi"); break;
            case 5: System.out.println("Vineri"); break;
            case 6: System.out.println("Sambata"); break;
            case 7: System.out.println("Duminica"); break;
        }



    }
}
