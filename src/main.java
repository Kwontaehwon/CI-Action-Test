public class main {
    private int X;
    private int Y;

    public main(int x, int y){
        this.X = x;
        this.Y = y;
    }

    public int getX(){
        return this.X;
    }

    public static void main(String[] args) {
        main a = new main(1,2);
        if(1 == 1) System.out.println("YES!");
        System.out.println("Github Action Test");
    }
}
