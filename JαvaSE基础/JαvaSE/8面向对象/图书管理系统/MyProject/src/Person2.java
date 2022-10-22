public class Person2 {
    //属性。。。
    //方法
    public static void  eatFruit(){
        System.out.println("吃水果...");
    }

    public   void eatFood(){
        System.out.println("吃主食...");
        eatFruit();
    }

    public void sleep(){

    }

    public static void main(String[] args) {
        Person2 p = new Person2();
        p.eatFood();
    }
}
