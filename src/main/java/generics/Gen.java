package generics;

class Gen
{
 static < T, V extends Number> void  display(T t, V v)  
 {
  System.out.println(v.getClass().getName()+" = " +v);
  System.out.println(t.getClass().getName()+" = " +t);
 }
 public static void main(String[] args)
 {
 // display(88,"This is string");
  display ("this is string",99); 
 }
}