package test;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import list.Cons;
import list.List;
import runtime.data.Term;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.DefaultXYZDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class ChartStructure {
	String chartType;
	Map<String, String> properties = new HashMap<String, String>();
	ChartComponent components[];
	Boolean isSpecialType = false;
	String[] columnNames;
	Object[][] tableData;
	
	
	class ChartComponent {
		private String componentName;
		private String componentType;
		private Map<String, String> properties = new HashMap<String, String>();
		private Object values;
		private String valueType;
		public String getComponentName() {
			return componentName;
		}
		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}
		public String getComponentType() {
			return componentType;
		}
		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}
		public String getProperties(String key) {
			return properties.get(key);
		}
		public void addProperties(String key, String val) {
			this.properties.put(key, val);
		}
		
		public void addProperties(Map<String , String > map) {
			this.properties=map;
		}
		
		public Object getValues() {
			return values;
		}
		public void setValues(Object values) {
			this.values = values;
		}
		public String getValueType() {
			return valueType;
		}
		public void setValueType(String valueType) {
			this.valueType = valueType;
		}
		
	}

	public String toString() {
		StringBuffer str = new StringBuffer();
		if (chartType != null)
			str.append("Chart -> " + chartType  + " [");
		if (components != null) {
			for (int i = 0 ; i< components.length ; i++) {
				if ((components[i] != null) && (components[i].getComponentName() != null) && (components[i].getComponentType() != null)) { 
					str.append("\n[" + components[i].getComponentName() + "::" + components[i].getComponentType() + "]");
					str.append(components[i].getValues().toString() + "]");
				}
			}
		}
		if (chartType != null)
			str.append(" ]");
		return str.toString();
	}
	
	private Map <String, String> parseProperty(Object param) {
		Map<String, String> props = new HashMap<String, String>();
		if (param instanceof list.Cons) {
			String[] pvals= getStringArray((Cons)param);
			for (int i =0; i< pvals.length ; i++) {
				String[] v= pvals[i].split("=");
				if (v.length >= 2) {
					props.put(new String(v[0]),new String(v[1]));
					//System.out.println(" Properties are " + new String(v[0])+ " and " + new String(v[1]));
				}	
			}
				
		}
		return props;
	}
	


	private  String[] getStringArray(list.Cons obj) {
		 List cons = (List) obj;
		 String [] a = new String[cons.length()]; 
		 int cnt = 0;
		 while (!cons.isNil()) {
			 Object o = cons.getHead();
			 if (o instanceof String) {
				
				 String strVal =  o.toString();
				 a[cnt++] = new String(strVal);
			 }
			 cons = cons.getTail();		
			 
		}
		return a; 
		
	}

	private  Object[][] getTableData(list.Cons obj) {
		 List cons = (List) obj;
		 int x =0, y =0;
		 if (!cons.isNil()) {
			 x = cons.length();
			 Object head = cons.getHead();
			 if (head instanceof list.Cons) {
				 List hi = (List) head;
				 y = hi.length();
			 }
		 }
		 
		 Object[][] data = new Object[x][y];
		 
		 int xcnt = 0, ycnt =0;
		 
		 while (!cons.isNil()) {
			 ycnt = 0;
			 Object o = cons.getHead();
			 if (o instanceof list.Cons) {
				 List i = (List) o;
				 while (!i.isNil()) {
					 Object io = i.getHead();
					 data[xcnt][ycnt++] = io;
					 i = i.getTail();
				 }
				 xcnt++;
			 }			 			 
			 cons = cons.getTail();		
		}
		return data; 
		
	}

	private  double[][] getBubbleSegmentData(list.Cons obj) {
		 List cons = (List) obj;
		 int x =0, y =0;
		 if (!cons.isNil()) {
			 x = cons.length();
			 Object head = cons.getHead();
			 if (head instanceof list.Cons) {
				 List hi = (List) head;
				 y = hi.length();
			 }
		 }
		 
		 double[][] data = new double[x][y];
		 
		 int xcnt = 0, ycnt =0;
		 
		 while (!cons.isNil()) {
			 ycnt = 0;
			 Object o = cons.getHead();
			 if (o instanceof list.Cons) {
				 List i = (List) o;
				 while (!i.isNil()) {
					 Object io = i.getHead();
					 if (io instanceof Integer)
							 data[xcnt][ycnt++] = new Double((Integer) io).doubleValue();
						 
					 else data[xcnt][ycnt++] = 0;
					 i = i.getTail();
				 }
				 xcnt++;
			 }			 			 
			 cons = cons.getTail();		
		}
		return data; 
		
	}

	private  int[] getIntegerArray(list.Cons obj) {
		 List cons = (List) obj;
		 int [] a = new int[cons.length()]; 
		 int cnt = 0;
		 while (!cons.isNil()) {
		   Number n = (Number)cons.getHead();
		   int intVal = n.intValue();
			 a[cnt++] = intVal;
			 cons = cons.getTail();				 
		}
		return a; 
		
	}

	private void parseTerm(Term term) {
		
		Object [] values = term.getValues();
		chartType = term.getName().getString();
		
		if (values[0] != null ) {
			
			if (chartType.equals("Lines") || chartType.equals("Pie") || chartType.equals("Areas") || chartType.equals("Bars") || chartType.equals("StackedBars")) {
				properties = parseProperty(term.getValues()[0]);
				if ((values[1] != null) && (values[1] instanceof Cons)) {
					Cons parameters = (Cons) values[1];
					components = new ChartComponent[parameters.length()];
					for (int i = 0; i< parameters.length() ; i++) {
						Object o = parameters.nth(i);
						if (o instanceof Term) {
							Term componentTerm = (Term) o;
							ChartComponent chartComp = new ChartComponent();
								
							chartComp.setComponentType(componentTerm.getName().getString());
							if (componentTerm.getValues()[0] != null)
								chartComp.addProperties(parseProperty(componentTerm.getValues()[0].toString()));
							if (componentTerm.getValues()[1] != null)
								chartComp.setComponentName(componentTerm.getValues()[1].toString());
							Object vo = componentTerm.getValues()[2];
							if (vo != null) {
								//System.out.println(" vo " + vo.getClass() + " value " + vo.toString());
								if (vo instanceof Cons) {
									chartComp.setValues(getIntegerArray((Cons)vo));
									chartComp.setValueType("Array.Integer");
								} else if (vo instanceof Integer) {
									chartComp.setValues(vo);
									chartComp.setValueType("Integer");
								} else if (vo instanceof String) {
									chartComp.setValues(vo);
									chartComp.setValueType("String");
								} 
							}
							components[i] = chartComp;
						}
					}	
				}
			    applyInterval();
				
			} else {
				isSpecialType = true;
				if (chartType.equals("Table")) {
					
					properties = parseProperty(term.getValues()[0]);
					
					if (term.getValues()[1] instanceof Cons) {
						columnNames = getStringArray((Cons)term.getValues()[1]);
					}
					
					if (term.getValues()[2] instanceof Cons) {
						tableData = getTableData((Cons)term.getValues()[2]);
					}
				} else if (chartType.equals("Bubbles")) {
					properties = parseProperty(term.getValues()[0]);
					
					if (term.getValues()[1] instanceof Cons) {
						List sd = (List) term.getValues()[1];
						components = new ChartComponent[sd.length()];
						int i = 0;
						while (!sd.isNil()) {
							Object obj = sd.getHead();
							if (obj instanceof Term) {
								Term componentTerm = (Term) obj;
								ChartComponent chartComp = new ChartComponent();
									
								chartComp.setComponentType(componentTerm.getName().getString());
								if (componentTerm.getValues()[0] != null)
									chartComp.setComponentName(componentTerm.getValues()[0].toString());
								Object vo = componentTerm.getValues()[1];
								if ((vo != null) && (vo instanceof Cons)) {
									chartComp.setValues(getBubbleSegmentData((Cons)vo));
								
								//	Cons t = (Cons)vo;
								//	if (!t.isNil() && (t.getHead() instanceof Cons)) {
								//		chartComp.setValues(getBubbleSegmentData((Cons)t.getHead()));		
								//		chartComp.setValueType("Table.Double"); 
								//}
								}
								components[i++] = chartComp;
							}
							sd = sd.getTail();
						}
					}
				}
			}
		}
		
	}
	
	private int addValues(int[] vals, int count) {
		int val = 0;
		for (int i = 0; i < count; i++) {
			val = val + vals[i];
		}
		return val;
	}
	
	private int maxValues(int[] vals, int count) {
		int val = 0;
		for (int i = 0; i < count; i++) {
			if (vals[i] > val) val = vals[i];  
		}
		return val;
	}
	
	private int minValues(int[] vals, int count) {
		int val = Integer.MAX_VALUE;
		for (int i = 0; i < count; i++) {
			if (vals[i] < val) val = vals[i];  
		}
		return val;
	}
	
	private int applyOperator(int[] vals, int count, String operator ) {
		int retVal = 0;
		if (operator.equals("Avg")) {
			retVal = addValues(vals, count);
			retVal = (int) Math.ceil(retVal/count);
		} else if (operator.equals("Max")) {
			retVal = maxValues(vals, count);	
		} else if (operator.equals("Min")) {
			retVal= minValues(vals, count);	
		} else if (operator.equals("Sum")) {
			retVal = addValues(vals, count);	
		} else {
				retVal = addValues(vals, count);
				retVal = (int) Math.ceil(retVal/count);
		}
		
		
		return retVal;
	}
	
	private void applyInterval() {
		
		String operator;
		if (properties.containsKey("Operator")) {
			operator = (String)properties.get("Operator");
		} else {
			operator = new String("Avg");
		}
		
		if (properties.containsKey("Interval")) {
			int interval = Integer.parseInt(properties.get("Interval"));
			if (interval > 0) {
				for (int c = 0 ; c < components.length; c++) {
					ChartComponent cc = components[c];
						if ((cc.getValueType() != null ) && (cc.getValueType().equals("Array.Integer"))) {
							int vals[] = (int [])cc.getValues();
							int len = vals.length;
							int nlen = (int) Math.ceil(len/interval);
							int[] newVals = new int[nlen];
							for (int i = 0; i< nlen; i++) {
								int count = 0;
								int[] tval = new int[interval];
								for (int j = 0 ; j< interval; j ++) {
									int index = interval*i + j;
									if (index < len ) {
										tval[j] = vals[index];
										count++;
									}
									newVals[i] = applyOperator(tval, count, operator);
								}
							}
							if (newVals.length > 0)
								components[c].setValues(newVals);
						}
				
			}	
			}
		}
	}
	private JFreeChart createLines(ChartStructure cs) {
		
		String title= new String("No Heading Provided");
		String xAxis = new String("x-axis");
		String yAxis = new String("y-axis");
		
		
		if (cs.properties.get("Title") != null)
			title = new String(cs.properties.get("Title"));
		if (cs.properties.get("X-axis") != null)
			xAxis = new String(cs.properties.get("X-axis"));
		if (cs.properties.get("Y-axis") != null)
			yAxis = new String(cs.properties.get("Y-axis"));
		
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		
		
		for (int c =0; c< cs.components.length; c++) {
			ChartComponent cc = cs.components[c];
			
			String lineName = new String("Line Name not provided");
			if (cc.getComponentName() != null )
				lineName = cc.getComponentName();
			
			XYSeries series = new XYSeries(lineName);
			  
			if (cc.getComponentType().equals("Line")) {
				int[] vals = (int[])cc.getValues();
				for (int i =0 ; i < vals.length; i ++) 
					series.add(i, vals[i]);
			}
				
			dataset.addSeries(series);
		}
	    JFreeChart chart = ChartFactory.createXYLineChart(
	        		   title, // Title
	        		   xAxis, // x-axis Label
	        		   yAxis, // y-axis Label
	        		   dataset, // Dataset
	        		   PlotOrientation.VERTICAL, // Plot Orientation
	        		   true, // Show Legend
	        		   false, // Use tooltips
	        		   false // Configure chart to generate URLs?
	        		);

	    return chart;

        
	}


	private JFreeChart createBars(ChartStructure cs) {
		
		String title= new String("No Heading Provided");
		String xAxis = new String("x-axis");
		String yAxis = new String("y-axis");
		
		
		if (cs.properties.get("Title") != null)
			title = new String(cs.properties.get("Title"));
		if (cs.properties.get("X-axis") != null)
			xAxis = new String(cs.properties.get("X-axis"));
		if (cs.properties.get("Y-axis") != null)
			yAxis = new String(cs.properties.get("Y-axis"));
		
		
		int xVal = 0;
		int yVal = 0;
		
		
		if (cs.components != null)
			yVal = cs.components.length;
		if ((cs.components[0] != null) && (cs.components[0].getValues() != null)) {
			xVal = ((int []) cs.components[0].getValues()).length;
		}
		
		double [][] data = new double [yVal][xVal];
		String [] xLabels = new String[xVal];
		String [] yLabels = new String[yVal];
		
		for (int i= 0; i < xVal ; i++ ) {
			xLabels[i] = new String(""+i); 
		}
		if ((xVal > 0) && (yVal > 0)) {

			
			for (int c =0; c< cs.components.length; c++) {
				ChartComponent cc = cs.components[c];
			
				//xLabels[c] = new String(""+c);
				if (cc.getComponentName() != null )
					yLabels[c] = cc.getComponentName();
				else yLabels[c] = new String("Bar" + c);
				
				
				if (cc.getComponentType().equals("Bar")) {
					int[] vals = (int[])cc.getValues();
					double[] dvals = new double[vals.length];
					
					for (int i =0 ; i < vals.length; i ++) 
						dvals[i] =  vals[i];
					
					data[c] = dvals;
				}
			}

			
		}
		
		//System.out.println("xLable" + xLabels + "\n yLable" + yLabels + "\n data " + data);
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset( yLabels, xLabels , data);
	    JFreeChart chart = ChartFactory.createBarChart(
	        		   title, // Title
	        		   xAxis, // x-axis Label
	        		   yAxis, // y-axis Label
	        		   dataset, // Dataset
	        		   PlotOrientation.VERTICAL, // Plot Orientation
	        		   true, // Show Legend
	        		   true, // Use tooltips
	        		   false // Configure chart to generate URLs?
	        		);

	    return chart;

        
	}


	
	private JFreeChart createArea(ChartStructure cs) {
		
		String title= new String("No Heading Provided");
		String xAxis = new String("x-axis");
		String yAxis = new String("y-axis");
		
		
		if (cs.properties.get("Title") != null)
			title = new String(cs.properties.get("Title"));
		if (cs.properties.get("X-axis") != null)
			xAxis = new String(cs.properties.get("X-axis"));
		if (cs.properties.get("Y-axis") != null)
			yAxis = new String(cs.properties.get("Y-axis"));
		
		
		int xVal = 0;
		int yVal = 0;
		
		
		if (cs.components != null)
			yVal = cs.components.length;
		if ((cs.components[0] != null) && (cs.components[0].getValues() != null)) {
			xVal = ((int []) cs.components[0].getValues()).length;
		}
		
		double [][] data = new double [yVal][xVal];
		String [] xLabels = new String[xVal];
		String [] yLabels = new String[yVal];
		
		for (int i= 0; i < xVal ; i++ ) {
			xLabels[i] = new String(""+i); 
		}
		if ((xVal > 0) && (yVal > 0)) {

			
			for (int c =0; c< cs.components.length; c++) {
				ChartComponent cc = cs.components[c];
			
				//xLabels[c] = new String(""+c);
				if (cc.getComponentName() != null )
					yLabels[c] = cc.getComponentName();
				else yLabels[c] = new String("Area " + c);
				
				
				if (cc.getComponentType().equals("Area")) {
					int[] vals = (int[])cc.getValues();
					double[] dvals = new double[vals.length];
					
					for (int i =0 ; i < vals.length; i ++) 
						dvals[i] =  vals[i];
					
					data[c] = dvals;
				}
			}

			
		}
		
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset( yLabels, xLabels , data);
	    JFreeChart chart = ChartFactory.createStackedAreaChart(
	        		   title, // Title
	        		   xAxis, // x-axis Label
	        		   yAxis, // y-axis Label
	        		   dataset, // Dataset
	        		   PlotOrientation.VERTICAL, // Plot Orientation
	        		   true, // Show Legend
	        		   true, // Use tooltips
	        		   false // Configure chart to generate URLs?
	        		);

	    return chart;

        
	}
	
	

	private JFreeChart createStackedBar(ChartStructure cs) {
		
		String title= new String("No Heading Provided");
		String xAxis = new String("x-axis");
		String yAxis = new String("y-axis");
		
		
		if (cs.properties.get("Title") != null)
			title = new String(cs.properties.get("Title"));
		if (cs.properties.get("X-axis") != null)
			xAxis = new String(cs.properties.get("X-axis"));
		if (cs.properties.get("Y-axis") != null)
			yAxis = new String(cs.properties.get("Y-axis"));
		
		
		int xVal = 0;
		int yVal = 0;
		
		
		if (cs.components != null)
			yVal = cs.components.length;
		if ((cs.components[0] != null) && (cs.components[0].getValues() != null)) {
			xVal = ((int []) cs.components[0].getValues()).length;
		}
		
		double [][] data = new double [yVal][xVal];
		String [] xLabels = new String[xVal];
		String [] yLabels = new String[yVal];
		
		for (int i= 0; i < xVal ; i++ ) {
			xLabels[i] = new String(""+i); 
		}
		if ((xVal > 0) && (yVal > 0)) {

			
			for (int c =0; c< cs.components.length; c++) {
				ChartComponent cc = cs.components[c];
			
				//xLabels[c] = new String(""+c);
				if (cc.getComponentName() != null )
					yLabels[c] = cc.getComponentName();
				else yLabels[c] = new String("Bar " + c);
				
				
				if (cc.getComponentType().equals("Bar")) {
					int[] vals = (int[])cc.getValues();
					double[] dvals = new double[vals.length];
					
					for (int i =0 ; i < vals.length; i ++) 
						dvals[i] =  vals[i];
					
					data[c] = dvals;
				}
			}

			
		}
		
		//System.out.println("xLable" + xLabels + "\n yLable" + yLabels + "\n data " + data);
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset( yLabels, xLabels , data);
	    JFreeChart chart = ChartFactory.createStackedBarChart(
	        		   title, // Title
	        		   xAxis, // x-axis Label
	        		   yAxis, // y-axis Label
	        		   dataset, // Dataset
	        		   PlotOrientation.VERTICAL, // Plot Orientation
	        		   true, // Show Legend
	        		   true, // Use tooltips
	        		   false // Configure chart to generate URLs?
	        		);

	    return chart;

        
	}
	

	
	private  JFreeChart createPie(ChartStructure cs) {
		
		String title= new String("No Heading Provided");
		
		
		if (cs.properties.get("Title") != null)
			title = new String(cs.properties.get("Title"));
		
		DefaultPieDataset dataset = new DefaultPieDataset();
		
		
		for (int c = 0 ; c < cs.components.length; c++) {
			
			ChartComponent cc = cs.components[c];
			
			String sliceName = new String("Slice Name not provided");
			if (cc.getComponentName() != null )
				sliceName = cc.getComponentName();
			int sliceValue =0;
			
			if ((cc.values != null) && (cc.values instanceof Integer))
					sliceValue = ((Integer) cc.values).intValue();
			dataset.setValue(sliceName, sliceValue);
		}
		
		JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);
		return chart;
	}

	

	private  JPanel createTable(ChartStructure cs) {
		
		String title= new String("No Heading Provided");
		
		
		if (cs.properties.get("Title") != null)
			title = new String(cs.properties.get("Title"));
		
		JPanel tpanel = new JPanel ();
        tpanel.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                                                            title,
                                                            TitledBorder.CENTER,
                                                            TitledBorder.TOP));
        
		 //headers for the table
        String[] columns = cs.columnNames;
        
		
		Object[][] data =  cs.tableData;
		        //create table with data
        JTable table = new JTable(data, columns);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tpanel.setLayout(new GridLayout(1,1));
        tpanel.add(new JScrollPane(table));
         
        
		return tpanel;
	}

	
	private  JFreeChart createBubbleChart(ChartStructure cs) {
		
		String title= new String("No Heading Provided");
		String xAxis = new String("x-axis");
		String yAxis = new String("y-axis");
		int dRange = 0;
		
		if (cs.properties.get("Title") != null)
			title = new String(cs.properties.get("Title"));
		if (cs.properties.get("X-axis") != null)
			xAxis = new String(cs.properties.get("X-axis"));
		if (cs.properties.get("Y-axis") != null)
			yAxis = new String(cs.properties.get("Y-axis"));
		if (cs.properties.get("Range") != null)
			dRange = Integer.parseInt(cs.properties.get("Range"));
		
		
		
		DefaultXYZDataset defaultxyzdataset = new DefaultXYZDataset();
		
		for (int c =0; c< cs.components.length; c++) {
			ChartComponent cc = cs.components[c];
			defaultxyzdataset.addSeries(cc.getComponentName(), (double [][]) cc.getValues());
		}

		JFreeChart chart = ChartFactory.createBubbleChart(
		         title,                    
		         yAxis,                    
		         xAxis,                    
		         defaultxyzdataset,                    
		         PlotOrientation.HORIZONTAL,                    
		         true, true, false);
		
		if (dRange > 0) {
			XYPlot xyPlot = (XYPlot) chart.getPlot();
			NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
	        domain.setRange(0, dRange);
	        NumberAxis range = (NumberAxis) xyPlot.getRangeAxis();
	        range.setRange(0, dRange);
		}
		return chart;
	}


	
	Component createChart(Term term) {
		JFreeChart chart = null;
		ChartStructure cs = new ChartStructure();
		ChartPanel cp = null;
		cs.parseTerm(term);
		if (cs.chartType.equals("Lines")) {
			chart = createLines(cs);
			cp= new ChartPanel(chart);
		} else if (cs.chartType.equals("Pie")) {
			chart = createPie(cs);
			cp= new ChartPanel(chart);
		} else if (cs.chartType.equals("Areas")) {
			chart = createArea(cs);
			cp= new ChartPanel(chart);
		} else if (cs.chartType.equals("StackedBars")) {
			chart = createStackedBar(cs);
			cp= new ChartPanel(chart);
		} else if (cs.chartType.equals("Bars")) {
			chart = createBars(cs);
			cp = new ChartPanel(chart);
		} 	else if (cs.chartType.equals("Bubbles")) {
			chart = createBubbleChart(cs);
			cp = new ChartPanel(chart);
		}  else if (cs.chartType.equals("Table")) {
			return  createTable(cs);
		} 	
		
		if (cp!= null)
			cp.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),"",TitledBorder.CENTER,TitledBorder.TOP));
		return cp;
	}
	
	
	private  JPanel createGrid(ChartStructure cs) {
		
		String title= new String("No Heading Provided");
		
		
		if (cs.properties.get("Title") != null)
			title = new String(cs.properties.get("Title"));
		
        JPanel totalGUI = new JPanel();
        
        // We create a JPanel with the GridLayout.
        JPanel mainPanel = new JPanel(new GridLayout(3, 4, 10, 30));
        
        JPanel red = createSquareJPanel(Color.red, 50);
        JPanel blue = createSquareJPanel(Color.blue, 50);
        JPanel green = createSquareJPanel(Color.green, 50);
        JPanel orange = createSquareJPanel(Color.orange, 50);
        JPanel yellow = createSquareJPanel(Color.yellow, 50);
        JPanel pink = createSquareJPanel(Color.pink, 50);
        JPanel cyan = createSquareJPanel(Color.cyan, 50);
        JPanel gray = createSquareJPanel(Color.gray, 50);
        JPanel black = createSquareJPanel(Color.black, 50);
        JPanel magenta = createSquareJPanel(Color.magenta, 50);
      
        mainPanel.add(red);
        mainPanel.add(blue);
        mainPanel.add(green);
        mainPanel.add(orange);
        mainPanel.add(yellow);
        mainPanel.add(pink);
        mainPanel.add(cyan);
        mainPanel.add(gray);
        mainPanel.add(black);
        mainPanel.add(magenta);

        totalGUI.add(mainPanel);
        totalGUI.setOpaque(true);
        return totalGUI;
	}

	private JPanel createSquareJPanel(Color color, int size)
    {
        JPanel tempPanel = new JPanel();
        tempPanel.setBackground(color);
        tempPanel.setMinimumSize(new Dimension(size, size -40));
        tempPanel.setMaximumSize(new Dimension(size, size));
        tempPanel.setPreferredSize(new Dimension(size, size - 20));
        return tempPanel;
    }
}
