package test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import list.List;
import list.Nil;
import runtime.data.Term;

public class ExcelReader {
	
	private static class Terms {
		private List<Term> terms = new Nil<Term>();
		public void append(Term term) { terms = terms.append(term); }
		public List<Term> getTerms() { return terms; }
	}
	public static final String SAMPLE_XLSX_FILE_PATH = "/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/NSS Taught Download 2018.xlsx";
	
	public static Term readWorkbook(String path) {
		Workbook workbook;
		try {
			workbook = WorkbookFactory.create(new File(path));
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			return new Term("ExcelError",e.toString());
		}
		return getTerm(workbook);
	}

	public static void main(String[] args) throws IOException, InvalidFormatException {

		// Creating a Workbook from an Excel file (.xls or .xlsx)
		Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

		// Retrieving the number of sheets in the Workbook
		System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

		/*
		 * ============================================================= Iterating over
		 * all the sheets in the workbook (Multiple ways)
		 * =============================================================
		 */

		// 1. You can obtain a sheetIterator and iterate over it
		Iterator<Sheet> sheetIterator = workbook.sheetIterator();
		System.out.println("Retrieving Sheets using Iterator");
		while (sheetIterator.hasNext()) {
			Sheet sheet = sheetIterator.next();
			System.out.println("=> " + sheet.getSheetName());
		}

		// 2. Or you can use a for-each loop
		System.out.println("Retrieving Sheets using for-each loop");
		for (Sheet sheet : workbook) {
			System.out.println("=> " + sheet.getSheetName());
		}

		// 3. Or you can use a Java 8 forEach with lambda
		System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
		workbook.forEach(sheet -> {
			System.out.println("=> " + sheet.getSheetName());
		});

		/*
		 * ================================================================== Iterating
		 * over all the rows and columns in a Sheet (Multiple ways)
		 * ==================================================================
		 */

		// Getting the Sheet at index zero
		Sheet sheet = workbook.getSheetAt(1);

		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();

		/*
		 * 
		 * // 1. You can obtain a rowIterator and columnIterator and iterate over them
		 * System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
		 * Iterator<Row> rowIterator = sheet.rowIterator(); while
		 * (rowIterator.hasNext()) { Row row = rowIterator.next();
		 * 
		 * // Now let's iterate over the columns of the current row Iterator<Cell>
		 * cellIterator = row.cellIterator();
		 * 
		 * while (cellIterator.hasNext()) { Cell cell = cellIterator.next(); String
		 * cellValue = dataFormatter.formatCellValue(cell); System.out.print(cellValue +
		 * "\t"); } System.out.println(); }
		 * 
		 * // 2. Or you can use a for-each loop to iterate over the rows and columns
		 * System.out.
		 * println("\n\nIterating over Rows and Columns using for-each loop\n"); for
		 * (Row row: sheet) { for(Cell cell: row) { String cellValue =
		 * dataFormatter.formatCellValue(cell); System.out.print(cellValue + "\t"); }
		 * System.out.println(); }
		 * 
		 */

		// 3. Or you can use Java 8 forEach loop with lambda
		System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
		sheet.forEach(row -> {
			row.forEach(cell -> {
				printCellValue(cell);
			});
			System.out.println();
		});
		
		Term t = getTerm(workbook);
		List<Term> ss = (List<Term>)t.getValues()[0];
		while(!ss.isNil()) {
			System.out.println(ss.getHead());
			ss = ss.getTail();
		}

		// Closing the workbook
		workbook.close();
	}

	private static void printCellValue(Cell cell) {
		switch (cell.getCellTypeEnum()) {
		case BOOLEAN:
			System.out.print(cell.getBooleanCellValue());
			break;
		case STRING:
			System.out.print(cell.getRichStringCellValue().getString());
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				System.out.print(cell.getDateCellValue());
			} else {
				System.out.print(cell.getNumericCellValue());
			}
			break;
		case FORMULA:
			System.out.print(cell.getCellFormula());
			break;
		case BLANK:
			System.out.print("");
			break;
		default:
			System.out.print("");
		}

		System.out.print("\t");
	}

	private static Term getTerm(Workbook book) {
		return new Term("XWorkbook", getSheets(book));
	}

	private static List<Term> getSheets(Workbook book) {
		Terms sheets = new Terms();
		book.forEach(sheet -> {
			sheets.append(getTerm(sheet));
		});
		return sheets.getTerms();
	}

	private static Term getTerm(Sheet sheet) {
		return new Term("XSheet", sheet.getSheetName(),getRows(sheet));
	}

	private static List<Term> getRows(Sheet sheet) {
		Terms rows = new Terms();
		sheet.forEach(row -> {
			rows.append(getTerm(row));
		});
		return rows.getTerms();
	}

	private static Term getTerm(Row row) {
		return new Term("XRow", getCells(row));
	}

	private static List<Term> getCells(Row row) {
		Terms cells = new Terms();
		row.forEach(cell -> {
			cells.append(getCell(cell));
		});
		return cells.getTerms();
	}

	private static Term getCell(Cell cell) {
		switch (cell.getCellTypeEnum()) {
		case BOOLEAN:
			return new Term("XBool",cell.getBooleanCellValue());
		case STRING:
			return new Term("XStr",cell.getRichStringCellValue().getString());
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				return new Term("XDate",cell.getDateCellValue().toString());
			} else {
				return new Term("XFloat",cell.getNumericCellValue());
			}
		case FORMULA:
			return new Term("XFormula",cell.getCellFormula());
		case BLANK:
			return new Term("XBlank");
		default:
			return new Term("XUnknown");
		}
	}
}