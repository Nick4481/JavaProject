public class
Operators {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 30;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a%c);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println(100+50);
        System.out.println(a+b);
        System.out.println(a+50);
        System.out.println(a+b-c);
        System.out.println(a*b/c+a-b+50/100);


        //operatori de atribuire
        int d = 10;
        int e = d;
        System.out.println(e);

        d = d+2;
        System.out.println(d);

        d = d-1;
        System.out.println(d);

        for (int i = 0; i<=10; i+=2){
            System.out.println(i);
        }


        for (int i=10; i>=0; i--){
            System.out.println(i);

        }


        System.out.println(a>b);
        System.out.println(b>a);
        System.out.println(a>=b);
        System.out.println(b>=a);
        System.out.println(5==5);
        System.out.println(a==b);
        System.out.println(a!=b);

        boolean iLoveJava = true;
        System.out.println(iLoveJava);
        System.out.println(!iLoveJava);

        if (iLoveJava){
            System.out.println("Learn Test Automation");
        }

        else {
            System.out.println("Try Harder!");
        }


        boolean ilikefootbal = false;
        System.out.println(ilikefootbal);

        if (ilikefootbal){
            System.out.println("Awsome");
        }
        else {
            System.out.println("Not cool");
        }

        if (d<100 && e<100){
            System.out.println("d si e mai mici decat 100");
        }

        if (d<50 || e<50){
            System.out.println("d SAU e mai mici decat 50");
        }

        //Tema

        int x=10;
        int y=6;
        int z=5;
        System.out.println(x*y);
        System.out.println(x/z);
        System.out.println(x+y);
        System.out.println(++x);
        x +=5;

        int sum = x+y;




        if (sum>=10){
            System.out.println("suma lor este mai mare decat10");
        }
        else {
            System.out.println("suma lor este mai mica decat 10");
        }





        if (sum%2==0){
            System.out.println("suma este para");
        }
        else {
            System.out.println("suma este para");
        }



        //tema optionala

        int var1 = 5;
        int var2 = 10;
        int var3 = 15;
        int var4 = 20;

        System.out.println(var1+var2+var3+var4);
        System.out.println(var1*var2*var3*var4);
        System.out.println(var4/var2);
        System.out.println(++var1);
        System.out.println(++var1);
        System.out.println(++var1);
        System.out.println(var1);
        System.out.println(var2-=2);
        System.out.println(var2-=2);
        System.out.println(var2);

        int sum2 = var1+var2+var3+var4;
        int prod1 = var1*var2*var3*var4;
        System.out.println(sum2);

        boolean cand1 = sum2>100;
        boolean cand2 = prod1>1000;
        System.out.println(cand1);
        System.out.println(cand2);



    }
}
