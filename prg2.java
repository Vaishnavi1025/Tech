class prg2{
	public static void main (String args[]){
		try{
			int a=8/0;
		}
		catch(Exception e){
		System.out.println("error"+e);
		}
		finally
		{
		System.out.println("finally");
		}
		System.out.println("successful");
	}
}