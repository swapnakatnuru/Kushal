package Utilis;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverUtilities {
    public static Properties prop;



    public void navigateTOUrl()  {

        prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/test/resources/data.properties");
            prop.load(fs);


        } catch (Exception e) {
            e.printStackTrace();

        }

        DriverFactory.driver.navigate().to(prop.getProperty("url"));
    }
    public void navigateTOUrl1()  {

        prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/test/resources/data.properties");
            prop.load(fs);


        } catch (Exception e) {
            e.printStackTrace();

        }

        DriverFactoryEd.driver.navigate().to(prop.getProperty("url1"));
    }

    public void firstNameTxt() {
        DriverFactory.driver.navigate().to(prop.getProperty("FirstName"));

    }

   /* public static String dataDriven(String str) throws IOException {


        FileInputStream file = new FileInputStream("login.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowcount = sheet.getLastRowNum();//returns row count
        int colcount = sheet.getRow(0).getLastCellNum();//returns column cell count
        for (int i = 1; i <= rowcount; i++) {
            XSSFRow currentrow = sheet.getRow(i);               //focus on current row
            String fn = currentrow.getCell(1).getStringCellValue();
            //String ln = currentrow.getCell(1).getStringCellValue();

            //for (int j = 0; j < colcount; j++) {
            //    String value = currentrow.getCell(j).toString();                //will read value from cell
            //    System.out.println(value);
            }

        return str;
    }*/
public String getPageTielEd(){
    return  DriverFactoryEd.driver.getTitle();
}

        public String getPageTitle() {
            return DriverFactory.driver.getTitle();
        }
    public void pageRefresh(){
            DriverFactory.driver.navigate().refresh();
    }

    }
