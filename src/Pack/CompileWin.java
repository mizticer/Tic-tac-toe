package Pack;

import java.util.Timer;
import java.util.TimerTask;

public class CompileWin {
    Timer time;
    static int numberOfLine=0;
    public CompileWin() {
        time=new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(Gui.gewinner==0){
                    //wygrana X w poziomie
                    if(Gui.state[0]==1 && Gui.state[1]==1 && Gui.state[2]==1){
                        Gui.gewinner=1;
                        numberOfLine=1;
                    }
                    else if(Gui.state[3]==1 && Gui.state[4]==1 && Gui.state[5]==1){
                        Gui.gewinner=1;
                        numberOfLine=2;
                    }
                    else if(Gui.state[6]==1 && Gui.state[7]==1 && Gui.state[8]==1){
                        Gui.gewinner=1;
                        numberOfLine=3;
                    }
                    //wygrana X w pionie
                    else if(Gui.state[0]==1 && Gui.state[3]==1 && Gui.state[6]==1){
                        Gui.gewinner=1;
                        numberOfLine=4;
                    }
                    else if(Gui.state[1]==1 && Gui.state[4]==1 && Gui.state[7]==1){
                        Gui.gewinner=1;
                        numberOfLine=5;
                    }
                    else if(Gui.state[2]==1 && Gui.state[5]==1 && Gui.state[8]==1){
                        Gui.gewinner=1;
                        numberOfLine=6;
                    }
                    //po przekątnej wygrana X
                    else if(Gui.state[0]==1 && Gui.state[4]==1 && Gui.state[8]==1){
                        Gui.gewinner=1;
                        numberOfLine=7;
                    }
                    else if(Gui.state[2]==1 && Gui.state[4]==1 && Gui.state[6]==1){
                        Gui.gewinner=1;
                        numberOfLine=8;
                    }
                    ///////////////////////////////////////////////////////////////////
                    //wygrana O w poziomie
                    if(Gui.state[0]==2 && Gui.state[1]==2 && Gui.state[2]==2){
                        Gui.gewinner=2;
                        numberOfLine=1;
                    }
                    else if(Gui.state[3]==2 && Gui.state[4]==2 && Gui.state[5]==2){
                        Gui.gewinner=2;
                        numberOfLine=2;
                    }
                    else if(Gui.state[6]==2 && Gui.state[7]==2 && Gui.state[8]==2){
                        Gui.gewinner=2;
                        numberOfLine=3;
                    }
                    //wygrana O w pionie
                    else if(Gui.state[0]==2 && Gui.state[3]==2 && Gui.state[6]==2){
                        Gui.gewinner=2;
                        numberOfLine=4;
                    }
                    else if(Gui.state[1]==2 && Gui.state[4]==2 && Gui.state[7]==2){
                        Gui.gewinner=2;
                        numberOfLine=5;
                    }
                    else if(Gui.state[2]==2 && Gui.state[5]==2 && Gui.state[8]==2){
                        Gui.gewinner=2;
                        numberOfLine=6;
                    }
                    //po przekątnej wygrana O
                    else if(Gui.state[0]==2 && Gui.state[4]==2 && Gui.state[8]==2){
                        Gui.gewinner=2;
                        numberOfLine=7;
                    }
                    else if(Gui.state[2]==2 && Gui.state[4]==2 && Gui.state[6]==2){
                        Gui.gewinner=2;
                        numberOfLine=8;
                    }

                }

            }
        },0,150);
    }
}
