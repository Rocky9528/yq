public class Computer {
    String name ;
    int score ;//0

    public int showFist(){

        //随机数
       int choice =  (int)(Math.random() *3 ) + 1 ;
        if(choice ==1){
            System.out.println("您出了剪刀");
        }else if(choice ==2){
            System.out.println("您出了石头");
        }else if(choice ==3){
            System.out.println("您出了布");
        }else{
            System.out.println("输入有误！");
        }
        return choice ;
    }
}
