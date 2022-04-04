/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsslnd;

/**
 *
 * @author Raul
 */
public class RSSLND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Etiquetas etq = new Etiquetas();

        String rss = ""+ etq.etiquetaVersion() 
                + etq.crearEtiquetaAtributo("version=\"2.0\">")
                + etq.etiquetaContenedora("channel", true)
                + etq.etiquetaContenido("title", "Prueba")
                + etq.etiquetaContenido("link", "https://github.com/usuario")
                + etq.etiquetaContenido("description", "Prueba de descripcion")
                + etq.etiquetaContenedora("channel", false)
                + etq.etiquetaContenedora("rss", false);
        
        System.out.println(rss);
        /*
        <?xml version="1.0"?>
            <rss version="2.0">
                <channel>
                <title>Prueba</title>
                <link>https://github.com/usuario</link>
                <description>Prueba de descripcion</description>
                </channel>
            </rss>
         */
    }

}
