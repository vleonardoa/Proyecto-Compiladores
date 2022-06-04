/* The following code was generated by JFlex 1.7.0 */


   
/* --------------------------Usercode Section------------------------ */
package Principal;  
import Grafic.Guardar;
import java_cup.runtime.*;
import java.io.*;

class Ccadena	
{	
	static String string="";
}



class Errores
{
    public static PrintWriter salida1=null;
	public static PrintWriter salida2=null;
	public static PrintWriter salida3=null;

public Errores(){
    Guardar gu = new Guardar();
    String direc = gu.DirName;
    
	String archivo1 = "C:\\memory\\Salida\\"+direc+"-lexicos.html";
        FileWriter fw1;
        String archivo2 = "C:\\memory\\Salida\\"+direc+"-sintacticos.html";
        FileWriter fw2;
        String archivo3 = "C:\\memory\\Salida\\"+direc+"-semanticos.html";
        FileWriter fw3;


        try{
        	fw1= new FileWriter(archivo1);
	        BufferedWriter bw1 = new BufferedWriter(fw1);
		salida1 = new PrintWriter(bw1);

		fw2= new FileWriter(archivo2);
	        BufferedWriter bw2 = new BufferedWriter(fw2);
        	salida2 = new PrintWriter(bw2);

		fw3= new FileWriter(archivo3);
	        BufferedWriter bw3 = new BufferedWriter(fw3);
        	salida3 = new PrintWriter(bw3);


	} catch (IOException f) {
                // TODO
         }
         
                    
}
 
 public static void error_lexico(int linea_e,int columna_e,String caracter_e,String estado_e){
    		linea_e=linea_e + 1;

	        //Escribiendo en el archivo lexicos.html                         

                salida1.println("<TR BGCOLOR='White'>");
		salida1.println("<td width='150'>" + linea_e + "</td>");
        	salida1.println("<td width='150'>" + columna_e + "</td>");
	        salida1.println("<td width='200'>" + caracter_e + "</td>"); 
		salida1.println("<td width='300'>" + estado_e + "</td>"); 
		salida1.println("</TR>");
		                          
 }

 public static void error_sintactico(int linea_e,int columna_e,String descripcion_e,String estado_e){
    		linea_e=linea_e + 1;
    
	        //Escribiendo en el archivo sintacticos.html                         

        	salida2.println("<TR BGCOLOR='White'>");
		salida2.println("<td width='150'>" + linea_e + "</td>");
        	salida2.println("<td width='150'>" + columna_e + "</td>");
	        salida2.println("<td width='200'>" + descripcion_e + "</td>"); 
	        salida2.println("<td width='300'>" + estado_e + "</td>"); 
        	salida2.println("</TR>");


 }


 public static void error_semantico(String descripcion_e){
    
	        //Escribiendo en el archivo semanticos.html                         

        	salida3.println("<TR BGCOLOR='White'>");
		salida3.println("<td width='800'>" + descripcion_e + "</td>"); 
	        salida3.println("</TR>");


 }

public static void abrir(){
	        //Escribiendo en el archivo lexicos.html                         
		salida1.println("<html><head><title>REPORTE DE ERRORES LEXICOS</title></head>");
		salida1.println("<body bgcolor='black'>");
        	salida1.println("<font color='white'>");
	        salida1.println("<h1 align='Center'>REPORTE DE ERRORES LEXICOS</h1>");
		salida1.println("</font>");
	        salida1.println("<TABLE BORDER='2' CELLPADING='10' ALIGN='center'>");
        	salida1.println("<TR>");
	        salida1.println("<td width='150' bgcolor='red'>LINEA</td>");
        	salida1.println("<td width='150' bgcolor='red'>COLUMNA</td>");
		salida1.println("<td width='200' bgcolor='red'>CARACTER</td>");
		salida1.println("<td width='300' bgcolor='red'>ESTADO</td>");
        	salida1.println("</TR></TABLE>");
	        salida1.println("<TABLE BORDER='2' CELLPADING='10' ALIGN='center'>");
        	


	        //Escribiendo en el archivo sintacticos.html                         

		salida2.println("<html><head><title>REPORTE DE ERRORES SINTACTICOS</title></head>");
		salida2.println("<body bgcolor='black'>");
        	salida2.println("<font color='white'>");
	        salida2.println("<h1 align='Center'>REPORTE DE ERRORES SINTACTICOS</h1>");
		salida2.println("</font>");
	        salida2.println("<TABLE BORDER='2' CELLPADING='10' ALIGN='center'>");
        	salida2.println("<TR>");
	        salida2.println("<td width='150' bgcolor='red'>LINEA</td>");
        	salida2.println("<td width='150' bgcolor='red'>COLUMNA</td>");
		salida2.println("<td width='200' bgcolor='red'>DESCRIPCION</td>");
		salida2.println("<td width='300' bgcolor='red'>ESTADO</td>");
        	salida2.println("</TR></TABLE>");
	        salida2.println("<TABLE BORDER='2' CELLPADING='10' ALIGN='center'>");



	        //Escribiendo en el archivo semanticos.html                         

		salida3.println("<html><head><title>REPORTE DE ERRORES SEMANTICOS</title></head>");
		salida3.println("<body bgcolor='black'>");
        	salida3.println("<font color='white'>");
	        salida3.println("<h1 align='Center'>REPORTE DE ERRORES SEMANTICOS</h1>");
		salida3.println("</font>");
	        salida3.println("<TABLE BORDER='2' CELLPADING='10' ALIGN='center'>");
        	salida3.println("<TR>");
		salida3.println("<td width='800' bgcolor='red'><center>DESCRIPCION</center></td>");
        	salida3.println("</TR></TABLE>");
	        salida3.println("<TABLE BORDER='2' CELLPADING='10' ALIGN='center'>");


}
public static void cerrar(){

        	salida1.println("</TR></TABLE></body></html>");
	        salida1.close();  

        	salida2.println("</TR></TABLE></body></html>");
	        salida2.close();  

        	salida3.println("</TR></TABLE></body></html>");
	        salida3.close();  


}

}



      

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>C:/Compiladores/ArchivosDeConfiguracion/Scanner.jflex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int S_TABLA = 2;
  public static final int S_ETIQUETA_TABLA = 4;
  public static final int S_FILA = 6;
  public static final int S_CELDA_ENCABEZADO = 8;
  public static final int S_CELDA = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\6\1\5\1\16\1\6\1\4\22\0\1\6\3\0\1\1"+
    "\1\0\1\11\11\0\12\3\2\0\1\7\1\0\1\10\2\0\4\2"+
    "\1\27\16\2\1\23\6\2\6\0\1\13\1\14\1\25\1\26\1\17"+
    "\1\24\2\2\1\20\2\2\1\15\1\2\1\30\1\32\1\2\1\21"+
    "\2\2\1\12\1\22\4\2\1\31\12\0\1\16\u1fa2\0\1\16\1\16"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\0\1\3\2\4\1\5\1\6\2\1"+
    "\2\7\1\10\2\1\1\11\1\12\2\2\2\12\1\13"+
    "\2\4\1\14\1\13\1\15\2\3\2\15\1\16\1\17"+
    "\1\16\1\20\1\21\1\20\35\0\1\22\3\0\1\23"+
    "\2\0\1\24\1\0\1\25\1\0\1\26\1\0\1\27"+
    "\34\0\1\30\1\31\4\0\1\32\1\33";

  private static int [] zzUnpackAction() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\33\0\66\0\121\0\154\0\207\0\242\0\242"+
    "\0\275\0\330\0\363\0\242\0\242\0\u010e\0\242\0\242"+
    "\0\242\0\u0129\0\u0144\0\u015f\0\u017a\0\242\0\u0195\0\242"+
    "\0\242\0\u01b0\0\242\0\u01cb\0\u01e6\0\u0201\0\u021c\0\242"+
    "\0\242\0\u0237\0\242\0\242\0\u0252\0\u026d\0\u0288\0\u02a3"+
    "\0\u02be\0\u02d9\0\u02f4\0\u030f\0\u032a\0\u0345\0\u0360\0\u037b"+
    "\0\u0396\0\u03b1\0\u03cc\0\u03e7\0\u0402\0\u041d\0\u0438\0\u0453"+
    "\0\u046e\0\u0489\0\u04a4\0\u04bf\0\u04da\0\u04f5\0\u0510\0\u052b"+
    "\0\u0546\0\u0561\0\242\0\u057c\0\u0597\0\u05b2\0\242\0\u05cd"+
    "\0\u05e8\0\242\0\u0603\0\242\0\u061e\0\u0639\0\u0654\0\242"+
    "\0\u066f\0\u068a\0\u06a5\0\u06c0\0\u06db\0\u06f6\0\u0711\0\u072c"+
    "\0\u0747\0\u0762\0\u077d\0\u0798\0\u07b3\0\u07ce\0\u07e9\0\u0804"+
    "\0\u081f\0\u083a\0\u0855\0\u0870\0\u088b\0\u08a6\0\u08c1\0\u08dc"+
    "\0\u08f7\0\u0912\0\u092d\0\u0948\0\242\0\242\0\u0963\0\u097e"+
    "\0\u0999\0\u09b4\0\242\0\242";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\2\17\4\11\1\20\14\11\2\21\1\22\1\23\1\13"+
    "\1\14\1\15\1\24\1\25\1\21\4\22\1\20\14\22"+
    "\2\26\2\27\1\13\1\14\1\30\1\31\1\32\1\30"+
    "\4\27\1\20\14\27\2\33\1\34\1\35\1\13\1\14"+
    "\1\15\1\36\1\37\1\33\4\34\1\20\14\34\2\40"+
    "\2\27\1\13\1\14\1\30\1\41\1\42\1\40\4\27"+
    "\1\20\14\27\2\43\2\27\1\13\1\14\1\30\1\44"+
    "\1\45\1\43\4\27\1\20\14\27\35\0\1\11\7\0"+
    "\4\11\1\0\14\11\3\0\1\12\34\0\1\14\37\0"+
    "\1\46\22\0\1\22\7\0\4\22\1\0\14\22\3\0"+
    "\1\23\46\0\1\47\4\0\1\50\20\0\1\51\22\0"+
    "\2\27\6\0\4\27\1\0\14\27\17\0\1\52\15\0"+
    "\1\34\7\0\4\34\1\0\14\34\3\0\1\35\54\0"+
    "\1\53\31\0\1\54\33\0\1\55\32\0\1\56\20\0"+
    "\1\57\31\0\1\60\40\0\1\61\25\0\1\62\31\0"+
    "\1\63\37\0\1\64\33\0\1\65\31\0\1\66\32\0"+
    "\1\67\27\0\1\70\36\0\1\71\27\0\1\72\31\0"+
    "\1\73\36\0\1\74\27\0\1\75\32\0\1\76\32\0"+
    "\1\77\32\0\1\100\32\0\1\101\36\0\1\102\24\0"+
    "\1\103\34\0\1\104\36\0\1\105\37\0\1\106\17\0"+
    "\1\107\45\0\1\110\32\0\1\111\17\0\1\112\41\0"+
    "\1\113\23\0\1\114\41\0\1\115\23\0\1\116\32\0"+
    "\1\117\32\0\1\120\36\0\1\121\32\0\1\122\42\0"+
    "\1\123\32\0\1\124\15\0\1\125\32\0\1\126\50\0"+
    "\1\127\32\0\1\130\15\0\1\131\32\0\1\132\44\0"+
    "\1\133\32\0\1\134\30\0\1\135\32\0\1\136\22\0"+
    "\1\137\32\0\1\140\32\0\1\141\32\0\1\142\33\0"+
    "\1\143\32\0\1\144\32\0\1\145\32\0\1\146\35\0"+
    "\1\147\32\0\1\150\30\0\1\151\32\0\1\152\46\0"+
    "\1\153\32\0\1\154\14\0\1\155\32\0\1\156\32\0"+
    "\1\157\32\0\1\160\45\0\1\161\32\0\1\162\36\0"+
    "\1\163\32\0\1\164";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2511];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\1\1\0\3\1\2\11\3\1\2\11\1\1\3\11"+
    "\4\1\1\11\1\1\2\11\1\1\1\11\4\1\2\11"+
    "\1\1\2\11\1\1\35\0\1\11\3\0\1\11\2\0"+
    "\1\11\1\0\1\11\1\0\1\1\1\0\1\11\34\0"+
    "\2\11\4\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 134) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { Errores.error_sintactico(yyline,yychar,yytext(),"ESTADO INICIAL");
            } 
            // fall through
          case 28: break;
          case 2: 
            { Errores.error_sintactico(yyline,yychar,yytext(),"ESTADO TABLA");
            } 
            // fall through
          case 29: break;
          case 3: 
            { Errores.error_sintactico(yyline,yychar,yytext(),"ESTADO FILA");
            } 
            // fall through
          case 30: break;
          case 4: 
            { Ccadena.string = Ccadena.string + yytext();
            } 
            // fall through
          case 31: break;
          case 5: 
            { Errores.error_lexico(yyline,yychar,yytext(),"ESTADO INICIAL");
									System.out.println("caracter no reconocido "+yytext()+"   linea:" + yyline + " columna:" + yychar);
            } 
            // fall through
          case 32: break;
          case 6: 
            { System.out.println("------------------------ TDOLAR:"+yytext());
									 return new Symbol(sym.TDOLAR,yytext());
            } 
            // fall through
          case 33: break;
          case 7: 
            { yychar=0;
            } 
            // fall through
          case 34: break;
          case 8: 
            { /* Ignora espacios en blanco. */
            } 
            // fall through
          case 35: break;
          case 9: 
            { throw new Error("Illegal character "+yytext()+"  ");
            } 
            // fall through
          case 36: break;
          case 10: 
            { Errores.error_lexico(yyline,yychar,yytext(),"ESTADO TABLA");
									System.out.println("caracter no reconocido "+yytext()+"   linea:" + yyline + " columna:" + yychar);
            } 
            // fall through
          case 37: break;
          case 11: 
            { Errores.error_lexico(yyline,yychar,yytext(),"ESTADO ETIQUETA TABLA");
									 System.out.println("caracter no reconocido "+yytext()+"   linea:" + yyline + " columna:" + yychar);
            } 
            // fall through
          case 38: break;
          case 12: 
            { Errores.error_sintactico(yyline,yychar,yytext(),"ESTADO ETIQUETA TABLA");
            } 
            // fall through
          case 39: break;
          case 13: 
            { Errores.error_lexico(yyline,yychar,yytext(),"ESTADO FILA");
									 System.out.println("caracter no reconocido "+yytext()+"   linea:" + yyline + " columna:" + yychar);
            } 
            // fall through
          case 40: break;
          case 14: 
            { Errores.error_lexico(yyline,yychar,yytext(),"ESTADO CELDA ENCABEZADO");
									 System.out.println("caracter no reconocido "+yytext()+"   linea:" + yyline + " columna:" + yychar);
            } 
            // fall through
          case 41: break;
          case 15: 
            { Errores.error_sintactico(yyline,yychar,yytext(),"ESTADO CELDA ENCABEZADO");
            } 
            // fall through
          case 42: break;
          case 16: 
            { Errores.error_lexico(yyline,yychar,yytext(),"ESTADO CELDA");
									 System.out.println("caracter no reconocido "+yytext()+"   linea:" + yyline + " columna:" + yychar);
            } 
            // fall through
          case 43: break;
          case 17: 
            { Errores.error_sintactico(yyline,yychar,yytext(),"ESTADO CELDA");
            } 
            // fall through
          case 44: break;
          case 18: 
            { Ccadena.string=""; yybegin(S_FILA);
            } 
            // fall through
          case 45: break;
          case 19: 
            { yybegin(S_TABLA);
									 System.out.println("------------------------ TFIN_FILA:"+yytext());
									 return new Symbol(sym.TFIN_FILA,yytext());
            } 
            // fall through
          case 46: break;
          case 20: 
            { yybegin(S_TABLA);
            } 
            // fall through
          case 47: break;
          case 21: 
            { yybegin(YYINITIAL);
            } 
            // fall through
          case 48: break;
          case 22: 
            { Ccadena.string=""; yybegin(S_CELDA);
            } 
            // fall through
          case 49: break;
          case 23: 
            { yybegin(S_FILA);
									  System.out.println("------------------------ TCELDA:"+Ccadena.string);
									  return new Symbol(sym.TCELDA,new String(Ccadena.string));
            } 
            // fall through
          case 50: break;
          case 24: 
            { Ccadena.string=""; yybegin(S_ETIQUETA_TABLA);
            } 
            // fall through
          case 51: break;
          case 25: 
            { yybegin(S_TABLA);
									  System.out.println("------------------------ TETIQUETA_TABLA:"+Ccadena.string);
									  return new Symbol(sym.TETIQUETA_TABLA,new String(Ccadena.string));
            } 
            // fall through
          case 52: break;
          case 26: 
            { Ccadena.string=""; yybegin(S_CELDA_ENCABEZADO);
            } 
            // fall through
          case 53: break;
          case 27: 
            { yybegin(S_FILA);
									  System.out.println("------------------------ TCELDA_ENCABEZADO:"+Ccadena.string);
									  return new Symbol(sym.TCELDA_ENCABEZADO,new String(Ccadena.string));
            } 
            // fall through
          case 54: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}