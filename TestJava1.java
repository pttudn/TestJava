//9×9の掛け算表を出力するプログラム
public class TestJava1{
    public static void main(String args[]){
        for(int i=1;i<=19;i++){
            for(int j=1;j<=19;j++){
                if(i*j<10){
                    System.out.print("  "+i*j+"|");
                }else if(i*j<100){
                    System.out.print(" "+i*j+"|");
                }
                else{
                    System.out.print(i*j+"|");
                }
            }
            System.out.println();
        }
    }
}