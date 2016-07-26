package csie.ncnu.example;

public class Ellipse {
	//double pi=3.14;
	//int ��� 
	int majorAxis;				//���b/2
	int minorAxis;				//�u�b/2
	int x;						//��ߪ�x�y��
	int y;						//��ߪ�y�y��
	public void setcenter(int x,int y){			//�]�w��ߦ�m
		this.x=x;
		this.y=y;
	}
	public double area(){	
		return Math.PI*majorAxis*minorAxis ;	//���n
	}
	public double perimeter(){					//�P��
		return 2*Math.PI*minorAxis+4*(majorAxis-minorAxis);	
	}
	public void setAxis(int majorAxis,int minorAxis){		//�]�w���u�b
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
