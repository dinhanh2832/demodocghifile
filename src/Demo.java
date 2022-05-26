import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        FileOutputStream oFile = new FileOutputStream("demo.txt");
        Writer writer = new OutputStreamWriter(oFile,"UTF-8");
        String[] strings = new String[]{"â","f","g"};
        String str = "";
        for (String b : strings) {
            str += b;
        }
        writer.write(str);
        writer.close();
//        FileInputStream iFile = new FileInputStream("demo1");
//        Reader reader = new InputStreamReader(iFile,"UTF-8");
////        byte[] bytes1 = new byte[10];
//        int i ;
//        while ((i = reader.read()) > 0) {
////            String s = new String(bytes1, 0, i);
//            System.out.println((char) i);
//        }
//        iFile.close();
    }
}
