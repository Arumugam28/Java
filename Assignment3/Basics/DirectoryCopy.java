import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DirectoryCopy {
    public static void main(String[] args) {
        String sourceDirPath = "D:\\Inspire Intership Details\\Basics\\source";
        String destDirPath = "D:\\Inspire Intership Details\\Basics\\distination";

        File sourceDir = new File(sourceDirPath);
        File destDir = new File(destDirPath);
        if (!destDir.exists()) {
            destDir.mkdirs();
        }

        File[] files = sourceDir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    Path sourcePath = file.toPath();
                    Path targetPath = Paths.get(destDirPath, file.getName());
                    try {
                        Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        System.out.println("Failed to copy " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("File copy completed.");
        } else {
            System.out.println("Source directory is empty or does not exist.");
        }
    }
}
