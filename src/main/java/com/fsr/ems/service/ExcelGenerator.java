package com.fsr.ems.service;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.net.URLDecoder;

public class ExcelGenerator {
    public static void main(String[] args) {
        String inputFilePath = "C:/Work/fsr_ems/src/main/java/com/fsr/ems/service/見積書01.xlsx";
        String outputStreamFilePath = "C:/Work/fsr_ems/src/main/java/com/fsr/ems/service/見積書.xlsx";


        try (
                FileInputStream fileInputStream = new FileInputStream(inputFilePath); // 读取模板文件
                Workbook workbook = new XSSFWorkbook(fileInputStream); // 打开工作簿
        ) {
            Sheet sheet = workbook.getSheetAt(0); // 获取第一个工作表
            Row row = sheet.getRow(0); // 获取第一行
            if (row == null) {
                row = sheet.createRow(0); // 如果第一行不存在，则创建
            }
            Cell cell = row.getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK); // 获取A1单元格
            cell.setCellValue("御　見　積　書 （準委任)"); // 设置单元格内容

            // 将更改保存到新文件
            try (FileOutputStream outputStream =  new FileOutputStream("C:/Work/fsr_ems/src/main/java/com/fsr/ems/service/見積書.xlsx")) {
                workbook.write(outputStream);
                System.out.println("Excel 模板填充完成！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}