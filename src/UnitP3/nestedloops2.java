package UnitP3;

public class nestedloops2 {
    public static void main(String[] args) {
        int mystery = 2;
        int a = 2;
        for(int i = 0; i < 3; i++){
            for(int j = i+1; j < 10; j+=3){
                System.out.print(a * j -i + " ");
            }
            System.out.println(a);
        }

    }
}
