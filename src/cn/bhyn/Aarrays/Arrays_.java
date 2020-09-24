package cn.bhyn.Aarrays;

import java.util.Arrays;

public class Arrays_ {
    public static void main(String[] args) {
        int [] intArry = {20,30,50};
        String intstr = Arrays.toString(intArry);   //转为字符串
        System.out.println(intstr);

        double [] dArry = {1.0,2.3,8.6,2.1,0.9};
        Arrays.sort(dArry);                         //排序
        System.out.println(Arrays.toString(dArry));


    }
}
