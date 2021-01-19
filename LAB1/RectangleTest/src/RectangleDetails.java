
public class RectangleDetails {
    private double length,width,area,perimeter;
    
    public RectangleDetails() {
        this.length=0;
        this.width=0;
        this.area=0;
        this.perimeter=0;
    }
    
    public RectangleDetails(double len,double wid) {
        this.length=len;
        this.width=wid;
    }
    
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    
    public void setLength(double len) {
        this.length=len;
    }
    public void setWidth(double wid) {
        this.width=wid;
    }
    
    public void computeArea() {
        this.area=length*width;
    }
    
    public void computePerimeter() {
        this.perimeter=2*length+2*width;
    }
    
    public void displayDetails() {
        System.out.println("The area of Rectangle is "+area);
        System.out.println("The perimeter of Rectangle is "+perimeter); 
    }
    
    
    
}
