package environment;

public class Board {
	private char[][] board = new char[8][8];

	enum letter {
		a, b, c, d, e, f, g, h;
	}

	public static boolean isletterInEnum(String letter) {
		for (letter l : letter.values()) {
			if (l.name().equals(letter.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	private void move_piece_to(int i, String c, char p) {
		if (isletterInEnum(c)) {
			int j = c;
			board[j][i] = p;
		} else {
			System.out.println("piece doesn't exist");
		}
	}

}
