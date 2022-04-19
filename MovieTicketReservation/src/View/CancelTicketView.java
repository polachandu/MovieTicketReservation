package View;

import javax.swing.*;
import java.awt.*;

public class CancelTicketView {
	private static GuiComponents guiComponents = new GuiComponents();

    private static JPanel jPanel = guiComponents.createPanel();
    private static JLabel jLabel = guiComponents.createLabel("Cancellation Form");
    private static JLabel ticketLabel = guiComponents.createLabel("Ticket ID");
  
    private static JTextField ticketID = guiComponents.editTextField(10);
    
    private static JButton submitButton = guiComponents.createButton("Confirm");
    private static JButton backButton = guiComponents.createButton("Go Back");
    private static CancelTicketView cancelTicketView = new CancelTicketView();
    private static PaymentPageView paymentPageView = new PaymentPageView();
    
    public JPanel setupCancelTicketPage() {
        JPanel subPanel = guiComponents.createPanel();
        BoxLayout boxLayout = new BoxLayout(subPanel, BoxLayout.Y_AXIS);
        setAlignments();
        addComponentsToPanel(subPanel, boxLayout);
        jPanel.add(subPanel);
        jPanel.setBorder(BorderFactory.createTitledBorder("Cancel Ticket"));
        return jPanel;
    }

    private void setAlignments() {
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ticketLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ticketID.setAlignmentX(Component.CENTER_ALIGNMENT);
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    private void addComponentsToPanel(JPanel panel, BoxLayout boxLayout) {
        panel.add(ticketLabel);
        panel.add(ticketID);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(submitButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(backButton);
        panel.setLayout(boxLayout);
    }
    
    public void clearFields() {
    	ticketID.setText(null);    	
    }
    
    public void showMessage(String message) {
    	JOptionPane.showMessageDialog(null, message);
    }
    
    public static JPanel getjPanel() {
        return jPanel;
    }
    
    public static void setjPanel(JPanel jPanel) {
        CancelTicketView.jPanel = jPanel;
    }
    
    public static JLabel getjLabel() {
        return jLabel;
    }

    public static void setjLabel(JLabel jLabel) {
    	CancelTicketView.jLabel = jLabel;
    }

    public int  getTicketID() {
        return Integer.parseInt(ticketID.getText());
    }
    
    public static void setTicket(JTextField ticket) {
    	CancelTicketView.ticketID = ticket;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public static JButton getBackButton() {
        return backButton;
    }

    public static void setSubmitButton(JButton submitButton) {
    	CancelTicketView.submitButton = submitButton;
    }


}
