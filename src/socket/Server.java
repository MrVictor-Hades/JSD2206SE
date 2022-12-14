package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室服务端
 */
public class Server {
    private ServerSocket serverSocket;

    public Server(){
        try {
            System.out.println("正在启动服务端......");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // IPv4 地址 . . . . . . . . . . . . : 176.49.7.221
    public void start(){
        try {
            System.out.println("等待客户端连接......");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端连接了！");

            // 通过刚接收连接的 socket ，获取输入流来读取该客户端发送过来的消息
            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);





            String line ;
            while ((line = br.readLine()) != null){
                System.out.println("客户端说"+line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();

    }
}


















