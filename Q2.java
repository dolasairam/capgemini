/*
Write a program to declare all primitive data types with all possible types 
of initialization and also check implicit and explicit type casting by assigning them to each other.
*/

class Q2
{
	byte b;
	final static short s=10;
	int i;
	static long l;
	final static float f=0.0f;
	double d;
	char c;
	public static void main(String args[])
	{
		int i1=100;
		byte b2=(byte)i1;
		Q1 q = new Q1();
		byte b1=s;
		System.out.println("Byte "+q.b);
		System.out.println("short "+q.s);
		System.out.println("int "+q.i);
		System.out.println("long "+q.l);
		System.out.println("float "+q.f);
		System.out.println("double "+q.d);
		System.out.println("char "+q.c);
		System.out.println("implicit "+b1);
		System.out.println("explicit "+b2);
	}
}