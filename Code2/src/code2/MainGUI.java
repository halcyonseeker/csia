package code2;

import java.util.ArrayList;
/*
Extensibility/TODO list
- More refined GUI
- add person button leads to window instead of tab
- allow a person to be placed in more than one cate2gory
  - replace category combo box with a popup box containing check boxes and an add category button and text field
- set quiery combo box to clear when refresh button is pressed
*/
public class MainGUI extends javax.swing.JFrame {

    private ArrayList<Person> peopleArrayList = new ArrayList<Person>();
    
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deletePersonDialogue = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        confirmDeletePersonButton = new javax.swing.JButton();
        cancelDeleteButton = new javax.swing.JButton();
        editCategoryDialogue = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoriesTable = new javax.swing.JTable();
        newCategoryTF = new javax.swing.JTextField();
        newCategoryButton = new javax.swing.JButton();
        deleteCategoryButton = new javax.swing.JButton();
        categoryLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        peoplePanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        organizatonLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        categoriesLabel = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();
        email2Label = new javax.swing.JLabel();
        phone2Label = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        deleteProfileButton = new javax.swing.JButton();
        editProfileButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        phone3Label = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        categoryQueryCB = new javax.swing.JComboBox<>();
        queryButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        peopleTable = new javax.swing.JTable();
        doBLabel = new javax.swing.JLabel();
        displayNameLabel = new javax.swing.JLabel();
        displayAgeLabel = new javax.swing.JLabel();
        displayEmail1Label = new javax.swing.JLabel();
        displayEmail2Label = new javax.swing.JLabel();
        displayEmail3Label = new javax.swing.JLabel();
        displayPhone1Label = new javax.swing.JLabel();
        displayPhone2Label = new javax.swing.JLabel();
        displayPhone3Label = new javax.swing.JLabel();
        displayOrganizationLabel = new javax.swing.JLabel();
        displayAddressLabel = new javax.swing.JLabel();
        displayDateLabel = new javax.swing.JLabel();
        displayCategoryLabel = new javax.swing.JLabel();
        displayNotesLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        newPersonPanel = new javax.swing.JPanel();
        streetTF = new javax.swing.JTextField();
        stateTF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTA = new javax.swing.JTextArea();
        countryTF = new javax.swing.JTextField();
        zipTF = new javax.swing.JTextField();
        dateCB = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        monthCB = new javax.swing.JComboBox<>();
        yearCB = new javax.swing.JComboBox<>();
        categoryCB = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        addCategoryButton = new javax.swing.JButton();
        enterPersonButton = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        firstEmailTF = new javax.swing.JTextField();
        secondEmailTF = new javax.swing.JTextField();
        thirdEmailTF = new javax.swing.JTextField();
        secondPhoneTF = new javax.swing.JTextField();
        firstPhoneTF = new javax.swing.JTextField();
        thirdPhoneTF = new javax.swing.JTextField();
        organizationTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        exportImportPanel = new javax.swing.JPanel();
        exportButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        exportFamilyCB = new javax.swing.JCheckBox();
        exportWorkCB = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        exportPersonalCB = new javax.swing.JCheckBox();

        jLabel7.setText("Are you sure you want to delete this entry?");

        confirmDeletePersonButton.setText("Yes");
        confirmDeletePersonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confirmDeletePersonButtonMouseReleased(evt);
            }
        });

        cancelDeleteButton.setText("No, Cancel");
        cancelDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelDeleteButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmDeletePersonButton)
                        .addGap(141, 141, 141)
                        .addComponent(cancelDeleteButton))
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmDeletePersonButton)
                    .addComponent(cancelDeleteButton)))
        );

        javax.swing.GroupLayout deletePersonDialogueLayout = new javax.swing.GroupLayout(deletePersonDialogue.getContentPane());
        deletePersonDialogue.getContentPane().setLayout(deletePersonDialogueLayout);
        deletePersonDialogueLayout.setHorizontalGroup(
            deletePersonDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePersonDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deletePersonDialogueLayout.setVerticalGroup(
            deletePersonDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePersonDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        categoriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Categories"
            }
        ));
        jScrollPane1.setViewportView(categoriesTable);

        newCategoryButton.setText("Add New Category");

        deleteCategoryButton.setText("Delete Category");

        categoryLabel.setText("jLabel8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newCategoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newCategoryTF)))
                    .addComponent(deleteCategoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteCategoryButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newCategoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newCategoryButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editCategoryDialogueLayout = new javax.swing.GroupLayout(editCategoryDialogue.getContentPane());
        editCategoryDialogue.getContentPane().setLayout(editCategoryDialogueLayout);
        editCategoryDialogueLayout.setHorizontalGroup(
            editCategoryDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editCategoryDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editCategoryDialogueLayout.setVerticalGroup(
            editCategoryDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCategoryDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emailLabel.setText("Email:");

        organizatonLabel.setText("Organization:");

        addressLabel.setText("Address:");

        categoriesLabel.setText("Categories:");

        notesLabel.setText("Notes:");

        email2Label.setText("Email 2 :");

        phone2Label.setText("Phone 2:");

        nameLabel.setText("Name:");

        searchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTFActionPerformed(evt);
            }
        });

        ageLabel.setText("Age:");

        deleteProfileButton.setText("Delete Person");
        deleteProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteProfileButtonMouseReleased(evt);
            }
        });
        deleteProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProfileButtonActionPerformed(evt);
            }
        });

        editProfileButton.setText("Edit Person");
        editProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editProfileButtonMouseReleased(evt);
            }
        });

        jLabel6.setText("Email 3: ");

        phoneLabel.setText("Phone:");

        phone3Label.setText("Phone 3:");

        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchButtonMouseReleased(evt);
            }
        });

        categoryQueryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Family", "Work", "Personal" }));

        queryButton.setText("Find");
        queryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                queryButtonMouseReleased(evt);
            }
        });

        peopleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        peopleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                peopleTableMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(peopleTable);

        doBLabel.setText("Date of Birth");

        displayNameLabel.setText("jLabel8");

        displayAgeLabel.setText("jLabel9");

        displayEmail1Label.setText("jLabel10");

        displayEmail2Label.setText("jLabel11");

        displayEmail3Label.setText("jLabel12");

        displayPhone1Label.setText("jLabel13");

        displayPhone2Label.setText("jLabel14");

        displayPhone3Label.setText("jLabel15");

        displayOrganizationLabel.setText("jLabel16");

        displayAddressLabel.setText("jLabel");

        displayDateLabel.setText("jLabel");

        displayCategoryLabel.setText("jLabel28");

        displayNotesLabel.setText("jLabel10");

        refreshButton.setText("Refresh");
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                refreshButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout peoplePanelLayout = new javax.swing.GroupLayout(peoplePanel);
        peoplePanel.setLayout(peoplePanelLayout);
        peoplePanelLayout.setHorizontalGroup(
            peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peoplePanelLayout.createSequentialGroup()
                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(peoplePanelLayout.createSequentialGroup()
                        .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchTF, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(categoryQueryCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(queryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(peoplePanelLayout.createSequentialGroup()
                        .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayEmail1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addComponent(email2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayEmail2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayEmail3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addComponent(phoneLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayPhone1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addComponent(phone2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(displayPhone2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addComponent(phone3Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayPhone3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peoplePanelLayout.createSequentialGroup()
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel)
                                    .addComponent(doBLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(displayAgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(displayDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(organizatonLabel)
                                    .addComponent(addressLabel)
                                    .addComponent(notesLabel)
                                    .addComponent(categoriesLabel))
                                .addGap(29, 29, 29)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(peoplePanelLayout.createSequentialGroup()
                                        .addComponent(displayCategoryLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(displayNotesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(displayAddressLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(displayOrganizationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peoplePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refreshButton))))
        );
        peoplePanelLayout.setVerticalGroup(
            peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peoplePanelLayout.createSequentialGroup()
                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(editProfileButton)
                    .addComponent(refreshButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(peoplePanelLayout.createSequentialGroup()
                        .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryQueryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryButton)
                            .addComponent(deleteProfileButton))
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                    .addGroup(peoplePanelLayout.createSequentialGroup()
                        .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayNameLabel))
                        .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(displayAgeLabel)
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(doBLabel)
                                    .addComponent(displayDateLabel))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailLabel)
                                    .addComponent(displayEmail1Label))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email2Label)
                                    .addComponent(displayEmail2Label))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(displayEmail3Label))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phoneLabel)
                                    .addComponent(displayPhone1Label))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phone2Label)
                                    .addComponent(displayPhone2Label))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phone3Label)
                                    .addComponent(displayPhone3Label))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(organizatonLabel)
                                    .addComponent(displayOrganizationLabel))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addressLabel)
                                    .addComponent(displayAddressLabel))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(categoriesLabel)
                                    .addComponent(displayCategoryLabel))
                                .addGap(18, 18, 18)
                                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(notesLabel)
                                    .addComponent(displayNotesLabel)))
                            .addGroup(peoplePanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ageLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Search People", peoplePanel);

        notesTA.setColumns(20);
        notesTA.setRows(5);
        jScrollPane2.setViewportView(notesTA);

        dateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel38.setText("Date of Birth:");

        monthCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March ", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        yearCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", " " }));

        categoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Family", "Work", "Personal" }));

        jLabel42.setText("Phone 1:");

        jLabel43.setText("Phone 2:");

        jLabel44.setText("Phone 3:");

        jLabel45.setText("Organization:");

        jLabel46.setText("Address:");

        jLabel47.setText("Categories:");

        addCategoryButton.setText("Add Category");
        addCategoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addCategoryButtonMouseReleased(evt);
            }
        });

        enterPersonButton.setText("Enter");
        enterPersonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                enterPersonButtonMouseReleased(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Email 1:");

        jLabel4.setText("Eamil 2:");

        jLabel5.setText("Email 3:");

        jLabel18.setText("Notes:");

        javax.swing.GroupLayout newPersonPanelLayout = new javax.swing.GroupLayout(newPersonPanel);
        newPersonPanel.setLayout(newPersonPanelLayout);
        newPersonPanelLayout.setHorizontalGroup(
            newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPersonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel42)
                    .addComponent(jLabel18))
                .addContainerGap(745, Short.MAX_VALUE))
            .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(newPersonPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(newPersonPanelLayout.createSequentialGroup()
                            .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel38)
                                .addComponent(jLabel43)
                                .addComponent(jLabel44)
                                .addComponent(jLabel45)
                                .addComponent(jLabel46)
                                .addComponent(jLabel47))
                            .addGap(63, 63, 63)
                            .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(organizationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(thirdPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(secondPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(thirdEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(secondEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(newPersonPanelLayout.createSequentialGroup()
                                        .addComponent(categoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addCategoryButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newPersonPanelLayout.createSequentialGroup()
                                        .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newPersonPanelLayout.createSequentialGroup()
                                                .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(newPersonPanelLayout.createSequentialGroup()
                                                        .addComponent(dateCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(newPersonPanelLayout.createSequentialGroup()
                                                .addComponent(streetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(stateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(countryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(zipTF, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 119, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newPersonPanelLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(enterPersonButton)))
                    .addContainerGap()))
        );
        newPersonPanelLayout.setVerticalGroup(
            newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPersonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(112, 112, 112))
            .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(newPersonPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(dateCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(firstEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(secondEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(thirdEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(firstPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(secondPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(thirdPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(organizationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(streetTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(countryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zipTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(newPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(categoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addCategoryButton))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterPersonButton)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("New Person", newPersonPanel);

        exportButton.setText("Export");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        jLabel17.setText("Export by ...");

        exportFamilyCB.setText("Family");

        exportWorkCB.setText("Work");

        jLabel24.setText("Export as ...");

        jRadioButton1.setText(".csv file");

        jRadioButton2.setText(".vcf file");

        jRadioButton3.setText(".xml file ");

        exportPersonalCB.setText("Personal");

        javax.swing.GroupLayout exportImportPanelLayout = new javax.swing.GroupLayout(exportImportPanel);
        exportImportPanel.setLayout(exportImportPanelLayout);
        exportImportPanelLayout.setHorizontalGroup(
            exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportImportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(exportImportPanelLayout.createSequentialGroup()
                        .addGroup(exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(exportFamilyCB))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, exportImportPanelLayout.createSequentialGroup()
                        .addGroup(exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exportWorkCB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exportPersonalCB, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel24)
                    .addGroup(exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(exportButton)
                        .addComponent(jRadioButton3)))
                .addContainerGap(599, Short.MAX_VALUE))
        );
        exportImportPanelLayout.setVerticalGroup(
            exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportImportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportFamilyCB)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addGroup(exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(exportWorkCB))
                .addGap(18, 18, 18)
                .addGroup(exportImportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(exportPersonalCB))
                .addGap(18, 18, 18)
                .addComponent(exportButton)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Export/Import Person", exportImportPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterPersonButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterPersonButtonMouseReleased
        //Create new instance of Person 
        String [] email = {firstEmailTF.getText(), secondEmailTF.getText(), thirdEmailTF.getText()};
        String [] phone = {firstPhoneTF.getText(), secondPhoneTF.getText(), thirdPhoneTF.getText()};
        //ArrayList <String> categoryArrayList = null;
        //categoryArrayList.add(categoryCB.getSelectedItem()+"");
        peopleArrayList.add(new Person(
                nameTF.getText(),
                ageTF.getText(),
                dateCB.getSelectedItem()+"",
                monthCB.getSelectedItem()+"",
                yearCB.getSelectedItem()+"",
                email,
                phone,
                organizationTF.getText(),
                categoryCB.getSelectedItem()+"",
                notesTA.getText(),
                streetTF.getText(),
                stateTF.getText(),
                countryTF.getText(),
                zipTF.getText()
        ));
        System.out.println("LOG: new arraylist");
        //Clear Text field after pressing enter
        nameTF.setText("");
        ageTF.setText("");
        dateCB.setSelectedIndex(0);
        monthCB.setSelectedIndex(0);
        yearCB.setSelectedIndex(0);
        firstEmailTF.setText("");
        secondEmailTF.setText("");
        thirdEmailTF.setText("");
        firstPhoneTF.setText("");
        secondPhoneTF.setText("");
        thirdPhoneTF.setText("");
        organizationTF.setText("");
        streetTF.setText("");
        stateTF.setText("");
        countryTF.setText("");
        zipTF.setText("");
        categoryCB.setSelectedIndex(0);
        notesTA.setText("");
        System.out.println("LOG: cleared text fields");
        clearDetails(); 
        writePeopleToTable();
        System.out.println("LOG: added array list to table");
        
        
        System.out.println("LOG: wrote person to text fields to be edited");
        System.out.println(" ");
        //ensure that te user does not need to fill in all fields 
        //set the all the jlabels on the people tab
        
    }//GEN-LAST:event_enterPersonButtonMouseReleased


    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        //Something
    }//GEN-LAST:event_exportButtonActionPerformed

    private void deleteProfileButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProfileButtonMouseReleased
        deletePersonDialogue.setVisible(true);
        deletePersonDialogue.setBounds(500, 300, 300, 100);
    }//GEN-LAST:event_deleteProfileButtonMouseReleased

    private void searchButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseReleased
        String searchTerm = searchButton.getText();
        SearchSort s = new SearchSort();
        ArrayList<Person> searchResultArrayList = s.search(peopleArrayList, searchTerm);
        System.out.println("LOG: search completed");
        clearTable();
        if(searchResultArrayList.size() <= peopleTable.getRowCount()){
            for(int row = 0 ; row < searchResultArrayList.size(); row++){
                peopleTable.setValueAt(searchResultArrayList.get(row).getName(), row, 0);
                peopleTable.setValueAt(searchResultArrayList.get(row).getCategory().toString(), row, 1);
            }
        }
        System.out.println("LOG: wrote search results to table");
        System.out.println(" ");
    }//GEN-LAST:event_searchButtonMouseReleased

    private void queryButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queryButtonMouseReleased
        //Query database by category
        String queryCategory = categoryQueryCB.getSelectedItem()+"";
        SearchSort s = new SearchSort();
        System.out.println("LOG: query completed");
        clearTable();
        ArrayList<Person> queryResultArrayList = s.query(peopleArrayList, queryCategory);
        if(queryResultArrayList.size() <= peopleTable.getRowCount()){
            for(int row = 0 ; row < queryResultArrayList.size(); row++){
                peopleTable.setValueAt(queryResultArrayList.get(row).getName(), row, 0);
                peopleTable.setValueAt(queryResultArrayList.get(row).getCategory().toString(), row, 1);
            }
        }
        System.out.println("LOG: wrote query results to table");
        System.out.println(" ");
    }//GEN-LAST:event_queryButtonMouseReleased

    private void editProfileButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileButtonMouseReleased
        // Open Person in editPerson tab -- lots of .setText()

        
    }//GEN-LAST:event_editProfileButtonMouseReleased

    private void addCategoryButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategoryButtonMouseReleased
        //How would this work? JDialogue?
        //categoryArrayList.add(input)
        //change new person combo box and query category combo box
        editCategoryDialogue.setVisible(true);
        editCategoryDialogue.setBounds(500, 300, 340, 200);
        System.out.println("LOG: opened edit person dialogue");
    }//GEN-LAST:event_addCategoryButtonMouseReleased

    private void peopleTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peopleTableMouseReleased
        int selected = peopleTable.getSelectedRow();
        String namePersonToDisplay = peopleTable.getValueAt(selected, 0)+"";
        int index = 0;
        for(int i = 0; i < peopleArrayList.size(); i++){
            if(namePersonToDisplay.equals(peopleArrayList.get(i).getName())){
                index = i;
                break;
            } 
        }
        String [] email = peopleArrayList.get(index).getEmail(); 
        String [] phone = peopleArrayList.get(index).getPhone();
       
        displayNameLabel.setText(peopleArrayList.get(index).getName());     
        displayAgeLabel.setText(peopleArrayList.get(index).getAge());
        displayDateLabel.setText(peopleArrayList.get(index).getDate() + " -- " + peopleArrayList.get(index).getMonth() + " -- " + peopleArrayList.get(index).getYear());
        displayEmail1Label.setText(email[0]); 
        displayEmail2Label.setText(email[1]);
        displayEmail3Label.setText(email[2]);
        displayPhone1Label.setText(phone[0]);
        displayPhone2Label.setText(phone[1]);
        displayPhone3Label.setText(phone[2]);
        displayOrganizationLabel.setText(peopleArrayList.get(index).getOrganization());
        displayAddressLabel.setText(peopleArrayList.get(index).getStreet() + ", " + peopleArrayList.get(index).getState() + ", " + peopleArrayList.get(index).getCountry());
        displayCategoryLabel.setText(peopleArrayList.get(index).getCategory());
        displayNotesLabel.setText(peopleArrayList.get(index).getNotes());
        System.out.println("LOG: displayed details");
        System.out.println(" ");
        
    }//GEN-LAST:event_peopleTableMouseReleased

    private void refreshButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseReleased
        clearTable();
        writePeopleToTable();
        clearDetails();
        //TODO: set query combo box to clear
    }//GEN-LAST:event_refreshButtonMouseReleased

    private void cancelDeleteButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelDeleteButtonMouseReleased
        deletePersonDialogue.setVisible(false);
    }//GEN-LAST:event_cancelDeleteButtonMouseReleased

    private void confirmDeletePersonButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmDeletePersonButtonMouseReleased
        int selected = peopleTable.getSelectedRow();
        String namePersonToDelete = peopleTable.getValueAt(selected, 0)+"";
        int index = 0;
        for(int i = 0; i < peopleArrayList.size(); i++){
            if(namePersonToDelete.equals(peopleArrayList.get(i).getName())){
                index = i;
                break;
            } 
        }
        peopleArrayList.remove(index);
        deletePersonDialogue.setVisible(false);
        clearTable();
        writePeopleToTable();
        
    }//GEN-LAST:event_confirmDeletePersonButtonMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }
    
    public void clearTable() {
        for(int i = 0; i < peopleTable.getRowCount(); i++){
            for(int k = 0; k < peopleTable.getColumnCount(); k++){
                peopleTable.setValueAt("", i, k);
            }
        }
    }
    public void clearDetails(){
        displayNameLabel.setText(" ");
        displayAgeLabel.setText("");
        displayDateLabel.setText("");
        displayEmail1Label.setText("");
        displayEmail2Label.setText("");
        displayEmail3Label.setText("");
        displayPhone1Label.setText("");
        displayPhone2Label.setText("");
        displayPhone3Label.setText("");
        displayOrganizationLabel.setText("");
        displayAddressLabel.setText("");
        displayCategoryLabel.setText("");
        displayNotesLabel.setText("");
    }
    public void writePeopleToTable(){
        if(peopleArrayList.size() <= peopleTable.getRowCount()){
            for(int row = 0 ; row < peopleArrayList.size(); row++){
                peopleTable.setValueAt(peopleArrayList.get(row).getName(), row, 0);
                peopleTable.setValueAt(peopleArrayList.get(row).getCategory().toString(), row, 1);
            }
        }
    }
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategoryButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton cancelDeleteButton;
    private javax.swing.JLabel categoriesLabel;
    private javax.swing.JTable categoriesTable;
    private javax.swing.JComboBox<String> categoryCB;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> categoryQueryCB;
    private javax.swing.JButton confirmDeletePersonButton;
    private javax.swing.JTextField countryTF;
    private javax.swing.JComboBox<String> dateCB;
    private javax.swing.JButton deleteCategoryButton;
    private javax.swing.JDialog deletePersonDialogue;
    private javax.swing.JButton deleteProfileButton;
    private javax.swing.JLabel displayAddressLabel;
    private javax.swing.JLabel displayAgeLabel;
    private javax.swing.JLabel displayCategoryLabel;
    private javax.swing.JLabel displayDateLabel;
    private javax.swing.JLabel displayEmail1Label;
    private javax.swing.JLabel displayEmail2Label;
    private javax.swing.JLabel displayEmail3Label;
    private javax.swing.JLabel displayNameLabel;
    private javax.swing.JLabel displayNotesLabel;
    private javax.swing.JLabel displayOrganizationLabel;
    private javax.swing.JLabel displayPhone1Label;
    private javax.swing.JLabel displayPhone2Label;
    private javax.swing.JLabel displayPhone3Label;
    private javax.swing.JLabel doBLabel;
    private javax.swing.JDialog editCategoryDialogue;
    private javax.swing.JButton editProfileButton;
    private javax.swing.JLabel email2Label;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton enterPersonButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JCheckBox exportFamilyCB;
    private javax.swing.JPanel exportImportPanel;
    private javax.swing.JCheckBox exportPersonalCB;
    private javax.swing.JCheckBox exportWorkCB;
    private javax.swing.JTextField firstEmailTF;
    private javax.swing.JTextField firstPhoneTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> monthCB;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton newCategoryButton;
    private javax.swing.JTextField newCategoryTF;
    private javax.swing.JPanel newPersonPanel;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextArea notesTA;
    private javax.swing.JTextField organizationTF;
    private javax.swing.JLabel organizatonLabel;
    private javax.swing.JPanel peoplePanel;
    private javax.swing.JTable peopleTable;
    private javax.swing.JLabel phone2Label;
    private javax.swing.JLabel phone3Label;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton queryButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTextField secondEmailTF;
    private javax.swing.JTextField secondPhoneTF;
    private javax.swing.JTextField stateTF;
    private javax.swing.JTextField streetTF;
    private javax.swing.JTextField thirdEmailTF;
    private javax.swing.JTextField thirdPhoneTF;
    private javax.swing.JComboBox<String> yearCB;
    private javax.swing.JTextField zipTF;
    // End of variables declaration//GEN-END:variables
}
