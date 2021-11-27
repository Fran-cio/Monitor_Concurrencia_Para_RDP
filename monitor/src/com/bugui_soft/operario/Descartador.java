package com.bugui_soft.operario;

import com.bugui_soft.utils.Constantes;

import java.util.concurrent.TimeUnit;

import static com.bugui_soft.Main.monitor;

public class Descartador implements Runnable {

    private final Integer[] tInvariante;
    public Descartador() {
        //Invariante de transiciones del Descartador.(T2 a T3)
        tInvariante = new Integer[]{0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public void run() {
        while (true) {
            monitor.dispararTransicion(tInvariante);
            try {
                TimeUnit.MILLISECONDS.sleep(Constantes.SLEEP_DESCARTADOR_MS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
