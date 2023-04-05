import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*1

        Задача: Программа вводит строки, пок
        а пользователь не введёт пустую строку (нажав enter).
                Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

                Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
                Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
                Программа выводит слова на экран.*/
        int i=0;
        String[] str = new String[1000];
        while (true){
            String s = sc.nextLine();
            if(s.isEmpty())break;
            str[i] = s;
            i++;
        }
        int n = i;
        System.out.println("Task 1a");
        for(int j=0; j< i; j++){
            System.out.println(str[j].toUpperCase());
        }
        // Я решил использовать данные массива str.Не выжу смысла для переписавания кода для ввода строк.Если не примите такую задчу
        // дайте знать я поправлю.
        System.out.println("Task 1b");
        for(i=0; i<n; i++){
            if(str[i].length()%2==0){
                str[i]+=str[i];
            }
            else{
                str[i] = str[i]+str[i]+str[i];
            }
            System.out.println(str[i]);
        }

        /*2

        Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
*/
        String[] str2 = new String[5];
        System.out.println("Task 2");
        for(i=0; i<5; i++){
            str2[i] = sc.nextLine();
        }
        int mn = 9999999,mx=0;
        String mn1="",mx1="";
        for(i=0; i<str2.length; i++){
            if(mn>str2[i].length()){
                mn = str2[i].length();
                mn1 = str2[i];
            }
            if(mx<str2[i].length()){
                mx = str2[i].length();
                mx1 = str2[i];
            }
        }
        System.out.println("mn_str= " + mn1 + " size= " + mn);
        System.out.println("mx_str= "+  mx1 + " size= "+ mx);
       /* 3

        1. Создать массив на 10 строк.
        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
        System.out.println("Task 3");
        String[] str3 = new String[10];
        for(i=0; i<8; i++){
            str3[i] = sc.nextLine();
        }
        for(i = str3.length-1; i>-1; i--){
            System.out.println(str3[i]);
        }

        /*4

        1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
        которой совпадает с текущим индексом из массива чисел.
*/
        System.out.println("Task 4");
        String[] str4 = new String[10];
        int[] num = new int[10];
        for(i=0;i <10; i++){
            str4[i] = sc.nextLine();
        }
        for(i=0; i<num.length; i++){
            num[i]= str4[i].length();
            System.out.println(num[i]);
        }
        /*5

        1. Считать 6 строк и заполнить ими массив strings.
        2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").*/
        System.out.println("Task 5");
        String[] str5 = new String[6];
        for(i=0; i<6; i++){
            str5[i] =sc.nextLine();
        }
        for(i=0; i<str5.length; i++){
            for(int j=0; j<str5.length; j++){
                if(i!=j && str5[i]!=null) {
                    if (str5[i].equals(str5[j])) {
                        str5[i]=null;
                    }
                }
            }
        }
        for(i=0; i<str5.length; i++){
            System.out.println(str5[i]);
        }
    }
}