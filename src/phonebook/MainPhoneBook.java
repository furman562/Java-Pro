package phonebook;

import java.util.List;

public class MainPhoneBook {
    public static void main(String[] args) {
        Record record1 = new Record("John Doe", "123-456-7890");
        Record record2 = new Record("Jane Smith", "987-654-3210");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addRecord(record1);
        phoneBook.addRecord(record2);

        String searchName = "John Doe";
        Record foundRecord = phoneBook.find(searchName);
        if (foundRecord != null) {
            System.out.println("Found record for " + searchName + ": " + foundRecord.getPhoneNumber());
        } else {
            System.out.println("Record not found for " + searchName);
        }


        String searchNameAll = "John Doe";
        List<Record> foundRecordsAll = phoneBook.findAll(searchNameAll);
        if (foundRecordsAll != null) {
            System.out.println("Found records for " + searchNameAll + ": " + foundRecordsAll);
        } else {
            System.out.println("Records not found for " + searchNameAll);
        }
    }
}


