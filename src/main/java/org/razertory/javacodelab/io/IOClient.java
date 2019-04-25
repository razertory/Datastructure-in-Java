package org.razertory.javacodelab.io;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @author springchan
 * @date 2019/4/25
 * @description
 **/
public class IOClient {

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();
    }
}
