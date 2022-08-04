 import com.company.Human;
 import com.company.Laptop;
 import com.company.Triangle;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       // Triangle triangle = new Triangle();
        Laptop laptop = new Laptop();
        Laptop.weight=2;
        laptop.price = 95000;
        System.out.println(laptop);
        Human human = new Human();
        Human.laptop =laptop;
        //area();
        human.age=15;
        human.age = human.age+1;
        System.out.println(human.age);
        Human [] ad = new Human[15];
        for (Human i :ad) {
            System.out.println("Name:"+i.name);
            System.out.println("Age:"+i.age);
            System.out.println("Price:"+i.laptop.price);
            System.out.println("Laptop:"+i.laptop);

        }
        Human the = new Human();
        the.name="Samual";
        the.age=15;
        the.Laptop = the.Laptop;

        Human tthe = new Human();
        the.name="Samual";
        the.age=15;
        the.Laptop = the.Laptop;

        Human thhe = new Human();
        the.name="Samual";
        the.age=15;
        the.Laptop = the.Laptop;
    }
    public boolean searchHuman(Human[]a){
        int counter=0;
        for (Human i :a) {
            if (i.name.equals("Samual")&& i.age>20){
                counter++;
            }
        }

       return true;
    }
    static void area() {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
     //   System.out.println("Введите первую сторону треугольника  :");
        triangle.a = 5;
        //System.out.println("Введите вторую сторону треугольника  :");
        triangle.b = 12;
        //System.out.println("Введите третью сторону треугольника  :");
        triangle.c = 13;
        triangle.p = (triangle.a + triangle.b + triangle.c ) / 2 * 2 ;

        //   System.out.println("Площадь треугольника:" + triangle.p);
    }

//    Human human = new Human();
//    human.colorHair="black";
//    human.age =124;
//    human.colorEis="Grey";
//    human.weight =125;
//    human.growth =1245;
//    human.name ="Shaiyrkan";
//    human.sureName ="Kaiyrkan";
//        System.out.println(human.sureName);
//        Phone [] array = new Phone[123];
//        Phone phone = new Phone();
//
//
//
//
//        phone.model = "Motorola 5 edge";
//        phone.cameraPixels=54;
//        phone.color="Blue";
//        phone.diagonal=6.6;
//        phone.weight=240;
//        phone.memory=256;
//        array[0]=phone;
//        System.out.println(array[0].model);

//        for (int i = 0; i < array.length; i++) {
//            //Phone phone = new Phone;
//            //phone.memory= scanner.nextInt();
//            //phone.weight= scanner.nextInt();
//
//        }
//        Phone phone1 = new Phone();//ушинтип атын озгортсо болот болот
//
//        phone1.model = "Samsung A10s ";
//        phone1.cameraPixels=12;
//        phone1.color="Blue, Black";
//        phone1.diagonal=5.2;
//        phone1.weight=200;
//        phone1.memory=32;
//
//        System.out.println(phone.model);


    //System.out.println(Arrays.toString(method(27,false)));//
    //   for (int i = 0; i < 21; i++) {
    //     int a = random.nextInt(1,99);
    //   System.out.println("oshogo boluno turgan sandar"+a);
    // if (a%2==0){
    //   System.out.println("1  "+a);
//}
            //else if (a%d<=0){
              //  System.out.println("2  "+a);
            //}
            //String [] arr1 = {"Table","unit","grete"};
            //for (int j = 3; j < arr1.length; j--) {}
            //}


//int[] arr = {1, 2, 30, 40, 55, 6};
        //System.out.println(Arrays.toString(intMassiv(arr)));
        /*int number = scanner.nextInt();
        int gs = number;//dlyi nechetnyh
        int gd = number;//dlyi chetnyh
        while (gs > 0) {
        }
        while (gd > 0) {
        }
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(gd);*/
static boolean method (int[]arr){
return false;
}

public static int[] method1(int n){
    Random random = new Random();
    int [] array = new int[10];
    array[0]= random.nextInt(1,300);
//    for(int i =1; i< array.length; i++){
//        array[i] = random.nextInt(array[i-1  ],100);
//    }

    for (int i = 0; i < array.length; i++) {
array[i] = random.nextInt(array[i-1]+10,300);

    }
    return array;
 }
        public static void birdeme(){
Scanner scanner = new Scanner(System.in);
Random random = new Random();
            System.out.println("Решите задачу: 45+68");
            System.out.println("У вас есть пять попыток");
            System.out.println("Введите ответ");
            int a = scanner.nextInt();
            while (a!=113) {
                if (a==113){
                    System.out.println("Yes");

             }
             else if (a!=113){
                 System.out.println("No");
                 System.out.println("Введите ответ");
                 a = scanner.nextInt();
                 if (a==113){
                     System.out.println("Yes");
             }
            }
        }
}
        public static void kaitaloo() {
        String word = "hello world";
        String word2 = "hello worD";
        char[] chars = {'h', 'g', 'f'};
        char result = word.charAt(5);//бир эле символун чыгарат
        System.out.println(" charAt бир эле символун чыгарат :"+result);
        String result1 = word.substring(2);//kesip beret
        String result2 = word.substring(3, 8);
        System.out.println("substring кесип берет"+result1 + "  1  " + result2 + "   2   ");
        boolean contains = word.contains("wor"/*top toch kylyp oksoshturup zhazysh kerek*/);//barby zhokpu tecksheret
        System.out.println(contains);
        String result3 = word.toLowerCase(Locale.ROOT);//кичинекей тамга
        String result4 = word.toUpperCase();//чон тамга
        String result5 = word.trim();//башында жана аягында болгон пробелдерди алып коёт
        boolean result6 = word.equals(word2);//salyshtyrat
        boolean result7 = word.equalsIgnoreCase(word2);
        String result8 = word.replace("l", "r");//l dyn baaryn r ga almashtyryp koiot
        int result9 = word.length();//kancha simvol bar ekenin sanap beret misaly "hello word "to on bir simvol bar
        String result10 = word.concat(word2);//sozdordu koshup koiot
        int result11 = word.indexOf('w');//simvol kaisy zherde zhaigashkan zherin korsotot
        //String a = word.startsWith("hello");
        //int result12=word.toCharArray(chars);//bir massivten alyp bashkaga salyp koiot


    }
        public static void ex(String word) {
//            String endWord = word.substring(word.length()-2);
//                System.out.println(endWord+word+endWord);
//                if (word.length()<=1){
//                System.out.println("error");
//            }
//            else {
//                System.out.println(word.charAt(word.length()+1)+word.charAt(word.length()-1)+word+(word.charAt(word.length()-1+-2)));
//
//            }
//                if (word.substring(0,2) .equals("hi")){
//                    System.out.println("oa");
//                }
//                for (int i = 0; i <word.length() ; i++) {
//                    System.out.println(word.charAt(i)+" ");
//                }
//                if (word.length()<=3){
//                    System.out.println(word.toUpperCase());
//                }
//                else {
//                    String first = word.substring(0, word.length() - 3);
//                    String second = word.substring(word.length() - 3).toUpperCase();
//                    String result = first + second.toUpperCase();

//                    System.out.println(result);
//                    System.out.println(word);
//                    System.out.println(first);
//                    System.out.println(second);
        //    System.out.println(word.endsWith(word.toUpperCase()));
        //}

    }
        public static boolean snacks(String mix) {
        Scanner scanner = new Scanner(System.in);
//        if (mix.length() < 3) {
//            return false;
//        } else if (mix.substring(1, 2).equals("ix")) {
//            return true;
//            String first = mix.substring(0, mix.length() - 3);
//            String second = mix.substring(mix.length() - 3).toUpperCase();
//            String result = first + second.toUpperCase();
//        if (mix.length()<3){
//            return false;
//        }
//        return mix.startsWith(1,3).equals("ix");
       int count = 0;
        for (int i = 0; i < mix.length(); i++) {
            if(mix.charAt(i)=='e'){
                count++;
                return true;
        }
        }
        return count>=1 && count<=3;
    }
        public static void at(String ...a){
            for (String s :a) {
                System.out.println(s+"   i love  you");

            }
        }
        public static void  tehnicLesson(int ...a){
              /*  int summa = 0;
                for (int i = 0; i < a.length; i++) {
                    summa+=a[i];
                }
                System.out.println(summa);*/
            for (int d: a ) {
                System.out.println(d +" ");
            }

        }
        public static void method5 (int ...a){
            int sum =0;
            for (int element:a) {
                System.out.println(element +" ");
                sum+=element;
            }
            System.out.println("\nSum is: "+sum);
        }
        public static void practica_bez_sveta() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
                /*            double a = scanner.nextDouble();
                double c=a*10;
                int b=(int)c;
                int v=b/10;
                int d=b%10;

                System.out.println("0"+","+d);
          */
              /*   int [] massiv1=new int[5];   //massiv
            int [] massiv2=new int[5];
                for (int i= 0; i<massiv1.length; i++) {
                    System.out.println("Введите число: "+i);
                    massiv1[i]=scanner.nextInt();

                }
                System.out.println("Это наш первый наполненный массив");
                System.out.println();
                for (int i = 0; i < massiv2.length; i++){


                }*/
               /* int [] massiv1 = new int[10];//------------------
                for (int i = 0; i < massiv1.length; i++) {
                    massiv1[i]= random.nextInt();
                }*/
               /* int [] a = new int[5];
                for (int i = 0; i < a.length; i++) {
                    a [i] = random.nextInt();
                }
                if (a[i]==)*/
              /*  int sum=0;
                int a = 1;
                int b = scanner.nextInt();

                System.out.println("Ушул сандар экиге калдыксыз болунот:");
                while (a<b){
                    if (a%2==0){
                        sum +=a;
                        System.out.println(a+" ");
                    }
                    a++;


                }
                System.out.println("\bСумма чисел"+sum);*/
             /*   int i = 1;//vrode birden bashtap elu go chein bolgon sandardy consolgo chigarat
                int sum1 = 0;
                int sum2=0;
                while(i<100){
                if(i<50){
                    sum1+=i;
                    for (int c = 0;c < 5;c++) {
                        System.out.println(i+c);
                    }  {
                        ;
                    }
                }
                else{
                    sum2+=i;
                }
                i++;
                }*/
              /*  int a = scanner.nextInt();
                while (a>0){

                int counter = 0;



                        int b = scanner.nextInt();
                   a-=b;


                    System.out.println(a);

                    counter++;

                }System.out.println(counter);*///couunter ishtebeit
            // int a,b,
               /* int a = scanner.nextInt();//zhakshi ishtebeit
                int b = scanner.nextInt();


                for (; a != b; ) {

                    a = scanner.nextInt();

                    b = scanner.nextInt();

                    a += a;

                    b += b;

                }
                if (a == b) {
                    System.out.println("chisla ravny i summa chisel a " + a + "\tsumma chisel b " + b); */
              /* int a = random.nextInt(0,50);

                for (int i = 1; i <20 ; i++) {
                    int k = random.nextInt(0,50);
                    if(k%a==0){
                        System.out.println("делится на  без остатка "+k+a);
                    }
                    else{
                        System.out.println("не делится без остатака"+k+a); */
                /*int[]array = new int[10];
                array[0]=5;
                for (int i = 0; i < array.length ; i++) {
                    array[i]= random.nextInt(1,50);
                }
                System.out.println("birinchi random san ="+array[0]);
                System.out.println(Arrays.toString(array));
                for (int i =0;i< array.length;i++){
                    if(array[i]%array[0]==0){
                    System.out.println(array[i]);
                    }      */
                /*int []arr = new int[10];
                for (int i = 0; i < arr.length ; i++) {
                    arr[i]= scanner.nextInt();
                }
                System.out.println(Arrays.toString(arr));*/
                /* String []arr = new String[3];
                arr[0]="Sasha";
                arr[2]="Masha";
                arr[3]="Pasha";
                System.out.println(Arrays.toString(arr));*/
                /*  System.out.println("Vvedite chislo");
                int a = scanner.nextInt();
                System.out.println("Vyberite operatiu");
                int b = scanner.nextInt();
                System.out.println("Vvedite chislo");
                int c = scanner.nextInt();
                switch (a+b+c){
                    case('+'):
                        System.out.println(a+c);
                        break;
                    case('-'):
                        System.out.println(a-c);
                        break;
                    case('*'):
                        System.out.println(a*c);
                        break;
                    case('/'):
                        System.out.println(a/c);
                        break;
                    case('%'):
                        System.out.println(a%c);
                        break;
                }*/
                /*int a = scanner.nextInt();
                while(a>0){
                    int b = scanner.nextInt();
                     a-=b;
                    System.out.println(a);
                }*/
                /*int x = scanner.nextInt();
                int b = 1;
                while(b<=x){
                    if (x%2==0 && x%3==0){
                        System.out.println(x);
                }x++;*/

                /* int sum1=0,sum2=0;
                for (int i=1;i<=5;i++) {
                    int a = random.nextInt(1,51);
                   // int b = random.nextInt(1,101);

                    if (a>=50){
                        System.out.println("50 don chong");
                        sum2+=a;
                    } else  {
                        System.out.println("50 don kichine");
                        sum1+=a;
                    }
                    System.out.println("sum bir   "+sum1);
                    System.out.println("sum eki    "+sum2);
                }//*/
                /*
            /*int x = scanner.nextInt();
                method(x);}
                public static void method(int x){
                int sum1 = 0;
                int sum2 = 0;
                Random random = new Random();
                for(int i =1; i<=x;i++){
                int a = random.nextInt(1,101);
                 sum1 ++;
                 sum2+=a;

                if(a<=50){
                    System.out.println("50 go barabar zhe kichine"+a);
                }
                else {
                    System.out.println("50 don chon"+a);
                }
                    System.out.println(sum1+"random san ketip zhatat    "+"    obshyi chislo"+sum2);*/
            //pochti birdei birok ustundogu tuura asty ne dokonca
                /*a();
            }
                public static void a(){
                Scanner scanner=new Scanner(System.in);
                Random random = new Random();
                int f = scanner.nextInt();


                    for (int i = 1; i <f; i++) {
                        int g = random.nextInt(1,f);
                        if(g<f){
                            int s = g+1;
                            System.out.println("kichine "+s+ "     random sun"+g);
                        }
                        else if(g>f){
                            int c = g-1;
                            System.out.println("chon"+c + "      random sun"+g);
                        }
                        else {
                            System.out.println(876984448);
                        }*/
//*/
                /*    String d = scanner.nextLine();
              kundor(d);
            }
            public static void kundor(String a) {
                switch (a) {
                    case "ПН,СР,ПТ":
                        System.out.println("Понедельник куну бизде Technical lesson болот");
                        break;
                    case "ВТ,ЧТ":
                        System.out.println("Вторник куну бизде Practice lesson болот");
                        break;
                    case "СБ,":
                        System.out.println("Суббота куну бизде сабак болбойт");
                        break;
                    case "ВС":
                        System.out.println("Воскресенье куну бизде сабак болбойт");
                        break;
                    default:
                        System.out.println("Мындай кун жок");
                }*/
                /*kalkulator(scanner.nextLine());

            }
                public static void kalkulator(String c ) {
                Scanner scanner=new Scanner(System.in);
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                    switch (c) {
                        case "-":
                            System.out.println(a-b);
                            break;
                        case "+":
                            System.out.println(a+b);
                            break;
                        case "*":
                            System.out.println(a*b);
                            break;
                        case "/":
                            System.out.println(a/b);
                            break;
                        case "%":
                            System.out.println(a%b);
                            break;
                        default:
                            System.out.println(404);
                    }
                int[] a = {1,2,3,4,5,6,7,8,9};
                int[] b = new int [a.length];
                for (int i = 0; i < a.length; i++) {
                    b[i]=a[i];
                    System.out.println(b[i]);
                }

                System.out.println();
                int r = scanner.nextInt();
                //double g = g(r);

            }
            public static void g (double r ){
                double PI=Math.PI;
                //return PI*Math.pow(r,2);
            }
            public static void method(int[]arr){
                Random random=new Random();
                for (int i = 0; i < arr.length; i++) {
                    arr [i] = random.nextInt(1,22);

//arr1[],int arr2[]
                }

            }
                public static void mmethod(int arr1[],int arr2[]){
                for (int i = 0; i < arr1.length; i++) {
                     if(arr1[i]>10){
                         arr2[i]=arr1[i];
                     }*/
                /*int[]a;
                int n;
                System.out.println("Enter numbers of array: ");
                n = scanner.nextInt();
                a = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter a[ "+i+"] = ");
                    a[i]= scanner.nextInt();

                }*/
            //7-1
                /*  int[] a={21,5,67,87};
                int[] b=new int[a.length];
                for (int i = 0; i < 100; i++) {
                    b [i]=a[i];
                    System.out.println(b[i]);

                }*/
            //7-2
                /* int []a = new int[100];
                for (int i = 0; i < a.length; i++) {
                    int b = random.nextInt(1,100);
                    a[i]=b;
                    int c = scanner.nextInt();
                    if(a[i]==c){
                        System.out.println(i);
                    }
                    else{
                        System.out.println("Myndai san massivtin ichinde zhok");
                    }

                }*/
            //8
                /* int sum=0;
                int a = 1;
                int b = 300;

                while (a<b) {
                    if (a % 3 == 0) {
                        sum += a;
                        System.out.println(a + "  ушул сандар учко калдыксыз болунот");
                    }
                    a++;
                }
                while (a<b) {
                    if (a % 4 == 0) {
                        sum += a;
                        System.out.println(a + "  ушул сандар тортко калдыксыз болунот");
                    }
                    a++;
                }
                while (a < b) {
                    if (a % 5 == 0) {
                        sum += a;
                        System.out.println(a + "  ушул сандар бешке калдыксыз болунот");
                    }
                    a++;
                }
                    System.out.println("\bСумма чисел" + sum);*/
            /*    //9*/
        }
        public static void otuzTapshyrma2() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            //1
             /*       int a = random.nextInt(1,99);

                for (int i = 0; i < 21; i++) {
                    int b = random.nextInt(1,99);

                    if (b/a==0) {
                        System.out.println(b);
                    }

                }*/
            //2
              /*  for (int i = 0; i < 21; i++) {
                    int a = random.nextInt(-50,+50);
                    if (a<0){
                        System.out.println(a+"  naimenshee chislo");
                    }
                    if (a>0){
                        System.out.println(a+"  naibolshee chislo");
                    }
                }*/
            //3
           /*     System.out.println("Vvedite chislo: ");
                int a = scanner.nextInt();
                while (a>0){

                    System.out.println("Vvedite eshe chislo: ");
                   int  b= scanner.nextInt();
                     a-=b;
                    System.out.println(a);

                }*/
            //4
               /* int a=0;
                int b=1;
                int counter =0;
                int counter1 = 0;
                while (a!=b){
                    a= scanner.nextInt();
                    b= scanner.nextInt();
                    counter+=a;

                    counter1+=b;
                }
                System.out.println("summa vseh pervyh chisel"+counter);
                System.out.println("summa vseh vtoryh chisel"+counter1);*/
            //5
            //int a = scanner.nextInt();

              /*  int a = scanner.nextInt();
                int num = (int)Math.log10(a)+1;
                int b = a;
                int c = a;
                int b1 =a;
                int c1 = a;
                    for (int i = 0; i < num; i++) {
                        if (a / 2 == 0 || a % 2 == 0) {
                            b /= 10;
                            c /= 100;
                            b1 %= 10;
                            c1 %= 100;
                            System.out.print("1       " + b + " " + c + " " + b1 + " " + c1 + "  ");
                        }
                    }
                for (int i = 0; i < num; i++) {
                    b/=10; c/=100; b1%=10; c1%=100;
                }
                     if  (a/3==0 || a%3==0){

                    System.out.print("2       "+b+" "+c+" "+b1+" "+c1+"  ");
                }

                   */


            /*  }*//*445445454545454554544444444444444444444444444444444444444444444444555555555555555555555555555555
                int a = scanner.nextInt();
                int a1 = a/10;//76587
                int b1 = a/100;//7658
                int a2 = a%10;//3
                int b2 = a%100;//73
                System.out.println(a1);
                System.out.println(b1);
                System.out.println(a2);
                System.out.println(b2);*/
            //6
   /*int num = scanner.nextInt();//465785     tipa ushundai sandardyn en birinchi sanyn chygarat    @
                int    num1 = 0;
                while (num > 10){
                    num = num / 10;
                }
                System.out.println(num);*/
            //7
          /* int number = scanner.nextInt();
           while (number>0){
               System.out.println(number%10);
               number/=10;
           }
           int nimbrt = scanner.nextInt();
           int dfg = number,fdsg=number;
           int fgdsg = 0 , result =0;
           while (dfg>0){
               fdsg/=10;
               fgdsg++;
           }
            System.out.println("сандын узундугу\n"+fgdsg);
            for (int i = fgdsg; i <=1 ; i--) {
                result+= nimbrt%10*Math.pow(10,i-1);
                System.out.println(number%10+" "+Math.pow(10,i));
                System.out.println(result);
                nimbrt/=10;
            }
            System.out.println(result);*/
            //8
            /*System.out.println("Канча билет болуш керек");
            int noFtickets = scanner.nextInt();
            int noFpeople =0,rejekted =0;
            while (noFtickets<0){
                System.out.println("Канча билет аласыз");
                int sun = scanner.nextInt();
                if(sun>noFtickets){
                    System.out.println("bizde"+noFtickets+"kaldy");

                        rejekted++;
                        continue;

                    noFtickets-=sun;
                    noFpeople++;
                }
                System.out.println("---kassa cose---");
                System.out.println(noFpeople+"kishi bilet aldy");
                System.out.println(rejekted+"ushuncha kishige bilet satylbai kaldy");

            }*/
    }
          /*  public static void tapshyrma9(){
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int [] a = {1,54,62,4,8};
                for (int i = 20; i >= 0; i--) {
                    System.out.println(i);
                }
                //System.out.println(a.length-1);

    }*/




        public static void practica28_07_22(){

       /*     res(15);
                System.out.println(res(15));

            }static int  res (int number){
                if(number>10)
                    return  number;
            else
                    return 10;
        }*/
            /*    System.out.println(res(12));
            }
                static boolean res ( int age){
                    return age >= 6 && age >= 18;
                }*/
          /*     int [] a = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
                aaa(a);

            }
            static void aaa(int b []){
                 for(int i = b.length-1;i>=0;i--);
                System.out.print(b[i]+" ");
                /*int [] c ={1,2,3,4,5,6};
                bbb(c);
            }
            public static void bbb (int[]a){
                for (int i = 0; i<=a.length/3; i++) {
                    System.out.print(a[i]+" ");
                }
                System.out.println();
                for(int i = a.length/2;i<a.length;i++){
                    System.out.print(a[i]+" ");
                }
                int [] a ={1,2,2,3,4,};
                ccc(a);

            }
            static boolean ccc (int [] d ){*/
                /*
            int[] arr1 = {1, 2, 3, 4, 4, 6, 7, 8, 9};
                System.out.println(method(arr1));}
        static boolean method(int[]arr) {
            if (arr[0] == arr[arr.length - 1]) {
                return true;
            }else {
                return false;
            }*/
               /* int arr[]=new int[10];
                int a =5;

            }
            public static void method
            public static void sout(int[]arr){
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Vvedite i = "+i+" :");
                    arr[i]= scanner.nextInt();

                }
            }
            public static void fill(int[]arr){
            for (int i = 0; i < arr.length; i++) {
            System.out.println("Vvedite i = " + i + " :");
            arr[i] = scanner.nextInt();
            //8

}*/}
  /*  public static boolean fda(String[] names,String number){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(names)){
        if ( number  [%=2])
            }
        }
        return
    }*/
        public static void integer (Integer a /*5 dtp zhaszysh kerek*/) {
            System.out.println(a.doubleValue() + "  double");
            System.out.println(a.byteValue() + "  byte");
            System.out.println(a.floatValue() + "  float");
            System.out.println(a.intValue() + "  int");
            System.out.println(a.longValue() + "  long");
            System.out.println(a.shortValue() + "  short");
            //  int a = 765873;
            // a%=10;
            //while (a>0){
            // System.out.println(a);
            //a%=10;

            //}
                       /*  int a =5;
                a=a+10;
                System.out.println(a);*/
             /*   int a= 5;
                Integer integer = new  Integer(a);
                String string = Integer.toString(integer);
                System.out.println(string);*/
        }
        public static int[] intMassiv(int[] massiv){
            for(int i = 0;i< massiv.length;i++){
                if (massiv[i]<10){
                    massiv[i] = 0;
                }
            }
            return massiv;
        }
        public static void method (int number) {
                if (number > 10) {
                    System.out.println("bolshe 10");
                } else {
                    System.out.println("menshe 10");
                }
            }
            public static void easyWay ( int n){
                String jup = "", tak = "";

                while (n > 0) {
                    if (n % 10 % 2 == 0) {
                        jup = jup + n % 10 + " ";
                    } else {
                        tak = tak + n % 10 + " ";
                        n /= 10;
                    }
                    System.out.println("Ж");
                }
            }
            public static String examEx(int b ) {
                if (b % 4 == 0) {
                    return"Leap year";
                } else {
                    return "Not leap year";
                }
            }
         public static char[] method(int n,boolean b) {
    /*char[] tamgalar1 = new char[n];         *
    char j = 0;*
    if (b) {*
        for (int i = 67; i < 67 + n; i ++) {*            бул туура эмеееес
            tamgalar1[j] = (char) i;*
            j++;*
        }
    } else if (b) {*
        for (int i = 65; i < 65 + n; i++) {*
            tamgalar1[j] = (char) i;*
            j++;*
        }*
    } else {*

    }*/


    if(n>26){
        n=26;

    } char[] tamgalar = new char[n];
    int j =0;

    if(b){
        for (int i = 65; i <65+n; i++) {
            tamgalar[j]=(char)i;
            j++;
        }

    }

    else {
        for(int i=97; i<97+n; i++){
            tamgalar[j] = (char)i;
            j++;
        }
    }
return tamgalar;
}

            }






































































