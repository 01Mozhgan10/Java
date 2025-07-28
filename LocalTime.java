//برنامه ای بنویسید که ساعت و تاریخ سیستم را در فایل text ذخیره کند؟

package Primary;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTime {
        public static void main(String[] args) {
            // دریافت تاریخ و ساعت فعلی
            LocalDateTime now = LocalDateTime.now();

            // فرمت تاریخ و ساعت
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);

            // نام فایل برای ذخیره
            String fileName = "text.txt";

            try (FileWriter fileWriter = new FileWriter(fileName)) {
                // نوشتن تاریخ و ساعت در فایل
                fileWriter.write("تاریخ و ساعت فعلی: " + formattedDateTime);
                System.out.println("تاریخ و ساعت با موفقیت در فایل ذخیره شد: " + fileName);
            } catch (IOException e) {
                System.out.println("خطا در نوشتن به فایل: " + e.getMessage());
            }
        }
}