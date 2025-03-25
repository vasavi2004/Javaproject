package day7;
	import java.io.*;
	import java.util.*;

	class FileMetadata implements Serializable {
	    private static final long serialVersionUID = 1L;
	    String fileName;
	    long fileSize;
	    long lastModified;

	    public FileMetadata(String fileName, long fileSize, long lastModified) {
	        this.fileName = fileName;
	        this.fileSize = fileSize;
	        this.lastModified = lastModified;
	    }
	}

	public class FileBackupSystem {
	    private static final String BACKUP_DIR = "backup";
	    private static final String METADATA_FILE = "backup_metadata.dat";

	    public static void backupFiles(String sourceDir) {
	        File sourceFolder = new File(sourceDir);
	        File backupFolder = new File(BACKUP_DIR);
	        if (!backupFolder.exists()) backupFolder.mkdir();

	        List<FileMetadata> metadataList = new ArrayList<>();

	        for (File file : Objects.requireNonNull(sourceFolder.listFiles())) {
	            if (file.isFile()) {
	                File backupFile = new File(BACKUP_DIR + File.separator + file.getName());
	                copyFile(file, backupFile);
	                metadataList.add(new FileMetadata(file.getName(), file.length(), file.lastModified()));
	            }
	        }
	        saveMetadata(metadataList);
	        System.out.println("Backup completed.");
	    }

	    public static void recoverFiles() {
	        List<FileMetadata> metadataList = loadMetadata();
	        if (metadataList == null) return;

	        for (FileMetadata metadata : metadataList) {
	            File backupFile = new File(BACKUP_DIR + File.separator + metadata.fileName);
	            File recoveredFile = new File(metadata.fileName);
	            copyFile(backupFile, recoveredFile);
	        }
	        System.out.println("Files recovered successfully.");
	    }

	    private static void copyFile(File source, File dest) {
	        try (FileInputStream fis = new FileInputStream(source);
	             FileOutputStream fos = new FileOutputStream(dest)) {
	            byte[] buffer = new byte[1024];
	            int bytesRead;
	            while ((bytesRead = fis.read(buffer)) != -1) {
	                fos.write(buffer, 0, bytesRead);
	            }
	        } catch (IOException e) {
	            System.out.println("Error copying file: " + source.getName());
	        }
	    }

	    private static void saveMetadata(List<FileMetadata> metadataList) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(METADATA_FILE))) {
	            oos.writeObject(metadataList);
	        } catch (IOException e) {
	            System.out.println("Error saving metadata.");
	        }
	    }

	    private static List<FileMetadata> loadMetadata() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(METADATA_FILE))) {
	            return (List<FileMetadata>) ois.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error loading metadata.");
	            return null;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("1. Backup Files\n2. Recover Files\n3. Exit");
	            System.out.print("Enter choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter directory path for backup: ");
	                    String sourceDir = scanner.nextLine();
	                    backupFiles(sourceDir);
	                    break;
	                case 2:
	                    recoverFiles();
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 3);
	        scanner.close();
	    }
	}
