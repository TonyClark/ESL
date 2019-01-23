package esl.lib;

import static esl.lib.Lib.$nil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static final String			SAMPLE_XLSX_FILE_PATH	= "/Users/clarkt1/Dropbox/Aston_Files/workspace/esl/esl/data/cars.xlsx";

	//public static SimpleDateFormat	simpleDateFormat			= new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", new Locale("us"));
	public static SimpleDateFormat	simpleDateFormat			= new SimpleDateFormat("dd/mm/yyyy", new Locale("us"));

	public static ESLVal writeWorkbook(String path, ESLVal term) {
		try {
			XSSFWorkbook workbook = new XSSFWorkbook();
			writeTerm(term, workbook);
			FileOutputStream out = new FileOutputStream(new File(path));
			workbook.write(out);
			out.close();
			return term;
		} catch (EncryptedDocumentException | IOException e) {
			System.err.println("ERROR " + path);
			e.printStackTrace(System.err);
			return new ESLVal("ExcelError", new ESLVal(e.toString()));
		}
	}

	private static void writeTerm(ESLVal term, Workbook workbook) {
		ESLVal sheets = term.termRef(0);
		while (!sheets.isNil()) {
			ESLVal sheet = sheets.head();
			sheets = sheets.tail();
			String name = sheet.termRef(0).strVal;
			ESLVal rows = sheet.termRef(1);
			Sheet s = workbook.createSheet(name);
			int rowIndex = 0;
			while (!rows.isNil()) {
				ESLVal row = rows.head();
				rows = rows.tail();
				Row r = s.createRow(rowIndex++);
				ESLVal cells = row.termRef(0);
				int cellIndex = 0;
				while (!cells.isNil()) {
					ESLVal cell = cells.head();
					cells = cells.tail();
					String valueType = cell.termName;
					ESLVal value = cell.termRef(0);
					Cell c = r.createCell(cellIndex++);
					switch (valueType) {
					case "XStr":
						c.setCellValue(value.strVal);
						break;
					case "XFloat":
						c.setCellValue(value.doubleVal);
						break;
					case "XBool":
						c.setCellValue(value.boolVal);
						break;
					case "XDate":
						try {
							Date date = simpleDateFormat.parse(value.strVal);
							c.setCellValue(date);
							CreationHelper creationHelper = workbook.getCreationHelper();
							CellStyle cellStyle = workbook.createCellStyle();
							cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("dd/mm/yyyy"));
							c.setCellStyle(cellStyle);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						break;
					case "XFormula":
						c.setCellFormula(value.strVal);
						break;
					default:
					}
				}
			}
		}
	}

	public static ESLVal readWorkbook(String path) {
		Workbook workbook;
		try {
			workbook = WorkbookFactory.create(new File(path));
			ESLVal term = getTerm(workbook);
			workbook.close();
			return term;
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			return new ESLVal("ExcelError", new ESLVal(e.toString()));
		}
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
		Sheet sheet = workbook.getSheetAt(0);

		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();

		// 3. Or you can use Java 8 forEach loop with lambda
		System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
		sheet.forEach(row -> {
			row.forEach(cell -> {
				printCellValue(cell);
			});
			System.out.println();
		});

		// Closing the workbook
		workbook.close();

		System.out.println(readWorkbook(SAMPLE_XLSX_FILE_PATH));
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

	private static ESLVal getTerm(Workbook book) {
		return new ESLVal("XWorkbook", getSheets(book));
	}

	private static ESLVal getSheets(Workbook book) {
		ESLVal[] sheets = new ESLVal[] { $nil };
		book.forEach(sheet -> {
			sheets[0] = sheets[0].cons(getTerm(sheet));
		});
		return sheets[0].reverse();
	}

	private static ESLVal getTerm(Sheet sheet) {
		return new ESLVal("XSheet", new ESLVal(sheet.getSheetName()), getRows(sheet));
	}

	private static ESLVal getRows(Sheet sheet) {
		ESLVal[] rows = new ESLVal[] { $nil };
		sheet.forEach(row -> {
			rows[0] = rows[0].cons(getTerm(row));
		});
		return rows[0].reverse();
	}

	private static ESLVal getTerm(Row row) {
		return new ESLVal("XRow", getCells(row));
	}

	private static ESLVal getCells(Row row) {
		ESLVal[] cells = new ESLVal[] { $nil };
		row.forEach(cell -> {
			cells[0] = cells[0].cons(getCell(cell));
		});
		return cells[0].reverse();
	}

	private static ESLVal getCell(Cell cell) {
		switch (cell.getCellTypeEnum()) {
		case BOOLEAN:
			return new ESLVal("XBool", new ESLVal(cell.getBooleanCellValue()));
		case STRING:
			return new ESLVal("XStr", new ESLVal(cell.getRichStringCellValue().getString()));
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				return new ESLVal("XDate", new ESLVal(simpleDateFormat.format(cell.getDateCellValue())));
			} else {
				return new ESLVal("XFloat", new ESLVal(cell.getNumericCellValue()));
			}
		case FORMULA:
			return new ESLVal("XFormula", new ESLVal(cell.getCellFormula()));
		case BLANK:
			return new ESLVal("XBlank", new ESLVal[] {});
		default:
			return new ESLVal("XUnknown", new ESLVal[] {});
		}
	}
}