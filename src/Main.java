import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: ");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();

        Main main = new Main();
        main.readFileText(path);
    }

    public void readFileText(String filePath){
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();

            System.out.println("Sum = " + sum);
        }catch (Exception e){
            System.out.println("File khong ton tai or bi loi!!!");
        }
    }
}