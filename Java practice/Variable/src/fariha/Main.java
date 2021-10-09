package fariha;

public class Main {
    //instance variable
    int id;
     static String name = "Leading University";//Class variable

    void sum(int a,int b)
    {
        int result = a+b;//Local variable
        System.out.println("result = "+result);
    }
    public static void main(String[] args) {

        int a = 10;//Local variable

        Main main= new Main();
        main.sum(12,5);//parameter variable

        main.id =53;

        System.out.println("a = "+a);
        System.out.println("University Name: " +Main.name);
        System.out.println("ID: "+main.id);

    }
}
