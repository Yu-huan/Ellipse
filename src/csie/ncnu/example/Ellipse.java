package csie.ncnu.example;

public class Ellipse {
	//double pi=3.14;
	//int 圓心 
	int majorAxis;				//長軸/2
	int minorAxis;				//短軸/2
	int x;						//圓心的x座標
	int y;						//圓心的y座標
	public void setcenter(int x,int y){			//設定圓心位置
		this.x=x;
		this.y=y;
	}
	public double area(){	
		return Math.PI*majorAxis*minorAxis ;	//面積
	}
	public double perimeter(){					//周長
		return 2*Math.PI*minorAxis+4*(majorAxis-minorAxis);	
	}
	public void setAxis(int majorAxis,int minorAxis){		//設定長短軸
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
	}
	Ellipse(int majorAxis,int minorAxis){
		setAxis(majorAxis,minorAxis);
	}
	Ellipse(int radius){
		setAxis(radius,radius);
	}
}
