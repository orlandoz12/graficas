
import graficacion.datoslista;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author asus
 */
public final class guia5 extends javax.swing.JFrame {
    String linea,comparador,comparador2,comparador3,comparador4,comparador5;
String[] valores;
String [] titulos;
String tigrafica;
public static datoslista dat;
DefaultTableModel modelo= new DefaultTableModel();
File archivo=new File("escuelasdeformacion.csv");

int i=0,columnas,tama,tama2,tama3,tama4,tama5,tamatabla=0;

 public static LinkedList<datoslista> tabl = new LinkedList<>();
 LinkedList<String> filcol2 = new LinkedList<>();
  LinkedList<Integer> columna1 = new LinkedList<>();
  LinkedList<Integer> columna2 = new LinkedList<>();
  LinkedList<Integer> columna3 = new LinkedList<>();
  LinkedList<Integer> columna4 = new LinkedList<>();
  LinkedList<Integer> columna5 = new LinkedList<>();
  LinkedList<Integer> columna6 = new LinkedList<>();
  LinkedList<String> filcol3 = new LinkedList<>();
   LinkedList<String> filcol4 = new LinkedList<>();
    LinkedList<String> filcol5 = new LinkedList<>();
     LinkedList<String> filcol6 = new LinkedList<>();
    

    public guia5() {
        initComponents(); 
     
     try{
    Scanner in=new Scanner(archivo);
    
    while(in.hasNext()){
        linea=in.nextLine();
        valores=linea.split(",");
        
        
          if (i==0){
              titulos=valores;
              columnas=valores.length;
               
          }
          if (i==1){
              dat =new datoslista();
               modelo.setColumnIdentifiers(titulos); 
               modelo.addRow(valores);
               filcol2.add(valores[1]);
               comparador=valores[1];
               filcol3.add(valores[2]);
                comparador2=valores[2];
                 filcol4.add(valores[3]);
                comparador3=valores[3];
                 filcol5.add(valores[4]);
                comparador4=valores[4];
                 filcol6.add(valores[5]);
                comparador5=valores[5];
                 dat.setn(valores[0]);
                dat.setdisciplina(valores[1]);
               dat.setsexo(valores[2]);
                dat.setbarrio(valores[3]);
                dat.setestrato(valores[4]);
                dat.setdiscapacidad(valores[5]);
                tabl.add(dat);
          }
         
          
          if(i>1){
              dat =new datoslista();
               dat.setn(valores[0]);
                dat.setdisciplina(valores[1]);
               dat.setsexo(valores[2]);
                dat.setbarrio(valores[3]);
                dat.setestrato(valores[4]);
                dat.setdiscapacidad(valores[5]);
              modelo.addRow(valores);
              if(valores[1].equals(comparador)){
                  
              }else{
                  filcol2.add(valores[1]);
                  comparador=valores[1];
              }
              if(valores[2].equals(comparador2)){
                  
              }else{
                  filcol3.add(valores[2]);
                  comparador2=valores[2];
              }
              if(valores[3].equals(comparador3)){
                  
              }else{
                  filcol4.add(valores[3]);
                  comparador3=valores[3];
              }
              if(valores[4].equals(comparador4)){
                  
              }else{
                  filcol5.add(valores[4]);
                  comparador4=valores[4];
                  if(valores[5].equals(comparador5)){
                  
              }else{
                  filcol6.add(valores[5]);
                  comparador5=valores[5];
              }
              }
              tabl.add(dat);
              }
        
          
          i++;
        
}
     }catch (FileNotFoundException ex){
 
}  tabla.setVisible(true);
  modelo.setColumnCount(columnas);
tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
tabla.getColumnModel().getColumn(1).setPreferredWidth(150);
tabla.getColumnModel().getColumn(2).setPreferredWidth(100);
tabla.getColumnModel().getColumn(3).setPreferredWidth(150);
tabla.getColumnModel().getColumn(4).setPreferredWidth(10);
tabla.getColumnModel().getColumn(5).setPreferredWidth(10);
   LinkedList<String> pr = new LinkedList<>();
     LinkedList<String> pr2 = new LinkedList<>();
       LinkedList<String> pr3 = new LinkedList<>();
         LinkedList<String> pr4 = new LinkedList<>();
           LinkedList<String> pr5 = new LinkedList<>();
       //filtro1 
       tama=filcol2.size();   
      for(int j=0;j<tama;j++){
       for(int k=0;k<tama;k++){
           if(j!=k){
               if(filcol2.get(j).equals(filcol2.get(k))){
               filcol2.set(j,"");
           }}}} 
      for(int j=0;j<tama;j++){
       if(!filcol2.get(j).equals(""))
           pr.add( filcol2.get(j));  
   }
   filcol2.clear();
   filcol2=pr; 
   tama=filcol2.size();
   for(int h=0;h<tama;h++){
       filtro1.addItem(filcol2.get(h));
   }
  
   //filtro1
   //filtro2
    tama2=filcol3.size();
      for(int j=0;j<tama2;j++){
       for(int k=0;k<tama2;k++){
           if(j!=k){
               if(filcol3.get(j).equals(filcol3.get(k))){
               filcol3.set(j,"");
           }}}}
      pr2.clear();
      for(int j=0;j<tama2;j++){
         if(!filcol3.get(j).equals(""))
           pr2.add( filcol3.get(j));  
   }
         filcol3.clear();
   filcol3=pr2;
   tama2=filcol3.size();
   for(int h=0;h<tama2;h++){
       filtro2.addItem(filcol3.get(h));
   }  
   
    //filtro2
    //filtro3
    tama3=filcol4.size();
    for(int j=0;j<tama3;j++){
       for(int k=0;k<tama3;k++){
           if(j!=k){
               if(filcol4.get(j).equals(filcol4.get(k))){
               filcol4.set(j,"");
           }}}}
     pr3.clear();
      for(int j=0;j<tama3;j++){
         if(!filcol4.get(j).equals(""))
           pr3.add( filcol4.get(j));  
   }
         filcol4.clear();
   filcol4=pr3;
   tama3=filcol4.size();
   for(int h=0;h<tama3;h++){
       filtro3.addItem(filcol4.get(h));
   }
    //filtro3
    //filtro4
    tama4=filcol5.size();
     for(int j=0;j<tama4;j++){
       for(int k=0;k<tama4;k++){
           if(j!=k){
               if(filcol5.get(j).equals(filcol5.get(k))){
               filcol5.set(j,"");
           }}}}
      pr4.clear();
      for(int j=0;j<tama4;j++){
         if(!filcol5.get(j).equals(""))
           pr4.add( filcol5.get(j));  
   }
         filcol5.clear();
   filcol5=pr4;
   tama4=filcol5.size();
   for(int h=0;h<tama4;h++){
       filtro4.addItem(filcol5.get(h));
   }
    //filtro4
    //filtro5
    tama5=filcol6.size();  
    for(int j=0;j<tama5;j++){
       for(int k=0;k<tama5;k++){
           if(j!=k){
               if(filcol6.get(j).equals(filcol6.get(k))){
               filcol6.set(j,"");
           }}}}
   pr5.clear();
      for(int j=0;j<tama5;j++){
         if(!filcol6.get(j).equals(""))
           pr5.add( filcol6.get(j));  
   }
         filcol6.clear();
   filcol6=pr5;
   tama5=filcol6.size();
   for(int h=0;h<tama5;h++){
       filtro5.addItem(filcol6.get(h));
   }
   //filtro5
 
 
   
  tamatabla=modelo.getRowCount();
       
        
        btgraficar.setVisible(false); 
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgrgrafica = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filtro1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btgraficar = new javax.swing.JButton();
        filtro2 = new javax.swing.JComboBox<>();
        filtro3 = new javax.swing.JComboBox<>();
        filtro4 = new javax.swing.JComboBox<>();
        filtro5 = new javax.swing.JComboBox<>();
        gratorta = new javax.swing.JRadioButton();
        grabarra = new javax.swing.JRadioButton();
        coorx = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        panelgrafica = new javax.swing.JPanel();
        btlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ESCUELAS DE FORMACION EN BUCARAMANGA");

        jLabel2.setText("seleccione filtro");

        filtro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "filtrar" }));
        filtro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtro1ActionPerformed(evt);
            }
        });

        tabla.setModel(modelo);
        jScrollPane1.setViewportView(tabla);

        btgraficar.setText("graficar");
        btgraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgraficarActionPerformed(evt);
            }
        });

        filtro2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "filtro" }));
        filtro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtro2ActionPerformed(evt);
            }
        });

        filtro3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "filtro" }));
        filtro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtro3ActionPerformed(evt);
            }
        });

        filtro4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "filtro" }));
        filtro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtro4ActionPerformed(evt);
            }
        });

        filtro5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "filtro" }));
        filtro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtro5ActionPerformed(evt);
            }
        });

        btgrgrafica.add(gratorta);
        gratorta.setText("torta");
        gratorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gratortaActionPerformed(evt);
            }
        });

        btgrgrafica.add(grabarra);
        grabarra.setText("barras");
        grabarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarraActionPerformed(evt);
            }
        });

        coorx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x" }));

        jLabel3.setText("tipo de grafica:");

        javax.swing.GroupLayout panelgraficaLayout = new javax.swing.GroupLayout(panelgrafica);
        panelgrafica.setLayout(panelgraficaLayout);
        panelgraficaLayout.setHorizontalGroup(
            panelgraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        panelgraficaLayout.setVerticalGroup(
            panelgraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        btlimpiar.setText("limpiar grafica");
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(filtro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coorx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btgraficar)
                                .addGap(50, 50, 50)
                                .addComponent(btlimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gratorta)
                                .addGap(18, 18, 18)
                                .addComponent(grabarra))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(panelgrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gratorta)
                    .addComponent(grabarra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coorx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btgraficar)
                                .addComponent(btlimpiar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelgrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtro1ActionPerformed
    int tamfi=0;
    
      for(int j=0;j<tamatabla;j++){
          
          if(tabl.get(j).getdisciplina().equals(filtro1.getSelectedItem().toString())){
          tamfi=tamfi+1;
          tigrafica=filtro1.getSelectedItem().toString();
          columna1.add(j);
          }}
      
     
     if(filtro1.getSelectedItem().toString().equals("filtrar")){
          modelo.setRowCount(tamatabla);
         for(int i=0;i<tamatabla;i++){
          modelo.setValueAt(tabl.get(i).getn(), i, 0);
         modelo.setValueAt(tabl.get(i).getdisciplina(), i, 1);
         modelo.setValueAt(tabl.get(i).getsexo(), i, 2);
         modelo.setValueAt(tabl.get(i).getbarrio(), i, 3);
         modelo.setValueAt(tabl.get(i).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(i).getdiscapacidad(), i, 5);
     }
          coorx.removeAllItems();
    
      coorx.addItem("x");
    
     }else{
     for(int i=0;i<tamfi;i++){
         modelo.setRowCount(tamfi);
         modelo.setValueAt(tabl.get(columna1.get(i)).getn(), i, 0);
         modelo.setValueAt(tabl.get(columna1.get(i)).getdisciplina(), i, 1);
         modelo.setValueAt(tabl.get(columna1.get(i)).getsexo(), i, 2);
          modelo.setValueAt(tabl.get(columna1.get(i)).getbarrio(), i, 3);
          modelo.setValueAt(tabl.get(columna1.get(i)).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(columna1.get(i)).getdiscapacidad(), i, 5);
         
     }
     columna1.clear();
     coorx.removeAllItems();
     
       for(int i=1;i<titulos.length;i++){
           if(i!=1){
 coorx.addItem(titulos[i]);
   
           }}
     }
     
    
    }//GEN-LAST:event_filtro1ActionPerformed

    private void filtro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtro2ActionPerformed
          int tamfi=0;
         
      for(int j=0;j<tamatabla;j++){
          
          if(tabl.get(j).getsexo().equals(filtro2.getSelectedItem().toString())){
          tamfi=tamfi+1;
          tigrafica=filtro2.getSelectedItem().toString();
          columna2.add(j);
          }}
      
     
     if(filtro2.getSelectedItem().toString().equals("filtro")){
         modelo.setRowCount(tamatabla);
         for(int i=0;i<tamatabla;i++){
          modelo.setValueAt(tabl.get(i).getn(), i, 0);
         modelo.setValueAt(tabl.get(i).getdisciplina(), i, 1);
         modelo.setValueAt(tabl.get(i).getsexo(), i, 2);
         modelo.setValueAt(tabl.get(i).getbarrio(), i, 3);
         modelo.setValueAt(tabl.get(i).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(i).getdiscapacidad(), i, 5);
     }
            coorx.removeAllItems();
    
      coorx.addItem("x");
     
     }else{
         modelo.setRowCount(tamfi);
         for(int i=0;i<tamfi;i++){
          modelo.setValueAt(tabl.get(columna2.get(i)).getn(), i, 0);
         modelo.setValueAt(tabl.get(columna2.get(i)).getdisciplina(), i, 1);
         modelo.setValueAt(tabl.get(columna2.get(i)).getsexo(), i, 2);
         modelo.setValueAt(tabl.get(columna2.get(i)).getbarrio(), i, 3);
         modelo.setValueAt(tabl.get(columna2.get(i)).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(columna2.get(i)).getdiscapacidad(), i, 5);
             
             }
     columna2.clear();
           coorx.removeAllItems();
    
       for(int i=1;i<titulos.length;i++){
           if(i!=2){
 coorx.addItem(titulos[i]);
    
    }}
     }
      
    }//GEN-LAST:event_filtro2ActionPerformed

    private void filtro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtro3ActionPerformed
       int tamfi=0;
      
      for(int j=0;j<tamatabla;j++){
          
          if(tabl.get(j).getbarrio().equals(filtro3.getSelectedItem().toString())){
          tamfi=tamfi+1;
          tigrafica=filtro3.getSelectedItem().toString();
          columna3.add(j);
          }}
      
     
     if(filtro3.getSelectedItem().toString().equals("filtro")){
         modelo.setRowCount(tamatabla);
         for(int i=0;i<tamatabla;i++){
          modelo.setValueAt(tabl.get(i).getn(), i, 0);
         modelo.setValueAt(tabl.get(i).getdisciplina(), i, 1);
         modelo.setValueAt(tabl.get(i).getsexo(), i, 2);
         modelo.setValueAt(tabl.get(i).getbarrio(), i, 3);
         modelo.setValueAt(tabl.get(i).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(i).getdiscapacidad(), i, 5);
     }
            coorx.removeAllItems();
  
     coorx.addItem("x");
    
     }else{
         modelo.setRowCount(tamfi);
         for(int i=0;i<tamfi;i++){
          modelo.setValueAt(tabl.get(columna3.get(i)).getn(), i, 0);
         modelo.setValueAt(tabl.get(columna3.get(i)).getdisciplina(), i, 1);
         modelo.setValueAt(tabl.get(columna3.get(i)).getsexo(), i, 2);
         modelo.setValueAt(tabl.get(columna3.get(i)).getbarrio(), i, 3);
         modelo.setValueAt(tabl.get(columna3.get(i)).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(columna3.get(i)).getdiscapacidad(), i, 5);
             
             }
     columna3.clear();
           coorx.removeAllItems();
    
       for(int i=1;i<titulos.length;i++){
           if(i!=3){
 coorx.addItem(titulos[i]);
  
    }}
     } 
   
    }//GEN-LAST:event_filtro3ActionPerformed

    private void filtro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtro4ActionPerformed
       int tamfi=0;
        
      for(int j=0;j<tamatabla;j++){
          
          if(tabl.get(j).getestrato().equals(filtro4.getSelectedItem().toString())){
          tamfi=tamfi+1;
          tigrafica=filtro4.getSelectedItem().toString();
          columna4.add(j);
          }}
      
     
     if(filtro4.getSelectedItem().toString().equals("filtro")){
         modelo.setRowCount(tamatabla);
         for(int i=0;i<tamatabla;i++){
          modelo.setValueAt(tabl.get(i).getn(), i, 0);
         modelo.setValueAt(tabl.get(i).getdisciplina(), i, 1);
         modelo.setValueAt(tabl.get(i).getsexo(), i, 2);
         modelo.setValueAt(tabl.get(i).getbarrio(), i, 3);
         modelo.setValueAt(tabl.get(i).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(i).getdiscapacidad(), i, 5);
     }
            coorx.removeAllItems();
     
      coorx.addItem("x");
    
     }else{
         modelo.setRowCount(tamfi);
         for(int i=0;i<tamfi;i++){
          modelo.setValueAt(tabl.get(columna4.get(i)).getn(), i, 0);
         modelo.setValueAt(tabl.get(columna4.get(i)).getdisciplina(), i, 1);
        modelo.setValueAt(tabl.get(columna4.get(i)).getsexo(), i, 2);
         modelo.setValueAt(tabl.get(columna4.get(i)).getbarrio(), i, 3);
         modelo.setValueAt(tabl.get(columna4.get(i)).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(columna4.get(i)).getdiscapacidad(), i, 5);
             
             }
     columna4.clear();
          coorx.removeAllItems();
    
       for(int i=1;i<titulos.length;i++){
           if(i!=4){
 coorx.addItem(titulos[i]);
  
    }}
     }
         
    }//GEN-LAST:event_filtro4ActionPerformed

    private void filtro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtro5ActionPerformed
         int tamfi=0;
    
      for(int j=0;j<tamatabla;j++){
          
          if(tabl.get(j).getdiscapacidad().equals(filtro5.getSelectedItem().toString())){
          tamfi=tamfi+1;
          tigrafica=filtro5.getSelectedItem().toString();
          columna5.add(j);
          }}
      
     
     if(filtro5.getSelectedItem().toString().equals("filtro")){
         modelo.setRowCount(tamatabla);
         for(int i=0;i<tamatabla;i++){
          modelo.setValueAt(tabl.get(i).getn(), i, 0);
         modelo.setValueAt(tabl.get(i).getdisciplina(), i, 1);
         modelo.setValueAt(tabl.get(i).getsexo(), i, 2);
         modelo.setValueAt(tabl.get(i).getbarrio(), i, 3);
         modelo.setValueAt(tabl.get(i).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(i).getdiscapacidad(), i, 5);
     }
          columna5.clear();
            coorx.removeAllItems();   
     
     coorx.addItem("x");
    
      
     }else{
         modelo.setRowCount(tamfi);
         for(int i=0;i<tamfi;i++){
         modelo.setValueAt(tabl.get(columna5.get(i)).getn(), i, 0);
        modelo.setValueAt(tabl.get(columna5.get(i)).getdisciplina(), i, 1);
        modelo.setValueAt(tabl.get(columna5.get(i)).getsexo(), i, 2);
         modelo.setValueAt(tabl.get(columna5.get(i)).getbarrio(), i, 3);
          modelo.setValueAt(tabl.get(columna5.get(i)).getestrato(), i, 4);
         modelo.setValueAt(tabl.get(columna5.get(i)).getdiscapacidad(), i, 5);
             
             }
     columna5.clear();
            coorx.removeAllItems();
    
       for(int i=1;i<titulos.length;i++){
           if(i!=5){
 coorx.addItem(titulos[i]);
   
    }}
     }
       
    }//GEN-LAST:event_filtro5ActionPerformed

    private void gratortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gratortaActionPerformed
      if(coorx.getSelectedItem().toString().equals("x")){
           JOptionPane.showMessageDialog(this, "selccionar un filtro y seguido el eje x");
            btgrgrafica.clearSelection();
      }else{
          btgraficar.setVisible(true);
      }
        
    }//GEN-LAST:event_gratortaActionPerformed

    private void grabarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarraActionPerformed
        if(coorx.getSelectedItem().toString().equals("x")){
           JOptionPane.showMessageDialog(this, "selccionar un filtro y seguido el eje x");
           btgrgrafica.clearSelection();
      }else{
          btgraficar.setVisible(true);
      }
       
    }//GEN-LAST:event_grabarraActionPerformed

    private void btgraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgraficarActionPerformed
        DefaultPieDataset datos=new DefaultPieDataset();
        DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
        datos.clear();
       File f=new File("datos grafica.csv");
       FileWriter fw;
        int []valor;
            String x = null;
            int posicionx = 0;
           
            
            for(int i=1;i<titulos.length;i++){
            if(coorx.getSelectedItem().toString().equals(titulos[i])){
                x=titulos[i];
                posicionx=i;
            }
            }
            LinkedList<String> y = new LinkedList<>();
            switch(posicionx){
                case 1: y=filcol2;
                break;
                case 2: y=filcol3;
                break;
                case 3: y=filcol4;
                break;
                case 4: y=filcol5;
                break;
                case 5: y=filcol6;
                break;
                default:
            }
            
                int tamaño=y.size();
                int tamañot=modelo.getRowCount();
                valor=new int[tamaño];
                for(int i=0;i<tamaño;i++){
                    int contador=0;
                    for(int j=0;j<tamañot;j++){
                        if(y.get(i).equals(modelo.getValueAt(j, posicionx))){
                            contador=contador+1;
                        }
                    }
                    valor[i]=contador;
                }
                if(gratorta.isSelected()){
               
              
                  try {
                      fw=new FileWriter(f);
                       fw.write("titulo,"+tigrafica+"\n");
                      fw.write(""+x+",valor\n");
                      for(int i=0;i<tamaño;i++){
                   datos.setValue(y.get(i), valor[i]);
                   
                      fw.write(""+y.get(i)+","+valor[i]+"\n");
                      }
                      fw.close();
                  } catch (IOException ex) {
                      Logger.getLogger(guia5.class.getName()).log(Level.SEVERE, null, ex);
                  }
              
                   
                      
                
                JFreeChart grafico_torta = ChartFactory.createPieChart(
                ""+x,
                datos,
                true,
                true,
                false
        );
                ChartPanel panel= new ChartPanel(grafico_torta);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(600,300));
        
        panelgrafica.setLayout(new BorderLayout());
        panelgrafica.add(panel,BorderLayout.NORTH);
        JFreeChart chart = ChartFactory.createPieChart(
                ""+x,
                datos,
                true,
                true,
                false
        );
            try {
                ChartUtilities.saveChartAsJPEG(new File("chart5.jpg"),chart,500,300);
            } catch (IOException ex) {
                Logger.getLogger(guia5.class.getName()).log(Level.SEVERE, null, ex);
            }
        pack();
        repaint();
       
            }else{
                  try {
                      fw=new FileWriter(f);
                      fw.write("titulo,"+tigrafica+"\n");
                      fw.write("cantidad,general,tipo\n");
                      for(int i=0;i<tamaño;i++){
                   datos2.setValue(valor[i],x,y.get(i) );
                   
                      fw.write(""+valor[i]+","+x+","+y.get(i)+"\n");
                      }
                      fw.close();
                  } catch (IOException ex) {
                      Logger.getLogger(guia5.class.getName()).log(Level.SEVERE, null, ex);
                  }
              
                   
                      
                
                JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                        ""+tigrafica,
                        ""+x,
                        "cantidad",
                        datos2,
                        PlotOrientation.VERTICAL,
                        true,
                        true,
                        false
                );
                    
                    
                    
                   
                ChartPanel panel= new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(600,300));
        
        panelgrafica.setLayout(new BorderLayout());
        panelgrafica.add(panel,BorderLayout.NORTH);
        JFreeChart chart = ChartFactory.createBarChart3D(
                ""+tigrafica,
                        ""+x,
                        "cantidad",
                        datos2,
                        PlotOrientation.VERTICAL,
                        true,
                        true,
                        false
        );
            try {
                ChartUtilities.saveChartAsJPEG(new File("chart5.jpg"),chart,500,300);
            } catch (IOException ex) {
                Logger.getLogger(guia5.class.getName()).log(Level.SEVERE, null, ex);
            }
        pack();
        repaint();
       
                    
                }
            
            
       
        btgrgrafica.clearSelection();
            
    }//GEN-LAST:event_btgraficarActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
       panelgrafica.removeAll();
       panelgrafica.repaint();
    }//GEN-LAST:event_btlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(guia5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new guia5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btgraficar;
    private javax.swing.ButtonGroup btgrgrafica;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JComboBox<String> coorx;
    private javax.swing.JComboBox<String> filtro1;
    private javax.swing.JComboBox<String> filtro2;
    private javax.swing.JComboBox<String> filtro3;
    private javax.swing.JComboBox<String> filtro4;
    private javax.swing.JComboBox<String> filtro5;
    private javax.swing.JRadioButton grabarra;
    private javax.swing.JRadioButton gratorta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelgrafica;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
