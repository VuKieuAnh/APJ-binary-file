package Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private static String filePath = "//Users//vuanh//IdeaProjects//APJ-file-IO//src//fileManager.txt";
    public static void WriteFile(List<Spend> spends) throws IOException {
        try{
            File fileManager = new File (filePath);
            if (!fileManager.exists()){
                fileManager.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(spends);
//            fos.close();
            oos.close();
        }catch (IOException e){
            System.out.println("khong luu duoc file");
        }
    }
    public static List<Spend> ReadFile(){
        List<Spend> spends = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            spends = (List<Spend>)ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return spends;
    }

}
