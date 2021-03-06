package lesson6;

import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient extends JFrame {
    public final String SERVER_ADDR = "localhost";
    public final int SERVER_PORT = 8189;
    private JTextField msgInputField;
    private JTextArea chatArea;
    public Socket socket;
    public DataInputStream in;
    public DataOutputStream out;

    public EchoClient() {
        try {
            openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        prepareGUI();
    }

    public void openConnection() throws IOException {
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try (Scanner x = new Scanner (System.in);){
                    while (true) {
                        out.writeUTF(x.nextLine());
                        System.out.println(in.readUTF());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


    public void closeConnection() {

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage() {
        if (!msgInputField.getText().trim().isEmpty()) {
            try {
                out.writeUTF(msgInputField.getText());
                msgInputField.setText("");
                msgInputField.grabFocus();
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "???????????? ???????????????? ??????????????????");
            }
        }
    }

    public void prepareGUI() {
// ?????????????????? ????????
        setBounds(600, 300, 500, 500);
        setTitle("????????????");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
// ?????????????????? ???????? ?????? ???????????? ??????????????????
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);
// ???????????? ???????????? ?? ?????????? ?????? ?????????? ?????????????????? ?? ?????????????? ?????????????? ??????????????????
        JPanel bottomPanel = new JPanel(new BorderLayout());
        JButton btnSendMsg = new JButton("??????????????????");
        bottomPanel.add(btnSendMsg, BorderLayout.EAST);
        msgInputField = new JTextField();
        add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.add(msgInputField, BorderLayout.CENTER);
        btnSendMsg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        msgInputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        // ?????????????????????? ???????????????? ???? ???????????????? ????????
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                try {
                    out.writeUTF("/end");
                    closeConnection();
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
            }
        });
        setVisible(true);
    }

    @SneakyThrows
    public static void main(String[] args) {

//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new EchoClient();
//            }
//        });

        final String SERVER_ADDR = "localhost";
        final int SERVER_PORT = 8189;
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        try (Scanner x = new Scanner (System.in);){
            while (true) {
                String str = x.nextLine();
                if(str.equalsIgnoreCase("/end"))
                    break;
                out.writeUTF(x.nextLine());
                System.out.println(in.readUTF());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
