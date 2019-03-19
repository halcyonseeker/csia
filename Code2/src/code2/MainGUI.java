package code2;

import java.util.ArrayList;
/*
Extensibility/TODO list
- More refined GUI
- TODO add 1900 to 2022 in data of birth cb
- add person button leads to window instead of tab
- allow a person to be placed in more than one cate2gory
  - replace cetegory combo box with a popup box containing check boxes and an add category button and text field
*/
public class MainGUI extends javax.swing.JFrame {

    private ArrayList<Person> peopleArray = new ArrayList<Person>();
    
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        peoplePanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        organizatonLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        categoriesLabel = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();
        email2Label = new javax.swing.JLabel();
        phone2Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        peopleList = new javax.swing.JList<>();
        nameLabel = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        dOBLabel = new javax.swing.JLabel();
        deleteProfileButton = new javax.swing.JButton();
        editProfileButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        phone3Label = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emailLabel.setText("Email:");

        organizatonLabel.setText("Organization:");

        addressLabel.setText("Address:");

        categoriesLabel.setText("Categories:");

        notesLabel.setText("Notes:");

        email2Label.setText("Email 2 :");

        phone2Label.setText("Phone 2:");

        peopleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Person not set", "Person not set", "Person not set", "Person not set" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(peopleList);

        nameLabel.setText("Name:");

        searchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTFActionPerformed(evt);
            }
        });

        ageLabel.setText("Age:");

        dOBLabel.setText("Date of Birth:");

        deleteProfileButton.setText("Delete");
        deleteProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProfileButtonActionPerformed(evt);
            }
        });

        editProfileButton.setText("Edit");

        jLabel6.setText("Email 3: ");

        phoneLabel.setText("Phone:");

        phone3Label.setText("Phone 3:");

        javax.swing.GroupLayout peoplePanelLayout = new javax.swing.GroupLayout(peoplePanel);
        peoplePanel.setLayout(peoplePanelLayout);
        peoplePanelLayout.setHorizontalGroup(
            peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peoplePanelLayout.createSequentialGroup()
                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peoplePanelLayout.createSequentialGroup()
                        .addGap(0, 214, Short.MAX_VALUE)
                        .addComponent(editProfileButton)
                        .addGap(24, 24, 24)
                        .addComponent(deleteProfileButton))
                    .addGroup(peoplePanelLayout.createSequentialGroup()
                        .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notesLabel)
                            .addComponent(emailLabel)
                            .addComponent(email2Label)
                            .addComponent(phone2Label)
                            .addComponent(organizatonLabel)
                            .addComponent(addressLabel)
                            .addComponent(categoriesLabel)
                            .addComponent(ageLabel)
                            .addComponent(nameLabel)
                            .addComponent(dOBLabel)
                            .addComponent(jLabel6)
                            .addComponent(phoneLabel)
                            .addComponent(phone3Label))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        peoplePanelLayout.setVerticalGroup(
            peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peoplePanelLayout.createSequentialGroup()
                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editProfileButton)
                        .addComponent(deleteProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(peoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(peoplePanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ageLabel)
                        .addGap(18, 18, 18)
                        .addComponent(dOBLabel)
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel)
                        .addGap(18, 18, 18)
                        .addComponent(email2Label)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(phoneLabel)
                        .addGap(18, 18, 18)
                        .addComponent(phone2Label)
                        .addGap(18, 18, 18)
                        .addComponent(phone3Label)
                        .addGap(18, 18, 18)
                        .addComponent(organizatonLabel)
                        .addGap(18, 18, 18)
                        .addComponent(addressLabel)
                        .addGap(18, 18, 18)
                        .addComponent(categoriesLabel)
                        .addGap(18, 18, 18)
                        .addComponent(notesLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(peoplePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("People", peoplePanel);

        notesTA.setColumns(20);
        notesTA.setRows(5);
        jScrollPane2.setViewportView(notesTA);

        dateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel38.setText("Date of Birth:");

        monthCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March ", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        yearCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", " " }));

        categoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Family", "Work", "Personal", " " }));

        jLabel42.setText("Phone 1:");

        jLabel43.setText("Phone 2:");

        jLabel44.setText("Phone 3:");

        jLabel45.setText("Organization:");

        jLabel46.setText("Address:");

        jLabel47.setText("Categories:");

        addCategoryButton.setText("Add Category");

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
                .addContainerGap(740, Short.MAX_VALUE))
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
                                        .addComponent(categoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(104, 104, 104))
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
                .addContainerGap(594, Short.MAX_VALUE))
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
        MyDate d = new MyDate(Byte.parseByte(dateCB.getSelectedItem()+""), monthCB.getSelectedItem()+"", Integer.parseInt(yearCB.getSelectedItem()+""));
        Address a = new Address(streetTF.getText()+"", stateTF.getText()+"", countryTF.getText()+"", Integer.parseInt(zipTF.getText()+""));
        String [] email = {firstEmailTF.getText(), secondEmailTF.getText(), thirdEmailTF.getText()};
        String [] phone = {firstPhoneTF.getText(), secondPhoneTF.getText(), thirdPhoneTF.getText()};
        String [] category = {categoryCB.getSelectedItem()+""};
        peopleArray.add(new Person(
                nameTF.getText(),
                Integer.parseInt(ageTF.getText()), 
                d,
                email,
                phone,
                organizationTF.getText(),
                a,
                category,
                notesTA.getText()
        ));
     
    }//GEN-LAST:event_enterPersonButtonMouseReleased

    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTFActionPerformed

    private void deleteProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProfileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteProfileButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportButtonActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategoryButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTF;
    private javax.swing.JLabel categoriesLabel;
    private javax.swing.JComboBox<String> categoryCB;
    private javax.swing.JTextField countryTF;
    private javax.swing.JLabel dOBLabel;
    private javax.swing.JComboBox<String> dateCB;
    private javax.swing.JButton deleteProfileButton;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> monthCB;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPanel newPersonPanel;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextArea notesTA;
    private javax.swing.JTextField organizationTF;
    private javax.swing.JLabel organizatonLabel;
    private javax.swing.JList<String> peopleList;
    private javax.swing.JPanel peoplePanel;
    private javax.swing.JLabel phone2Label;
    private javax.swing.JLabel phone3Label;
    private javax.swing.JLabel phoneLabel;
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
