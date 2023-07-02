package misc;
/**
 *  CheckEqual: checks for the equality of two objects
 * 
 * 
 * 
 * 
 *
 * 
 *  
 *
 * @param  url  an absolute URL giving the base location of the image
 * @param  name the location of the image, relative to the url argument
 * @return      the image at the specified URL
 * @see         Image
 */
public class CheckEqual {

	String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof CheckEqual){
			if(this.s.equalsIgnoreCase(((CheckEqual) obj).getS())){
				return true;
			}
		
	}
		return false;
}

	public static void main(String[] args) {
		
		CheckEqual o1 = new CheckEqual();
		o1.setS("ani");
		
		CheckEqual o2= new CheckEqual();
		o2.setS("ani");
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());

		//o1=o2;
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));
	}
}
