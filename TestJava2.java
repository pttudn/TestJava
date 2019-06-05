//入力した文字列を表示し、指定しない場合は未入力と表示するプログラム

public class TestJava2{
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("未入力");
        }else{
            for(int i=0;i<args.length;i++){
                System.out.println("「 "+args[i]+" 」が入力されました");
            }
        }
    }
    
}