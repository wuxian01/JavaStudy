package chapter05;

import java.io.*;

public class Java03_Object {
    public static void main(String[] args){
        //TODO 序列化 反序列化
        String filePath = "/Users/xiaohe/IdeaProjects/Github/JavaStudy/data/word.txt";
        File file = new File(filePath);
        File destFile =  new File(filePath+".copy");

        ObjectOutputStream oos = null;
        FileOutputStream fos = null;

        ObjectInputStream ois = null;
        FileInputStream fis = null;

        try {
           fos = new FileOutputStream(destFile);
            try {
                oos = new ObjectOutputStream(fos);
                User u =  new User();
                oos.writeObject(u);
                oos.flush();
            }catch (IOException e){
                e.printStackTrace();
            }

            fis = new FileInputStream(destFile);
           try{
               ois = new ObjectInputStream(fis);
               Object obj = ois.readObject();
               System.out.println(obj);
           }catch(Exception e){
               System.out.println("<UNK>");
           }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos != null) {
                try{
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class User implements Serializable {

}