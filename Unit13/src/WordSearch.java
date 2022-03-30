import java.util.*;
import java.io.*;

public class WordSearch {
	private char[][] m;

	public WordSearch(int size, String str) {
		m = new char[size][size];
		int i, j, c = 0;
		for (i = 0; i < size; ++i) {
			for (j = 0; j < size; ++j) {
				m[i][j] = str.charAt(c);
				c = c + 1;
			}

		}
	}

	public boolean isFound(String word) {
		int i, j;
		boolean b;
		for (i = 0; i < m.length; ++i) {
			for (j = 0; j < m[i].length; ++j) {
				b = (checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j)
						|| checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownLeft(word, i, j)
						|| checkDiagDownRight(word, i, j));
				if (b == true)
					return b;
			}
		}
		return false;
	}

	public boolean checkRight(String w, int r, int c) {
		int f = 0, c1 = 0;
		for (int j = c; j < m[r].length; ++j) {
			if (c1 == w.length()) {
				break;
			}
			if (m[r][j] != w.charAt(c1)) {
				f = 1;
				break;
			}
			c1 = c1 + 1;
		}
		if (f == 0 && c1 == w.length())
			return true;
		return false;
	}

	public boolean checkLeft(String w, int r, int c) {
		int f = 0, c1 = 0;
		for (int j = c; j >= 0; --j) {
			if (c1 == w.length()) {
				break;
			}
			if (m[r][j] != w.charAt(c1)) {
				f = 1;
				break;
			}
			c1 = c1 + 1;
		}
		if (f == 0 && c1 == w.length())
			return true;
		return false;
	}

	public boolean checkUp(String w, int r, int c) {
		int f = 0, c1 = 0;
		for (int j = r; j >= 0; --j) {
			if (c1 == w.length()) {
				break;
			}
			if (m[j][c] != w.charAt(c1)) {
				f = 1;
				break;
			}
			c1 = c1 + 1;
		}
		if (f == 0 && c1 == w.length())
			return true;
		return false;
	}

	public boolean checkDown(String w, int r, int c) {
		int f = 0, c1 = 0;
		for (int j = r; j < m.length; ++j) {
			if (c1 == w.length()) {
				break;
			}
			if (m[j][c] != w.charAt(c1)) {
				f = 1;
				break;
			}
			c1 = c1 + 1;
		}
		if (f == 0 && c1 == w.length())
			return true;
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c) {
		int f = 0, c1 = 0;
		while (r >= 0 && c < m.length) {
			if (c1 == w.length()) {
				break;
			}
			if (m[r][c] != w.charAt(c1)) {
				f = 1;
				break;
			}
			c1 = c1 + 1;
			r = r - 1;
			c = c + 1;
		}
		if (f == 0 && c1 == w.length())
			return true;
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c) {
		int f = 0, c1 = 0;
		while (r >= 0 && c >= 0) {
			if (c1 == w.length()) {
				break;
			}
			if (m[r][c] != w.charAt(c1)) {
				f = 1;
				break;
			}
			c1 = c1 + 1;
			r = r - 1;
			c = c - 1;
		}
		if (f == 0 && c1 == w.length())
			return true;
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c) {
		int f = 0, c1 = 0;
		while (r < m.length && c >= 0) {
			if (c1 == w.length()) {
				break;
			}
			if (m[r][c] != w.charAt(c1)) {
				f = 1;
				break;
			}
			c1 = c1 + 1;
			r = r + 1;
			c = c - 1;
		}
		if (f == 0 && c1 == w.length())
			return true;
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c) {
		int f = 0, c1 = 0;
		while (r < m.length && c < m.length) {
			if (c1 == w.length()) {
				break;
			}
			if (m[r][c] != w.charAt(c1)) {
				f = 1;
				break;
			}
			c1 = c1 + 1;
			r = r + 1;
			c = c + 1;
		}
		if (f == 0 && c1 == w.length())
			return true;
		return false;
	}

	public String toString() {
		return "";
	}
}