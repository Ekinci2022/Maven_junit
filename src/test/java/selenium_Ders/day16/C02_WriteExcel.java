package selenium_Ders.day16;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_WriteExcel {


    @Test
    public void writeExcelTest() throws IOException {


       // WORKBOOK (EXCEL DOSYASI) > WORKSHEET/SHEET(SAYFA) >ROW (SATIR)> CELL(VERI HUCRESI)
        String path ="./src/test/java/resources/Capitals.xlsx";
//        String path =".\\src\\test\\java\\resources\\Capitals.xlsx";//WINDOWS
//        DOSYAYI AC

        FileInputStream fileInputStream = new FileInputStream(path);

//        EXCEL DOSYASINI AC /WORKBOOK AC

        Workbook workbook = WorkbookFactory.create(fileInputStream);

//        SAYFAYI AC / Sheet1
//        Sheet sheet1 = workbook.getSheetAt(0);//index 0 dan baslar. ilk sayfayi ac

        Sheet sheet1 = workbook.getSheet("Sheet1");// Sheet1 isimli sayfayi ac

//        ILK SATIRA GIT / Row
        Row row1 = sheet1.getRow(0);//ILK SATIRA GIT

//             ilk satir 3.sutunu create et
        Cell cell3 =row1.createCell(2);

//          Nufus ekle

            cell3.setCellValue("NUFUS");

            //2.satir 3.sutuna 450000
        sheet1.getRow(1).createCell(2).setCellValue("450000");

            //3.satir 3.sutuna 350000
        sheet1.getRow(2).createCell(2).setCellValue("350000");

        //4.satir dil ekle
        Cell cell4=row1.createCell(3);
        cell4.setCellValue("dil");

        //7.satir 3.sutuna 40.000 ekle
        sheet1.getRow(6).createCell(2).setCellValue("40.000");

        // 8.satir 4.sutuna ingilizce ekle
        sheet1.getRow(7).createCell(3).setCellValue("ingilizce");

        //9.satir 4.sutuna almanca ekle

        sheet1.getRow(8).createCell(3).setCellValue("Almanca");

        Cell cell5=row1.createCell(4);
        cell5.setCellValue("Kita");

        // 6.satir 5.sutuna avrupa ekle
        sheet1.getRow(5).createCell(4).setCellValue("Avrupa");
        //6.satir 4.sutuna yunanca ekle
        sheet1.getRow(5).createCell(3).setCellValue("yunanca");


            //KAYDET: kayit islemi file output islemi ile yapilir.
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
    }
}
