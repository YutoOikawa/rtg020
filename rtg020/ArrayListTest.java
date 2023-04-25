import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class ArrayListTest{
    public static void main(String args[]){

        List<String> ls = new ArrayList<>();

        ls.add("サーバサイドエンジニア");
        ls.add("Webフロントエンドエンジニア");
        ls.add("技術統括マネージャー");
        ls.add("アシスタントエンジニア");
        ls.add("みならいエンジニア");
        ls.add("AWSエンジニア");
        ls.add("わかてエンジニア");

        ls.add(0,"モバイルエンジニア");

        String separator = System.getProperty("line.separator");

        System.out.println("0番目の要素は" + ls.get(0) + separator);

        System.out.println("---------要素を全表示---------");
        for(var val: ls){
            System.out.println(val);
        }

        ls.remove(1);
        System.out.println();

        System.out.println("---------1番目の要素を削除");
        for(var val: ls){
            System.out.println(val);
        }

        System.out.println();

        List<String> ls2 = ls.stream().sorted().collect(Collectors.toList());
        System.out.println("---------文字の昇順にソート---------");

        for(var val: ls2){
            System.out.println(val);
        }

        System.out.println();

        ls.clear();
        if(ls.isEmpty()){
            System.out.println("リスト型は空っぽです");
        }else{
            System.out.println("リスト型は空っぽではありません");
        }
        
    }
}    
        



