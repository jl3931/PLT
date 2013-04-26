import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

public class BMPIO {
	private final static int HEADER_SIZE = 27;

	public static int imageLength(int w, int h) {
		return w * h * 3 + 2 * HEADER_SIZE;
	}

	public static void saveBMP(String filename, int [][] rgbValues, Object o) {
		BMPWriter bmpw = new BMPWriter();
		bmpw.saveBMP(filename, rgbValues, o);
	}

	/*
     * Get a 2D-bitmap from BMP file
     * @filename:  name of BMP file
     * @return: 2D array of int values
     *          origin seems to be left bottom corner
     *          value = R|G<<8|B<<16|alpha<<24
     */
    public static int[][] getBitmapFromBMP(String filename) {
        try {
            File imageFile = new File(filename);
            BufferedImage image = ImageIO.read(imageFile);
            int w = image.getWidth();
            int h = image.getHeight();
            int[][] ret = new int[h][w];
            for (int y = 0; y < h; y++)
                for (int x = 0; x < w; x++) {
                    int rgb = image.getRGB(x, y) & 0x00FFFFFF;
                    int red = (rgb & 0x00FF0000) >> 16;
                    int green = (rgb & 0x0000FF00) >> 8;
                    int blue = (rgb & 0x000000FF);
                    ret[h - 1 - y][x] = red|green<<8|blue<<16;
                }
        }
        catch (Exception e) {
            LOGOPP.io.err("Fail to load file, please check the path");
        }
        return null;
    }

    public static Object getHiddenObject(String filename) {
        try {
        	File imageFile = new File(filename);
        	BufferedImage image = ImageIO.read(imageFile);
        	int w = image.getWidth();
        	int h = image.getHeight();
            FileInputStream fin = new FileInputStream(imageFile);
            byte[] bytes = load(fin);
            System.out.println(bytes.length);
            int imageLength = imageLength(w, h);
            if (bytes.length > imageLength) {
                LOGOPP.io.debug("get byte array!");
                byte[] objectBytes = new byte[bytes.length - imageLength];
                System.arraycopy(bytes, imageLength, objectBytes, 0, objectBytes.length);
                ByteArrayInputStream bis = new ByteArrayInputStream(objectBytes);
                ObjectInput in = null;
                Object o = null;
                try {
                    in = new ObjectInputStream(bis);
                    o = in.readObject(); 
                    //LOGOPP.io.out((String)o);
                } finally {
                    bis.close();
                    in.close();
                }
                return o;
            }
        }
        catch (Exception e) {
        }
        return null;
    }

    public final static byte[] load(FileInputStream fin) {
        byte readBuf[] = new byte[512*1024];
        try { 
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            int readCnt = fin.read(readBuf);
            while (0 < readCnt) {
                bout.write(readBuf, 0, readCnt);
                readCnt = fin.read(readBuf);
            }
            fin.close();
            return bout.toByteArray();
        }
        catch (Exception e) {
            return new byte[0];
        }
    }

}

class BMPWriter {
	private final static int BMP_CODE = 19778;
	byte [] bytes;
	
	public void saveBMP(String filename, int [][] rgbValues, Object o){
		try {
			FileOutputStream fos = new FileOutputStream(new File(filename));
			
			bytes = new byte[54 + 3*rgbValues.length*rgbValues[0].length + getPadding(rgbValues[0].length)*rgbValues.length];

			saveFileHeader();
			saveInfoHeader(rgbValues.length, rgbValues[0].length);
			saveRgbQuad();
			saveBitmapData(rgbValues);

			fos.write(bytes);
			if (o != null) {
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				ObjectOutput out = null;
				try {
					out = new ObjectOutputStream(bos);
					out.writeObject(o);
					byte[] myBytes = bos.toByteArray();
					fos.write(myBytes);
				} finally { 
					out.close();
					bos.close();
				}
			}
			fos.close();
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		
	}

	private void saveFileHeader() {
		byte[]a=intToByteCouple(BMP_CODE);
		bytes[0]=a[1];
		bytes[1]=a[0];
		
		a=intToFourBytes(bytes.length);
		bytes[5]=a[0];
		bytes[4]=a[1];
		bytes[3]=a[2];
		bytes[2]=a[3];
		
		//data offset
		bytes[10]=54;
	}
	
	private void saveInfoHeader(int height, int width) {
		bytes[14]=40;
		
		//byte[]a=intToFourBytes(width);
		byte[]a=intToFourBytes(height);
		bytes[22]=a[3];
		bytes[23]=a[2];
		bytes[24]=a[1];
		bytes[25]=a[0];
		
		//a=intToFourBytes(height);
		a=intToFourBytes(width);

		bytes[18]=a[3];
		bytes[19]=a[2];
		bytes[20]=a[1];
		bytes[21]=a[0];
		
		bytes[26]=1;
		
		bytes[28]=24;
	}
	
	private void saveRgbQuad() {
		
	}

	private void saveBitmapData(int[][]rgbValues) {
		int i;
		
		for(i=0;i<rgbValues.length;i++){
			writeLine(i, rgbValues);
		}
		
	}
	
	private void writeLine(int row, int [][] rgbValues) {
		final int offset=54;
		final int rowLength=rgbValues[row].length;
		final int padding = getPadding(rgbValues[0].length);
		int i;
		
		for(i=0;i<rowLength;i++){
			int rgb=rgbValues[row][i];
			int temp=offset + 3*(i+rowLength*row) + row*padding;
			
			bytes[temp]    = (byte) (rgb>>16);
			bytes[temp +1] = (byte) (rgb>>8);
			bytes[temp +2] = (byte) rgb;
		}
		i--;
		int temp=offset + 3*(i+rowLength*row) + row*padding+3;
		
		for(int j=0;j<padding;j++)
			bytes[temp +j]=0;
		
	}

	private byte[] intToByteCouple(int x){
		byte [] array = new byte[2];
		
		array[1]=(byte)  x;
		array[0]=(byte) (x>>8);
		
		return array;
	}
	
	private byte[] intToFourBytes(int x){
		byte [] array = new byte[4];
		
		array[3]=(byte)  x;
		array[2]=(byte) (x>>8);
		array[1]=(byte) (x>>16);
		array[0]=(byte) (x>>24);
		
		return array;
	}
	
	private int getPadding(int rowLength){
		
		int padding = (3*rowLength)%4;
		if(padding!=0)
			padding=4-padding;
		
		
		return padding;
	}
}