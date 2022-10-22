import java.util.Scanner;

public class Game {
    User user ;
    Computer computer ;
    int count ;//对战次数

    //初始化：设置自己的名字  对手的名字，积分0
    public void init(){
        System.out.println("请输入您的姓名:");
        Scanner input = new Scanner(System.in) ;
        String name = input.next();
        user.name = name ;
        user.score= 0 ;

        System.out.println("请选择你的对手：\n1.张三\t2.李四\t3.王五");
        int choice  = input.nextInt();
        computer.score = 0 ;
        switch(choice){
            case 1:
                computer.name ="张三";
                        break ;
            case 2:
                computer.name ="李四";
                break ;
            case 3:
                computer.name ="王五";
                break ;
            default:
                System.out.println("输入有误！");
        }
        System.out.println("您选择了与TA对战："+computer.name);
    }


    public void start(){
        init();
        int userFist = user.showFist();
        int computerFist = computer.showFist();

        calcResult(userFist,computerFist);
    }

    //计算最终结果
    public void calcResult(int userFist,int computerFist){
        //1.剪刀\t2.石头\t3.布"
        if((userFist==1 && computerFist==3)||(userFist==2 && computerFist==1) ||(userFist==3 && computerFist==2))  {//人
            System.out.println("您赢了！");
            user.score ++ ;
        }else if((userFist==3 && computerFist==1)||(userFist==1 && computerFist==2) ||(userFist==2 && computerFist==3)){//计算机
            System.out.println("您输了！");
            computer.score ++ ;
        }else{
            System.out.println("平局");
        }
    }

    //显示最终结果
    public void showResult(){}


}
