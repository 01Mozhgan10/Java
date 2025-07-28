//برنامه ای بنویسید که ورودی زمان را از کاربر بگیرد و آن را به فرمت ساعت،
// دقیقه و ثانیه تبدیل کند.
// همچنین باید بررسی کنیم که آیا ورودی کاربر کامل است یا ناقص.

package Primary;
import java.util.Scanner;

public class Saat {
        public static void main(String[] args) {
            Scanner desired = new Scanner(System.in);

            System.out.println("Please enter the clock(HH:mm:ss or HH:mm or HH):");

            String input = desired.nextLine();
            String[] timeParts = input.split(":");
            int hour, minute = 0, second = 0;
            // بررسی تعداد اجزای ورودی
            switch (timeParts.length) {
                case 3: // HH:mm:ss
                    hour = Integer.parseInt(timeParts[0]);
                    minute = Integer.parseInt(timeParts[1]);
                    second = Integer.parseInt(timeParts[2]);
                    break;
                case 2: // HH:mm
                    hour = Integer.parseInt(timeParts[0]);
                    minute = Integer.parseInt(timeParts[1]);
                    break;
                case 1: // HH
                    hour = Integer.parseInt(timeParts[0]);
                    break;
                default:
                    System.out.println("ورودی نامعتبر است.");
                    return;
            }
            // بررسی صحت زمان
            if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
                System.out.println("زمان وارد شده نامعتبر است.");
                return;
            }
            // نمایش زمان به فرمت کامل
            System.out.printf("زمان وارد شده: %02d:%02d:%02d\n", hour, minute, second);
        }
    }