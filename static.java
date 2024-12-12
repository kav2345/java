***
static 
output:
100
200
300

1001
2001
3001
10001
20001
30001

1001
2001
3001
***
public class test {
	static int a,b,c;
	int m,n,o;
	static {
		a=100;
		b=200;
		c=300;
	}
	{
		a=1001;
		b=2001;
		c=3001;
		m=10001;
		n=20001;
		o=30001;
	}
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

}

public class stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.c);
		System.out.println("");
		test t=new test();
		t.display1();
		System.out.println("");
		test.display();
	}

}
***
