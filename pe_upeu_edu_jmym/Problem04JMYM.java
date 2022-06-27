package pe_upeu_edu_jmym;

import java.util.Scanner;
public class Problem04JMYM {

    static Scanner leerT=new Scanner(System.in);

    public static void numeroPerfecto() {
        int n, i, s;
        System.out.println("Ingrese número: ");
        n=leerT.nextInt();
        s = 0;
        i = n/2;
        while(i>0){
            if(n%i==0){
                s = s+i;
            }
            i--;
        }
        if (s==n) {
            System.out.println(n+" es perfecto");
        }else{System.out.println(n+" no es perfecto");}
    }

    public static void main(String[] args) {
        numeroPerfecto();
    } 

}