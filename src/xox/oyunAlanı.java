package xox;

public class oyunAlaný
{
	public void alanYazBaslangic(char[][] alan)
	{
		char k = '1';
		for(int a = 1; a<4; a++)
		{
			alan[0][a] = k;
			k++;
		}
		
		
		char t = '1';
		for(int b = 1;b<4 ;b++)
		{
			alan[b][0] = t;
			t++;
		}
		
		
		for(int i = 0;i < 4 ;i++ )
		{
			for(int j = 0;j<4;j++)
			{
				System.out.print(alan[i][j] + "  ");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public void yaz(char[][]alan)
	{
		for(int i = 0;i<4;i++)
		{
			for(int j = 0;j<4;j++)
			{
				System.out.print(alan[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
