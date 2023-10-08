package domain.model;

public abstract class Shape{
    private int x = 0;
    private int y = 0;

    // Constructor
    public Shape(int newX, int newY){
        setX(newX);
        setY(newY);
    }
    
    public Shape(){
    }
   
    //Modificador
    public void setX(int newX){
        if((newX >= 0) && (newX <= 1000)){
            x = newX;
        }
    }
    
    // get X
    public int getX(){
        return x;
    }
    
    // set Y 
    public void setY(int newY){
        if((newY >= 0) && (newY <= 1000)){
            y = newY;
        }
    }

    public int getY(){
        return y;
    }
    public abstract int getArea();
    public abstract int getPerimeter();
}