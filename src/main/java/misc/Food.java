package misc;class Pizza{
   public void eat()
   {
      System.out.println("pizza");
   }
}
class Food {
   /* There is no semicolon(;)  
    * semicolon is present at the curly braces of the method end.
    */
	public static void main(String[] args) {
		 Pizza p = new Pizza(){
		      public void eat()
		      {
		         System.out.println("anonymous pizza");
		      }
		   };
		   p.eat();
		   Pizza p2 = new Pizza();
		   p2.eat();
	}
  
}