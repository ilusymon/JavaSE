package com.atguigu.day12homework.test6;

/**
 * @author Symon
 * @version 1.0
 * @className Test06
 * @description TODO
 * @date 2020/8/5 21:15
 */
public class Test06 {
    public static int fun(){
        int result = 5;
        try{
            result = result / 0;
            return result;
        }catch(Exception e){
            System.out.println("Exception");
            result = -1;
            return result;
        }finally{
            result = 10;
            System.out.println("I am in finally.");
        }
    }
    public static void main(String[] args) {
        int x = fun();
        System.out.println(x);
    }
}
