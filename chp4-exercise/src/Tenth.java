//: Tenth.java
// This is the tenth exercise of chapter4
// 思路：把一个4位数字拆成4个数字，然后任意两个数组合成一个两位数，
// 两两相乘，共有12种组，再判断乘积是否和原来的数字相等。

public class Tenth {    
          static int a(int i) {
              return i/1000;
          }
          static int b(int i) {
              return (i%1000)/100;
          }
          static int c(int i) {
              return ((i%1000)%100)/10;
         }
         static int d(int i) {
             return ((i%1000)%100)%10;
         }
         static int com(int i, int j) {
             return (i * 10) + j;
         }
         static void productTest (int i, int m, int n) {
             if(m * n == i) System.out.println(i + " = " + m + " * " + n);
         }    
     public static void main(String[] args) {        
         for(int i = 1001; i < 9999; i++) {            
             productTest(i, com(a(i), b(i)), com(c(i), d(i)));
             productTest(i, com(a(i), b(i)), com(d(i), c(i)));
             productTest(i, com(a(i), c(i)), com(b(i), d(i)));
             productTest(i, com(a(i), c(i)), com(d(i), b(i)));
             productTest(i, com(a(i), d(i)), com(b(i), c(i)));
             productTest(i, com(a(i), d(i)), com(c(i), b(i)));
             productTest(i, com(b(i), a(i)), com(c(i), d(i)));
             productTest(i, com(b(i), a(i)), com(d(i), c(i)));
             productTest(i, com(b(i), c(i)), com(d(i), a(i)));
             productTest(i, com(b(i), d(i)), com(c(i), a(i)));
             productTest(i, com(c(i), a(i)), com(d(i), b(i)));
             productTest(i, com(c(i), b(i)), com(d(i), a(i)));
         }            
     } 
}