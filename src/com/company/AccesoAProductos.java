package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class AccesoAProductos {

    ControlProducto controlProducto = new ControlProducto();

    public ArrayList<Productos> getProductos(int opcionAMostrar) throws IOException, InterruptedException {

        switch (opcionAMostrar) {
            case 1 -> {
                return controlProducto.listarBocadillos();
            }
            case 2 -> {
                return controlProducto.listarbebidas();
            }
            case 3 -> {
                return controlProducto.listarCafes();
            }
            default -> {
                return null;
            }
        }
    }
}
