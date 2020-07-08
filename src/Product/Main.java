package Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Spend> spends = new ArrayList<>();
        spends.add(new Spend(1, "main"));
        FileManager.WriteFile(spends);
        spends.add(new Spend(2, "main2"));
        FileManager.WriteFile(spends);
        List<Spend> newSpend = FileManager.ReadFile();
        for (Spend e: newSpend){
            System.out.println(e.getName());
        }
    }
}
