
public class Test3 {
	public static void main(String[] args) {
		int provinces[] = {100,200,300}; 
		int position = -1;//初始值
		int cities[][] = {
					{101,102,103},
					{201,202,203},
					{301,302,303}
				};
		int i;
		for(i=0;i<3;i++)
		{	if(provinces[i] == 300)
			{
				position = i ; 
				break ; 
			}}
		int j;
		for(j=0;j<3;j++)
		{	
//			printf("%d",cities[position][j]);
			System.out.println(cities[position][j]);
		}
		
		
		
	}
}
