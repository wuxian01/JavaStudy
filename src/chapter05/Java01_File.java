package chapter05;

import java.io.*;

public class Java01_File {
    public static void main(String[] args) {
        // TODO Java IO 文件流
        // TODO File: 文件类型，属于java.io
        String filePath = "/Users/xiaohe/IdeaProjects/Github/JavaStudy/data/word.txt";
        File file = new File(filePath);

        System.out.println(file);
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());

        File destFile =  new File(filePath+".copy");
        FileInputStream  fis = null;
        FileOutputStream fos = null;

        FileInputStream  bufIn = null;
        FileOutputStream bufOut = null;

        byte[] cache = new byte[1024];
       try {
           fis = new FileInputStream(file);
           fos = new FileOutputStream(destFile);

           //TODO 缓冲区
           bufIn = new FileInputStream(file);
           bufOut = new FileOutputStream(destFile);


          try {
//              int data = -1;
//              while((data =fis.read())!=-1){
//                  fos.write(data);
//              }
//              byte[] data = fis.readAllBytes();
//              fos.write(data);

              int data = -1;
              while((data = bufIn.read(cache)) != -1) {
                  bufOut.write(cache,0,data);
              }

          }catch (IOException e){
              e.printStackTrace();
          }
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }finally {
           if (fis != null) {
               try{
                   fis.close();
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }
           if  (fos != null) {
               try{
                   fos.close();
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }
       }


    }
}
