import javax.swing.*;

public class Gui {

    String data;

    public Gui(){

        data = "Data will be displayed here";


        JFrame f=new JFrame();

        JButton b=new JButton("click");
        b.setBounds(130,100,100, 40);

        JSlider js = new JSlider();
        js.setBounds(50,50, 200,28);
        js.setMaximum(100);
        js.setMinimum(0);
        js.addChangeListener(new SliderListener());

        JLabel jl = new JLabel(data);
        jl.setSize(200,80);

        f.add(b);
        f.add(jl);
        f.add(js);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
