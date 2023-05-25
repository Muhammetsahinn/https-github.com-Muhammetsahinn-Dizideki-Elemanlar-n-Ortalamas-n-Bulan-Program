import java.util.Scanner;

public class main {
    public static void main(String[] args){
        double sum = 0.0;
        double[] list = { 1.0, 2.0 ,3.0, 4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0};

        for(int i = 0; i<list.length; i++){
            sum=sum+(1/list[i]);
        }
        System.out.println(sum);

    }

}


