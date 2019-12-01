
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {

    public static void main(String[] args) throws IOException {
        int i = 0;
        while (i < 5) {
            Socket s = new Socket("192.168.11.22", 6000);
            OutputStream os = s.getOutputStream();
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入数据:");
            int  number = sc.nextInt();
            if (number==-1) {
                System.out.println("see U ...");
                break;
            }
            os.write(number);
            os.flush();

            InputStream is = s.getInputStream();
            byte[] by = new byte[30];
            is.read(by);
            is.close();
            String st = new String(by);

            System.out.println(st.trim());

            if ("恭喜你猜中了...".equals(st.trim())) {
                //   System.out.println(st.trim());
                System.out.println("猜中了..不要再猜了...bye");
                break;
            }
            i++;

        }


    }


}
