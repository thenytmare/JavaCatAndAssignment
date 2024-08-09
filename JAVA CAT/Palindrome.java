    import javax.swing.*;

    public class Palindrome {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Palindrome Checker");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter a number:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Check Palindrome");
        JLabel resultLabel = new JLabel();

        button.addActionListener(e -> {
            String input = textField.getText();
            if (isPalindrome(input)) {
                resultLabel.setText(input + " is a palindrome!");
            } else {
                resultLabel.setText(input + " is not a palindrome.");
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(resultLabel);
        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}

