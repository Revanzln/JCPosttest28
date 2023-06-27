package com.juaracoding;
public class soal2 {
        public static void main (String[]args){
            int intloop = 0;
            int c = 9;
            int b = 1;
            for(int a= 0;a<=4;a++) {
                intloop++;
                System.out.println("");
                if(intloop <=0) {
                }
                else {
                    for (int i = b ;i<=c;i++) {
                        if( i%2==0) {
                            System.out.print("_");
                        }
                        else {
                            System.out.print(i);
                        }
                    }
                }
                if( c==5 && b==5 ){
                }
                else {
                    c--;
                    b++;
                }
            }
        }
}