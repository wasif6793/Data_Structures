package classes;

public class Cookie{
    String color;

    public Cookie(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
class Main {

    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}

