import java.util.*;

public class DD {
    public static void main(String[] args) {
       /* 1. Считать 6 строк и заполнить ими массив strings.
        2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").*/
        Scanner sc= new Scanner(System.in);
        System.out.println("Task 5");
        String[] str5 = new String[6];
        for(int i=0; i<6; i++){
            str5[i] =sc.nextLine();
        }
        int k=0;
        for(int i=0; i<str5.length; i++){
            for(int j=0; j<str5.length; j++){
                if(i!=j && str5[i]!=null) {
                    if (str5[i].equals(str5[j])) {
                        str5[i]=null;
                    }
                }
            }
        }
        for(int i=0; i<str5.length; i++){
            System.out.println(str5[i]);
        }
    }
}
