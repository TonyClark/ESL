package edb.gui;

import java.awt.Font;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JTextPane;

import actors.CodeBox;
import edb.editor.TextLineNumber;
import instrs.Instr;

public class Assembler extends JTextPane {

  static Font    font  = new Font("Courier", Font.PLAIN, 10);

  TextLineNumber lines = new TextLineNumber(this, font, 0);
  CodeBox        code  = null;

  public Assembler() {
    super();
    setFont(font);
  }

  public void openAsm(CodeBox code) {
    if (code != this.code) {
      this.code = code;
      Vector<Instr> instrs = code.getCode();
      String asm = "";
      for (Instr i : instrs)
        asm = asm + i + "(" + i.getLineStart() + ")" + "\n";
        //asm = asm + i + "\n";
      setText(asm);
      setCaretPosition(0);
    }
  }

  public void selectLine(int line) {
    lines.setSelectedLine(line);
    lines.repaint();
    int i = 0;
    while (line > 1) {
      if (getText().charAt(i) == '\n') line--;
      i++;
    }
    setCaretPosition(i);
  }

  public TextLineNumber getLines() {
    return lines;
  }

}
