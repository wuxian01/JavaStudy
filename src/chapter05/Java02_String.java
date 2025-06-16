package chapter05;

import java.io.*;

// TODO 字符流
public class Java02_String {
    public static void main(String[] args) {
        // TODO Java IO 文件流
        // TODO File: 文件类型，属于java.io
        String filePath = "/Users/xiaohe/IdeaProjects/Github/JavaStudy/data/word.txt";
        File file = new File(filePath);
        File destFile =  new File(filePath+".copy");
        BufferedReader reader = null;
        PrintWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            writer = new PrintWriter(destFile);
            try {
                StringBuilder sb = new StringBuilder();
                String data = null;
                while ((data =reader.readLine()) != null) {
                    writer.println(data);
                }
                writer.flush();
            }catch (IOException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try{
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if  (writer != null) {
                writer.close();
            }
        }
    }
}
