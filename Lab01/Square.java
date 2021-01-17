public class Square{
    private double height;
    private double width;
    
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double h){
        height=h;
    }
    public void setWidth(double w){
        width=w;
    }
    public double getArea(){
        double area=height*width;
        return area;
    }
}