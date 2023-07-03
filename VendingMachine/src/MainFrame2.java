import Domen.Product;
import Services.VendingMachine;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame2 extends JFrame {
    private JList<String> productList;
    private DefaultListModel<String> listModel;
    private JTextField tfFunds;

    public void initialize(VendingMachine venMachine) {
        Font mainFont = new Font("Segoe print", Font.BOLD, 18);

        // Создаем список продуктов
        listModel = new DefaultListModel<>();
        for (Product product : venMachine.getProducts()) {
            String item = product.getName() + " - " + product.getPrice();
            listModel.addElement(item);
        }

        productList = new JList<>(listModel);
        productList.setFont(mainFont);
        productList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        productList.setVisibleRowCount(5);

        JScrollPane scrollPane = new JScrollPane(productList);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Добавляем поле ввода для наличности
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        JLabel lblFunds = new JLabel("Наличность:");
        lblFunds.setFont(mainFont);
        tfFunds = new JTextField(10);
        tfFunds.setFont(mainFont);
        inputPanel.add(lblFunds);
        inputPanel.add(tfFunds);
        mainPanel.add(inputPanel, BorderLayout.NORTH);

        // Добавляем кнопку "купить товар"
        JButton btnBuy = new JButton("Купить товар");
        btnBuy.setFont(mainFont);
        btnBuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = productList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String selectedProduct = listModel.getElementAt(selectedIndex);
                    String[] parts = selectedProduct.split(" - ");
                    String productName = parts[0];
                    double productPrice = Double.parseDouble(parts[1]);

                    double funds = Double.parseDouble(tfFunds.getText());

                    if (funds >= productPrice) {
                        double change = funds - productPrice;
                        JOptionPane.showMessageDialog(null, "Вы купили " + productName + "\nСдача: " + change);
                    } else {
                        JOptionPane.showMessageDialog(null, "Недостаточно средств");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Выберите товар из списка");
                }
            }
        });

        mainPanel.add(btnBuy, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}