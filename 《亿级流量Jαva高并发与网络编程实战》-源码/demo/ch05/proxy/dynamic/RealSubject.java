package dynamicproxy;

//��ʵ��ɫ
public class RealSubject implements Subject {
	@Override
	public boolean rent(int money)
    {
		System.out.println("�ⷿ"+money+"Ԫ");
		return true ;
	}

}
