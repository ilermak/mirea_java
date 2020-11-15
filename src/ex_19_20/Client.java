package ex_19_20;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {

    static String ip = "127.0.0.1";
    static int port = 1488;


    public static void sendMessage(DatagramSocket s) {
        while (true) {
            byte[] buff = new byte[2048];
            String msg;
            DatagramPacket packet = new DatagramPacket(buff, 0, buff.length);

            try {
                s.receive(packet);
                msg = new String(buff, 0, packet.getLength());
                System.out.println(msg);
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }

    public static void getMessage(DatagramSocket socket) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            DatagramPacket toPacket;
            byte[] toSendBuffer = scanner.nextLine().getBytes();
            try {
                toPacket = new DatagramPacket(
                        toSendBuffer,
                        0,
                        toSendBuffer.length,
                        InetAddress.getByName(ip),
                        port);
                socket.send(toPacket);
            } catch (UnknownHostException exception) {
                exception.getStackTrace();
            } catch (IOException exception) {
                exception.getStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите порт: ");
        int clientPort = new Scanner(System.in).nextInt();
        try {
            DatagramSocket socket = new DatagramSocket(clientPort);
            System.out.print("Введите имя: ");
            Thread thread = new Thread(() -> getMessage(socket));
            thread.start();
            thread = new Thread(() -> sendMessage(socket));
            thread.start();
        } catch (SocketException exception) {
            exception.getStackTrace();
        }
    }
}