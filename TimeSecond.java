package Primary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimeSecond {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            List<String> previousEntries = new ArrayList<>();

            String fileName = "text.txt";
            String dateTimeString;

            // خواندن تاریخ و ساعت از فایل
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
                dateTimeString = bufferedReader.readLine();
                // استخراج تاریخ و ساعت از رشته خوانده شده
                if (dateTimeString != null && dateTimeString.startsWith("تاریخ و ساعت فعلی: ")) {
                    dateTimeString = dateTimeString.replace("تاریخ و ساعت فعلی: ", "");
                    System.out.println("تاریخ و ساعت خوانده شده: " + dateTimeString);
                } else {
                    System.out.println("فرمت داده در فایل نادرست است.");
                    return;
                }
            } catch (IOException e) {
                System.out.println("خطا در خواندن از فایل: " + e.getMessage());
                return;
            }

            // فرمت تاریخ و ساعت
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, formatter);

            // محاسبه تعداد ثانیه‌ها از شروع روز
            long secondsFromStartOfDay = ChronoUnit.SECONDS.between(localDateTime.toLocalDate().atStartOfDay(), localDateTime);

            System.out.println("تعداد ثانیه‌ها از شروع روز: " + secondsFromStartOfDay);

            // اطلاعات قبلی
            System.out.println("اطلاعات قبلی:");
            previousEntries.add(dateTimeString);

            // نمایش اطلاعات قبلی
            for (String entry : previousEntries) {
                System.out.println(entry);
            }

            // افزودن اطلاعات جدید
            System.out.println("\nبرای وارد کردن اطلاعات جدید، آن را تایپ کنید و 'Enter' را بزنید (برای خروج 'exit' را تایپ کنید):");

            while (true) {
                LocalDateTime now = LocalDateTime.now(); // دریافت تاریخ و زمان جاری
                String formattedDateTime = now.format(formatter);
                String newEntry = scanner.nextLine();

                if (newEntry.equalsIgnoreCase("exit")) {
                    break; // در صورتی که کاربر 'exit' را وارد کند، حلقه متوقف می‌شود
                }

                previousEntries.add(newEntry);// افزودن ورودی جدید به لیست
                previousEntries.add(formattedDateTime);
                System.out.println("اطلاعات جدید ذخیره شد.");

                // نمایش لیست به‌روز شده
                System.out.println("لیست به‌روز شده اطلاعات:");
                for (String entry : previousEntries) {
                    System.out.println(entry);
                }
            }
        }

    }