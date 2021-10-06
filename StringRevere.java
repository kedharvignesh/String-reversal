
public class StringRevere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string ="niloiv";
		
		byte[] byt=string.getBytes();
		byte[] reverse= new byte[byt.length];
		
		for(int i=0;i<byt.length;i++) {
			reverse[i]=byt[byt.length-i-1];
		}
		System.out.println(new String(reverse));

		
		
		
		
		
		
		System.out.println();
		////////////////////////////////////////////
		
		
		char[] result =string.toCharArray();
		
		for(int i=result.length-1;i>=0;i--) {
			System.out.print(result[i]);
		}
		
		System.out.println();
		
		
		
		///////////////////////////////
		
		
		System.out.println();
//		
//		
		StringBuffer sbuf = new StringBuffer(string);
		sbuf.reverse();
		System.out.println(sbuf);
		
		
		System.out.println();
		/////////////////////////////////////////////
		StringBuilder sbuild = new StringBuilder(string);
		sbuild.reverse();
		System.out.println(sbuild);
		
		
		///////////////////////////////////////////
		System.out.println("recursive");
		reverseRecursive(string);
		System.out.println();
		
		System.out.println("========================");
		
		System.out.println("fibonocci");
		System.out.println();
		int count=0,m=0,j=1,p=0;
		System.out.print(m+" "+j+ " ");
		while(count<=10) {
			p=m+j;
			m=j;
			j=p;
			count++;
			System.out.print(p+" ");
		}
		System.out.println();
		
		System.out.println("fib recursive");
		for(int i=1;i<10;i++) {
		System.out.print(fibanociRec(i)+" ");
		}
		
		int a=2;
		int b=3;
		
		int pov = Math.addExact(a, b);
		System.out.println(pov);
		
				/////////////////////////////////////
		System.out.println();
		
		System.out.println(Add(a, b));;
		
		
		System.out.println();
		
		System.out.println(sub(a, b));;
		
		///////////swapping to nos.
		
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println(a+" , "+ b);
		
		//////////without 3rd variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" , "+b);
				

	}
////////////////////////////string reverse using recursion
		static int reverseRecursive(String x) {
			if(x.isEmpty()) {
				return 0;
			}
			int l = x.length();
			if (l==0) {
				return 0;
			}
			System.out.print(x.charAt(l-1));
			return reverseRecursive(x.substring(0, x.length()-1));
		}



	static int Add(int x, int y)
	{
	  if (y == 0)
	    return x;
	  else
	    return Add(x ^ y, (x & y) << 1);
	}
	
	
	
	////////////////////////////////////////////////
	
	static int sub(int x, int y)
	{
	  if (y == 0)
	    return x;
	  else
	    return sub(x ^ y, (~x & y) << 1);
	}
	///////////////////swapping two nos
	static int fibanociRec(int x) {
		if (x==0) {
			return 0;
		}
		if (x==1) {
			return 1;
		}
		return  fibanociRec(x-1)+fibanociRec(x-2);
	
	}
	
	
	

}
