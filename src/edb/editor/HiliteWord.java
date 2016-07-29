package edb.editor;

class HiliteWord {

  String      _word;
  public int  _position;
  KeywordType key;

  public HiliteWord(String word, int pos, KeywordType key) {
    super();
    this._word = word;
    this._position = pos;
    this.key = key;
  }

  public KeywordType keyType() {
    return key;
  }
}