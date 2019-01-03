package prob6;

public class Rectangle extends Shape implements Resizable{
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width * height;
	}

	@Override
	double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public void resize(double arg) {
		width = width * arg;
		height = height * arg;
		
	}

}
