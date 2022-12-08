package code;

import code.utils.Driver;

public class test {


    public static void StaticWait(int seconds){
        try {
            Thread.sleep(1000*seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Java");
    }

}
