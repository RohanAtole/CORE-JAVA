import java.io.File;

public class FileOrganizer {

    public static void main(String[] args) {

        File folder = new File("sample_folder"); // change path

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path.");
            return;
        }

        for (File file : folder.listFiles()) {
            if (file.isFile()) {

                String name = file.getName();
                int dot = name.lastIndexOf(".");

                if (dot == -1) continue;

                String ext = name.substring(dot + 1);
                File newDir = new File(folder, ext);

                if (!newDir.exists()) newDir.mkdir();

                file.renameTo(new File(newDir, name));
            }
        }

        System.out.println("Files organized by extension.");
    }
}
