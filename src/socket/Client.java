package socket;


import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    private Socket socket; // 套接字

    public  Client(){

        try {
            System.out.println("正在连接服务端......");
            socket = new Socket("localhost",8088);
            System.out.println("与服务器端建立连接！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  void start(){
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);


            Scanner scanner  = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println("服务端说"+line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }



}
