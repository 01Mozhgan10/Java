package Primary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> dateTimeEntries = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("ما به شما اجازه می‌دهیم که تاریخ و زمان را ثبت کنید. برای خروج 'exit' را تایپ کنید.");

        while (true) {
            LocalDateTime now = LocalDateTime.now(); // دریافت تاریخ و زمان جاری
            String formattedDateTime = now.format(formatter); // فرمت‌دهی تاریخ و زمان

            System.out.println("تاریخ و زمان جاری: " + formattedDateTime);
            System.out.println("آیا می‌خواهید این تاریخ و زمان را ذخیره کنید؟ (یا با زدن اینتر می‌توانید ادامه دهید یا 'exit' برای خروج)");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break; // در صورتی که کاربر 'exit' را وارد کند، حلقه متوقف می‌شود
            }


            dateTimeEntries.add(formattedDateTime); // افزودن تاریخ و زمان به لیست

            // نمایش لیست به‌روز شده
            System.out.println("لیست به‌روز شده تاریخ و زمان:");
            for (String entry : dateTimeEntries) {
                System.out.println(entry);
            }
        }

        System.out.println("برنامه به پایان رسید.");
        scanner.close();
    }
}