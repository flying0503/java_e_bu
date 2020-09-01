package cn.bhyn.argv_return;

public class argv_return {
    public static void main(String[] args) {
        int [] a = sun_avg(1,2,4);
        System.out.println("sum:"+a[0]);
        System.out.println("avg:"+a[1]);
    }

    public static int[] sun_avg(int a,int b,int c){
        int sum = a+b+c;
        int avg = sum/3;
        int [] argv = {sum,avg};
        return argv;
    }
}
