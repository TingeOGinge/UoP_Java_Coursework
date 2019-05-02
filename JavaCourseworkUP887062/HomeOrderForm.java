package JavaCourseworkUP887062;

import Server.Order;
import Server.Sauce;
import Server.Topping;
import Server.Pizza;
import Server.BaseSize;
import Server.BaseCrust;
import java.awt.CardLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
  

public class HomeOrderForm extends javax.swing.JFrame {

  /**
   * Creates new form HomeOrderForm
   */
  
 
  CardLayout cl;
  Order currentOrder;
  Pizza currentPizza;
  Pizza editPizza;
  ArrayList<String> sizesStrings;
  ArrayList<String> crustsStrings;
  ArrayList<String> saucesStrings;
  ArrayList<String> toppingsStrings; 
  ArrayList<Topping> toppings;
  
  public HomeOrderForm() {  
    currentOrder = new Order(); 
    sizesStrings = currentOrder.getSizes(); 
    crustsStrings = currentOrder.getCrusts();
    saucesStrings = currentOrder.getSauces();
    toppingsStrings = currentOrder.getToppingsString();
    toppings = currentOrder.getToppings();
    initComponents();
    cl = (CardLayout)(cardLayoutPanel.getLayout());    
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    staticTopPanel = new javax.swing.JPanel();
    newPizzaButton = new javax.swing.JButton();
    editDeleteButton = new javax.swing.JButton();
    staticBottomPanel = new javax.swing.JPanel();
    closeButton = new javax.swing.JButton();
    orderSummaryButton = new javax.swing.JButton();
    cardLayoutPanel = new javax.swing.JPanel();
    homePanel = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    orderSummary = new javax.swing.JTextArea();
    totalCostOutput = new javax.swing.JTextField();
    totalCostLabel = new javax.swing.JLabel();
    newPizzaPanel = new javax.swing.JPanel();
    sizeCombo = new javax.swing.JComboBox();
    crustCombo = new javax.swing.JComboBox();
    sauceCombo = new javax.swing.JComboBox();
    topping1Combo = new javax.swing.JComboBox();
    topping2Combo = new javax.swing.JComboBox();
    sizeLabel = new javax.swing.JLabel();
    crustLabel = new javax.swing.JLabel();
    sauceLabel = new javax.swing.JLabel();
    topping1Label = new javax.swing.JLabel();
    topping2Label = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    pizzaSummaryOutput = new javax.swing.JTextArea();
    addToOrderButton = new javax.swing.JButton();
    editDeletePanel = new javax.swing.JPanel();
    jScrollPane3 = new javax.swing.JScrollPane();
    editDeleteTextArea = new javax.swing.JTextArea();
    jLabel1 = new javax.swing.JLabel();
    pizzaNumberCombo = new javax.swing.JComboBox();
    deletePizzaButton = new javax.swing.JButton();
    editSizeCombo = new javax.swing.JComboBox();
    editCrustCombo = new javax.swing.JComboBox();
    editSauceCombo = new javax.swing.JComboBox();
    editTopping1Combo = new javax.swing.JComboBox();
    editTopping2Combo = new javax.swing.JComboBox();
    editSizeLabel1 = new javax.swing.JLabel();
    editCrustLabel1 = new javax.swing.JLabel();
    editSauceLabel1 = new javax.swing.JLabel();
    editTopping1Label1 = new javax.swing.JLabel();
    editTopping2Label1 = new javax.swing.JLabel();
    submitEditButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Pizza Ordering System");
    setBackground(java.awt.Color.white);
    setName("Home/Order"); // NOI18N

    staticTopPanel.setBackground(new java.awt.Color(255, 0, 51));

    newPizzaButton.setText("New Pizza");
    newPizzaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        newPizzaButtonAction(evt);
      }
    });

    editDeleteButton.setText("Edit/Delete Pizza");
    editDeleteButton.setToolTipText("");
    editDeleteButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editDeleteAction(evt);
      }
    });

    javax.swing.GroupLayout staticTopPanelLayout = new javax.swing.GroupLayout(staticTopPanel);
    staticTopPanel.setLayout(staticTopPanelLayout);
    staticTopPanelLayout.setHorizontalGroup(
      staticTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(staticTopPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(newPizzaButton)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(editDeleteButton)
        .addContainerGap())
    );
    staticTopPanelLayout.setVerticalGroup(
      staticTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(staticTopPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(staticTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(newPizzaButton)
          .addComponent(editDeleteButton))
        .addContainerGap(57, Short.MAX_VALUE))
    );

    staticBottomPanel.setBackground(new java.awt.Color(255, 51, 51));

    closeButton.setText("Close");
    closeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        closeButtonActionPerformed(evt);
      }
    });

    orderSummaryButton.setText("Order Summary");
    orderSummaryButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout staticBottomPanelLayout = new javax.swing.GroupLayout(staticBottomPanel);
    staticBottomPanel.setLayout(staticBottomPanelLayout);
    staticBottomPanelLayout.setHorizontalGroup(
      staticBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staticBottomPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(closeButton)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(orderSummaryButton)
        .addContainerGap())
    );
    staticBottomPanelLayout.setVerticalGroup(
      staticBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(staticBottomPanelLayout.createSequentialGroup()
        .addContainerGap(17, Short.MAX_VALUE)
        .addGroup(staticBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(orderSummaryButton)
          .addComponent(closeButton))
        .addGap(54, 54, 54))
    );

    cardLayoutPanel.setBackground(new java.awt.Color(255, 255, 255));
    cardLayoutPanel.setLayout(new java.awt.CardLayout());

    homePanel.setBackground(new java.awt.Color(255, 255, 255));

    orderSummary.setEditable(false);
    orderSummary.setColumns(20);
    orderSummary.setRows(5);
    orderSummary.setText("To create a new pizza, click the button above. ");
    jScrollPane1.setViewportView(orderSummary);

    totalCostOutput.setEditable(false);

    totalCostLabel.setText("Total Cost:");

    javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
    homePanel.setLayout(homePanelLayout);
    homePanelLayout.setHorizontalGroup(
      homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(totalCostLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
        .addComponent(totalCostOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    homePanelLayout.setVerticalGroup(
      homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(homePanelLayout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(29, 29, 29)
        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(totalCostOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(totalCostLabel))
        .addGap(0, 54, Short.MAX_VALUE))
    );

    cardLayoutPanel.add(homePanel, "HomePanel");
    homePanel.getAccessibleContext().setAccessibleDescription("");

    newPizzaPanel.setBackground(new java.awt.Color(255, 255, 255));

    sizeCombo.setModel(new DefaultComboBoxModel(
      sizesStrings.toArray(new String[sizesStrings.size()])));
  sizeCombo.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
      sizeComboItemStateChanged(evt);
    }
  });

  crustCombo.setModel(new DefaultComboBoxModel(
    crustsStrings.toArray(new String[crustsStrings.size()])));
crustCombo.addItemListener(new java.awt.event.ItemListener() {
  public void itemStateChanged(java.awt.event.ItemEvent evt) {
    crustComboItemStateChanged(evt);
  }
  });

  sauceCombo.setModel(new DefaultComboBoxModel(
    saucesStrings.toArray(new String[saucesStrings.size()])));
sauceCombo.addItemListener(new java.awt.event.ItemListener() {
  public void itemStateChanged(java.awt.event.ItemEvent evt) {
    sauceComboItemStateChanged(evt);
  }
  });

  topping1Combo.setModel(new DefaultComboBoxModel(
    toppingsStrings.toArray(new String[toppingsStrings.size()])));
topping1Combo.addItemListener(new java.awt.event.ItemListener() {
  public void itemStateChanged(java.awt.event.ItemEvent evt) {
    topping1ComboItemStateChanged(evt);
  }
  });

  topping2Combo.setModel(new DefaultComboBoxModel(
    toppingsStrings.toArray(new String[toppingsStrings.size()])));
topping2Combo.setMinimumSize(new java.awt.Dimension(79, 26));
topping2Combo.setPreferredSize(new java.awt.Dimension(79, 26));
topping2Combo.addItemListener(new java.awt.event.ItemListener() {
  public void itemStateChanged(java.awt.event.ItemEvent evt) {
    topping2ComboItemStateChanged(evt);
  }
  });

  sizeLabel.setText("Size");

  crustLabel.setText("Crust");

  sauceLabel.setText("Sauce");

  topping1Label.setText("Topping 1");

  topping2Label.setText("Topping 2");

  pizzaSummaryOutput.setEditable(false);
  pizzaSummaryOutput.setColumns(20);
  pizzaSummaryOutput.setRows(5);
  jScrollPane2.setViewportView(pizzaSummaryOutput);

  addToOrderButton.setText("Add to order");
  addToOrderButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
      addToOrderButtonActionPerformed(evt);
    }
  });

  javax.swing.GroupLayout newPizzaPanelLayout = new javax.swing.GroupLayout(newPizzaPanel);
  newPizzaPanel.setLayout(newPizzaPanelLayout);
  newPizzaPanelLayout.setHorizontalGroup(
    newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(newPizzaPanelLayout.createSequentialGroup()
      .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(newPizzaPanelLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newPizzaPanelLayout.createSequentialGroup()
              .addGap(0, 0, Short.MAX_VALUE)
              .addComponent(addToOrderButton))))
        .addGroup(newPizzaPanelLayout.createSequentialGroup()
          .addGap(74, 74, 74)
          .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sizeLabel)
            .addComponent(crustLabel)
            .addComponent(sauceLabel)
            .addComponent(topping1Label)
            .addComponent(topping2Label))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
          .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(crustCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(sauceCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(sizeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(topping1Combo, 0, 79, Short.MAX_VALUE))
            .addComponent(topping2Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
      .addContainerGap())
  );
  newPizzaPanelLayout.setVerticalGroup(
    newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(newPizzaPanelLayout.createSequentialGroup()
      .addGap(30, 30, 30)
      .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(sizeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(sizeLabel))
      .addGap(30, 30, 30)
      .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(crustCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(crustLabel))
      .addGap(30, 30, 30)
      .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(sauceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(sauceLabel))
      .addGap(30, 30, 30)
      .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(topping1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(topping1Label))
      .addGap(30, 30, 30)
      .addGroup(newPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(topping2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(topping2Label))
      .addGap(35, 35, 35)
      .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(addToOrderButton)
      .addGap(12, 12, 12))
  );

  cardLayoutPanel.add(newPizzaPanel, "NewPizzaPanel");

  editDeletePanel.setBackground(new java.awt.Color(255, 255, 255));
  editDeletePanel.setForeground(new java.awt.Color(255, 255, 51));
  editDeletePanel.setRequestFocusEnabled(false);

  editDeleteTextArea.setEditable(false);
  editDeleteTextArea.setColumns(20);
  editDeleteTextArea.setRows(5);
  jScrollPane3.setViewportView(editDeleteTextArea);

  jLabel1.setText("Pizza Number:");

  pizzaNumberCombo.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
      pizzaNumberComboItemStateChanged(evt);
    }
  });

  deletePizzaButton.setText("Delete Pizza");
  deletePizzaButton.setToolTipText("");
  deletePizzaButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
      deletePizzaButtonActionPerformed(evt);
    }
  });

  editSizeCombo.setModel(new DefaultComboBoxModel(
    sizesStrings.toArray(new String[sizesStrings.size()])));
editSizeCombo.addItemListener(new java.awt.event.ItemListener() {
  public void itemStateChanged(java.awt.event.ItemEvent evt) {
    editSizeComboItemStateChanged(evt);
  }
  });

  editCrustCombo.setModel(new DefaultComboBoxModel(
    crustsStrings.toArray(new String[crustsStrings.size()])));
editCrustCombo.addItemListener(new java.awt.event.ItemListener() {
  public void itemStateChanged(java.awt.event.ItemEvent evt) {
    editCrustComboItemStateChanged(evt);
  }
  });

  editSauceCombo.setModel(new DefaultComboBoxModel(
    saucesStrings.toArray(new String[saucesStrings.size()])));
editSauceCombo.addItemListener(new java.awt.event.ItemListener() {
  public void itemStateChanged(java.awt.event.ItemEvent evt) {
    editSauceComboItemStateChanged(evt);
  }
  });

  editTopping1Combo.setModel(new DefaultComboBoxModel(
    toppingsStrings.toArray(new String[toppingsStrings.size()])));
editTopping1Combo.addItemListener(new java.awt.event.ItemListener() {
  public void itemStateChanged(java.awt.event.ItemEvent evt) {
    editTopping1ComboItemStateChanged(evt);
  }
  });

  editTopping2Combo.setModel(new DefaultComboBoxModel(
    toppingsStrings.toArray(new String[toppingsStrings.size()])));
editTopping2Combo.addItemListener(new java.awt.event.ItemListener() {
  public void itemStateChanged(java.awt.event.ItemEvent evt) {
    editTopping2ComboItemStateChanged(evt);
  }
  });

  editSizeLabel1.setText("Size");

  editCrustLabel1.setText("Crust");

  editSauceLabel1.setText("Sauce");

  editTopping1Label1.setText("Topping 1");

  editTopping2Label1.setText("Topping 2");

  submitEditButton.setText("Submit Edit");
  submitEditButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
      submitEditButtonActionPerformed(evt);
    }
  });

  javax.swing.GroupLayout editDeletePanelLayout = new javax.swing.GroupLayout(editDeletePanel);
  editDeletePanel.setLayout(editDeletePanelLayout);
  editDeletePanelLayout.setHorizontalGroup(
    editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jScrollPane3)
    .addGroup(editDeletePanelLayout.createSequentialGroup()
      .addContainerGap()
      .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editDeletePanelLayout.createSequentialGroup()
          .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editSizeLabel1)
            .addComponent(editCrustLabel1)
            .addComponent(editSauceLabel1)
            .addComponent(editTopping1Label1)
            .addComponent(editTopping2Label1))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(editCrustCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editSauceCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editSizeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editTopping1Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editTopping2Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addGroup(editDeletePanelLayout.createSequentialGroup()
          .addComponent(jLabel1)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
          .addComponent(pizzaNumberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(editDeletePanelLayout.createSequentialGroup()
          .addComponent(deletePizzaButton)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
          .addComponent(submitEditButton)))
      .addContainerGap())
  );
  editDeletePanelLayout.setVerticalGroup(
    editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editDeletePanelLayout.createSequentialGroup()
      .addGap(19, 19, 19)
      .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(jLabel1)
        .addComponent(pizzaNumberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGap(26, 26, 26)
      .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(editSizeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(editSizeLabel1))
      .addGap(30, 30, 30)
      .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(editCrustCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(editCrustLabel1))
      .addGap(30, 30, 30)
      .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(editSauceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(editSauceLabel1))
      .addGap(30, 30, 30)
      .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(editTopping1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(editTopping1Label1))
      .addGap(30, 30, 30)
      .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(editTopping2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(editTopping2Label1))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
      .addGroup(editDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(deletePizzaButton)
        .addComponent(submitEditButton))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
  );

  cardLayoutPanel.add(editDeletePanel, "EditDeletePanel");

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(staticTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addComponent(staticBottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addComponent(cardLayoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );
  layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
      .addComponent(staticTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(0, 0, Short.MAX_VALUE)
      .addComponent(cardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(0, 0, 0)
      .addComponent(staticBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
  );

  pack();
  }// </editor-fold>//GEN-END:initComponents

  private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    this.dispose();
  }//GEN-LAST:event_closeButtonActionPerformed

  private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
    updateHomeDisplay();
  }//GEN-LAST:event_homeButtonActionPerformed

  private void newPizzaButtonAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPizzaButtonAction
    cl.show(cardLayoutPanel, "NewPizzaPanel");
    currentPizza = new Pizza();
    sizeCombo.setSelectedIndex(0);
    crustCombo.setSelectedIndex(0);
    sauceCombo.setSelectedIndex(0);
    topping1Combo.setSelectedIndex(0);
    topping2Combo.setSelectedIndex(0);
    pizzaSummaryOutput.setText(currentPizza.getInfo());
  }//GEN-LAST:event_newPizzaButtonAction
  
  private void editDeleteAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDeleteAction
    if (currentOrder.getSize() > 0){      
      cl.show(cardLayoutPanel, "EditDeletePanel");
      editPizza = new Pizza(currentOrder.getPizza(1));
      updateEditDeleteDisplay();
      updateEditDeleteCombos();
    }
  }//GEN-LAST:event_editDeleteAction
  
  private void updateHomeDisplay(){
    cl.show(cardLayoutPanel, "HomePanel");
    totalCostOutput.setText("£" + currentOrder.getTotalCost());
    if (currentOrder.getSize() > 0) {
      orderSummary.setText(currentOrder.getInfo());
    } else { orderSummary.setText("Your order is empty"); }
  }
  
  private void updateEditDeleteCombos(){
    updateEditSizeCombo();
    updateEditCrustCombo();
    updateEditSauceCombo();
    updateToppingCombo(editTopping1Combo, editPizza.getTopping1());
    updateToppingCombo(editTopping2Combo, editPizza.getTopping2());
  }
  
  private void updateEditSizeCombo(){
    String currentSize = 
            editPizza.getBaseSize().getDescription().substring(0, 1);
    for (int i = 0; i < editSizeCombo.getItemCount(); i++){
      String editSizeOption = String.valueOf(editSizeCombo.getItemAt(i));
      if (editSizeOption.substring(0, 1).equals(currentSize)){
        editSizeCombo.setSelectedIndex(i);
        break;
      }
    }
  }
  
  private void updateEditCrustCombo(){
    String currentCrust = 
            editPizza.getBaseCrust().getDescription().substring(0, 1);
    for (int i = 0; i < editCrustCombo.getItemCount(); i++){
      String editCrustOption = String.valueOf(editCrustCombo.getItemAt(i));
      if (editCrustOption.substring(0, 1).equals(currentCrust)){
        editCrustCombo.setSelectedIndex(i);
        break;
      }
    }
  }
  
  private void updateEditSauceCombo(){
    String currentSauce = 
            editPizza.getPizzaSauce().getDescription().substring(0, 1);
    for (int i = 0; i < editSauceCombo.getItemCount(); i++){
      String editSauceOption = String.valueOf(editSauceCombo.getItemAt(i));
      if (editSauceOption.substring(0, 1).equals(currentSauce)){
        editSauceCombo.setSelectedIndex(i);
        break;
      }
    }
  }
  
  private void updateToppingCombo(JComboBox toppingCombo, Topping t){
    String currentTopping = t.getDescription().substring(0, 2);
    for (int i = 0; i < editTopping1Combo.getItemCount(); i++){
      String editToppingOption = String.valueOf(editTopping1Combo.getItemAt(i));
      if (editToppingOption.substring(0, 2).equals(currentTopping)){
        toppingCombo.setSelectedIndex(i);
        break;
      }
    }
  }
  
  private void addToOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOrderButtonActionPerformed
    currentOrder.addPizza(currentPizza);
    cl.show(cardLayoutPanel, "HomePanel");
    totalCostOutput.setText("£" + currentOrder.getTotalCost());
    orderSummary.setText(currentOrder.getInfo());
  }//GEN-LAST:event_addToOrderButtonActionPerformed

  private void pizzaNumberComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pizzaNumberComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      Integer index = (Integer)pizzaNumberCombo.getSelectedItem();
      editPizza = new Pizza(currentOrder.getPizza(index));
      editDeleteTextArea.setText(editPizza.getInfo());
      updateEditDeleteCombos();
    }    
  }//GEN-LAST:event_pizzaNumberComboItemStateChanged

  private void deletePizzaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePizzaButtonActionPerformed
    if (currentOrder.getSize() > 0){
      Integer index = (Integer)pizzaNumberCombo.getSelectedItem();
      currentOrder.deletePizza(index);
      updateEditDeleteDisplay();
      if (currentOrder.getSize().equals(0)) { 
        updateHomeDisplay();
        cl.show(cardLayoutPanel, "HomePanel");
      }
    }
  }//GEN-LAST:event_deletePizzaButtonActionPerformed

  private void editSizeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editSizeComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      extractSizeCombos(editSizeCombo, editPizza, editDeleteTextArea);
    }
  }//GEN-LAST:event_editSizeComboItemStateChanged

  private void submitEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitEditButtonActionPerformed
    if (currentOrder.getSize() > 0){
      int index = (int)pizzaNumberCombo.getSelectedItem();
      currentOrder.updatePizza(editPizza, index);
      updateHomeDisplay();
    }
  }//GEN-LAST:event_submitEditButtonActionPerformed

  private void editCrustComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editCrustComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      extractCrustCombos(editCrustCombo, editPizza, editDeleteTextArea);
    }
  }//GEN-LAST:event_editCrustComboItemStateChanged

  private void editTopping1ComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editTopping1ComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      extractToppingCombos(editTopping1Combo, editPizza, editDeleteTextArea, 1);
    }
  }//GEN-LAST:event_editTopping1ComboItemStateChanged

  private void editTopping2ComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editTopping2ComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      extractToppingCombos(editTopping2Combo, editPizza, editDeleteTextArea, 2);
    }
  }//GEN-LAST:event_editTopping2ComboItemStateChanged

  private void editSauceComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editSauceComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      extractSauceCombos(editSauceCombo, editPizza, editDeleteTextArea);
    }
  }//GEN-LAST:event_editSauceComboItemStateChanged

  private void sizeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sizeComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      extractSizeCombos(sizeCombo, currentPizza, pizzaSummaryOutput);
    }
  }//GEN-LAST:event_sizeComboItemStateChanged

  private void crustComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_crustComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
     extractCrustCombos(crustCombo, currentPizza, pizzaSummaryOutput); 
    }
  }//GEN-LAST:event_crustComboItemStateChanged

  private void sauceComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sauceComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      extractSauceCombos(sauceCombo, currentPizza, pizzaSummaryOutput);
    }
  }//GEN-LAST:event_sauceComboItemStateChanged

  private void topping1ComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_topping1ComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      extractToppingCombos(topping1Combo, currentPizza, pizzaSummaryOutput, 1);
    }    
  }//GEN-LAST:event_topping1ComboItemStateChanged

  private void topping2ComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_topping2ComboItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED){
      extractToppingCombos(topping2Combo, currentPizza, pizzaSummaryOutput, 2);
    }  
  }//GEN-LAST:event_topping2ComboItemStateChanged
  
  private void extractSizeCombos(JComboBox dropdown, Pizza p, JTextArea display){
    String size = (String)dropdown.getSelectedItem();
    p.setBaseSize(BaseSize.valueOf(size.toUpperCase()));
    display.setText(p.getInfo());
  }
  
  private void extractCrustCombos(JComboBox dropdown, Pizza p, JTextArea display){
    String crust = (String)dropdown.getSelectedItem();
    p.setBaseCrust(BaseCrust.valueOf(
            crust.split("\\s+")[0].toUpperCase()));
    display.setText(p.getInfo());
  }
  
   private void extractSauceCombos(JComboBox dropdown, Pizza p, JTextArea display){
    String sauce = (String)dropdown.getSelectedItem();
    p.setPizzaSauce(Sauce.valueOf(sauce.toUpperCase()));
    display.setText(p.getInfo());
  }
   
   private void extractToppingCombos(JComboBox dropdown, Pizza p, 
                                      JTextArea display, int toppingNum){
    String newTopping = (String)dropdown.getSelectedItem();
    for (Topping t : toppings){
      if (t.getDescription().equals(newTopping)) {
        if (toppingNum == 1) { 
          p.setTopping1(t);
          break;
        }
        else { 
          p.setTopping2(t);
          break;
        }
      }
    }    
    display.setText(p.getInfo());
   }
  
  private void updateEditDeleteDisplay(){
    pizzaNumberCombo.removeAllItems();
    Integer orderSize = currentOrder.getSize();
    if(orderSize > 0){      
      for (Integer i = 1; i <= orderSize; i++){
        pizzaNumberCombo.addItem(i);
      }
    }
  }
  
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
      java.util.logging.Logger.getLogger(HomeOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(HomeOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(HomeOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(HomeOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new HomeOrderForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton addToOrderButton;
  private javax.swing.JPanel cardLayoutPanel;
  private javax.swing.JButton closeButton;
  private javax.swing.JComboBox crustCombo;
  private javax.swing.JLabel crustLabel;
  private javax.swing.JButton deletePizzaButton;
  private javax.swing.JComboBox editCrustCombo;
  private javax.swing.JLabel editCrustLabel1;
  private javax.swing.JButton editDeleteButton;
  private javax.swing.JPanel editDeletePanel;
  private javax.swing.JTextArea editDeleteTextArea;
  private javax.swing.JComboBox editSauceCombo;
  private javax.swing.JLabel editSauceLabel1;
  private javax.swing.JComboBox editSizeCombo;
  private javax.swing.JLabel editSizeLabel1;
  private javax.swing.JComboBox editTopping1Combo;
  private javax.swing.JLabel editTopping1Label1;
  private javax.swing.JComboBox editTopping2Combo;
  private javax.swing.JLabel editTopping2Label1;
  private javax.swing.JPanel homePanel;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JButton newPizzaButton;
  private javax.swing.JPanel newPizzaPanel;
  private javax.swing.JTextArea orderSummary;
  private javax.swing.JButton orderSummaryButton;
  private javax.swing.JComboBox pizzaNumberCombo;
  private javax.swing.JTextArea pizzaSummaryOutput;
  private javax.swing.JComboBox sauceCombo;
  private javax.swing.JLabel sauceLabel;
  private javax.swing.JComboBox sizeCombo;
  private javax.swing.JLabel sizeLabel;
  private javax.swing.JPanel staticBottomPanel;
  private javax.swing.JPanel staticTopPanel;
  private javax.swing.JButton submitEditButton;
  private javax.swing.JComboBox topping1Combo;
  private javax.swing.JLabel topping1Label;
  private javax.swing.JComboBox topping2Combo;
  private javax.swing.JLabel topping2Label;
  private javax.swing.JLabel totalCostLabel;
  private javax.swing.JTextField totalCostOutput;
  // End of variables declaration//GEN-END:variables
}
