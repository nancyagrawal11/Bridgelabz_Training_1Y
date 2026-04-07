
public static  class  Question4 {
    void comparison(){
        int A = 100;
        int B = 100;
        int C = 200;
        int D = 200;

        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a.equals(b));
    }
}
public static void main(String[]args){
    Question4 q4 = new  Question4();
    q4.comparison();

}
