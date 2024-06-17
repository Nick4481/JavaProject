public class Metoda {
    public static void main(String[] args) {


        afiseazaCeva("Nicu");
        afiseazaCeva1("Nicuu");
        learing2code("Java");
        learing2code("Pyton");
        learing2code("javascrip");
        learing2code("c++");
        varsta(16);
        varsta(24);
        varsta(71);
        vocalaSauConsoanaCuFor("a");
        System.out.println(sum(2, 8));
        System.out.println(reverse(9));
        System.out.println(biggernumber(8, 18));
        System.out.println(media(2.4, 4.1, 8.9));
        System.out.println(lenght("java"));
        System.out.println(reverseIT("java"));
        varsta(2);
        System.out.println(reverseIT("Chameleon"));
        afiseazaCeva("learning something");
        nimic(" i ate nimic");
        returneazadacaeNRpar(5);
        System.out.println(returneazadacaeNRpar(5));
        System.out.println(returneazacelmaiMAREnr(1, 6, 2, 1));
        System.out.println(returneazacaractereledinMijloc("casca"));
        System.out.println(getSum(98134));












    }

    private static void varsta(int varsta){
        if (varsta<18){
            System.out.println("too young");
        }
        else if (varsta>=18 && varsta <64) {
            System.out.println("just fine");

        }
        else System.out.println("Too old"); {

        }
    }

        public static void afiseazaCeva1(String nume1){
            System.out.println("hi "+nume1);

        }
        public static void afiseazaCeva(String nume){
            System.out.println("hello "+nume);
        }

        private static void learing2code(String LimbajProgramare) {
            System.out.println("its easy to learn" + LimbajProgramare);

            }

            private static void vocalaSauConsoanaCuFor(String cuvant){
        char vocala [] = {'a', 'e', 'i', 'c', 'u'};
        for (char v:vocala){
            if (cuvant.charAt(0)==v){
                System.out.println("incepe cu vocala");
            }
            else System.out.println("incepe cu consoana");
        }
            }

            // metode return

    private static int sum (int a, int b){
        int sum = a+b;
        return sum;
    }

    //tema

    private static int reverse (int a){
       return -a;
    }

    private static int biggernumber (int a, int b){
        return Math.max(a, b);

    }

    private static double media (double a, double b, double c){
        return a+b+c;
    }

    private static int lenght (String cuvant){
        return cuvant.length();
    }

    private static String reverseIT (String invers1){
        int i, inverss = invers1.length();
        StringBuilder dest = new StringBuilder(inverss);
        for (i = (inverss - 1); i >= 0; i--){
            dest.append(invers1.charAt(i));
        }
        return dest.toString();
    }

    private static void nimic (String nimic1){
        System.out.println("today"+nimic1);
    }

    private static boolean returneazadacaeNRpar(int numar){

            return numar%2==0;

        }

        private static int returneazacelmaiMAREnr(int x, int y, int z, int w){
        int max = x;
        int numere [] = {x, y, z, w};
        for (int n:numere){
            if (n>=max){
                max = n;
            }
        }
        return max;
    }

    private static String returneazacaractereledinMijloc(String cuvant){
        String mijloc;
        int lungime = cuvant.length();
        // litere impar
        if (lungime%2!=0){
          mijloc = cuvant.substring(lungime/2, lungime/2+1);

        }
        else mijloc = cuvant.substring(lungime/2-1, lungime/2+1);

        return mijloc;
    }

    public static  int getSum (int n){
        int sumacifrelor;
        for (sumacifrelor = 0; n>0; sumacifrelor += n % 10, n/= 10);
        return sumacifrelor;
    }




        }























