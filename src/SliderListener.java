import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderListener implements ChangeListener {

    public void stateChanged(ChangeEvent e){
        JSlider source = (JSlider)e.getSource();
        if(source.getValue()==99){
            System.out.println("Works");
        }
    }

}
