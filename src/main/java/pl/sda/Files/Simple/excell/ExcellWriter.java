package pl.sda.Files.Simple.excell;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

class ExcellWriter {

    public List<Person> write(String filePath) {

        List<Person> persons = new ArrayList<>();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Excell_File");

        Map<Integer, Object[]> map = new TreeMap<>();
        map.put(0, new Object[]{"name", "lastName"});
        map.put(1, new Object[]{"Jan", "Kowalski"});
        map.put(2, new Object[]{"Michał", "Basiński"});

        Set<Integer> keyset = map.keySet();

        int rowNumber = 0;

        for (Integer key : keyset) {

            Row row = sheet.createRow(rowNumber++);
            Object[] tab = map.get(key);

            int cellNumber = 0;
            for (Object obj : tab) {

                Cell cell = row.createCell(cellNumber++);

                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
        }
        try {

            FileOutputStream out = new FileOutputStream(filePath);
            workbook.write(out);
            out.close();
            System.out.println(".xlsx written.");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return persons;
    }
}



