import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class laptop {
    public static void main(String[] args) {
        Notebook not = new Notebook();
        not.id=0;
        not.brand="Samsung";
        not.os="Windows";
        not.ram=16;
        not.price=32000;
        not.color="Black";

        Notebook not1 = new Notebook();
        not1.id=1;
        not1.brand="Dell";
        not1.os="Linux";
        not1.ram=8;
        not1.price=21000;
        not1.color="Grey";
        
        Notebook not2 = new Notebook();
        not2.id=2;
        not2.brand="Sony";
        not2.os="Windows";
        not2.ram=32;
        not2.price=40980;
        not2.color="White";
        
        Notebook not3 = new Notebook();
        not3.id=3;
        not3.brand="Apple";
        not3.os="Mac";
        not3.ram=16;
        not3.price=50500;
        not3.color="Grey";

        Notebook not4 = new Notebook();
        not4.id=4;
        not4.brand="LG";
        not4.os="Linux";
        not4.ram=32;
        not4.price=33500;
        not4.color="Black";
        
        System.out.println(not);
        System.out.println(not1);
        System.out.println(not2);
        System.out.println(not3);
        System.out.println(not4);

        Scanner sc =   new Scanner(System.in);
        System.out.println(String.format("Выберите необходимый критерий: %n1 - Операционная система %n2 - ОЗУ %n3 - Цена"));
        int choise = sc.nextInt();

        if (choise == 1){
            Map<String, String> map = new HashMap<>();
            map.put("Windows", "Samsung");
            map.put("Windows", "Sony");
            map.put("Linux", "LG");
            map.put("Linux", "Dell");
            map.put("Mac", "Apple");

            Map<String, String> lmap = new LinkedHashMap<>();
            for(Map.Entry<String, String> result : map.entrySet()){
                if(result.getKey() == "Windows"){
                    lmap.put(result.getKey(), result.getValue());
                }
            }
            System.out.println(lmap);

        } else if (choise == 2){
            Map<Integer, String> map = new HashMap<>();
            map.put(16, "Samsung");
            map.put(32, "Sony");
            map.put(32, "LG");
            map.put(8, "Dell");
            map.put(16, "Apple");

            Map<Integer, String> lmap = new LinkedHashMap<>();
            for(Map.Entry<Integer, String> result : map.entrySet()){
                if(result.getKey() == 16){
                    lmap.put(result.getKey(), result.getValue());
                }
            }
            System.out.println(lmap);

        } else if (choise == 3){
            Map<Integer, String> map = new HashMap<>();
            map.put(32000, "Samsung");
            map.put(40980, "Sony");
            map.put(33500, "LG");
            map.put(21000, "Dell");
            map.put(50500, "Apple");

            Map<Integer, String> lmap = new LinkedHashMap<>();
            for(Map.Entry<Integer, String> result : map.entrySet()){
                if(result.getKey() < 50000){
                    lmap.put(result.getKey(), result.getValue());
                }
            }
            System.out.println(lmap);
        }
    }
}
