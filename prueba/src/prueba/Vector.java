package prueba;

public class Vector {

	public static void main(String[] args) {
		int n=5,result=0;
		int a []= new int [5];
		for ( int i=0; i<=5; i++)
			a[i]=(i+1)*10;
		for ( int i=0; i<=5; i++)
			System.out.printf("Elemento %d=%d/n",i,a[i]);
		for ( int i=0; i<=5; i++)
			result=result +a [i];
		System.out.printf("la media es="+result/5);
			
	}
}
