package com.springframework;

public class SingletonOne {
	public static void main(String[] args) {
		
	Products ps =new Products();
		System.out.println(ps.getInstance());
		System.out.println(ps.getInstance());
		System.out.println(ps.getInstance());
		
	    System.out.println();
	    System.out.println(ps.getDetails());
	    System.out.println(ps.getDetails());
	
		
	}
}
class Products{
	
	public  Products p;
	public  Products getInstance() {
		
		//System.out.println(p);
	if( p == null)
			p = new  Products();
		return p;
		
	}
	public  Products pr;
	public  Products getDetails() {
		
		//System.out.println(pr);
	if( pr == null)
			pr = new  Products();
		return pr;

}}