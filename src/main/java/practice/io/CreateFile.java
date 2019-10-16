package practice.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        String separator = System.getProperty("file.separator");
        String absoluteDir ="/home/navin/workspace/git/Java-practice/src/main/resources/io";
        String absolutePath = absoluteDir+separator+"createFile.txt";
        String tempDir = absoluteDir+separator+"temp";
        String tempDir2 = tempDir+separator+"temp";
        String tempDir3 = tempDir2 + separator +"temp";




        File file =  new File(absolutePath);

        if(file.exists()){
            System.out.println("File already Exists.\n Deleting the file.");
            if(file.delete()){
                System.out.println("file deleted successfully");
            }
        }

        if(file.createNewFile()){
            System.out.println(" created new file");
        }else {
            System.out.println("File already exist");
        }


        /**
         * write to a file
         *
         *  Here {@link FileOutputStream} create the file in the first place if it is not there, and writes to it.
         *
         *  if the file already exists then it will overwrite the file (if append is false)
         *  new FileOutputStream(absolutePath, Append = true or false)
         */

        FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
        fileOutputStream.write(absolutePath.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();


        /**
         *  create/delete Directory in Java
         *
         */

        File file3 = new File(absoluteDir+separator+"newDir");
        // if directory doesn't exist create it.
        if(!file3.exists()){
            file3.mkdir();
        }
        // else delete the directory but first delete inside files.
        else {
            File[] fileList = file3.listFiles();
            for (File temFile : fileList){
                System.out.println("deleting inside file");
                temFile.delete();
            }
            System.out.println("deleting existing directory");
            file3.delete();
        }







    }

}
