class MyException extends Exception{
	int detail;
	MyException(int a){
		detail=a;
	}
	public String toString(){
	return "MyExceptin["+detail+"]";
	}
}
class ExceptionSub{
	static void compute(int a) throws MyException{
		System.out.println("called compute("+a+")");
		if (a>10)
			throw new MyException(a);
			System.out.println("Normal exit");
	}
	public static void main(String args[]){
		try{
			compute(1);
			compute(20);
		}
		catch(MyException e){
			System.out.println("caught"+e);
		}
	}
}