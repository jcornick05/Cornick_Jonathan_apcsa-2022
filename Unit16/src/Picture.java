import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height the height of the desired picture
	 * @param width  the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/**
	 * Hide a black and white message in the current picture by changing the red to
	 * even and then setting it to odd if the message pixel is black
	 * 
	 * @param messagePict the picture with a message
	 */
	public void encode(Picture messagePict) {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel pixel = null;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = currPixels[row][col];
				pixel = messagePixels[row][col];

				if (pixel.getRed() + pixel.getGreen() < 400) {
					if (currPixel.getRed() % 2 == 0) {
						currPixel.setRed(currPixel.getRed() + 1);
					}
					if (currPixel.getGreen() % 2 == 0) {
						currPixel.setGreen(currPixel.getGreen() + 1);
					}
				} else {
					if (currPixel.getRed() % 2 != 0) {
						currPixel.setRed(currPixel.getRed() + 1);
					}
					if (currPixel.getGreen() % 2 != 0) {
						currPixel.setGreen(currPixel.getGreen() + 1);
					}
				}
			}
		}
	}

	/**
	 * Method to decode a message hidden in the red value of the current picture
	 * 
	 * @return the picture with the hidden message
	 */
	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel pixel = null;
		Picture picture = new Picture(this.getHeight(), this.getWidth());
		Pixel[][] messagePixels = picture.getPixels2D();

		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = pixels[row][col];
				pixel = messagePixels[row][col];

				if ((currPixel.getRed() % 2 != 0 && currPixel.getGreen() % 2 != 0)) {
					pixel.setColor(Color.BLACK);
				}

			}
		}
		return picture;
	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	// keeponlyblue

	public void keepOnlyBlue() {
		Pixel[][] pix = this.getPixels2D();
		for (Pixel[] rowss : pix) {
			for (Pixel pixthing : rowss) {
				pixthing.setRed(0);
				pixthing.setGreen(0);
			}
		}
	}

	public void keepOnlyGreen() {
		Pixel[][] pix = this.getPixels2D();
		for (Pixel[] rowss : pix) {
			for (Pixel pixthing : rowss) {
				pixthing.setRed(0);
				pixthing.setBlue(0);
			}
		}
	}

	public void keepOnlyRed() {
		Pixel[][] pix = this.getPixels2D();
		for (Pixel[] rowss : pix) {
			for (Pixel pixthing : rowss) {
				pixthing.setGreen(0);
				pixthing.setBlue(0);
			}
		}
	}

	public void negate() {
		Pixel[][] pixx = this.getPixels2D();
		for (Pixel[] rows : pixx) {
			for (Pixel pixthing : rows) {
				pixthing.setRed(pixthing.getRed() - 255);
				pixthing.setGreen(pixthing.getGreen() - 255);
				pixthing.setBlue(pixthing.getBlue() - 255);
			}
		}
	}

	// grayscale
	public void grayscale() {
		Pixel[][] pix = this.getPixels2D();
		for (Pixel[] rows : pix) {
			for (Pixel pixthing : rows) {
				int num = (int) ((pixthing.getRed() + pixthing.getBlue() + pixthing.getGreen()) / 3);
				pixthing.setRed(num);
				pixthing.setBlue(num);
				pixthing.setGreen(num);
			}
		}
	}

	// inverthing tha pic

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixel = this.getPixels2D();
		Pixel leftPix = null;
		Pixel rightPix = null;
		int width = pixel[0].length;
		for (int row = 0; row < pixel.length; row++) {
			for (int column = 0; column < width / 2; column++) {
				leftPix = pixel[row][column];
				rightPix = pixel[row][width - 1 - column];
				leftPix.setColor(rightPix.getColor());
			}
		}
	}

	// anotha one

	public void mirrorHorizontal() {
		Pixel[][] pixel = this.getPixels2D();
		Pixel abovepixel = null;
		Pixel belowpixel = null;
		int h = pixel.length;
		for (int row = 0; row < h; row++) {
			for (int column = 0; column < pixel[0].length; column++) {
				abovepixel = pixel[row][column];
				belowpixel = pixel[h - 1 - row][column];
				belowpixel.setColor(abovepixel.getColor());
			}
		}
	}

	public void mirrorHorizontalBotToTop() {
		Pixel[][] pixel = this.getPixels2D();
		Pixel abovepixel = null;
		Pixel belowpixel = null;
		int h = pixel.length;
		for (int row = 0; row < h; row++) {
			for (int column = 0; column < pixel[0].length; column++) {
				abovepixel = pixel[row][column];
				belowpixel = pixel[h - 1 - row][column];
				belowpixel.setColor(abovepixel.getColor());
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the
	 * picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {
				count++;
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
		System.out.println(count);
	}

	public void mirrorArms() {
		int mirp = 193;
		Pixel abovepix = null;
		Pixel belowpix = null;
		Pixel[][] pixels = this.getPixels2D();

		for (int row = 158; row < mirp; row++) {
			for (int col = 103; col < 170; col++) {
				abovepix = pixels[row][col];
				belowpix = pixels[mirp - row + mirp][col];
				belowpix.setColor(abovepix.getColor());
			}
		}

		int mirp2 = 198;
		Pixel abovepix2 = null;
		Pixel belowpix2 = null;

		for (int row = 171; row < mirp2; row++) {
			for (int col = 239; col < 294; col++) {
				abovepix2 = pixels[row][col];
				belowpix2 = pixels[mirp2 - row + mirp2][col];
				belowpix2.setColor(abovepix2.getColor());
			}
		}
	}

	public void mirrorGull() {
		int mirp = 345;
		Pixel rpix = null;
		Pixel lpix = null;
		Pixel[][] pixels = this.getPixels2D();

		for (int row = 235; row < 323; row++) {
			for (int col = 238; col < mirp; col++) {
				rpix = pixels[row][col];
				lpix = pixels[row][mirp - col + mirp / 3];
				lpix.setColor(rpix.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the
	 * current picture
	 * 
	 * @param fromPic  the picture to copy from
	 * @param startRow the start row to copy to
	 * @param startCol the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	public void copyother(Picture fromPic, int startRow, int endRow, int startCol, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < endCol; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());

			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("src/flower1.jpg");
		Picture flower2 = new Picture("src/flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("src/collage.jpg");
	}

	public void myCollage() {
		Picture kitten = new Picture("src/kitten2.jpg");

		Picture swan = new Picture("src/swan.jpg");

		Picture seagull = new Picture("src/seagull.jpg");

		this.copyother(kitten, 10, 50, 5, 100);
		kitten.mirrorHorizontal();

		kitten.explore();
		this.copyother(swan, 100, 20, 0, 0);
		swan.zeroBlue();
		swan.explore();
		this.copyother(seagull, 200, 40, 65, 308);
		kitten.grayscale();
		kitten.explore();
		this.copyother(kitten, 300, 80, 78, 107);
		this.mirrorVertical();
		kitten.explore();

	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel toppix = null;
		Pixel bottompix = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length - 1; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				toppix = pixels[row][col];
				bottompix = pixels[row + 1][col];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	public void edgeDetection2(int edgeDist) {
		Pixel thepixel = null;
		Pixel test = null;
		Pixel rightPixel = null;
		Pixel toppix = null;
		Pixel bottompix = null;
		Pixel leftPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length - 1; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				toppix = pixels[row][col];
				bottompix = pixels[row + 1][col];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("src/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this