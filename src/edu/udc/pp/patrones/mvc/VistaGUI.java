package edu.udc.pp.patrones.mvc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import edu.udc.pp.club.Socio;


@SuppressWarnings("serial")
public class VistaGUI extends JFrame implements ActionListener, Vista {
	
	private String[] opcionesCombo  = { "Todos",  "Adherentes", "Plenos", "Vitalicios"};
	private Controlador controlador;	
	private JTable tabla = new JTable();
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox combo = new JComboBox(opcionesCombo);	
	

	public VistaGUI(Controlador controlador) {
		this.controlador = controlador;
		this.controlador.setVista(this);
		this.combo.addActionListener(this);
		this.getContentPane().add(combo, BorderLayout.NORTH);
		this.getContentPane().add(tabla, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	
	
		@Override
		public void mostrarSocios(final List<Socio> socios) {
	
		
		
		
	TableModel tm =  new AbstractTableModel() {
		
		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			if (columnIndex == 0) {
				return socios.get(rowIndex).getNombre();
			} else {
				return socios.get(rowIndex).getTipo();
			}
		}
		
		@Override
		public int getRowCount() {
			return socios.size();
		}
		
		@Override
		public int getColumnCount() {
			return 2;
		}
	};
	
	this.tabla.setModel(tm);
	
	}
	
	
	
	@SuppressWarnings({ "rawtypes" })
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
        controlador.getListadoSocios(cb.getSelectedIndex() + 1);
	}
	
	
	
	
	
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	

	
	public void mostrarError (String s){
		System.out.println("Error: " + s);
	}



	
	
}
