//برنامه ای بنویسید که 2 عدد از کاربر بگیرد و مجموع آن ها را نشان دهد؟

//دسته بندی کلاس ها
package Primary;
//دستور اولیه ای که بتوانیم از کاربر چیزی دریافت کنیم
import java.util.Scanner;
//ایجاد کلاس
public class Sum {
    //متد اصلی برای شروع برنامه
    public static void main(String[] args) {
        //ایجاد یک شی و گرفتن اطلاعات وارد شده توسط کاربر
        Scanner num = new Scanner(System.in);
        //دستور چاپ
        System.out.print("Enter the first number: ");
        //تعریف متغیر از نوع صحیح و وارد کردن عدد اول توسط کاربر
        int num1 = num.nextInt();
        //دستور چاپ
        System.out.print("Enter the second number: ");
        //تعریف متغیر از نوع صحیح و وارد کردن عدد دوم توسط کاربر
        int num2 = num.nextInt();
        //تعریف متغیر از نوع صحیح و مجموع 2 عدد
        int sum = num1 + num2;
        //دستور چاپ حاصل جمع
        System.out.println("Sum of numbers: " + sum);
    }
}
