import java.io.*;;

public class FileDemo {
    
    public static void main(String[] args) {
        
        // Create a File Object 
        File file=new File("details.txt");

        // Get the details of the file
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        // Check if it is a file or directory
        if (file.isFile()) {
            System.out.println("It is a file.");
        } else if (file.isDirectory()) {
            System.out.println("It is a directory.");
        } else {
            System.out.println("It is neither a file nor a directory.");
        }

        // Check for read, write and hidden permissions
        if (file.canRead()) {
            System.out.println("File is readable.");
        } else {
            System.out.println("File is not readable.");
        }

        if (file.canWrite()) {
            System.out.println("File is writable.");
        } else {
            System.out.println("File is not writable.");
        }

        if (file.isHidden()) {
            System.out.println("File is hidden.");
        } else {
            System.out.println("File is not hidden.");
        }

        // Create a new empty file
        try {
            File newFile = new File("results.txt");
            if (newFile.createNewFile()) {
                System.out.println("New file created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

    }
}
