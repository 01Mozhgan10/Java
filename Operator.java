//برنامه ای بنویسید که 2 عدد و عملگر مورد نظر را از کاربر بگیرد و حاصل آن را نشان دهد؟

package Primary;
import java.util.Scanner;

public class Operator {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = num.nextInt();
        System.out.println("Enter a number2:");
        int num2 = num.nextInt();

        //دستور چاپ
        System.out.println("لطفاً یک عملگر وارد کنید (+, -, *, /): "); 
        //تعریف متغیر از نوع رشته
        String operator = num.next();
        //استفاده از دستور سوییچ برای بررسی چندین شرایط
        switch (operator) {
                //اگر کاربر + را انتخاب کرد
            case "+":
                //تعریف متغیر از نوع صحیح و مجموع آن
                int result1 = num1 + num2;
                //دستور چاپ و حاصل
                System.out.println("عملگر جمع انتخاب شد حاصل می شود:" + " " + result1);
                //اگر دستور اجرا شد از برنامه خارج شو
                break;
                //اگر کاربر - را انتخاب کرد 
            case "-":
                //تعریف متغیر از نوع صحیح و تفریق آن
                int result2 = num1 - num2;
                //دستور چاپ و حاصل
                System.out.println("عملگر تفریق انتخاب شد حاصل می شود:" + " " + result2);
                //اگر دستور اجرا شد از برنامه خارج شو
                break;
                //اگر کاربر * را انتخاب کرد
            case "*":
                //تعریف متغیر از نوع صحیح و ضرب آن
                int result3 = num1 * num2;
                //دستور چاپ و حاصل
                System.out.println("عملگر ضرب انتخاب شد حاصل می شود:" + " " + result3);
                //اگر دستور اجرا شد از برنامه خارج شو
                break;
                //اگر کاربر / را انتخاب کرد
            case "/":
                //تعریف متغیر از نوع اعشاری و تقسیم آن
                float result4 =(float) num1 / num2;
                //دستور چاپ و حاصل
                System.out.println("عملگر تقسیم انتخاب شد حاصل می شود:" + " " + result4);
                //اگر دستور اجرا شد از برنامه خارج شو
                break;
                //در صورت عادی(هیچ کدام از این موارد نبود)
            default:
                //کاربر هر چیز دیگری وارد کرد این دستور چاپ شود
                System.out.println("عملگر نامعتبر وارد شده است.");
        }
    }
}
