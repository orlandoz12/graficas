
package graficacion;

import com.sun.istack.internal.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class Graficacion {

   
    public static void main(String[] args) throws IOException {
        // Crear un gráfico xy simple
/*XYSeries series = new XYSeries("XYGraph");
XYSeries series2 = new XYSeries("XYGraph");

series.add(1, 5);
series.add(2, 5);
series.add(3, 5);
series.add(4, 5);
series2.add(1, 7);
series2.add(2, 8);
series2.add(3, 9);
series2.add(4, 10);
// Agregar las series de datos
XYSeriesCollection dataset = new XYSeriesCollection();
dataset.addSeries(series);
dataset.addSeries(series2);
// Generar el gráfico
JFreeChart chart = ChartFactory.createXYLineChart(
"XY Chart", // Título
"Eje x", // etiqueta para el eje x
"Eje y", // etiqueta para el eje y
dataset, // Dataset
PlotOrientation.VERTICAL, // Orientación
true, // Mostrar leyenda
true, // Usar tooltips
false // Configurar para generar URLs
);
// Generar un archivo con el gráfico
try {
ChartUtilities.saveChartAsJPEG(new File("chart.jpg"),
chart, 500, 300);
} catch (IOException e) {
System.err.println("Error al crear el archivo.");
}}
/*String linea;
String[] valores = null;
File archivo=new File("escuelasdeformacion.csv");
try{
    Scanner in=new Scanner(archivo);
    while(in.hasNext()){
        int i=0;
        linea=in.nextLine();
        valores=linea.split(",");
        System.out.println(linea);
        System.out.println(valores[i]);
        i++;
        
        
    }
}catch (FileNotFoundException ex){
    
}
System.out.println(valores[0]);
System.out.println(valores[1]);
System.out.println(valores[9]);

*/
String linea;
String[] valores;
int i=0;
int hombre=0;
int mujeres=0;
int promedio=0;
File archivo=new File("escuelasdeformacion.csv");
 DefaultPieDataset dat=new DefaultPieDataset();

try{
    Scanner in=new Scanner(archivo);
    
    while(in.hasNext()){
        
        linea=in.nextLine();
       
        
       
        valores=linea.split(",");
       i++;
        if(valores[1].equals("M")){
            hombre=hombre+1;
            }
            else{  if(valores[1].equals("F")){
            mujeres=mujeres+1;
            }else{
                    
                    } }
       
     if(!valores[0].equals("Curso"))
           promedio=promedio+((( Integer.parseInt(valores[3])+ Integer.parseInt(valores[4])+ Integer.parseInt(valores[5]))/3)); 
        
       
        
System.out.println(promedio);
    
}
     }catch (FileNotFoundException ex){
  
}
 System.out.println(promedio/i);
 System.out.println(hombre);
  System.out.println(mujeres);
dat.setValue("hombres", hombre);
dat.setValue("mujeres", mujeres);
 JFreeChart chart = ChartFactory.createPieChart(
                "cantidad de genero",
                dat,
                true,
                true,
                false
        );
ChartUtilities.saveChartAsJPEG(new File("chart2.jpg"),chart,500,300);
}}

    
    

