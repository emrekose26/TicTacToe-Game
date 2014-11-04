package xox;

public class Oyuncu_X extends Oyuncu
{
	@Override
	public void oyna(int x, int y, char[][] alan) 
	{
		alan[x][y] = 'X';
		int oyna[]=new int[4];
		int oyna2[]=new int[4];
		int kazand� = 0;
		
		//sa� �apraz
		for(int i =1;i<4;i++)
		{
			if(alan[i][i] == 'X')
				oyna[0]++;
		}
		
		//sol �apraz
		int a = 3;
		for(int b = 1;b<4;b++)
		{
			if(alan[b][a]=='X')
			{
				oyna2[0]++;
			}
			a--;
		}
		
		//dikey 
		for(int i=1;i<4;i++)
		{
			for(int j =1;j<4;j++)
			{
				if(alan[j][i]=='X')
					oyna[i]++;
			}
			
		}
		
		//yatay
		for(int p=1;p<4;p++)
		{
			for(int q =1;q<4;q++)
			{
				if(alan[p][q]=='X')
					oyna2[p]++;
			}
			
		}
		
		for(int i = 0 ; i < 4 ; i++)
		{
			if(oyna[i] == 3 || oyna2[i] == 3)
			{
				kazand� = 1;
			}
		}
		
		if(kazand� == 1)
		{
			Oyuncu.donguBreak = 1;
			System.out.println();
			System.out.println("1.oyuncu KAZANDI");
		}
	}
}
