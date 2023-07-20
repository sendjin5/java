package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example7 {
    public static void main(String[] args) {
        FileInputStream fis = null; //특정 파일에 내용을 저장하도록 하는 클래스
        FileOutputStream ois = null; //특정 파일에 내용을 불러오기 위한 클래스

        try {
            fis = new FileInputStream("infile.txt");
            try {
                ois = new FileOutputStream("outfile.txt");
            }catch (FileNotFoundException e) {
                System.out.println("해당 파일이 존재하지 않음");
        }catch (FileNotFoundException e) {
            }

            System.out.println("해당 파일이 존재하지 않음");
            System.out.println(e.getMessage());

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("원인불명");

        }



    }
}

//try 구문은 기본 2겹이상: driver
