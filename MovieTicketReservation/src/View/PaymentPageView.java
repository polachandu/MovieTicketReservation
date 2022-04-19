package View;
import java.awt.*;
import javax.swing.*;

public class PaymentPageView {
	
	private static GuiComponents guiComponents = new GuiComponents();

    private static JPanel jPanel = guiComponents.createPanel();
    private static JLabel jLabel = guiComponents.createLabel("Payment Form");
    //private static JLabel ticketLabel = guiComponents.createLabel("Ticket ID");
    private static JLabel seatLabel = guiComponents.createLabel("Selected Seats");
    private static JLabel priceLabel = guiComponents.createLabel("Total Price");
    private static JLabel emailLabel = guiComponents.createLabel("E-mail ID");
    private static JLabel nameLabel = guiComponents.createLabel("Name");
    private static JLabel cardNoLabel = guiComponents.createLabel("Card No");
    private static JLabel cardExpiryLabel = guiComponents.createLabel("Card Expiry");
    private static JLabel cvvLabel = guiComponents.createLabel("CVV");
        
    //private static JTextField ticketID = guiComponents.editTextField(10);
    private static JTextField seat = guiComponents.editTextField(10);
    private static JTextField price = guiComponents.editTextField(10);
    private static JTextField email = guiComponents.editTextField(10);
    private static JTextField name = guiComponents.editTextField(10);
    private static JTextField cardNo = guiComponents.editTextField(10);
    private static JTextField cardExpiry = guiComponents.editTextField(10);
    private static JTextField cvv = guiComponents.editTextField(10);
    
    private static JButton submitButton = guiComponents.createButton("Submit");
    private static JButton cancelButton = guiComponents.createButton("Cancel");

    public JPanel setupPaymentPage() {
    	
        JPanel subPanel = guiComponents.createPanel();
        BoxLayout boxLayout = new BoxLayout(subPanel, BoxLayout.Y_AXIS);
        setAlignments();
        addComponentsToPanel(subPanel, boxLayout);
        jPanel.add(subPanel);
        jPanel.setBorder(BorderFactory.createTitledBorder("Payment Ticket"));
        return jPanel;
    }

    private void setAlignments() {
    	
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        seatLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        seat.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        priceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        price.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        email.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        cardNoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        cardNo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        cardExpiryLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        cardExpiry.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        cvvLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        cvv.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        cancelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    private void addComponentsToPanel(JPanel panel, BoxLayout boxLayout) {
        panel.add(seatLabel);
        panel.add(seat);
        
        panel.add(priceLabel);
        panel.add(price);
        
        panel.add(emailLabel);
        panel.add(email);
        
        panel.add(nameLabel);
        panel.add(name);
        
        panel.add(cardNoLabel);
        panel.add(cardNo);
        
        panel.add(cardExpiryLabel);
        panel.add(cardExpiry);
        
        panel.add(cvvLabel);
        panel.add(cvv);
        
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(submitButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(cancelButton);
        
        panel.setLayout(boxLayout);
        
    }
    
    public static JPanel getjPanel() {
        return jPanel;
    }
    
    public static void setjPanel(JPanel jPanel) {
    	PaymentPageView.jPanel = jPanel;
    }
    
    public static JLabel getjLabel() {
        return jLabel;
    }

    public static void setjLabel(JLabel jLabel) {
    	PaymentPageView.jLabel = jLabel;
    }

    public static JTextField getSeat() {
        return seat;
    }

    public static void setSeat(JTextField seat) {
    	PaymentPageView.seat = seat;
    }
    
    public static JTextField getPrice() {
        return price;
    }

    public static void setPrice(JTextField price) {
    	PaymentPageView.price = price;
    }
    
    public static JTextField getEmail() {
        return email;
    }

    public static void setEmail(JTextField email) {
    	PaymentPageView.email = email;
    }
    
    public static JTextField name() {
        return name;
    }

    public static void setName(JTextField name) {
    	PaymentPageView.name = name;
    }
    
    public static JTextField getCardNo() {
        return cardNo;
    }

    public static void setCardNo(JTextField cardno) {
    	PaymentPageView.cardNo = cardno;
    }
    
    public static JTextField getCardExpiry() {
        return cardExpiry;
    }

    public static void setCardExpiry(JTextField cardexpiry) {
    	PaymentPageView.cardExpiry = cardexpiry;
    }
    
    public static JTextField getCvv() {
        return cvv;
    }

    public static void setCvv(JTextField cvv) {
    	PaymentPageView.cvv = cvv;
    }
    
    
    
    
    
    public static JButton getSubmitButton() {
        return submitButton;
    }

    public static JButton getCancelButton() {
        return cancelButton;
    }

    public static void setSubmitButton(JButton submitButton) {
    	PaymentPageView.submitButton = submitButton;
    }
	
	
}
