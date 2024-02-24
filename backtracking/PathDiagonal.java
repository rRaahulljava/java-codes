import java.util.ArrayList;

public class PathDiagonal {
    public static void main(String[] args) {
        System.out.println(pathDia("",3, 3));
    }

    static ArrayList<String> pathDia(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1){
            list.addAll(pathDia(p+ 'D',r -1 , c - 1));
        }

        if(r > 1){
            list.addAll(pathDia(p+'V', r -1 , c));
        }
        if(c > 1){
            list.addAll(pathDia(p + 'H', r , c -1 ));
        }
        return  list;
    }
}
