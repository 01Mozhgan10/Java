//برنامه ای بنویسید که ساعت را به ثانیه تبدیل کند؟(کاربر ساعت را به طور دقیق وارد کند : 12:35:07)

package Primary;

import java.util.Scanner;

public class Hours {
    public static void main(String[]args) {
        Scanner hours2 = new Scanner(System.in);
        //یک شی از کلاس اسکنر می سازد که ورودی را از کاربر بگیرد

        System.out.print("Enter the elapsed time in hours(hh:mm:ss): ");
        //دستور چاپ
                String timeString = hours2.nextLine();
                //ساعت وارد شده را از کاربر میگیرد و آن را به صورت رشته ای در یک متغیر دیگر ذخیره می کند

                    String[] timeParts = timeString.split(":");
                    //ایجاد یک آرایه از نوع رشته و تقسیم بندی اعداد وارد شده توسط دستور
                    //split
                    //و ذخیره در آرایه رشته استرینگ

                    //تعریف متغیر از نوع صحیح و تبدیل اولین آرایه از نوع رشته به عدد صحیح
                    int hours = Integer.parseInt(timeParts[0]);
                    //تعریف متغیر از نوع صحیح و تبدیل دومین آرایه از نوع رشته به عدد صحیح
                    int minutes = Integer.parseInt(timeParts[1]);
                    //تعریف متغیر از نوع صحیح و تبدیل سومین آرایه از نوع رشته به عدد صحیح
                    int seconds = Integer.parseInt(timeParts[2]);

                    //تعریف یک متغیر صحیح برای ثانیه و محاسبات آن
                    int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

                    //دستور چاپ
                    System.out.println("تعداد ثانیه ها: " + totalSeconds);
                }
                }