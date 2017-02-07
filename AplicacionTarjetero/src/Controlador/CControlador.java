package Controlador;

import Modelo.*;
import java.sql.*;
import java.util.*;
import Vista.VApplet;

/**
 *
 * @author marco
 */
public class CControlador {
    
    private MEmpresa modeloEmpresa;
    private MComercial modeloComercial;
    private MEtiquetas modeloEtiquetas;
    private Connection conexion;
    private VApplet vistaPrincipal;

    public CControlador(VApplet applet){
        this.vistaPrincipal = applet;
        conexionBD();
        modeloEmpresa = new MEmpresa(conexion);
        modeloComercial = new MComercial(conexion);
        modeloEtiquetas = new MEtiquetas(conexion);
    }
    
    
    /**
     * Crear conexión a BD.
     * La conexión es iniciada tras ejecutar la aplicación por primera vez.
     */
    public void conexionBD(){
        String bd = "jdbc:postgresql://A224-PCB:5432/bd_tarjetero";
        String user = "postgres";
        String pass = "postgres";
        
        try {
            conexion = DriverManager.getConnection(bd, user, pass);
            System.err.println("Conexión BD realizada.");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
  
    }

    
    /**
     * Método que abre el panel de Añadir Empresa.
     */
    public void accionAniadirEmpresa_Panel() {
        rellenaListaEtiquetas();
        vistaPrincipal.abreAniadirEmpresa();
    }

    
    /**
     * Método que abre el panel Modificar Empresa.
     */
    public void accionModificarEmpresa_Panel() {
        rellenaListaEtiquetas();
        vistaPrincipal.abreModificarEmpresa();
    }

    
    /**
     * Método que abre el panel Menú Principal.
     */
    public void accionCancelar_Panel() {
        vistaPrincipal.abreMenuPrincipal();
    }

    
    /**
     * Método que abre el panel Añadir Comercial.
     */
    public void accionAniadirComercial_Panel() {
        rellenaListaEmpresas();
        vistaPrincipal.abreAniadirComercial();
    }

    
    /**
     * Método que abre el panel Modificar Comercial.
     */
    public void accionModificarComercial_Panel() {
        rellenaListaEmpresas();
        vistaPrincipal.abreModificarComercial();
    }

    
    /**
     * Método que abre el panel Eliminar Empresa.
     */
    public void accionEliminarEmpresa_Panel() {
        vistaPrincipal.abreEliminarEmpresa();
    }

    
    /**
     * Método que abre el panel Eliminar Comercial.
     */
    public void accionEliminarComercial_Panel() {
        vistaPrincipal.abreEliminarComercial();
    }
    
    
    /**
     * Método que abre el panel Listar Empresas.
     */
    public void accionListaEmpresas(){
        vistaPrincipal.abreListarEmpresa();
    }
    
    
    /**
     * Método que abre el panel Listar Comerciales.
     */
    public void accionListaComercial(){
        vistaPrincipal.abreListarComercial();
    }
    
    
    /**
     * Método que abre el panel Consulta Empresa.
     */
    public void accionConsultaEmpresa() {
        vistaPrincipal.abreConsultaEmpresa();
    }
    
    /**
     * Método que abre el panel Consulta Comercial.
     */
    public void accionConsultaComercial() {
        vistaPrincipal.abreConsultaComercial();
    }
    
    //------------------------------------------------------------------------//

    /**
     * Método que llama al modelo Empresa para realizar la insercción de la misma.
     */
    public void accionRegistrarEmpresa() {
        String codEmpresa = vistaPrincipal.gettCodEmp().getText();
        String nombreEmpresa = vistaPrincipal.gettNombreEmp().getText();
        String cifEmpresa = vistaPrincipal.gettCIFEmp().getText();
        String dirEmpresa = vistaPrincipal.gettDirEmp().getText();
        String tlf1Empresa = vistaPrincipal.gettTlf1Emp().getText();
        String tlf2Empresa = vistaPrincipal.gettTlf2Emp().getText();
        String rutaImagen = vistaPrincipal.gettLogoEmp().getText();       
       
        if(rutaImagen.equalsIgnoreCase("")){
            vistaPrincipal.message("noImagen");
        }else
            if(codEmpresa.equalsIgnoreCase("")){
               vistaPrincipal.message("codEmpresaVacio");
            }else{
                //Si la lista 2 (etiquetas relacionadas con la empresa) tiene algún elemento ...
                if(vistaPrincipal.getLista2().getModel().getSize() != 0){

                    //Obtenemos todos los elementos de la lista de etiquetas.
                    String etiquetas = new String();
                    for(int i = 0; i < vistaPrincipal.getLista2().getModel().getSize(); i++){
                        etiquetas += vistaPrincipal.getLista2().getModel().getElementAt(i) + ",";
                    }

                    //Quitaremos la última coma de la etiqueta introducida.
                    etiquetas = etiquetas.substring(0, etiquetas.length()-1); 

                    //Le pasamos los parámetros al método que llamará al modelo de la tabla Empresa y devolverá true si todo fue bien.
                    boolean insertado = modeloEmpresa.registraEmpresa(codEmpresa, nombreEmpresa, cifEmpresa, dirEmpresa, tlf1Empresa, tlf2Empresa, etiquetas, rutaImagen);

                    if(insertado){
                        vistaPrincipal.message("empresaInsertada");
                        vistaPrincipal.limpiaRegistrosEmp();
                    }
                    else{
                        vistaPrincipal.message("errorRegistro");
                    }

                }else{
                    vistaPrincipal.message("seleccionaUnaEtiqueta");
                }
            }

    }
    
    
    /**
     * Método que llama al modelo Comercial para realizar la insercción del mismo.
     */
    public void accionRegistraComercial() {
        String codComercial = vistaPrincipal.gettCodCom().getText();
        String nombreComercial = vistaPrincipal.gettNombreCom().getText();
        String nifComercial = vistaPrincipal.gettNIFCom().getText();
        String dirComercial = vistaPrincipal.gettDirCom().getText();
        String tlfComercial = vistaPrincipal.gettTlfCom().getText();
        String correoComercial = vistaPrincipal.gettCorreoCom().getText();
        
        if(codComercial.equalsIgnoreCase("")){
            vistaPrincipal.message("codComercialVacio");
        }else{
            
            //Si la lista de empresas contiene algún elemento y se ha seleccionado alguno...
            if(vistaPrincipal.getListaEmpresas().getModel().getSize() != 0 && vistaPrincipal.getListaEmpresas().getSelectedIndex() != -1){
                
                //Capturamos el valor del item seleccionado y posteriormente le hacemos un split para quedarnos lo que hay
                //entre los dos corchetes.
                String empresa = vistaPrincipal.getListaEmpresas().getSelectedValue();
                String[] spliteao = empresa.split("\\[|\\]");
                
                
                //Le pasamos los parámetros al método que llamará al modelo de la tabla Empresa y devolverá true si todo fue bien.
                boolean insertado = modeloComercial.registraComercial(codComercial, nombreComercial, nifComercial, dirComercial, tlfComercial, correoComercial, spliteao[1]);

                if(insertado){
                    vistaPrincipal.message("comercialInsertado");
                    vistaPrincipal.limpiaRegistrosCom();
                }
                else{
                    vistaPrincipal.message("errorRegistro");
                }

            }else{
                vistaPrincipal.message("seleccionaUnaEmpresa");
            }
        
        }
        
    }


    /**
     * Acción que inserta la etiqueta en la tabla de etiquetas.
     */
    public void accionAniadeEtiqueta() {
        String capturaTexto = vistaPrincipal.gettAniadirEtiqueta().getText();
        
        if(!vistaPrincipal.gettAniadirEtiqueta().getText().trim().equalsIgnoreCase("")){
            //La función del modelo devuelve un booleano y es asignado a insertado.
            //Si insertado contiene true, añadimos la etiqueta a la lista, sino, saltará mensaje de error.
            //Posible error de etiqueta duplicada en la tabla etiquetas de la BD.
            boolean insertado = modeloEtiquetas.registraEtiqueta(capturaTexto);

            if(insertado){
                vistaPrincipal.getModeloLista1().addElement(capturaTexto);
                vistaPrincipal.getLista1().setModel(vistaPrincipal.getModeloLista1());
            }else
            {
                vistaPrincipal.message("ErrorInsertaEtiqueta");
            }
        }else
        {
            vistaPrincipal.message("etiquetaVacia");
        }
    }
    
    
    /**
     * Añade a la lista 2 las etiquetas seleccionadas de la lista 1 (Panel añadir empresa).
     */
    public void accionInsertaEtiqueta() {   
        //Obtenemos el valor seleccionado de la lista 1 y posteriormente, ese valor es añadido a la lista 2.
        if(vistaPrincipal.getLista1().getSelectedIndex() != -1){
            String seleccion = vistaPrincipal.getLista1().getSelectedValue();
            vistaPrincipal.getModeloLista2().addElement(seleccion);
            vistaPrincipal.getLista2().setModel(vistaPrincipal.getModeloLista2());
        }
    }
    
    
    /**
     * Acción que elimina la etiqueta de la lista (Panel añadir empresa).
     */
    public void accionEliminaEtiqueta() {
        int indice = vistaPrincipal.getLista2().getSelectedIndex();
        
        if(indice != -1){
        vistaPrincipal.getModeloLista2().removeElementAt(indice);
        }
    }
   
    
    /**
     * Rellena la lista de etiquetas del panel Añadir empresas.
     */
    public void rellenaListaEtiquetas(){
        Iterator it = modeloEtiquetas.selectEtiquetas().iterator();
        
        //Recorre la lista que devuelve el método selectEtiquetas() y añade cada elemento al JList1 del panel.
        vistaPrincipal.getModeloLista1().removeAllElements();
        while(it.hasNext()){
            String e = (String) it.next();
            vistaPrincipal.getModeloLista1().addElement(e);
        }
        
        vistaPrincipal.getLista1().setModel(vistaPrincipal.getModeloLista1());
        
        
        
        
    }
    
    
    /**
     * Muestra las empresas en los paneles que contienen una lista de empresas.
     */
    public void rellenaListaEmpresas() {
        //Rellena las listas de empresa que se encuentren en cada panel de la aplicación.
        Iterator it = modeloEmpresa.selectEmpresa().iterator();

        while(it.hasNext()){
            String e = (String) it.next();
            vistaPrincipal.getModeloLista4().addElement(e);
        }        
    }
    
    
    /**
     * Muestra los comerciales en la lista de eliminar del panel Eliminar comercial.
     */
    public void rellenaListaComerciales() {
        //Rellena la lista del panel eliminar comercial añadiendo todos los elementos de la tabla
        //que vaya capturando con addElement.
        Iterator it = modeloComercial.selectComercial().iterator();

        while(it.hasNext()){
            String e = (String) it.next();
            vistaPrincipal.getModeloLista4().addElement(e);
        }        
    }
    

    /**
     * Realiza una búsqueda del código introducido de la empresa y rellena campos enviándolo
     * al método de la vista.
     */
    public void accionBuscarEmpresa_Listar() {
        //Capturamos el código de la empresa para recoger los datos llamando al modelo.
        String capturaTexto = vistaPrincipal.gettCodEmp().getText();
        
        Object[] datos = modeloEmpresa.recogeDatos(capturaTexto);
        
        //Si el primer elemento del array (código empresa) es distinto de nulo (existe) ...
        if(datos[0] != null){
            //Cada vez que hagamos una acción sobre el botón borrará todos los elementos para que no sean
            //reinsertados en la lista.
            vistaPrincipal.getModeloLista2().removeAllElements();
        
            //Utilizamos el split sobre la columna etiquetas para añadir todos los elementos a la lista 2.
            //La columna etiquetas es un string de items separados por una coma.  Por lo que split hará que
            //quite esa coma y meta cada elemento en una posición del array.
            //La condición servirá para que sólo añada etiquetas en el caso de que las haya. De lo contrario
            //saltaría nullpointer.
            if(datos[6] != null){
                String[] etiquetas = datos[6].toString().split(",");
                for (String etiqueta : etiquetas) {
                    vistaPrincipal.getModeloLista2().addElement(etiqueta);
                }
                vistaPrincipal.getLista2().setModel(vistaPrincipal.getModeloLista2());
            }
            
            vistaPrincipal.ponerDatosEmpresa(datos, "listar");

        //De lo contrario mostrará un mensaje de error diciendo que no se encontró la empresa.
        }else{
            vistaPrincipal.message("empresaNoEncontrada"); 
        }

    }

    
    /**
     * Modifica los datos de la empresa.
     */
    public void accionModificarEmpresa() {
        String codEmpresa = vistaPrincipal.gettCodEmp().getText();
        String nombreEmpresa = vistaPrincipal.gettNombreEmp().getText();
        String cifEmpresa = vistaPrincipal.gettCIFEmp().getText();
        String dirEmpresa = vistaPrincipal.gettDirEmp().getText();
        String tlf1Empresa = vistaPrincipal.gettTlf1Emp().getText();
        String tlf2Empresa = vistaPrincipal.gettTlf2Emp().getText();
        String rutaImagen = vistaPrincipal.gettLogoEmp().getText();
        
        //Si el campo de búsqueda de la empresa está vacío ...
        if(codEmpresa.equalsIgnoreCase("")){
            vistaPrincipal.message("codEmpresaVacio");
        }else{
            //Si la lista 2 (etiquetas relacionadas con la empresa) tiene algún elemento ...
            if(vistaPrincipal.getLista2().getModel().getSize() != 0){

                //Obtenemos todos los elementos de la lista de etiquetas.
                String etiquetas = new String();
                for(int i = 0; i < vistaPrincipal.getLista2().getModel().getSize(); i++){
                    etiquetas += vistaPrincipal.getLista2().getModel().getElementAt(i) + ",";
                }
                
                //Quitaremos la última coma de la etiqueta introducida.
                etiquetas = etiquetas.substring(0, etiquetas.length()-1); 

                //Le pasamos los parámetros al método que llamará al modelo de la tabla Empresa y devolverá true si todo fue bien.
                boolean insertado = modeloEmpresa.actualizaEmpresa(codEmpresa, nombreEmpresa, cifEmpresa, dirEmpresa, tlf1Empresa, tlf2Empresa, etiquetas, rutaImagen);

                if(insertado){
                    vistaPrincipal.message("empresaModificada");
                    vistaPrincipal.limpiaRegistrosEmp();
                }
                else{
                    vistaPrincipal.message("errorRegistro");
                }

            }else{
                vistaPrincipal.message("seleccionaUnaEtiqueta");
            }
        }
        
    }

    
    /**
     * Modifica los datos del comercial.
     */
    public void accionModificarComercial() {
        String codComercial = vistaPrincipal.gettCodCom().getText();
        String nombreComercial = vistaPrincipal.gettNombreCom().getText();
        String nifComercial = vistaPrincipal.gettNIFCom().getText();
        String dirComercial = vistaPrincipal.gettDirCom().getText();
        String tlfComercial = vistaPrincipal.gettTlfCom().getText();
        String correoComercial = vistaPrincipal.gettCorreoCom().getText();
        String empresa = vistaPrincipal.getListaEmpresas().getSelectedValue();
            
        //Extraemos el código de la empresa seleccionada de la lista para asociarlo al comercial.
        String seleccionCod = empresa.substring(0, empresa.indexOf(" - "));
        String [] spliteao = empresa.split("\\[|\\]");

        //Si el campo de búsqueda de código está vacío salta mensaje de error y no realiza el proceso.
        if(codComercial.equalsIgnoreCase("")){
            vistaPrincipal.message("codComercialVacio");
        }else{
            //Si la lista empresas tiene algún elemento ...
            if(vistaPrincipal.getListaEmpresas().getModel().getSize() != 0){

                //Le pasamos los parámetros al método que llamará al modelo de la tabla Empresa y devolverá true si todo fue bien.
                boolean insertado = modeloComercial.actualizaComercial(codComercial, nombreComercial, nifComercial, dirComercial, tlfComercial, correoComercial, spliteao[1]);

                if(insertado){
                    vistaPrincipal.message("comercialModificado");
                    vistaPrincipal.limpiaRegistrosEmp();
                }
                else{
                    vistaPrincipal.message("errorRegistro");
                }

            }else{
                vistaPrincipal.message("seleccionaUnaEmpresa");
            }
        }
    }

    
    /**
     * Realiza la búsqueda de datos según el código de comercial insertado.
     */
    public void accionBuscarComercial_Listar() {
        //Capturamos el código de comercial del TextField.
        String capturaTexto = vistaPrincipal.gettCodCom().getText();
        
        //Hacemos la consulta sobre la tabla para que todo lo que nos devuelva se meta en un array
        //de objetos.
        Object[] datos = modeloComercial.recogeDatos(capturaTexto);
        
        //Si datos[0] que es el primer elemento del array (código comercial) es nulo quiere decir
        //que no se encontró dicho comercial en la tabla. De lo contrario, todo lo devuelto se 
        //modificará en los campos de la vista correspondiente.
        if(datos[0] != null){
        
            //Obtenemos el código de la empresa asociado al comercial con ese formateo. [CODEMPR].
            datos[6] = "["+datos[6]+"]";
        
            //Hacemos una selección de todas las empresas [COD - NOMBRE] y lo guardamos en un array.  Esa selección
            //se hará del modelo empresa.
            ArrayList datosEmpresas = new ArrayList();
            datosEmpresas = modeloEmpresa.selectEmpresa();

            String seleccionCod;
            
            //Cuando tengamos todas las empresas en el ArrayList lo recorreremos, elemento a elemento, y por cada
            //paso formateamos el código de la empresa que viene siendo [COD] - NOMBRE por [COD].
            //Cuando coincida la selección del formateo con el dato del array seleccionamos el índice de la lista
            //que se encuentre en ese momento.
            for(int i = 0; i < datosEmpresas.size(); i++){
                seleccionCod = datosEmpresas.get(i).toString().substring(0, datosEmpresas.get(i).toString().indexOf(" - "));
                if(datos[6].equals(seleccionCod)){
                    vistaPrincipal.getListaEmpresas().setSelectedIndex(i); 
                }
            }
            
            vistaPrincipal.ponerDatosComercial(datos, "listar");
            
        }else{
            vistaPrincipal.message("comercialNoEncontrado");
        }

    }
 

    /**
     * Método que llama al modelo comercial o empresa para realizar la búsqueda de empresa ó comercial.
     * @param tipo Este parámetro diferencia ambas listas, comercial y empresa, para llamar a un modelo u otro.
     */
    public void seleccionLista_Buscar(String tipo) {
        
        int indice_emp = vistaPrincipal.getListaBuscarEmp().getSelectedIndex();
        int indice_com = vistaPrincipal.getListaBuscarCom().getSelectedIndex();
        
        //Si el índice para ambas listas es distinto de -1 ...
        if(indice_emp != -1 || indice_com != -1){

            //Comprueba que tipo se le pasa, si es empresa o comercial.
            
            if(tipo.equals("empresa")){
                //Obtiene el valor seleccionado y posteriormente splitea para obtener el código de la empresa.
                String seleccionEmp = vistaPrincipal.getListaBuscarEmp().getSelectedValue();

                String seleccionCod = seleccionEmp.substring(0, seleccionEmp.indexOf(" - "));
                String[] spliteao = seleccionEmp.split("\\[|\\]");

                //Realiza la consulta con el dato "spliteao" (código empresa) y al recoger los mismos
                //modifica los campos con el método ponerDatosEmpresa_Listar.
                Object[] datos = modeloEmpresa.recogeDatos(spliteao[1]);
                vistaPrincipal.ponerDatosEmpresa_Listar(datos);
            }

            if(tipo.equals("comercial")){
                String seleccionCom = vistaPrincipal.getListaBuscarCom().getSelectedValue();

                String seleccionCod = seleccionCom.substring(0, seleccionCom.indexOf(" - "));
                String[] spliteao = seleccionCom.split("\\[|\\]");

                Object[] datos = modeloComercial.recogeDatos(spliteao[1]);
                vistaPrincipal.ponerDatosComercial_Listar(datos);
            }
        }

    }
    
    
    /**
     * Método que realiza el manejo de cadenas sobre el valor seleccionado de la lista para obtener el código.
     * @return Devuelve el código de la empresa / comercial seleccionado en la lista del panel Eliminar.
     */
    public String seleccionLista_El() {
        //En primer lugar obtenemos el índice sobre el que estamos situado en la lista eliminar.
        int indice = vistaPrincipal.getListaEliminar().getSelectedIndex();
        
        //Si el índice es -1 quiere decir que no se seleccionó índice alguno sobre la lista.
        //De lo contrario procedemos a manejar la cadena seleccionada de la lista para obtener el código
        //con el método split.
        //Sino hay nada que "splitear" devolverá null.
        if(indice != -1){
                String seleccion = vistaPrincipal.getListaEliminar().getSelectedValue();

                //Seleccionamos la cadena hasta el guión. Luego, nos quedará algo así como [1234]
                String seleccionCod = seleccion.substring(0, seleccion.indexOf(" - "));
                //Sobre esa cadena obtenemos el valor entre los corchetes con el método split.
                //Se pasará a un array de String el 1er elemento del array que será el valor que queremos
                //porque el 0 elemento es '['.
                String[] spliteao = seleccion.split("\\[|\\]");

                return spliteao[1]; 
        }else{
                return null;
        }
    }

    
    /**
     * Método que llama al modelo comercial o empresa para realizar la eliminación de empresa ó comercial.
     * @param tipo Este parámetro diferencia ambas listas, comercial y empresa para llamar a un modelo u otro.
     */
    public void accionEliminar(String tipo) {
        int indice = vistaPrincipal.getListaEliminar().getSelectedIndex();
        
        //Si el indice de la lista es distinto de -1 (hay 1 o más elementos) se podrá hacer el borrado de la
        //empresa o comercial seleccionado.
        if(indice != -1){
            if(tipo.equals("empresa")){
                String codigo = seleccionLista_El();

                //Devuelve true si la empresa fue eliminada correctamente, de lo contrario false.
                //Además, hace el borrado de la misma de la tabla de la BD.
                boolean eliminado = modeloEmpresa.eliminaEmpresa(codigo);

                //Si eliminado = true, remueve el elemento de la lista y lanza mensaje 'Eliminación con éxito'.
                //De lo contrario, lanzará un mensaje de error al intentar eliminar la empresa.
                if(eliminado){
                    vistaPrincipal.getModeloLista4().removeElementAt(indice);
                    vistaPrincipal.message("empresaEliminada");
                }else{
                    vistaPrincipal.message("errorEliminarEmpresa");
                }
            }

            //Mismo proceso anterior para la lista de comercial.
            if(tipo.equals("comercial")){
                String codigo = seleccionLista_El();

                boolean eliminado = modeloComercial.eliminaComercial(codigo);

                if(eliminado){
                    vistaPrincipal.getModeloLista4().removeElementAt(indice);
                    vistaPrincipal.message("comercialEliminado");
                }else{
                    vistaPrincipal.message("errorEliminarComercial");
                }
            }
        }
   
    }

    
    /**
     * Consulta de empresa en la tabla empresa y modifica los campos correspondientes para
     * mostrar los datos de la misma.
     */
    public void accionBuscarEmpresa_Consulta() {
        //Se captura el código de empresa y se guardará en una variable tipo String.
        String capturaTexto = vistaPrincipal.getTcodEmpresa_Consulta().getText();
        
        //Array de objetos que capturará la consulta propuesta en el modelo empresa.
        Object[] datos = modeloEmpresa.recogeDatos(capturaTexto);
        
        //Si datos[0] == null querrá decir que el método no devolvió nada y el código empresa
        //será nulo, por lo tanto, es una empresa inexistente en la BD.  Luego, si es nulo, 
        //pasará por el else de la condición para imprimir un mensaje de error.
        if(datos[0] != null){
            vistaPrincipal.ponerDatosEmpresa(datos, "consulta");
        }else{
            vistaPrincipal.message("empresaNoEncontrada");
        }
    }

    
    /**
     * Consulta de comercial en la tabla comercial y modifica los campos correspondientes para
     * mostrar los datos del mismo.
     */
    public void accionBuscarComercial_Consulta() {  
        //Capturamos el código de comercial y lo guardamos en una variable de tipo String.
        String capturaTexto = vistaPrincipal.getTcodComercial_Consulta().getText();

        //Este array de objetos capturará los datos de la tabla acorde con el código introducido
        //anteriormente.  
        Object[] datos = modeloComercial.recogeDatos(capturaTexto);
        
        //Si datos[0] que es el código de comercial devuelve nulo querrá decir que no lo encontró.
        //Si es != null llamará al método para insertar los datos en cada campo, de lo contrario, mostrará
        //un mensaje de error.
        if(datos[0] != null){
            vistaPrincipal.ponerDatosComercial(datos, "consulta");
        }else{
            vistaPrincipal.message("comercialNoEncontrado");
        }
    }
    

}
