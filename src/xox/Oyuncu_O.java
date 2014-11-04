package xox;

public class Oyuncu_O extends Oyuncu
{
	@Override
	public void oyna(int x, int y, char[][] alan) 
	{
		alan[x][y] = 'O';
		int oyna[]=new int[4];
		int oyna2[]=new int[4];
		int kazandý = 0;
		
		//sað çapraz
		for(int i =1;i<4;i++)
		{
			if(alan[i][i] == 'O')
				oyna[0]++;
		}

		//sol çapraz
		int a = 3;
		for(int b = 1;b<4;b++)
		{
			if(alan[b][a]=='O')
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
				if(alan[j][i]=='O')
					oyna[i]++;
			}
			
		}
		
		//yatay
		for(int p=1;p<4;p++)
		{
			for(int q =1;q<4;q++)
				{
					if(alan[p][q]=='O')
						oyna2[p]++;
				}
					
		}
	
		for(int i = 0 ; i < 4 ; i++)
		{
			if(oyna[i] == 3 || oyna2[i] == 3)
			{
				kazandý = 1;
			}
		}
		
		if(kazandý == 1)
		{
			Oyuncu.donguBreak = 1;
			System.out.println();
			System.out.println("2.oyuncu KAZANDI");
		}
		
		
	}

}
