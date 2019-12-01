import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Tool {

    public static void main(String[] args) {
        try {
            // 创建服务器端套接字，绑定到6000的端口上
            ServerSocket ss = new ServerSocket(6000);
           Util  u=null;
            //当前为一个客户服务，要为多个客户同时服务加while循环监听客户端请求
            while (true) {
                // 调用accept方法就会阻塞，直到客户端有连接请求到来的时候。
                // 它会返回一个套接字，然后就可以利用这个套接字与客户端进行数据通信。
                Socket s = ss.accept();
                if(u==null){
                    u=new Util();
                }
                InetAddress address=s.getInetAddress();
                if(address!=null && u.i==-1){
                    System.out.println(">>>>>"+u.i);
                       u.i=(int)(Math.random()*51);
                    System.out.println(address+"难道每次都进来???"+u.i);
                }
                //一旦有一个连接请求到来，接收连接请求，返回套接字。
                //然后创建启动一个新的线程,将套接字传递给线程,为客户端进行服务
                //Run执行完毕，当前线程也就终止了
                new ServerDemo(s,u).start();
            }
            //ss.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
