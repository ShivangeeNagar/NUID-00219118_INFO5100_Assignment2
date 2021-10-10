/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.CarInfo;
import model.Car_directory;

/**
 *
 * @author shivanginagar
 */
public class FilterPageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FilterPageJPanel
     */
    private Car_directory carDir; 
    private JPanel rightPanel;
    ArrayList<String> city = new ArrayList<String>();
    Set<String> uniqueCity;
    
    FilterPageJPanel(JPanel rightPanel, Car_directory carDir) {
        initComponents();     
        for(int i = 0; i < carDir.getCardetails().size(); i++){
            city.add(carDir.getCardetails().get(i).getAvailablecity());           
        }
        uniqueCity = new HashSet<String>(city);
        for(String str : uniqueCity){
            CBCity.addItem(str);           
        }
        this.rightPanel = rightPanel;
        this.carDir = carDir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnExpiredMaintenance = new javax.swing.JButton();
        CBMinSeats = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CBMaxSeats = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnFirstAvailable = new javax.swing.JButton();
        BtnMinMaxSeats = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BtnBack = new javax.swing.JButton();
        BtnCarsAvailable = new javax.swing.JButton();
        BtnManufacturers = new javax.swing.JButton();
        BtnLastFleetUpdated = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtSearchBrand = new javax.swing.JTextField();
        txtManufacturedYear = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        BtnSearchBrand = new javax.swing.JButton();
        BtnManufacturedYear = new javax.swing.JButton();
        BtnSerialNumber = new javax.swing.JButton();
        BtnModelNumber = new javax.swing.JButton();
        CBCity = new javax.swing.JComboBox<>();
        BtnSearchCity = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1500, 855));

        BtnExpiredMaintenance.setFont(new java.awt.Font("PT Serif Caption", 0, 18)); // NOI18N
        BtnExpiredMaintenance.setText("4. Cars with expired Maintenance certificate");
        BtnExpiredMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExpiredMaintenanceActionPerformed(evt);
            }
        });

        CBMinSeats.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        CBMinSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        CBMinSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBMinSeatsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        jLabel2.setText("Min. Seats");

        CBMaxSeats.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        CBMaxSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));

        jLabel1.setFont(new java.awt.Font("PT Serif Caption", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Uber App - Filter Rides");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        jLabel3.setText("Max. Seats");

        BtnFirstAvailable.setFont(new java.awt.Font("PT Serif Caption", 0, 18)); // NOI18N
        BtnFirstAvailable.setText("1. First Available Car");
        BtnFirstAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFirstAvailableActionPerformed(evt);
            }
        });

        BtnMinMaxSeats.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        BtnMinMaxSeats.setText("Search Cars with min and max seats");
        BtnMinMaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinMaxSeatsActionPerformed(evt);
            }
        });

        BtnBack.setFont(new java.awt.Font("PT Serif Caption", 0, 18)); // NOI18N
        BtnBack.setText("<-Previous Page");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnCarsAvailable.setFont(new java.awt.Font("PT Serif Caption", 0, 18)); // NOI18N
        BtnCarsAvailable.setText("3. Cars currently Available");
        BtnCarsAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCarsAvailableActionPerformed(evt);
            }
        });

        BtnManufacturers.setFont(new java.awt.Font("PT Serif Caption", 0, 18)); // NOI18N
        BtnManufacturers.setText("5. All the Manufacturers Used");
        BtnManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManufacturersActionPerformed(evt);
            }
        });

        BtnLastFleetUpdated.setFont(new java.awt.Font("PT Serif Caption", 0, 18)); // NOI18N
        BtnLastFleetUpdated.setText("2. Last time fleet was Updated");
        BtnLastFleetUpdated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLastFleetUpdatedActionPerformed(evt);
            }
        });

        txtSearchBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBrandActionPerformed(evt);
            }
        });

        BtnSearchBrand.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        BtnSearchBrand.setText("Search By Brand-Name");
        BtnSearchBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchBrandActionPerformed(evt);
            }
        });

        BtnManufacturedYear.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        BtnManufacturedYear.setText("Search By Manufactured Year");
        BtnManufacturedYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManufacturedYearActionPerformed(evt);
            }
        });

        BtnSerialNumber.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        BtnSerialNumber.setText("Search By Serial Number");
        BtnSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSerialNumberActionPerformed(evt);
            }
        });

        BtnModelNumber.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        BtnModelNumber.setText("Search By Model Number");
        BtnModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModelNumberActionPerformed(evt);
            }
        });

        CBCity.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        CBCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCityActionPerformed(evt);
            }
        });

        BtnSearchCity.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        BtnSearchCity.setText("Search By City");
        BtnSearchCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnBack)
                    .addComponent(BtnExpiredMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnManufacturers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCarsAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLastFleetUpdated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFirstAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BtnSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtManufacturedYear)
                                        .addComponent(txtSearchBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BtnManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(BtnSearchBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtModelNumber)
                                    .addComponent(CBCity, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnSearchCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(22, 22, 22)))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(511, 511, 511)
                .addComponent(CBMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMinMaxSeats)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnFirstAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLastFleetUpdated, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCarsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchBrand)
                            .addComponent(BtnSearchBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnExpiredMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnManufacturers, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBCity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnMinMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(715, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExpiredMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExpiredMaintenanceActionPerformed
        // TODO add your handling code here:
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        list = carDir.searchByMaintenanceCertificate();
        if(list.size() > 0){
            SearchResultsJPanel panel = new SearchResultsJPanel(rightPanel, list);
            rightPanel.add("SearchJPanel", panel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"None Cars with Maintenance Certificate found");
        }
    }//GEN-LAST:event_BtnExpiredMaintenanceActionPerformed

    private void CBMinSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMinSeatsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CBMinSeatsActionPerformed

    private void BtnFirstAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFirstAvailableActionPerformed
        // TODO add your handling code here:
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        list.add(carDir.firstAvailable());
        if(list.size() > 0){
            SearchResultsJPanel panel = new SearchResultsJPanel(rightPanel, list);
            rightPanel.add("SearchJPanel", panel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No Cars Available");
        }
    }//GEN-LAST:event_BtnFirstAvailableActionPerformed

    private void BtnMinMaxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinMaxSeatsActionPerformed
        // TODO add your handling code here:
        int min = Integer.parseInt(CBMinSeats.getSelectedItem().toString());
        int max = Integer.parseInt(CBMaxSeats.getSelectedItem().toString());
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        list = carDir.searchBySeats(min, max);
        if(list.size() > 0){
            SearchResultsJPanel panel = new SearchResultsJPanel(rightPanel, list);
            rightPanel.add("SearchJPanel", panel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"None Cars with such Seating arrangment");
        }
    }//GEN-LAST:event_BtnMinMaxSeatsActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnCarsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCarsAvailableActionPerformed
        // TODO add your handling code here:
        int available = carDir.availableCar();
        int notAvailable = carDir.getCardetails().size() - available;
        JOptionPane.showMessageDialog(null,"\nNumber of cars Available: "+ available+"\n\nNumber of cars not Available:"+notAvailable);
    }//GEN-LAST:event_BtnCarsAvailableActionPerformed

    private void BtnManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManufacturersActionPerformed
        // TODO add your handling code here:
        String list = carDir.carManufactures();
        JOptionPane.showMessageDialog(null,"Manufacturers used by Uber are:\n" + list);
    }//GEN-LAST:event_BtnManufacturersActionPerformed

    private void BtnLastFleetUpdatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLastFleetUpdatedActionPerformed
        // TODO add your handling code here:
        Date fleet = new Date();
        fleet = carDir.lastUpdated();
        JOptionPane.showMessageDialog(null,"Last time fleet was Updated on "+ fleet);
    }//GEN-LAST:event_BtnLastFleetUpdatedActionPerformed

    private void txtSearchBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBrandActionPerformed

    private void BtnSearchBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchBrandActionPerformed
        // TODO add your handling code here:
        String brand = txtSearchBrand.getText();
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        list = carDir.searchByBrand(brand);
        txtSearchBrand.setText("");
        if(list.size() > 0){
            SearchResultsJPanel panel = new SearchResultsJPanel(rightPanel, list);
            rightPanel.add("SearchJPanel", panel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No Cars of the Brand found");
            txtSearchBrand.setText("");
        }
    }//GEN-LAST:event_BtnSearchBrandActionPerformed

    private void BtnManufacturedYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManufacturedYearActionPerformed
        // TODO add your handling code here:
        String ye = txtManufacturedYear.getText();
        try {
            Integer.parseInt(ye);
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Year is not a valid.");
            return;
        }
        int year = Integer.parseInt(ye);
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        list = carDir.searchByYear(year);
        txtManufacturedYear.setText("");
        if(list.size() > 0){
            SearchResultsJPanel panel = new SearchResultsJPanel(rightPanel, list);
            rightPanel.add("SearchJPanel", panel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No Cars of the year found");
            txtManufacturedYear.setText("");
        }
    }//GEN-LAST:event_BtnManufacturedYearActionPerformed

    private void BtnSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSerialNumberActionPerformed
        // TODO add your handling code here:
        String serial = txtSerialNumber.getText();
        try {
            Integer.parseInt(serial);
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Serial Number is not a valid number.");
            return;
        }
        int serial_num = Integer.parseInt(serial);
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        list = carDir.searchBySerialNumber(serial_num);
        txtSerialNumber.setText("");
        if(list.size() > 0){
            SearchResultsJPanel panel = new SearchResultsJPanel(rightPanel, list);
            rightPanel.add("SearchJPanel", panel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No Cars of the Serial Number found");
            txtSerialNumber.setText("");
        }
    }//GEN-LAST:event_BtnSerialNumberActionPerformed

    private void BtnModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModelNumberActionPerformed
        // TODO add your handling code here:
        String model_num = txtModelNumber.getText();
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        list = carDir.searchByModelNumber(model_num);
        txtModelNumber.setText("");
        if(list.size() > 0){
            SearchResultsJPanel panel = new SearchResultsJPanel(rightPanel, list);
            rightPanel.add("SearchJPanel", panel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No Cars of the Model found");
            txtModelNumber.setText("");
        }
    }//GEN-LAST:event_BtnModelNumberActionPerformed

    private void CBCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCityActionPerformed

    private void BtnSearchCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchCityActionPerformed
        // TODO add your handling code here:
        String city = CBCity.getSelectedItem().toString();
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        list = carDir.searchByAvailableInCity(city);
        if(list.size() > 0){
            SearchResultsJPanel panel = new SearchResultsJPanel(rightPanel, list);
            rightPanel.add("SearchJPanel", panel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"None Cars availsble in the Selected City");
        }
    }//GEN-LAST:event_BtnSearchCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCarsAvailable;
    private javax.swing.JButton BtnExpiredMaintenance;
    private javax.swing.JButton BtnFirstAvailable;
    private javax.swing.JButton BtnLastFleetUpdated;
    private javax.swing.JButton BtnManufacturedYear;
    private javax.swing.JButton BtnManufacturers;
    private javax.swing.JButton BtnMinMaxSeats;
    private javax.swing.JButton BtnModelNumber;
    private javax.swing.JButton BtnSearchBrand;
    private javax.swing.JButton BtnSearchCity;
    private javax.swing.JButton BtnSerialNumber;
    private javax.swing.JComboBox<String> CBCity;
    private javax.swing.JComboBox<String> CBMaxSeats;
    private javax.swing.JComboBox<String> CBMinSeats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtManufacturedYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSearchBrand;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
