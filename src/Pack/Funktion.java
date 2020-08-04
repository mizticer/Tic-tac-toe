package Pack;

public class Funktion {
    public static void reset(){
        for(int i = 0; i<Gui.state.length; i++){
            Gui.state[i]=0;
            CompileWin.numberOfLine=0;
        }
        Gui.player=0;
        Gui.gewinner=0;

    }
}
