package ex_19_20;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Server {

    static DatagramPacket fstDataPacket;
    static DatagramPacket sndDataPacket;
    static DatagramSocket dataSocket;
    static StringBuilder history = new StringBuilder();
    static HashMap<String, String> nicknameIPMap = new HashMap<>();
    static ArrayList<InetAddress> IP = new ArrayList<>();
    static ArrayList<Integer> portArray = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[2048];
        String packetAddr;
        StringBuilder msgStr = new StringBuilder();
        String msg;
        dataSocket = new DatagramSocket(1488);
        fstDataPacket = new DatagramPacket(buffer, 0, buffer.length);


        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy [HH:mm]");
        Date date;
        File f = new File("src/ex_19_20/history.txt");
        f.createNewFile();

        while (true) {
            dataSocket.receive(fstDataPacket);
            msg = new String(buffer, 0, fstDataPacket.getLength());
            date = new Date();
            msgStr.append(dateFormat.format(date) + " ");
            packetAddr = fstDataPacket.getAddress().getHostAddress() + ":" + fstDataPacket.getPort();

            if (nicknameIPMap.get(packetAddr) == null || !portArray.contains(fstDataPacket.getPort())) {
                nicknameIPMap.put(packetAddr, msg);
                msgStr.append("<Server> Hello, " + msg);

                IP.add(fstDataPacket.getAddress());
                portArray.add(fstDataPacket.getPort());

            } else
                msgStr.append("<" + nicknameIPMap.get(packetAddr) + "> " + msg);

            for (int i = 0; i < IP.size(); i++) {
                sndDataPacket = new DatagramPacket(
                        msgStr.toString().getBytes(),
                        0,
                        msgStr.length(),
                        IP.get(i),
                        portArray.get(i));
                dataSocket.send(sndDataPacket);
            }

            System.out.println(msgStr);
            history.append(msgStr.toString() + "\n");
            msgStr = new StringBuilder();
            try (PrintWriter wf = new PrintWriter(f)) {
                wf.write(history.toString());
            } catch (IOException exception) {
                exception.getStackTrace();
            }

        }
    }
}