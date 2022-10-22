public class Person3 {

    public void aa()
    {
        Person2 p = new Person2();
        p.eatFruit();
        p.sleep();
        p.eatFood();


        Person2.eatFruit(); //类名.方法()  其中的方法必须是static修饰的
    }

    public void bb(){

    }

    public static void main(String[] args) {
        Person3 p = new Person3();
        p.aa();
    }
}
