package Chapter_4.Quiz_2;



public class Quiz_2_Cube{
    private  int x;
    private  int y;
    private  int z;

    Quiz_2_Cube(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;

    }



    public int getVolume(){
        return this.x * this.y * this.z;
    }

    public void increase(int x,int y,int z){
        this.x += x;
        this.y += y;
        this.z += z;
    }

    public boolean isZero(){
        boolean A = true;
        if(this.x*this.y*this.z ==0){
            A = false;
        }
        return A;
    }
}
