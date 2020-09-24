package com.ricardocuan.laboratorio8;

public class Datos {

    // Declaración de variables
    private int Id;
    private String Titulo;
    private String Detalle;
    private int Imagen;

    // Constructor
    public Datos(int id, String titulo, String detalle, int imagen) {
        Id = id;
        Titulo = titulo;
        Detalle = detalle;
        Imagen = imagen;
    }

    // GETTERS
    public int getId()         { return Id;      }
    public int getImagen()     { return Imagen;  }
    public String getTitulo()  { return Titulo;  }
    public String getDetalle() { return Detalle; }

    //SETTER
    public void setId(int id)              { Id = id;           }
    public void setImagen(int imagen)      { Imagen = imagen;   }
    public void setTitulo(String titulo)   { Titulo = titulo;   }
    public void setDetalle(String detalle) { Detalle = detalle; }


}
