import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       // task1();
       // task2();
       // task3();
       // task4();
       // task5();
      //  task6();
     //   task7();
        task8();
    }
    public static void task1() {
        System.out.printf("reqem daxil edin");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if (number%2==0) {
            System.out.printf("daxil etdiniz reqem cutdur");
            
        } else if (number%2==1) {
            System.out.printf("daxil etdiniz reqem tekdir");
            
        }
        else {
            System.out.printf("reqem daxil etmediz");
        }

    }

    public static void task2() {

        for (int i = 0; i < 101; i++) {
            System.out.println(i);

        }

    }

    public static void task3() {
        int gunler=7;
        switch (gunler){
            case 1:
                System.out.printf("Monday");
                break;
        }
        switch (gunler){
            case 2:
                System.out.printf("tuesday");
                break;
        }
        switch (gunler){
            case 3:
                System.out.printf("wednesday");
                break;
        }
        switch (gunler){
            case 4:
                System.out.printf("thursday");
                break;
        }
        switch (gunler){
            case 5:
                System.out.printf("friday");
                break;
        }
        switch (gunler){
            case 6:
                System.out.printf("saturday");
                break;
        }
        switch (gunler){
            case 7:
                System.out.printf("sunday");
                break;
        }




    }

    public static void task4() {
    int cavab=1;
    int number=5;

        for (int i = 1; i < number; i++) {
            cavab*=i;

        }
        System.out.println(cavab);


    }

    public static void task5() {
        ArrayList<Integer>list=new ArrayList<>();
        int number=5;
        list.add(number);
        int sum=5;
        for (int a:list) {
            sum+=number;

        }  System.out.println(sum);



    }

    public static void task6() {
       char soz1='a';
     int count=0;
     String soz="Salama";
        for (int i = 0; i <soz.length() ; i++) {
            if (soz.charAt(i)==soz1) {
                count++;
                System.out.println(count);


            }

        }

    }

    public static void task7() {
        System.out.printf("reqem daxil edin");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int kvadrati=number*number;
        System.out.println(kvadrati);

    }

    public static void task8() {
        HashSet<String>hashSet=new HashSet<>();
        hashSet.add("Salam");
        hashSet.add("Eliyev");
        hashSet.add("Veli");  hashSet.add("Dunya");
         for(String i:hashSet){
             System.out.println(i);
         }


    }



        }








