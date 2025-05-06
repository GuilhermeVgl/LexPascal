package Mecanismo;

public class Definicoes {
    protected int end;

    public String getIdentifier() {
        return "Identificador";
    }
    public String getKeyWord() {
        return "Palavra Reservada";
    }
    public String getSimbol() {
        return "Símbolo";
    }
    public String getLiteral() {
        return "Literal";
    }
    public String getNumber() {
        return "Número";
    }
    public String getUndefined() {
        return "Desconhecido";
    }

    public String getABSOLUTE(){ return "absolute"; }
    public final Token ABSOLUTE = new Token(getABSOLUTE(), getABSOLUTE(), getKeyWord(), getABSOLUTE(), ++end);

    public String getABSTRACT(){ return "abstract"; }
    public final Token ABSTRACT = new Token(getABSTRACT(), getABSTRACT(), getKeyWord(), getABSTRACT(), ++end);

    public String getANSICHAR(){ return "ansichar"; }
    public final Token ANSICHAR = new Token(getANSICHAR(), getANSICHAR(), getKeyWord(), getANSICHAR(), ++end);

    public String getANSISTRING(){ return "ansistring"; }
    public final Token ANSISTRING = new Token(getANSISTRING(), getANSISTRING(), getKeyWord(), getANSISTRING(), ++end);

    public String getARRAY(){ return "array"; }
    public final Token ARRAY = new Token(getARRAY(), getARRAY(), getKeyWord(), getARRAY(), ++end);

    public String getAS(){ return "as"; }
    public final Token AS = new Token(getAS(), getAS(), getKeyWord(), getAS(), ++end);

    public String getASM(){ return "asm"; }
    public final Token ASM = new Token(getASM(), getASM(), getKeyWord(), getASM(), ++end);

    public String getASSEMBLER(){ return "assembler"; }
    public final Token ASSEMBLER = new Token(getASSEMBLER(), getASSEMBLER(), getKeyWord(), getASSEMBLER(), ++end);

    public String getAUTOMATED(){ return "automated"; }
    public final Token AUTOMATED = new Token(getAUTOMATED(), getAUTOMATED(), getKeyWord(), getAUTOMATED(), ++end);

    public String getBEGIN(){ return "begin"; }
    public final Token BEGIN = new Token(getBEGIN(), getBEGIN(), getKeyWord(), getBEGIN(), ++end);

    public String getBOOLEAN(){ return "boolean"; }
    public final Token BOOLEAN = new Token(getBOOLEAN(), getBOOLEAN(), getKeyWord(), getBOOLEAN(), ++end);

    public String getBREAK(){ return "break"; }
    public final Token BREAK = new Token(getBREAK(), getBREAK(), getKeyWord(), getBREAK(), ++end);

    public String getBYTE(){ return "byte"; }
    public final Token BYTE = new Token(getBYTE(), getBYTE(), getKeyWord(), getBYTE(), ++end);

    public String getCASE(){ return "case"; }
    public final Token CASE = new Token(getCASE(), getCASE(), getKeyWord(), getCASE(), ++end);

    public String getCDECL(){ return "cdecl"; }
    public final Token CDECL = new Token(getCDECL(), getCDECL(), getKeyWord(), getCDECL(), ++end);

    public String getCHAR(){ return "char"; }
    public final Token CHAR = new Token(getCHAR(), getCHAR(), getKeyWord(), getCHAR(), ++end);

    public String getCLASS(){ return "class"; }
    public final Token CLASS = new Token(getCLASS(), getCLASS(), getKeyWord(), getCLASS(), ++end);

    public String getCONST(){ return "const"; }
    public final Token CONST = new Token(getCONST(), getCONST(), getKeyWord(), getCONST(), ++end);

    public String getCONSTRUCTOR(){ return "constructor"; }
    public final Token CONSTRUCTOR = new Token(getCONSTRUCTOR(), getCONSTRUCTOR(), getKeyWord(), getCONSTRUCTOR(), ++end);

    public String getCONTINUE(){ return "continue"; }
    public final Token CONTINUE = new Token(getCONTINUE(), getCONTINUE(), getKeyWord(), getCONTINUE(), ++end);

    public String getCURRENCY(){ return "currency"; }
    public final Token CURRENCY = new Token(getCURRENCY(), getCURRENCY(), getKeyWord(), getCURRENCY(), ++end);

    public String getDEFAULT(){ return "default"; }
    public final Token DEFAULT = new Token(getDEFAULT(), getDEFAULT(), getKeyWord(), getDEFAULT(), ++end);

    public String getDEPRECATED(){ return "deprecated"; }
    public final Token DEPRECATED = new Token(getDEPRECATED(), getDEPRECATED(), getKeyWord(), getDEPRECATED(), ++end);

    public String getDESTRUCTOR(){ return "destructor"; }
    public final Token DESTRUCTOR = new Token(getDESTRUCTOR(), getDESTRUCTOR(), getKeyWord(), getDESTRUCTOR(), ++end);

    public String getDISPOSE(){ return "dispose"; }
    public final Token DISPOSE = new Token(getDISPOSE(), getDISPOSE(), getKeyWord(), getDISPOSE(), ++end);

    public String getDIV(){ return "div"; }
    public final Token DIV = new Token(getDIV(), getDIV(), getKeyWord(), getDIV(), ++end);

    public String getDO(){ return "do"; }
    public final Token DO = new Token(getDO(), getDO(), getKeyWord(), getDO(), ++end);

    public String getDOUBLE(){ return "double"; }
    public final Token DOUBLE = new Token(getDOUBLE(), getDOUBLE(), getKeyWord(), getDOUBLE(), ++end);

    public String getDOWNTO(){ return "downto"; }
    public final Token DOWNTO = new Token(getDOWNTO(), getDOWNTO(), getKeyWord(), getDOWNTO(), ++end);

    public String getELSE(){ return "else"; }
    public final Token ELSE = new Token(getELSE(), getELSE(), getKeyWord(), getELSE(), ++end);

    public String getEND(){ return "end"; }
    public final Token END = new Token(getEND(), getEND(), getKeyWord(), getEND(), ++end);

    public String getEXIT(){ return "exit"; }
    public final Token EXIT = new Token(getEXIT(), getEXIT(), getKeyWord(), getEXIT(), ++end);

    public String getEXPORT(){ return "export"; }
    public final Token EXPORT = new Token(getEXPORT(), getEXPORT(), getKeyWord(), getEXPORT(), ++end);

    public String getEXTENDED(){ return "extended"; }
    public final Token EXTENDED = new Token(getEXTENDED(), getEXTENDED(), getKeyWord(), getEXTENDED(), ++end);

    public String getEXTERNAL(){ return "external"; }
    public final Token EXTERNAL = new Token(getEXTERNAL(), getEXTERNAL(), getKeyWord(), getEXTERNAL(), ++end);

    public String getFALSE(){ return "false"; }
    public final Token FALSE = new Token(getFALSE(), getFALSE(), getKeyWord(), getFALSE(), ++end);

    public String getFAR(){ return "far"; }
    public final Token FAR = new Token(getFAR(), getFAR(), getKeyWord(), getFAR(), ++end);

    public String getFILE(){ return "file"; }
    public final Token FILE = new Token(getFILE(), getFILE(), getKeyWord(), getFILE(), ++end);

    public String getFINALIZATION(){ return "finalization"; }
    public final Token FINALIZATION = new Token(getFINALIZATION(), getFINALIZATION(), getKeyWord(), getFINALIZATION(), ++end);

    public String getFINALIZED(){ return "finalized"; }
    public final Token FINALIZED = new Token(getFINALIZED(), getFINALIZED(), getKeyWord(), getFINALIZED(), ++end);

    public String getFINALLY(){ return "finally"; }
    public final Token FINALLY = new Token(getFINALLY(), getFINALLY(), getKeyWord(), getFINALLY(), ++end);

    public String getFOR(){ return "for"; }
    public final Token FOR = new Token(getFOR(), getFOR(), getKeyWord(), getFOR(), ++end);

    public String getFORWARD(){ return "forward"; }
    public final Token FORWARD = new Token(getFORWARD(), getFORWARD(), getKeyWord(), getFORWARD(), ++end);

    public String getFUNCTION(){ return "function"; }
    public final Token FUNCTION = new Token(getFUNCTION(), getFUNCTION(), getKeyWord(), getFUNCTION(), ++end);

    public String getGOTO(){ return "goto"; }
    public final Token GOTO = new Token(getGOTO(), getGOTO(), getKeyWord(), getGOTO(), ++end);

    public String getIF(){ return "if"; }
    public final Token IF = new Token(getIF(), getIF(), getKeyWord(), getIF(), ++end);

    public String getIMPLEMENTATION(){ return "implementation"; }
    public final Token IMPLEMENTATION = new Token(getIMPLEMENTATION(), getIMPLEMENTATION(), getKeyWord(), getIMPLEMENTATION(), ++end);

    public String getIN(){ return "in"; }
    public final Token IN = new Token(getIN(), getIN(), getKeyWord(), getIN(), ++end);

    public String getINHERITED(){ return "inherited"; }
    public final Token INHERITED = new Token(getINHERITED(), getINHERITED(), getKeyWord(), getINHERITED(), ++end);

    public String getINITIALIZATION(){ return "initialization"; }
    public final Token INITIALIZATION = new Token(getINITIALIZATION(), getINITIALIZATION(), getKeyWord(), getINITIALIZATION(), ++end);

    public String getINLINE(){ return "inline"; }
    public final Token INLINE = new Token(getINLINE(), getINLINE(), getKeyWord(), getINLINE(), ++end);

    public String getINT64(){ return "int64"; }
    public final Token INT64 = new Token(getINT64(), getINT64(), getKeyWord(), getINT64(), ++end);

    public String getINTEGER(){ return "integer"; }
    public final Token INTEGER = new Token(getINTEGER(), getINTEGER(), getKeyWord(), getINTEGER(), ++end);

    public String getINTERFACE(){ return "interface"; }
    public final Token INTERFACE = new Token(getINTERFACE(), getINTERFACE(), getKeyWord(), getINTERFACE(), ++end);

    public String getINTERRUPT(){ return "interrupt"; }
    public final Token INTERRUPT = new Token(getINTERRUPT(), getINTERRUPT(), getKeyWord(), getINTERRUPT(), ++end);

    public String getIS(){ return "is"; }
    public final Token IS = new Token(getIS(), getIS(), getKeyWord(), getIS(), ++end);

    public String getLABEL(){ return "label"; }
    public final Token LABEL = new Token(getLABEL(), getLABEL(), getKeyWord(), getLABEL(), ++end);

    public String getLIBRARY(){ return "library"; }
    public final Token LIBRARY = new Token(getLIBRARY(), getLIBRARY(), getKeyWord(), getLIBRARY(), ++end);

    public String getLONGINT(){ return "longint"; }
    public final Token LONGINT = new Token(getLONGINT(), getLONGINT(), getKeyWord(), getLONGINT(), ++end);

    public String getLONGWORD(){ return "longword"; }
    public final Token LONGWORD = new Token(getLONGWORD(), getLONGWORD(), getKeyWord(), getLONGWORD(), ++end);

    public String getMESSAGE(){ return "message"; }
    public final Token MESSAGE = new Token(getMESSAGE(), getMESSAGE(), getKeyWord(), getMESSAGE(), ++end);

    public String getMOD(){ return "mod"; }
    public final Token MOD = new Token(getMOD(), getMOD(), getKeyWord(), getMOD(), ++end);

    public String getNEAR(){ return "near"; }
    public final Token NEAR = new Token(getNEAR(), getNEAR(), getKeyWord(), getNEAR(), ++end);

    public String getNEW(){ return "new"; }
    public final Token NEW = new Token(getNEW(), getNEW(), getKeyWord(), getNEW(), ++end);

    public String getNIL(){ return "nil"; }
    public final Token NIL = new Token(getNIL(), getNIL(), getKeyWord(), getNIL(), ++end);

    public String getNODEFAULT(){ return "nodefault"; }
    public final Token NODEFAULT = new Token(getNODEFAULT(), getNODEFAULT(), getKeyWord(), getNODEFAULT(), ++end);

    public String getOBJECT(){ return "object"; }
    public final Token OBJECT = new Token(getOBJECT(), getOBJECT(), getKeyWord(), getOBJECT(), ++end);

    public String getOF(){ return "of"; }
    public final Token OF = new Token(getOF(), getOF(), getKeyWord(), getOF(), ++end);

    public String getOPERATOR(){ return "operator"; }
    public final Token OPERATOR = new Token(getOPERATOR(), getOPERATOR(), getKeyWord(), getOPERATOR(), ++end);

    public String getOVERLOAD(){ return "overload"; }
    public final Token OVERLOAD = new Token(getOVERLOAD(), getOVERLOAD(), getKeyWord(), getOVERLOAD(), ++end);

    public String getOVERRIDE(){ return "override"; }
    public final Token OVERRIDE = new Token(getOVERRIDE(), getOVERRIDE(), getKeyWord(), getOVERRIDE(), ++end);

    public String getPACKED(){ return "packed"; }
    public final Token PACKED = new Token(getPACKED(), getPACKED(), getKeyWord(), getPACKED(), ++end);

    public String getPASCAL(){ return "pascal"; }
    public final Token PASCAL = new Token(getPASCAL(), getPASCAL(), getKeyWord(), getPASCAL(), ++end);

    public String getPLATFORM(){ return "platform"; }
    public final Token PLATFORM = new Token(getPLATFORM(), getPLATFORM(), getKeyWord(), getPLATFORM(), ++end);

    public String getPRIVATE(){ return "private"; }
    public final Token PRIVATE = new Token(getPRIVATE(), getPRIVATE(), getKeyWord(), getPRIVATE(), ++end);

    public String getPROCEDURE(){ return "procedure"; }
    public final Token PROCEDURE = new Token(getPROCEDURE(), getPROCEDURE(), getKeyWord(), getPROCEDURE(), ++end);

    public String getPROGRAM(){ return "program"; }
    public final Token PROGRAM = new Token(getPROGRAM(), getPROGRAM(), getKeyWord(), getPROGRAM(), ++end);

    public String getPROPERTY(){ return "property"; }
    public final Token PROPERTY = new Token(getPROPERTY(), getPROPERTY(), getKeyWord(), getPROPERTY(), ++end);

    public String getPROTECTED(){ return "protected"; }
    public final Token PROTECTED = new Token(getPROTECTED(), getPROTECTED(), getKeyWord(), getPROTECTED(), ++end);

    public String getPUBLIC(){ return "public"; }
    public final Token PUBLIC = new Token(getPUBLIC(), getPUBLIC(), getKeyWord(), getPUBLIC(), ++end);

    public String getPUBLISHED(){ return "published"; }
    public final Token PUBLISHED = new Token(getPUBLISHED(), getPUBLISHED(), getKeyWord(), getPUBLISHED(), ++end);

    public String getRAISE(){ return "raise"; }
    public final Token RAISE = new Token(getRAISE(), getRAISE(), getKeyWord(), getRAISE(), ++end);

    public String getREAD(){ return "read"; }
    public final Token READ = new Token(getREAD(), getREAD(), getKeyWord(), getREAD(), ++end);

    public String getREADLN(){ return "readln"; }
    public final Token READLN = new Token(getREADLN(), getREADLN(), getKeyWord(), getREADLN(), ++end);

    public String getREADONLY(){ return "readonly"; }
    public final Token READONLY = new Token(getREADONLY(), getREADONLY(), getKeyWord(), getREADONLY(), ++end);

    public String getREAL(){ return "real"; }
    public final Token REAL = new Token(getREAL(), getREAL(), getKeyWord(), getREAL(), ++end);

    public String getRECORD(){ return "record"; }
    public final Token RECORD = new Token(getRECORD(), getRECORD(), getKeyWord(), getRECORD(), ++end);

    public String getREGISTER(){ return "register"; }
    public final Token REGISTER = new Token(getREGISTER(), getREGISTER(), getKeyWord(), getREGISTER(), ++end);

    public String getREINTRODUCE(){ return "reintroduce"; }
    public final Token REINTRODUCE = new Token(getREINTRODUCE(), getREINTRODUCE(), getKeyWord(), getREINTRODUCE(), ++end);

    public String getREPEAT(){ return "repeat"; }
    public final Token REPEAT = new Token(getREPEAT(), getREPEAT(), getKeyWord(), getREPEAT(), ++end);

    public String getREQUIRES(){ return "requires"; }
    public final Token REQUIRES = new Token(getREQUIRES(), getREQUIRES(), getKeyWord(), getREQUIRES(), ++end);

    public String getRESIDENT(){ return "resident"; }
    public final Token RESIDENT = new Token(getRESIDENT(), getRESIDENT(), getKeyWord(), getRESIDENT(), ++end);

    public String getRESOURCESTRING(){ return "resourcestring"; }
    public final Token RESOURCESTRING = new Token(getRESOURCESTRING(), getRESOURCESTRING(), getKeyWord(), getRESOURCESTRING(), ++end);

    public String getSAFECALL(){ return "safecall"; }
    public final Token SAFECALL = new Token(getSAFECALL(), getSAFECALL(), getKeyWord(), getSAFECALL(), ++end);

    public String getSEALED(){ return "sealed"; }
    public final Token SEALED = new Token(getSEALED(), getSEALED(), getKeyWord(), getSEALED(), ++end);

    public String getSELF(){ return "self"; }
    public final Token SELF = new Token(getSELF(), getSELF(), getKeyWord(), getSELF(), ++end);

    public String getSET(){ return "set"; }
    public final Token SET = new Token(getSET(), getSET(), getKeyWord(), getSET(), ++end);

    public String getSHL(){ return "shl"; }
    public final Token SHL = new Token(getSHL(), getSHL(), getKeyWord(), getSHL(), ++end);

    public String getSHORTINT(){ return "shortint"; }
    public final Token SHORTINT = new Token(getSHORTINT(), getSHORTINT(), getKeyWord(), getSHORTINT(), ++end);

    public String getSHORTSTRING(){ return "shortstring"; }
    public final Token SHORTSTRING = new Token(getSHORTSTRING(), getSHORTSTRING(), getKeyWord(), getSHORTSTRING(), ++end);

    public String getSHR(){ return "shr"; }
    public final Token SHR = new Token(getSHR(), getSHR(), getKeyWord(), getSHR(), ++end);

    public String getSINGLE(){ return "single"; }
    public final Token SINGLE = new Token(getSINGLE(), getSINGLE(), getKeyWord(), getSINGLE(), ++end);

    public String getSMALLINT(){ return "smallint"; }
    public final Token SMALLINT = new Token(getSMALLINT(), getSMALLINT(), getKeyWord(), getSMALLINT(), ++end);

    public String getSTDCALL(){ return "stdcall"; }
    public final Token STDCALL = new Token(getSTDCALL(), getSTDCALL(), getKeyWord(), getSTDCALL(), ++end);

    public String getSTRICT(){ return "strict"; }
    public final Token STRICT = new Token(getSTRICT(), getSTRICT(), getKeyWord(), getSTRICT(), ++end);

    public String getSTRING(){ return "string"; }
    public final Token STRING = new Token(getSTRING(), getSTRING(), getKeyWord(), getSTRING(), ++end);

    public String getTHEN(){ return "then"; }
    public final Token THEN = new Token(getTHEN(), getTHEN(), getKeyWord(), getTHEN(), ++end);

    public String getTHREADVAR(){ return "threadvar"; }
    public final Token THREADVAR = new Token(getTHREADVAR(), getTHREADVAR(), getKeyWord(), getTHREADVAR(), ++end);

    public String getTO(){ return "to"; }
    public final Token TO = new Token(getTO(), getTO(), getKeyWord(), getTO(), ++end);

    public String getTRUE(){ return "true"; }
    public final Token TRUE = new Token(getTRUE(), getTRUE(), getKeyWord(), getTRUE(), ++end);

    public String getTRY(){ return "try"; }
    public final Token TRY = new Token(getTRY(), getTRY(), getKeyWord(), getTRY(), ++end);

    public String getTYPE(){ return "type"; }
    public final Token TYPE = new Token(getTYPE(), getTYPE(), getKeyWord(), getTYPE(), ++end);

    public String getUINT64(){ return "uint64"; }
    public final Token UINT64 = new Token(getUINT64(), getUINT64(), getKeyWord(), getUINT64(), ++end);

    public String getUNICODESTRING(){ return "unicodestring"; }
    public final Token UNICODESTRING = new Token(getUNICODESTRING(), getUNICODESTRING(), getKeyWord(), getUNICODESTRING(), ++end);

    public String getUNIT(){ return "unit"; }
    public final Token UNIT = new Token(getUNIT(), getUNIT(), getKeyWord(), getUNIT(), ++end);

    public String getUNTIL(){ return "until"; }
    public final Token UNTIL = new Token(getUNTIL(), getUNTIL(), getKeyWord(), getUNTIL(), ++end);

    public String getUSES(){ return "uses"; }
    public final Token USES = new Token(getUSES(), getUSES(), getKeyWord(), getUSES(), ++end);

    public String getVAR(){ return "var"; }
    public final Token VAR = new Token(getVAR(), getVAR(), getKeyWord(), getVAR(), ++end);

    public String getVARARGS(){ return "varargs"; }
    public final Token VARARGS = new Token(getVARARGS(), getVARARGS(), getKeyWord(), getVARARGS(), ++end);

    public String getVIRTUAL(){ return "virtual"; }
    public final Token VIRTUAL = new Token(getVIRTUAL(), getVIRTUAL(), getKeyWord(), getVIRTUAL(), ++end);

    public String getWHILE(){ return "while"; }
    public final Token WHILE = new Token(getWHILE(), getWHILE(), getKeyWord(), getWHILE(), ++end);

    public String getWIDECHAR(){ return "widechar"; }
    public final Token WIDECHAR = new Token(getWIDECHAR(), getWIDECHAR(), getKeyWord(), getWIDECHAR(), ++end);

    public String getWIDESTRING(){ return "widestring"; }
    public final Token WIDESTRING = new Token(getWIDESTRING(), getWIDESTRING(), getKeyWord(), getWIDESTRING(), ++end);

    public String getWITH(){ return "with"; }
    public final Token WITH = new Token(getWITH(), getWITH(), getKeyWord(), getWITH(), ++end);

    public String getWORD(){ return "word"; }
    public final Token WORD = new Token(getWORD(), getWORD(), getKeyWord(), getWORD(), ++end);

    public String getWRITE(){ return "write"; }
    public final Token WRITE = new Token(getWRITE(), getWRITE(), getKeyWord(), getWRITE(), ++end);

    public String getWRITELN(){ return "writeln"; }
    public final Token WRITELN = new Token(getWRITELN(), getWRITELN(), getKeyWord(), getWRITELN(), ++end);

    public String getXOR(){ return "xor"; }
    public final Token XOR = new Token(getXOR(), getXOR(), getKeyWord(), getXOR(), ++end);

    public String getAND(){ return "and"; }
    public final Token AND = new Token(getAND(), getAND(), getKeyWord(), getAND(), ++end);

    public String getOR(){ return "or"; }
    public final Token OR = new Token(getOR(), getOR(), getKeyWord(), getOR(), ++end);

    public String getNOT(){ return "not"; }
    public final Token NOT = new Token(getNOT(), getNOT(), getKeyWord(), getNOT(), ++end);

    public String getDOT(){ return "."; }
    public final Token DOT = new Token(getDOT(), getDOT(), getSimbol(), getDOT(), ++end);

    public String getCOMMA(){ return ","; }
    public final Token COMMA = new Token(getCOMMA(), getCOMMA(), getSimbol(), getCOMMA(), ++end);

    public String getSEMICOLON(){ return ";"; }
    public final Token SEMICOLON = new Token(getSEMICOLON(), getSEMICOLON(), getSimbol(), getSEMICOLON(), ++end);

    public String getCOLON(){ return ":"; }
    public final Token COLON = new Token(getCOLON(), getCOLON(), getSimbol(), getCOLON(), ++end);

    public String getDOUBLECOLON(){ return "::"; }
    public final Token DOUBLECOLON = new Token(getDOUBLECOLON(), getDOUBLECOLON(), getSimbol(), getDOUBLECOLON(), ++end);

    public String getASSIGNMENT_OPERATOR(){ return ":="; }
    public final Token ASSIGNMENT_OPERATOR = new Token(getASSIGNMENT_OPERATOR(), getASSIGNMENT_OPERATOR(), getSimbol(), getASSIGNMENT_OPERATOR(), ++end);

    public String getDOUBLE_DOT(){ return ".."; }
    public final Token DOUBLE_DOT = new Token(getDOUBLE_DOT(), getDOUBLE_DOT(), getSimbol(), getDOUBLE_DOT(), ++end);

    public String getSINGLE_QUOTE(){ return "'"; }
    public final Token SINGLE_QUOTE = new Token(getSINGLE_QUOTE(), getSINGLE_QUOTE(), getSimbol(), getSINGLE_QUOTE(), ++end);

    public String getDOUBLE_QUOTE(){ return "\""; }
    public final Token DOUBLE_QUOTE = new Token(getDOUBLE_QUOTE(), getDOUBLE_QUOTE(), getSimbol(), getDOUBLE_QUOTE(), ++end);

    public String getLEFT_PARENTHESES(){ return "("; }
    public final Token LEFT_PARENTHESES = new Token(getLEFT_PARENTHESES(), getLEFT_PARENTHESES(), getSimbol(), getLEFT_PARENTHESES(), ++end);

    public String getRIGHT_PARENTHESES(){ return ")"; }
    public final Token RIGHT_PARENTHESES = new Token(getRIGHT_PARENTHESES(), getRIGHT_PARENTHESES(), getSimbol(), getRIGHT_PARENTHESES(), ++end);

    public String getLEFT_AND_RIGHT_PARENTHESES(){ return "()"; }
    public final Token LEFT_AND_RIGHT_PARENTHESES = new Token(getLEFT_AND_RIGHT_PARENTHESES(), getLEFT_AND_RIGHT_PARENTHESES(), getSimbol(), getLEFT_AND_RIGHT_PARENTHESES(), ++end);

    public String getLEFT_BRACKETS(){ return "["; }
    public final Token LEFT_BRACKETS = new Token(getLEFT_BRACKETS(), getLEFT_BRACKETS(), getSimbol(), getLEFT_BRACKETS(), ++end);

    public String getRIGHT_BRACKETS(){ return "]"; }
    public final Token RIGHT_BRACKETS = new Token(getRIGHT_BRACKETS(), getRIGHT_BRACKETS(), getSimbol(), getRIGHT_BRACKETS(), ++end);

    public String getLEFT_AND_RIGHT_BRACKETS(){ return "[]"; }
    public final Token LEFT_AND_RIGHT_BRACKETS = new Token(getLEFT_AND_RIGHT_BRACKETS(), getLEFT_AND_RIGHT_BRACKETS(), getSimbol(), getLEFT_AND_RIGHT_BRACKETS(), ++end);

    public String getLEFT_BRACES(){ return "{"; }
    public final Token LEFT_BRACES = new Token(getLEFT_BRACES(), getLEFT_BRACES(), getSimbol(), getLEFT_BRACES(), ++end);

    public String getRIGHT_BRACES(){ return "}"; }
    public final Token RIGHT_BRACES = new Token(getRIGHT_BRACES(), getRIGHT_BRACES(), getSimbol(), getRIGHT_BRACES(), ++end);

    public String getLEFT_AND_RIGHT_BRACES(){ return "{}"; }
    public final Token LEFT_AND_RIGHT_BRACES = new Token(getLEFT_AND_RIGHT_BRACES(), getLEFT_AND_RIGHT_BRACES(), getSimbol(), getLEFT_AND_RIGHT_BRACES(), ++end);

    public String getEQUAL_SIGN(){ return "="; }
    public final Token EQUAL_SIGN = new Token(getEQUAL_SIGN(), getEQUAL_SIGN(), getSimbol(), getEQUAL_SIGN(), ++end);

    public String getGREATER_THAN_SIGN(){ return ">"; }
    public final Token GREATER_THAN_SIGN = new Token(getGREATER_THAN_SIGN(), getGREATER_THAN_SIGN(), getSimbol(), getGREATER_THAN_SIGN(), ++end);

    public String getLESS_THAN_SIGN(){ return "<"; }
    public final Token LESS_THAN_SIGN = new Token(getLESS_THAN_SIGN(), getLESS_THAN_SIGN(), getSimbol(), getLESS_THAN_SIGN(), ++end);

    public String getGREATER_THAN_OR_EQUAL_TO_SIGN(){ return ">="; }
    public final Token GREATER_THAN_OR_EQUAL_TO_SIGN = new Token(getGREATER_THAN_OR_EQUAL_TO_SIGN(), getGREATER_THAN_OR_EQUAL_TO_SIGN(), getSimbol(), getGREATER_THAN_OR_EQUAL_TO_SIGN(), ++end);

    public String getLESS_THAN_OR_EQUAL_TO_SIGN(){ return "<="; }
    public final Token LESS_THAN_OR_EQUAL_TO_SIGN = new Token(getLESS_THAN_OR_EQUAL_TO_SIGN(), getLESS_THAN_OR_EQUAL_TO_SIGN(), getSimbol(), getLESS_THAN_OR_EQUAL_TO_SIGN(), ++end);

    public String getNOT_EQUAL_TO_SIGN(){ return "<>"; }
    public final Token NOT_EQUAL_TO_SIGN = new Token(getNOT_EQUAL_TO_SIGN(), getNOT_EQUAL_TO_SIGN(), getSimbol(), getNOT_EQUAL_TO_SIGN(), ++end);

    public String getPLUS_SIGN(){ return "+"; }
    public final Token PLUS_SIGN = new Token(getPLUS_SIGN(), getPLUS_SIGN(), getSimbol(), getPLUS_SIGN(), ++end);

    public String getMINUS_SIGN(){ return "-"; }
    public final Token MINUS_SIGN = new Token(getMINUS_SIGN(), getMINUS_SIGN(), getSimbol(), getMINUS_SIGN(), ++end);

    public String getASTERISK_OR_MULTIPLICATION_SIGN(){ return "*"; }
    public final Token ASTERISK_OR_MULTIPLICATION_SIGN = new Token(getASTERISK_OR_MULTIPLICATION_SIGN(), getASTERISK_OR_MULTIPLICATION_SIGN(), getSimbol(), getASTERISK_OR_MULTIPLICATION_SIGN(), ++end);

    public String getFORWARD_SLASH_OR_DIVISION_SIGN(){ return "/"; }
    public final Token FORWARD_SLASH_OR_DIVISION_SIGN = new Token(getFORWARD_SLASH_OR_DIVISION_SIGN(), getFORWARD_SLASH_OR_DIVISION_SIGN(), getSimbol(), getFORWARD_SLASH_OR_DIVISION_SIGN(), ++end);

    public String getCARET_OR_EXPONENTIATION_SIGN(){ return "^"; }
    public final Token CARET_OR_EXPONENTIATION_SIGN = new Token(getCARET_OR_EXPONENTIATION_SIGN(), getCARET_OR_EXPONENTIATION_SIGN(), getSimbol(), getCARET_OR_EXPONENTIATION_SIGN(), ++end);

    public String getPERCENT_SIGN(){ return "%"; }
    public final Token PERCENT_SIGN = new Token(getPERCENT_SIGN(), getPERCENT_SIGN(), getSimbol(), getPERCENT_SIGN(), ++end);
}