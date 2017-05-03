package hipercube.bass;

import com.sun.imageio.plugins.bmp.BMPImageReader;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * Created by bmajor on 2017. 05. 03..
 */
public class ByteArrayCreator {

    public static void main(String[] args){
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(args[0]));
            System.out.println("BufferedImage.type = " + bufferedImage.getType());

            //WritableRaster raster = bufferedImage.getRaster();
            //DataBufferByte dataBufferByte = (DataBufferByte) raster.getDataBuffer();

            //BitmapCreator.print(dataBufferByte.getData());

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, args[1], byteArrayOutputStream);
            byte[] bytes = byteArrayOutputStream.toByteArray();

            BitmapCreator.print(bytes);
            System.out.println(bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
