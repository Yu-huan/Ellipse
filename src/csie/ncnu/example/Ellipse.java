package csie.ncnu.example;

public class Ellipse {
	//double pi=3.14;
	int a;				//ªø¶b/2
	int b;				//µu¶b/2
	public double area(){	
		return Math.PI*a*b ;	//­±¿n
	}
	public double perimeter(){
		return 2*Math.PI*b+4*(a-b);	//©Pªø
	}
}
