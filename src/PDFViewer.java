import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PDFViewer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int designerPdfViewer(List<Integer> h, String word) {
		// Write your code here
		HashMap<Character, Integer> hm = new HashMap<>();
		List<Character> letters = Arrays.asList(
				'a', 'b', 'c', 'd', 'e',
				'f', 'g', 'h', 'i', 'j', 
				'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 'x', 'y', 'z');

		for (int i = 0; i < h.size(); i++) {
			hm.put(letters.get(i), h.get(i));
		}

		char[] wordChar = word.toCharArray();
		int wordSize = word.length();
		int maxHeigth = 0;
		for (int i = 0; i < wordChar.length; i++) {
			int heigth = hm.get(wordChar[i]);
			if (maxHeigth < heigth)
				maxHeigth = heigth;
		}
		return wordSize * maxHeigth;
	}
}
