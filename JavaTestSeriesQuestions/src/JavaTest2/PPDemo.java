package JavaTest2;

public class PPDemo extends PP {
public void show() {
i = i + 1;
j = j + 2;
System.out.println("i = " + i + " j= " + j);
}
public static void main(String[] args) {
PPDemo p = new PPDemo();
p.show();
}
}
