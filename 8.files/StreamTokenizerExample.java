import java.io.*;

class StreamTokenizerExample {
	public static void main(String srg[]) throws IOException {
		int line = 0;
		int chars = 0;
		int words = 0;
		FileReader fr = new FileReader("test.txt");
		StreamTokenizer st = new StreamTokenizer(fr);
		st.resetSyntax();
		st.eolIsSignificant(true);
		st.wordChars(33, 255);
		st.whitespaceChars(0, 32);
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			switch (st.ttype) {
			case StreamTokenizer.TT_EOL:
				line++;
				chars++;
				break;
			case StreamTokenizer.TT_WORD:
				words++;
				String s = st.sval;
				chars = chars + s.length();
				break;
			}
		}
		System.out.println("Number of lines=" + line + " " + "Number of chars=" + chars + " " + words);
	}
}