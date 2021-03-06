import javax.swing.*;
import java.awt.*;



public class menuGUI  {
    public static void main(String[] args) {

  /*
        // Main Application Window
        JFrame JFrameWindow = new JFrame();
        GridBagLayout gridBagLayout = new GridBagLayout();
        //FlowLayout flowLayout = new FlowLayout();
        JFrameWindow.setTitle("Employee Management System");
        JFrameWindow.setSize(1000,600);
        JFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //  Main JPanel on JFrame
        JPanel mainPanel = new JPanel(); // Creates Main Panel where additional panels will be on top
        mainPanel.setBackground(Color.GRAY);
        JFrameWindow.getContentPane().add(mainPanel);

        // EmployeeForm JPanel
        JPanel employeeForm = new JPanel(new GridBagLayout()); // Employee details panel
        employeeForm.setSize(500,600);
        employeeForm.setBackground(Color.lightGray);
        employeeForm.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK,1,true),"Register Employee"));
        mainPanel.add(employeeForm);

        // Set Position of components
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0; // Referenced from Mr Java Help Youtube
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10,20,5,20);

        //JLabels for Employee Form
        JLabel idLabel = new JLabel("Employee ID");
        employeeForm.add(idLabel,c);
        c.gridy++; // Increments and moves to row below

        JLabel nameLabel = new JLabel("\nName\n");
        employeeForm.add(nameLabel,c);
        c.gridy++;

        JLabel addressLabel = new JLabel("\nAddress\n");
        employeeForm.add(addressLabel,c);
        c.gridy++;

        JLabel emailLabel = new JLabel("\nEmail");
        employeeForm.add(emailLabel,c);
        c.gridy++;

        JLabel phoneLabel = new JLabel("\nPhone No.");
        employeeForm.add(phoneLabel,c);
        c.gridy++;

        JLabel departmentLabel = new JLabel("Department");
        employeeForm.add(departmentLabel,c);
        c.gridy++;

        JLabel jobTitleLabel = new JLabel("Title");
        employeeForm.add(jobTitleLabel,c);
        c.gridy++;

        c.gridx=1;
        c.gridy=0;
        c.anchor = GridBagConstraints.LINE_START;

        // Creates fields/combobox for employee form

        JTextField idField = new JTextField(5);
        employeeForm.add(idField,c);
        c.gridy++;

        JTextField nameField = new JTextField(20);
        employeeForm.add(nameField,c);
        c.gridy++;

        JTextArea addressField = new JTextArea(5,20);
        employeeForm.add(addressField,c);
        c.gridy++;

        JTextField emailField = new JTextField(20);
        employeeForm.add(emailField,c);
        c.gridy++;

        JTextField phoneField = new JTextField(15);
        employeeForm.add(phoneField,c);
        c.gridy++;

        // Create array for departments
        String [] departments = {"Accounts", "Mortgages", "Front Desk", "Marketing"};
        // Create combo box
        JComboBox departmentField = new JComboBox(departments);
        employeeForm.add(departmentField,c);
        c.gridy++;

        // Create arrays for Job Titles
        String [] jobTitles = {"Branch Manager","Accounts Manager", "Mortgage Manager", "General Manager", "Marketing Manager", "Admin", "Mortgage Consultants", "Bank Teller","Marketing Consultants"};

        JComboBox divisionField = new JComboBox(jobTitles);
        employeeForm.add(divisionField,c);
        c.gridy++;

        // Create Clear/ Register button for employee form
        JButton clearButton = new JButton("Clear");
        c.gridx = 0;
        c.gridy = 7;
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(20,20,20,20);
        employeeForm.add(clearButton,c);

        JButton registerButton = new JButton("Register Employee");
        c.gridx = 1;
        c.gridy = 7;
        c.anchor = GridBagConstraints.LINE_END;
        employeeForm.add(registerButton,c);

        JFrameWindow.add(mainPanel); // Add main panel to JFrame
        JFrameWindow.setVisible(true); // JFrame can be seen

        //  Search Panel
        JPanel searchPanel = new JPanel(new GridBagLayout());
        searchPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK,1,true),"Search Employee ID / Name"));
        searchPanel.setSize(700,200);

        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx =0;
        c1.gridy=0;

        JTextField searchField = new JTextField(20);
        c1.gridx = 14;
        c1.gridy = 11;
        searchPanel.add(searchField,c1); // add search field on search panel
        mainPanel.add(searchPanel,c1);
        JButton searchButton = new JButton("Search");
        c1.gridx = 16;
        c1.gridy = 11;
       // c.insets = new Insets(0,20,0,20);
        searchPanel.add(searchButton,c1); // add search button to search panel


*/









    }
}
