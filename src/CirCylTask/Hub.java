package CirCylTask;

public class Hub implements taskInterface {

	 int radius;
	double height;
	
	
	
	public Hub(int radius, double height) {
		
		this.radius = radius;
		this.height = height;
		
	}

	void display(){
		System.out.println("radius: "+ radius+"\nheight: "+ height );
	}

	double circumference(int radius){
	double Circumference;
	return Circumference= 2 * Math.PI * radius ;
	

	}

	@Override
	public void circumference() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void circleArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rectangleArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cylinderArea() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
 
 