package day16;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import java.io.FileInputStream;


public class C01_ExcelRead {

    @Test
    public void readExcelTest() throws Exception {

        String path="./src/test/java/resources/Capitals.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        Sheet sheet1=workbook.getSheetAt(0);

        Row row1=sheet1.getRow(0);
        Cell cell1=row1.getCell(0);
        System.out.println(cell1);


    }
}
