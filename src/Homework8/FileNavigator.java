package Homework8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        this.fileMap = new HashMap<>();
    }

    public void add(FileData fileData) {
        String path = fileData.getPath();

        if (!path.equals(getKeyForPath(path))) {
            System.out.println("Помилка: Шлях-ключ і шлях до файлу не співпадають.");
            return;
        }

        fileMap.computeIfAbsent(path, k -> new ArrayList<>()).add(fileData);
    }

    public List<FileData> find(String path) {
        return fileMap.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(String path, long maxSize) {
        List<FileData> files = fileMap.getOrDefault(path, new ArrayList<>());
        List<FileData> result = new ArrayList<>();

        for (FileData file : files) {
            if (file.getSize() <= maxSize) {
                result.add(file);
            }
        }

        return result;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();

        for (List<FileData> files : fileMap.values()) {
            allFiles.addAll(files);
        }

        allFiles.sort((file1, file2) -> Long.compare(file1.getSize(), file2.getSize()));

        return allFiles;
    }

    private String getKeyForPath(String path) {
        String[] parts = path.split("/");
        StringBuilder key = new StringBuilder();

        for (int i = 0; i < parts.length - 1; i++) {
            key.append(parts[i]);
            key.append("/");
        }

        return key.toString();
    }

    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();


        FileData file1 = new FileData("file1.txt", 100, "/path/to/files/");
        FileData file2 = new FileData("file2.txt", 150, "/path/to/files/");
        FileData file3 = new FileData("file3.txt", 80, "/another/path/");

        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file3);


        List<FileData> filesAtPath = fileNavigator.find("/path/to/files/");
        System.out.println("Файли за шляхом /path/to/files/: " + filesAtPath);


        List<FileData> filteredFiles = fileNavigator.filterBySize("/path/to/files/", 120);
        System.out.println("Файли за шляхом /path/to/files/ із розміром менше 120 байт: " + filteredFiles);


        fileNavigator.remove("/another/path/");
        System.out.println("Після видалення шляху /another/path/: " + fileNavigator.find("/another/path/"));


        List<FileData> sortedFiles = fileNavigator.sortBySize();
        System.out.println("Відсортовані файли за розміром: " + sortedFiles);
    }
}



