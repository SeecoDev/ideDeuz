package com.idedeuz;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.parser.PacienteLexer;
import com.parser.PacienteParser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import org.antlr.v4.codegen.model.SrcOp;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


public class pacientesController implements Initializable {

    public static ObservableList<Pacientes> listaPacientes = FXCollections.observableArrayList();
    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnImprimir;

    @FXML
    private TableColumn<Pacientes, Float> columnaAltura;

    @FXML
    private TableColumn<Pacientes, Integer> columnaEdad;

    @FXML
    private TableColumn<Pacientes, Float> columnaFA;

    @FXML
    private TableColumn<Pacientes, Float> columnaGET;

    @FXML
    private TableColumn<Pacientes, String> columnaGenero;

    @FXML
    private TableColumn<Pacientes, String> columnaNombre;

    @FXML
    private TableColumn<Pacientes, Float> columnaPeso;

    @FXML
    private TableColumn<Pacientes, Float> columnaTMB;

    @FXML
    private TableView<Pacientes> tblPacientes = new TableView<>();

    @FXML
    private MenuItem editClear;

    @FXML
    private MenuItem fileClose;

    @FXML
    private MenuItem fileNew;

    @FXML
    private MenuItem fileOpen;

    @FXML
    private MenuItem fileSave;

    @FXML
    private MenuItem helpAbout;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu menuEdit;

    @FXML
    private Menu menuFile;

    @FXML
    private Menu menuHelp;

    @FXML
    private MenuItem runEjecutar;

    @FXML
    private TextArea txtPrincipal;

    String nombreTabla;
    String generoTabla;
    int edadTabla;
    float pesoTabla;
    float alturaTabla;
    float faTabla;
    float getTabla;
    float tmbTabla;

    @FXML
    void clearEdit(ActionEvent event) {
        txtPrincipal.clear();
    }

    @FXML
    void closeFile(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void ejecutar(ActionEvent event) { //Metodo que corre la gramatica
        try{
            CharStream input = CharStreams.fromString(txtPrincipal.getText());
            PacienteLexer lexico = new PacienteLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            PacienteParser sintactico = new PacienteParser(tokens);
            sintactico.removeErrorListeners();
            sintactico.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("Error, no es posible ejecutar (linea " + line + ", caracter " + charPositionInLine + ").");
                }
            });
            ParseTree arbol = sintactico.calculadora();
            PacienteVisitor visitas = new PacienteVisitor();
            visitas.visit(arbol);
            for(int i=0; i<listaPacientes.size();i++){
                System.out.printf(String.valueOf(listaPacientes.get(i)));
            }
            tblPacientes.setItems(listaPacientes);

        }catch (Exception e){
            System.out.printf(e.getMessage());
        }
    }

    @FXML
    void eliminarPaciente(ActionEvent event) { //Metodo para eliminar paciente de la tabla
        int fila= tblPacientes.getSelectionModel().getFocusedIndex();
        listaPacientes.remove(fila);
    }

    @FXML
    void helpAbout(ActionEvent event) {
        Dialog<String> about = new Dialog<String>();
        Image minion = new Image("file:src/main/resources/com/images/cuteMinion.png");
        ImageView imageView = new ImageView(minion);
        about.setTitle("About");
        ButtonType type = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
        //Setting the content of the dialog
        about.setGraphic(imageView);
        about.setContentText("IDE Deuz: Renacido\nPor Adrian A. Flores Mena");
        //Adding buttons to the dialog pane
        about.getDialogPane().getButtonTypes().add(type);
        about.showAndWait();
    }

    @FXML
    void imprimirPDF(ActionEvent event) { //Metodo para imprimir la tabla a pdf
        //Generacion del reporte pdf
        Document documento = new Document();

        try{

            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento,new FileOutputStream(ruta + "/Desktop/ReportePaciente_"+nombreTabla+".pdf"));
            documento.setPageSize(PageSize.A4);
            documento.open();

            float col = 280f;
            float columWidth[]={col,col};

            PdfPTable encabezado = new PdfPTable(columWidth);
            encabezado.addCell("REPORTE DEUZ");
            encabezado.addCell("Reporte Paciente:"+"\n"+nombreTabla);

            PdfPTable tabla = new PdfPTable(8);
            tabla.addCell("Nombre");
            tabla.addCell("Genero");
            tabla.addCell("Edad");
            tabla.addCell("Peso(kg)");
            tabla.addCell("Altura(cm)");
            tabla.addCell("FA");
            tabla.addCell("TMB");
            tabla.addCell("GET");
            tabla.addCell(nombreTabla);
            tabla.addCell(generoTabla);
            tabla.addCell(String.valueOf(edadTabla));
            tabla.addCell(String.valueOf(pesoTabla));
            tabla.addCell(String.valueOf(alturaTabla));
            tabla.addCell(String.valueOf(faTabla));
            tabla.addCell(String.valueOf(tmbTabla));
            tabla.addCell(String.valueOf(getTabla));
            tabla.setWidthPercentage(100);
            tabla.setHorizontalAlignment(Element.ALIGN_MIDDLE);

            String parrafo="El paciente "+nombreTabla+", de sexo "+generoTabla+", tiene un peso de "+pesoTabla+"kg con una" +
                    " altura de "+alturaTabla+"cm. \n\tSu factor de actividad es de: "+faTabla+"\n\tResultando en la tasa metabolica basal: "+tmbTabla+
                    "\n\tCon el gasto energetico total: "+getTabla+"\n";
            Paragraph paragraph = new Paragraph(parrafo);


            documento.add(encabezado);
            documento.add(tabla);
            //Añadimos la tabla al Documento
            documento.add(paragraph);
            //Cerramos el documento
            documento.close();
            btnImprimir.setDisable(true);

        }catch (Exception e){
            System.out.println("Error: " +e);
        }

    }

    @FXML
    void newFile(ActionEvent event) {
        txtPrincipal.setEditable(true);
    }

    @FXML
    void openFile(ActionEvent event) {
        txtPrincipal.setEditable(true);
        txtPrincipal.setText("");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        File archivo = fileChooser.showOpenDialog(null);
        if(archivo != null){
            try {
                Scanner input = new Scanner(new File(archivo.getAbsolutePath()));
                while (input.hasNext()) {
                    txtPrincipal.appendText(input.nextLine() + '\n');
                }
                input.close();
            } catch (FileNotFoundException ex) {
                txtPrincipal.setText("No se encontro el archivo: " + archivo.getName());
            } catch (Exception ex) {
                txtPrincipal.setText(ex.getMessage());
            }
        }
    }

    @FXML
    void saveFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (.txt)", ".txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
            guardarTexto(txtPrincipal.getText(), file);
        }
    }

    void guardarTexto(String texto, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(texto);
            writer.close();
        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
    }

    public void insertarTabla(String nombre, String genero, int edad, float peso, float altura, float fa, float get, float tmb){
        listaPacientes.add(new Pacientes(
                nombre,
                genero,
                edad,
                peso,
                altura,
                fa,
                tmb,
                get));
    }

    //Se inicializa la tabla
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cargarTabla();
        btnImprimir.setDisable(true);
        tblPacientes.getSelectionModel().selectedItemProperty().addListener(
                (arg0, ant, sel) -> {
                    if (sel == null) {
                        tblPacientes.getSelectionModel().clearSelection();
                    } else {
                        btnImprimir.setDisable(false);
                        nombreTabla = sel.getNombre();
                        edadTabla =sel.getEdad();
                        pesoTabla = sel.getPeso();
                        if(sel.getGenero()=="1"){
                            generoTabla = "Femenino";
                        }else{
                            generoTabla = "Masculino";
                        }
                        alturaTabla = sel.getAltura();
                        faTabla=sel.getFa();
                        tmbTabla= sel.getTmb();
                        getTabla=sel.getGet();

                    }

                }
        );

    }

    private void cargarTabla() {
        tblPacientes.setEditable(true);
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
        columnaEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        columnaPeso.setCellValueFactory(new PropertyValueFactory<>("peso"));
        columnaAltura.setCellValueFactory(new PropertyValueFactory<>("altura"));
        columnaFA.setCellValueFactory(new PropertyValueFactory<>("fa"));
        columnaGET.setCellValueFactory(new PropertyValueFactory<>("get"));
        columnaTMB.setCellValueFactory(new PropertyValueFactory<>("tmb"));
        listaPacientes.clear();
    }
}
