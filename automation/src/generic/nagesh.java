package generic;

public class nagesh 
 {
		private String name;
        private int age;
		public String Getname()
		{
			
			return name;
			
		}
		public void setname(String name)
		{
		
			this.name=name;
		 
			
		}
		public int  Getage()
		{
			
			return age;
			
		}
		public void setage(int age)
		{
		if (age>=30 || age <29 )
		{
		
		 System.out.println("invalid age");
			

		}
		else 
		{
			
			this.age=age;
		}

}
 }