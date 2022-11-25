package com.idedeuz;

import com.parser.*;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;

import java.io.*;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ideDeuzController implements Initializable {
    public static String resultado="";
    private ExecutorService taskExecutor;

    @FXML
    private Button btnClear;

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
    private MenuItem runTraducirC;

    @FXML
    private MenuItem runTraducirMinion;

    @FXML
    private TextArea txtMinion;

    @FXML
    private TextArea txtPrincipal;

    @FXML
    private CodeArea txtCodigoPrincipal;

    //Metodos
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
    void clearEdit(ActionEvent event) {
        txtCodigoPrincipal.replaceText("");
    }

    @FXML
    void closeFile(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void ejecucionClear(ActionEvent event) {
        txtMinion.clear();
    }

    @FXML
    void ejecutar(ActionEvent event) {
        try {
            CharStream input = CharStreams.fromString(txtCodigoPrincipal.getText());
            MinionLexer lexico = new MinionLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            MinionParser sintactico = new MinionParser(tokens);
            sintactico.removeErrorListeners();
            sintactico.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("Error, no es posible ejecutar (linea " + line + ", caracter " + charPositionInLine + ").");
                }
            });
            ParseTree arbol = sintactico.programa();
            //Verificacion del Scope de Variables
            Verificador verificar = new Verificador();
            verificar.visit(arbol);

            //Ejecucion en Minion
            minionVisitor visitas = new minionVisitor();
            visitas.visit(arbol);
            //Ejecucion Jasmin
            traductorJasmin jasmin = new traductorJasmin();
            jasmin.visit(arbol);
            jasmin.cerrar();
                //Termina la visita a Jasmin, y se crean los archivos
            Process p = Runtime.getRuntime().exec("java -jar jasmin.jar Jasmin.j");
            p.waitFor();
            Process p2 = Runtime.getRuntime().exec("java Jasmin");
            // Recuperacion de la consola en jasmin
            BufferedReader b = new BufferedReader(new InputStreamReader(p2.getInputStream()));
            String linea;
            while((linea = b.readLine()) != null){
                txtMinion.appendText(linea + System.lineSeparator());
            }
            //Cerramos los procesos de la consola
            p.destroy();
            p2.destroy();


        } catch (ParseCancellationException e) {
            txtMinion.setText(e.getMessage());
        } catch (NullPointerException e) {
            txtMinion.setText(e.getMessage());
        } catch (ArithmeticException e) {
            txtMinion.setText(e.getMessage());
        }catch (Exception e) {
            txtMinion.setText(e.getMessage());
        } finally {
            resultado = "";
        }
    }

    @FXML
    void traducir(ActionEvent event) {
        try{
        txtCodigoPrincipal.setEditable(true);
        CharStream input = CharStreams.fromString(txtCodigoPrincipal.getText());
        TraductorLexer lexico = new TraductorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        TraductorParser sintacticoT = new TraductorParser(tokens);
        sintacticoT.removeErrorListeners();
        sintacticoT.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("Error, no es posible traducir (linea " + line + ", caracter " + charPositionInLine + ").");
                }
            });
        ParseTree arbol = sintacticoT.programa();
        VisitTraductor visitas = new VisitTraductor();
        visitas.visit(arbol);
        visitas.cerrar();
        txtMinion.setText("");
        txtCodigoPrincipal.replaceText("");
        File archivo=null;
        FileReader fr = null;
        BufferedReader br = null;
        String traduccion="";
        try {
            archivo = new File ("src/main/traduccion.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                traduccion= traduccion+linea+"\n";
            }
            txtCodigoPrincipal.replaceText(0,0,traduccion);
        }
        catch(Exception e){
            txtMinion.setText(e.getMessage());
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e){
                txtMinion.setText(e.getMessage());
            }
        }
        txtMinion.setText("Se ha traduccido exitosamente a Minion...");
    } catch (ParseCancellationException e) {
        txtMinion.setText(e.getMessage());
    } catch (NullPointerException e) {
        txtMinion.setText(e.getMessage());
    } catch (ArithmeticException e) {
        txtMinion.setText("Error, " + e.getMessage());
    }
    }

    @FXML
    void traducirC(ActionEvent event) {
        try{
            txtCodigoPrincipal.setEditable(true);

            CharStream input = CharStreams.fromString(txtCodigoPrincipal.getText());
            TraductorCLexer lexico = new TraductorCLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            TraductorCParser sintacticoT = new TraductorCParser(tokens);
            sintacticoT.removeErrorListeners();
            sintacticoT.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("Error, no es posible traducir (linea " + line + ", caracter " + charPositionInLine + ").");
                }
            });
            ParseTree arbol = sintacticoT.programa();
            VisitTraductorC visitas = new VisitTraductorC();
            visitas.visit(arbol);
            visitas.cerrar();

            txtCodigoPrincipal.replaceText("");
            txtMinion.setText("");
            File archivo=null;
            FileReader fr = null;
            BufferedReader br = null;
            String traduccion ="";
            try {
                archivo = new File ("src/main/traduccion.txt");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    traduccion= traduccion+linea+"\n";
                }
                txtCodigoPrincipal.replaceText(0,0,traduccion);
            }
            catch(Exception e){
                txtMinion.setText(e.getMessage());
            }finally{
                try{
                    if( null != fr ){
                        fr.close();
                    }
                }catch (Exception e){
                    txtMinion.setText(e.getMessage());
                }
            }
            txtMinion.setText("Se ha traduccido exitosamente a C...");
        } catch (ParseCancellationException e) {
            txtMinion.setText(e.getMessage());
        } catch (NullPointerException e) {
            txtMinion.setText(e.getMessage());
        } catch (ArithmeticException e) {
            txtMinion.setText("Error, " + e.getMessage());
        }
    }

    @FXML
    void newFile(ActionEvent event) {
        txtCodigoPrincipal.setEditable(true);
    }

    @FXML
    void openFile(ActionEvent event) {
        txtCodigoPrincipal.setEditable(true);
        txtCodigoPrincipal.replaceText("");
        String codigo = "";
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        File archivo = fileChooser.showOpenDialog(null);
        if(archivo != null){
            try {
                Scanner input = new Scanner(new File(archivo.getAbsolutePath()));
                while (input.hasNext()) {
                    codigo=codigo+input.nextLine()+'\n';
                }
                input.close();
                txtCodigoPrincipal.replaceText(0,0,codigo);
            } catch (FileNotFoundException ex) {
                txtMinion.setText("No se encontro el archivo: " + archivo.getName());
            } catch (Exception ex) {
                txtMinion.setText(ex.getMessage());
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
            guardarTexto(txtCodigoPrincipal.getText(), file);
        }
    }

    void guardarTexto(String texto, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(texto);
            writer.close();
        } catch (IOException e) {
            txtMinion.setText(e.getMessage());
        }
    }

    void sacarConsola(String consola){
        resultado+=consola+"\n";
    }
    private static final int THREAD_AVAILABE_NUMBER = Runtime.getRuntime().availableProcessors();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtCodigoPrincipal.setEditable(false);
        IntFunction<Node> lineNumberFactory = LineNumberFactory.get(txtCodigoPrincipal);
        txtCodigoPrincipal.setParagraphGraphicFactory(lineNumberFactory);
        codeAreaHighlighter();
        taskExecutor = Executors.newFixedThreadPool(THREAD_AVAILABE_NUMBER);
    }

    private void codeAreaHighlighter() {
        txtCodigoPrincipal.multiPlainChanges()
                .successionEnds(Duration.ofMillis(500))
                .supplyTask(this::computeHighlightingAsync)
                .awaitLatest(txtCodigoPrincipal.multiPlainChanges())
                .filterMap(tryTask -> {
                    if (tryTask.isSuccess()) {
                        return Optional.of(tryTask.get());
                    } else {
                        tryTask.getFailure().printStackTrace();
                        return Optional.empty();
                    }
                })
                .subscribe(this::applyHighlighting);
    }

    private Task<StyleSpans<Collection<String>>> computeHighlightingAsync() {
        String text = txtCodigoPrincipal.getText();
        Task<StyleSpans<Collection<String>>> task = new Task<StyleSpans<Collection<String>>>() {
            @Override
            protected StyleSpans<Collection<String>> call() {
                return computeHighlighting(text);
            }
        };
        taskExecutor.execute(task);
        return task;
    }


    private void applyHighlighting(StyleSpans<Collection<String>> highlighting) {
        txtCodigoPrincipal.setStyleSpans(0, highlighting);
    }

    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = MinionSyntax.PATTERN.matcher(text);
        int lastKeywordEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();

        while (matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                            matcher.group("CICLOS") != null ? "ciclos" :
                                    matcher.group("TRUEFALSE") != null ? "truefalse" :
                                            matcher.group("TIPOS") != null ? "tipos" :
                            matcher.group("PAREN") != null ? "paren" :
                                            matcher.group("BRACE") != null ? "brace" :
                                                    matcher.group("SEMICOLON") != null ? "semicolon" :
                                                                    matcher.group("STRING") != null ? "string" :
                                                                                            matcher.group("COMMENT") != null ? "comment" :
                                                                                                            matcher.group("OPERATION") != null ? "operation" :
                                                                                                                            matcher.group("NUMBER") != null ? "number" :
                                                                                                                                            null; /* nunca pasa */
            assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKeywordEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKeywordEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKeywordEnd);
        return spansBuilder.create();
    }

}

