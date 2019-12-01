import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo extends Thread {


    private Socket s;
    private Util u;

    public ServerDemo(Socket s,Util u) {
        this.u=u;
        this.s = s;
    }

    @Override
    public void run() {
        OutputStream os = null;
        InputStream is = null;
        try {
            while (true) {
                // 可以利用套接字获取输出流、输入流
                os = s.getOutputStream();
                is = s.getInputStream();
                int len =-1;
                while((len=is.read())!=-1){
                    System.out.println(s.getInetAddress()+"传过来的值为:"+len);
                    // 完成通信之后，我们可以将输出流、输入流、套接字、服务器端的套接字都关闭
                    if(u.i==len){
                        os.write("恭喜你猜中了...".getBytes());
                        os.flush();
                    }else  if(u.i>len){
                        os.write("您猜的数小了".getBytes());
                        os.flush();
                    }else{
                        os.write("您猜的数大了".getBytes());
                        os.flush();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        }



    }
