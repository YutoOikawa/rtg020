import java.util.HashSet;
import java.util.Set;

class HashSetTest {
    public static void main(String args[]) {

        Set<String> fruits = new HashSet<>();

        fruits.add("リンゴ");
        fruits.add("メロン");
        fruits.add("スイカ");
        fruits.add("オレンジ");

        System.out.println("---------全出力---------");
        System.out.println(fruits);
        System.out.println();

        String wantedFruit = "オレンジ";
        if (fruits.contains(wantedFruit)) {
            System.out.println(wantedFruit + "は存在します");
        } else {
            System.out.println(wantedFruit + "存在しません");
        }
        System.out.println();

        fruits.add("スイカ");
        fruits.add("スイカ");
        fruits.add("スイカ");
        System.out.println("--------重複要素は追加されない--------");
        System.out.println(fruits);
        System.out.println();

        System.out.println("HashSetのサイズは" + fruits.size());

        fruits.remove("スイカ");

        System.out.println("-----スイカを削除-----");
        System.out.println(fruits);
        System.out.println();

        Set<String> langs1 = Set.of("Java", "Python", "JavaScript");
        Set<String> langs2 = Set.of("Java", "Scala", "PHP");

        Set<String> union = new HashSet<>(langs1);
        Set<String> unionTmp = new HashSet<>(langs2);
        union.addAll(unionTmp);
        System.out.println("--------和集合--------");
        System.out.println(union);
        System.out.println();

        Set<String> except = new HashSet<>(langs1);
        Set<String> exceptTmp = new HashSet<>(langs2);
        except.removeAll(exceptTmp);
        System.out.println("--------差集合--------");
        System.out.println(except);
        System.out.println();

        Set<String> intersect = new HashSet<>(langs1);
        Set<String> intersectTmp = new HashSet<>(langs2);
        intersect.retainAll(intersectTmp);
        System.out.println("--------積集合--------");
        System.out.println(intersect);
        System.out.println();
    }
}