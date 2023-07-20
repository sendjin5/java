package sec1;

public class Shape {

    //다른 pakege에 접근하기 위해서는 앞에 public(접근제한해제)를 걸어야 한다.
    //접근제한자 : public > default(생략) > private
    //public : 어떤 패키지에서든 접근할 수 있음
    //default : 같은 패키지 내에서만 가능
    //privite: 같은 class에서만 가능
    //member field

    public String type;
    public int length;
    public double area;

    public Shape(){}
    public Shape(String type){
        this.type = type;     }            //this. 현재 클래스 내부 매게변수
    public Shape(String type, int length){
        this.type = type;
        this.length = length;
    }

    //void 반환 X
    //setMethod(저장 메소드)
    public double calcArea(){
        if(this.type.equals("square")) {
            this.area = this.length*this.length;
        } else if(this.type.equals("triangle")) {
            this.area = this.length*10/2;
        } else if(this.type.equals("circle")) {
            this.area = this.length*this.length*3.14;
        }   this.area = 0.0f;


        return this.area;
    }
    
    //setMethod(저장 메소드) : 긱 필드에 값을 저장할 목적

}


