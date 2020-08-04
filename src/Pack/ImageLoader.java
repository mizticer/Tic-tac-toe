package Pack;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {
    static Image imgX, imgO, imgLine,imgLinePion,imgLineRight,imgLineLeft;

    public ImageLoader(){
        try{
            imgX= ImageIO.read(new File("res/x.png"));
            imgO= ImageIO.read(new File("res/o.png"));
            imgLine= ImageIO.read(new File("res/line.png"));
            imgLinePion= ImageIO.read(new File("res/linepion.png"));
            imgLineRight= ImageIO.read(new File("res/lineright.png"));
            imgLineLeft= ImageIO.read(new File("res/lineleft.png"));
        }catch (IOException e){
            e.printStackTrace();

        }

    }
}
