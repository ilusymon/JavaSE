public class Test3 {

	public static void main(String[] args) {

		char ch='J';
		//ch+=32;
		ch=(char)(ch+32);
		System.out.println(ch);

		char ch2='a';
		ch2-=32;
		System.out.println(ch2);

		double d3=3.5;
		int i3=100;
		double sum3=d3+i3;
		System.out.println("sum3��ֵ:"+sum3);
		System.out.println("sum3����������:"+(int)sum3);

		double d4=100.4;
		int i4=45;
		int mul4 =(int)d4*i4;
		System.out.println("mul4����������:"+mul4);
	}

}