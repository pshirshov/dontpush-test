package test;


import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Window;

import java.util.ArrayList;
import java.util.List;

public final class OtrWebGuiApp extends Application {
    private static final long serialVersionUID = 1L;

    public OtrWebGuiApp() {

    }

    @Override
    public void init() {
        final Window w = new Window();


        final List<Button> buttons = new ArrayList<>();
        for (int c = 0; c < 50; ++c) {
            final Button btnTest = new Button();
            btnTest.setCaption("Btn"+c);
            w.addComponent(btnTest);
            buttons.add(btnTest);

        }


        setMainWindow(w);


        new Thread(new Runnable() {
            @Override
            public void run() {
                int c = 0;
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                    }
                    final String caption = "c=" + c;

                    for (final Button b:buttons) {
                        b.setCaption(caption);
                    }
                    System.err.println(caption+"; thread="+Thread.currentThread().getId());
                    ++c;
                }
            }
        }).start();
    }

}
