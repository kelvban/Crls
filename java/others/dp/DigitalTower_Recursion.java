import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitalTower_Recursion{ 
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		while((str=br.readLine())!=null){
			int num=Integer.parseInt(str);
			int[][] tower=new int[num][num];
			for(int i=0;i<num;i++){
				String line=br.readLine();
				String[] strs=line.split(" ");
				for(int j=0;j<=i;j++){
					tower[i][j]=Integer.parseInt(strs[j]);
				}
			}
			
		}
		br.close();
	}
}
