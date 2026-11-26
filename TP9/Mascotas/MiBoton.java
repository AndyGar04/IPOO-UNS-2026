import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class MiBoton extends JButton{
    
    public MiBoton(String rotulo){
        setText(rotulo);
        setPreferredSize(new Dimension(124, 50));
        setSize(150, 50);
    }

}
