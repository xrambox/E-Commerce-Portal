package de.buw.se;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFromExcel {

	private static final String CSV_FILE_PATH = "src\\main\\resources\\UserLoginDetails.csv";

	public static boolean validateUser(String providedUserName, String providedPassword) {
		try (Reader reader = new FileReader(CSV_FILE_PATH);
				CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader())) {

			for (CSVRecord csvRecord : csvParser) {
				String userName = csvRecord.get("userName");
				String password = csvRecord.get("password");

				if (userName.equals(providedUserName) && password.equals(providedPassword)) {
					return true; // Credentials matched
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false; // No matching credentials found
	}
}