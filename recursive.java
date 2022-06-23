package recursive;

public class recursive {
public static int usal(int a,int b) {
	int c=1;
	for(int i=1;i<=b;i++) {
		c=c*a;
	}
	//System.out.println(c);
	return c;
	
}
public static int usal2(int a,int b) {
	if(b==0) {
		return 1;
	}
	return a*usal2(a, b-1);
	
}
public static int faktoriyel(int n) {
	int c=1;
	for(int i=1;i<=n;i++) {
		c=c*i;
	}
	return c;
}
public static int faktoriye2 (int n) {
	if(n==1) {
		return 1;
	}
	return n*faktoriyel(n-1);
}
public static int fibonaci(int n) {
	int sonuc=0;

	if(n<=2) {
		return 1;
	}
		int sayi1=1;
		int sayi2=1;
		for(int i=2;i<n;i++) {
			sonuc=sayi2+sayi1;
			sayi1=sayi2;
			sayi2=sonuc;
			
			
			
		}
		return sonuc;
	
	
}
public static int fibonaci2(int n) {
	if(n==1|| n==2) {
		return 1;
	}
	return fibonaci2(n-1)+fibonaci2(n-2);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(usal(3, 5));
		System.out.println(usal2(3, 5));
		System.out.println(faktoriyel(4));
		System.out.println(faktoriye2(4));
		System.out.println(fibonaci(8));
		System.out.println(fibonaci2(8));
	}

}
