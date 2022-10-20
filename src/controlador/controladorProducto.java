
package controlador;

import dao.daoProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloProducto;
import modelo.modeloCategoria;
import vista.Producto;

/**
 *
 * @author dave_
 */
public class controladorProducto implements ActionListener, MouseListener{
    
    //Instancia de clases
    daoProducto daoproduct = new daoProducto();
    ModeloProducto modproduct = new ModeloProducto();
    Producto producto = new Producto();

    public controladorProducto() {
        
        producto.setVisible(true);
        producto.btnGuardarProducto.addActionListener(this);
        producto.btnEditarProducto.addActionListener(this);
        producto.btnEliminarProducto.addActionListener(this);
        tablaProducto(producto.tlbProducto);
        this.producto.tlbProducto.addMouseListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == producto.btnGuardarProducto){
            guardarProducto();
        }
        
        if(e.getSource() == producto.btnEliminarProducto){
            eliminar();
        }
    }
    
    private void guardarProducto(){
        
        System.out.println("Se preciono el boton guardar");
        modproduct.setNombre_producto(producto.txtIDpro.getText());
        modproduct.setPrecio_producto(Double.parseDouble(producto.txtPrecioProducto.getText()));
        modproduct.setCantidad_producto(Integer.parseInt(producto.txtCantidadProducto.getText()));
        modproduct.setNumeroserie_producto(producto.txtNSerieProducto.getText());
        String respuesta = daoproduct.guardarProducto(modproduct);
        
        if(respuesta!=null){
            
            JOptionPane.showMessageDialog(null, respuesta);
            limpiar();
                
            }
            else{
                 JOptionPane.showMessageDialog(null, respuesta);
            }
        
    }
    
    private void eliminar(){
        
        modproduct.setId_producto(Integer.parseInt(producto.txtIDpro.getText()));
        
        if(daoproduct.eliminar(modproduct)){
            JOptionPane.showMessageDialog(null, "Se elimino con exito");
        }
        else{
            JOptionPane.showMessageDialog(null, "NO elimino con exito");
        }
        
    }
    
    private void limpiar(){
        
        producto.txtIDpro.setText("");
        producto.txtPrecioProducto.setText("");
        producto.txtCantidadProducto.setText("");
        producto.txtNSerieProducto.setText("");
        
    }
    
    public void tablaProducto(JTable tlbProduct){
        DefaultTableModel mimodel = new DefaultTableModel();
        tlbProduct.setModel(mimodel);
        
        mimodel.addColumn("ID");
        mimodel.addColumn("Nombre");
        mimodel.addColumn("N.Serie");
        mimodel.addColumn("Precio");
        mimodel.addColumn("Cantidad");
        mimodel.addColumn("Estado");
        mimodel.addColumn("Categoria");
        mimodel.addColumn("Precio Compra");
        
        Object [] columna = new Object[8];
        
        int numeroRegistro = daoproduct.listaProducto().size();
        System.out.println(numeroRegistro);
        
        for(int i=0; i<numeroRegistro;i++){
            
            columna [0] = daoproduct.listaProducto().get(i).getId_producto();
            columna [1] = daoproduct.listaProducto().get(i).getNombre_producto();
            columna [2] = daoproduct.listaProducto().get(i).getNumeroserie_producto();
            columna [3] = daoproduct.listaProducto().get(i).getPrecio_producto();
            columna [4] = daoproduct.listaProducto().get(i).getCantidad_producto();
            columna [5] = daoproduct.listaProducto().get(i).getEstado_producto();
            columna [6] = daoproduct.listaProducto().get(i).getCantidad_producto();
            columna [7] = daoproduct.listaProducto().get(i).getPreciocompra_producto();
            mimodel.addRow(columna);
            
        }
        
    }
    
    ArrayList listaCategoria;
    
    public void llenarCombo(){
        
       producto.txtCategoriaProducto.removeAllItems();
       listaCategoria = daoproduct.listaCategoria();
       Iterator i = listaCategoria.iterator();
       
       while(i.hasNext()){
          // modeloCategoria cat = (modeloCategoria) iterador.next();
          // producto.txtCategoriaProducto.addItem(cat);
       }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        int numeroFilas = producto.tlbProducto.getColumnCount();
        String [] parametro = new String [numeroFilas];
        
        for(int i=0; i<numeroFilas; i++){
            parametro [i] = String.valueOf(producto.tlbProducto.getValueAt(producto.tlbProducto.getSelectedRow(), i));
        }
        
        producto.txtIDpro.setText(parametro[0]);
        producto.txtNombreProducto1.setText(parametro[1]);
        producto.txtNSerieProducto.setText(parametro[2]);
        producto.txtPrecioProducto.setText(parametro[3]);
        producto.txtCantidadProducto.setText(parametro[4]);
        producto.txtPrecioCompra.setText(parametro[5]);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
